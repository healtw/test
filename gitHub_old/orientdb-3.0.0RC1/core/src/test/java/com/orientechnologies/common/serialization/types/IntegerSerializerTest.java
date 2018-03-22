/*
 * Copyright 2010-2016 OrientDB LTD (http://orientdb.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.orientechnologies.common.serialization.types;

import com.orientechnologies.orient.core.storage.impl.local.paginated.wal.OWALChanges;
import com.orientechnologies.orient.core.storage.impl.local.paginated.wal.OWALChangesTree;
import org.junit.Assert;import org.junit.Before; import org.junit.Test;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * @author Ilya Bershadskiy (ibersh20-at-gmail.com)
 * @since 17.01.12
 */
public class IntegerSerializerTest {
  private static final int     FIELD_SIZE = 4;
  private static final Integer OBJECT     = 1;
  private OIntegerSerializer integerSerializer;
  byte[] stream = new byte[FIELD_SIZE];

  @Before
  public void beforeClass() {
    integerSerializer = new OIntegerSerializer();
  }

  public void testFieldSize() {
    Assert.assertEquals(integerSerializer.getObjectSize(null), FIELD_SIZE);
  }

  public void testSerialize() {
    integerSerializer.serialize(OBJECT, stream, 0);
    Assert.assertEquals(integerSerializer.deserialize(stream, 0), OBJECT);
  }

  public void testSerializeNative() {
    integerSerializer.serializeNative(OBJECT, stream, 0);
    Assert.assertEquals(integerSerializer.deserializeNativeObject(stream, 0), OBJECT);
  }

  public void testNativeDirectMemoryCompatibility() {
    integerSerializer.serializeNative(OBJECT, stream, 0);

    ByteBuffer buffer = ByteBuffer.allocateDirect(stream.length).order(ByteOrder.nativeOrder());
    buffer.put(stream);
    buffer.position(0);

    Assert.assertEquals(integerSerializer.deserializeFromByteBufferObject(buffer), OBJECT);
  }

  public void testSerializeInByteBuffer() {
    final int serializationOffset = 5;
    final ByteBuffer buffer = ByteBuffer.allocate(FIELD_SIZE + serializationOffset);

    buffer.position(serializationOffset);
    integerSerializer.serializeInByteBufferObject(OBJECT, buffer);

    final int binarySize = buffer.position() - serializationOffset;
    Assert.assertEquals(binarySize, FIELD_SIZE);

    buffer.position(serializationOffset);
    Assert.assertEquals(integerSerializer.getObjectSizeInByteBuffer(buffer), FIELD_SIZE);

    buffer.position(serializationOffset);
    Assert.assertEquals(integerSerializer.deserializeFromByteBufferObject(buffer), OBJECT);

    Assert.assertEquals(buffer.position() - serializationOffset, FIELD_SIZE);
  }

  public void testSerializeWALChanges() {
    final int serializationOffset = 5;
    final ByteBuffer buffer = ByteBuffer.allocateDirect(FIELD_SIZE + serializationOffset).order(ByteOrder.nativeOrder());
    final byte[] data = new byte[FIELD_SIZE];
    integerSerializer.serializeNative(OBJECT, data, 0);

    OWALChanges walChanges = new OWALChangesTree();
    walChanges.setBinaryValue(buffer, data, serializationOffset);

    Assert.assertEquals(integerSerializer.getObjectSizeInByteBuffer(buffer, walChanges, serializationOffset), FIELD_SIZE);
    Assert.assertEquals(integerSerializer.deserializeFromByteBufferObject(buffer, walChanges, serializationOffset), OBJECT);
  }
}
