package com.orientechnologies.orient.core.sql.functions.graph;

import com.orientechnologies.common.collection.OMultiCollectionIterator;
import com.orientechnologies.common.util.OSizeable;
import com.orientechnologies.orient.core.db.ODatabase;
import com.orientechnologies.orient.core.db.record.OIdentifiable;
import com.orientechnologies.orient.core.index.OCompositeKey;
import com.orientechnologies.orient.core.index.OIndex;
import com.orientechnologies.orient.core.metadata.schema.OClass;
import com.orientechnologies.orient.core.record.ODirection;
import com.orientechnologies.orient.core.record.OEdge;
import com.orientechnologies.orient.core.record.OVertex;
import com.orientechnologies.orient.core.record.impl.ODocument;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by luigidellaquila on 03/01/17.
 */
public class OSQLFunctionOut extends OSQLFunctionMoveFiltered {
  public static final String NAME = "out";

  public OSQLFunctionOut() {
    super(NAME, 0, -1);
  }

  @Override
  protected Object move(final ODatabase graph, final OIdentifiable iRecord, final String[] iLabels) {
    return v2v(graph, iRecord, ODirection.OUT, iLabels);
  }

  protected Object move(final ODatabase graph, final OIdentifiable iRecord, final String[] iLabels,
      Iterable<OIdentifiable> iPossibleResults) {
    if (iPossibleResults == null) {
      return v2v(graph, iRecord, ODirection.OUT, iLabels);
    }

    if (!iPossibleResults.iterator().hasNext()) {
      return Collections.emptyList();
    }

    Object edges = v2e(graph, iRecord, ODirection.OUT, iLabels);
    if (edges instanceof OSizeable) {
      int size = ((OSizeable) edges).size();
      if (size > supernodeThreshold) {
        Object result = fetchFromIndex(graph, iRecord, iPossibleResults, iLabels);
        if (result != null) {
          return result;
        }
      }

    }

    return v2v(graph, iRecord, ODirection.OUT, iLabels);
  }

  private Object fetchFromIndex(ODatabase graph, OIdentifiable iFrom, Iterable<OIdentifiable> iTo, String[] iEdgeTypes) {
    String edgeClassName = null;
    if (iEdgeTypes == null) {
      edgeClassName = "E";
    } else if (iEdgeTypes.length == 1) {
      edgeClassName = iEdgeTypes[0];
    } else {
      return null;
    }
    OClass edgeClass = graph.getMetadata().getSchema().getClass(edgeClassName);
    if (edgeClass == null) {
      return null;
    }
    Set<OIndex<?>> indexes = edgeClass.getInvolvedIndexes("out", "in");
    if (indexes == null || indexes.size() == 0) {
      return null;
    }
    OIndex index = indexes.iterator().next();

    OMultiCollectionIterator<OVertex> result = new OMultiCollectionIterator<OVertex>();
    for (OIdentifiable to : iTo) {
      OCompositeKey key = new OCompositeKey(iFrom, to);
      Object indexResult = index.get(key);
      if (indexResult instanceof OIdentifiable) {
        indexResult = Collections.singleton(indexResult);
      }
      Set<OIdentifiable> identities = new HashSet<OIdentifiable>();
      for (OIdentifiable edge : ((Iterable<OEdge>) indexResult)) {
        identities.add((OIdentifiable) ((ODocument) edge.getRecord()).rawField("in"));
      }
      result.add(identities);
    }

    return result;
  }

}
