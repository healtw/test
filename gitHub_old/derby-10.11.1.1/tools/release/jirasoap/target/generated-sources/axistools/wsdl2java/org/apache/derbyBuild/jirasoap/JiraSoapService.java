/**
 * JiraSoapService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.apache.derbyBuild.jirasoap;

public interface JiraSoapService extends java.rmi.Remote {
    public org.apache.derbyBuild.jirasoap.RemoteComment getComment(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteGroup createGroup(java.lang.String in0, java.lang.String in1, org.apache.derbyBuild.jirasoap.RemoteUser in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public org.apache.derbyBuild.jirasoap.RemoteServerInfo getServerInfo(java.lang.String in0) throws java.rmi.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteGroup getGroup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public java.lang.String login(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemoteException;
    public boolean logout(java.lang.String in0) throws java.rmi.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteConfiguration getConfiguration(java.lang.String in0) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteUser createUser(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public org.apache.derbyBuild.jirasoap.RemoteUser getUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException;
    public org.apache.derbyBuild.jirasoap.RemoteIssue getIssue(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteVersion[] getVersions(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteComponent[] getComponents(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteIssue createIssue(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteIssue in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public org.apache.derbyBuild.jirasoap.RemoteIssue updateIssue(java.lang.String in0, java.lang.String in1, org.apache.derbyBuild.jirasoap.RemoteFieldValue[] in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void deleteIssue(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteNamedObject[] getAvailableActions(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteIssueType[] getSubTaskIssueTypes(java.lang.String in0) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException;
    public org.apache.derbyBuild.jirasoap.RemoteProject createProject(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5, org.apache.derbyBuild.jirasoap.RemotePermissionScheme in6, org.apache.derbyBuild.jirasoap.RemoteScheme in7, org.apache.derbyBuild.jirasoap.RemoteScheme in8) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public org.apache.derbyBuild.jirasoap.RemoteProject updateProject(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteProject in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public org.apache.derbyBuild.jirasoap.RemoteProject getProjectByKey(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void removeAllRoleActorsByProject(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteProject in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemotePriority[] getPriorities(java.lang.String in0) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException;
    public org.apache.derbyBuild.jirasoap.RemoteResolution[] getResolutions(java.lang.String in0) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException;
    public org.apache.derbyBuild.jirasoap.RemoteIssueType[] getIssueTypes(java.lang.String in0) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException;
    public org.apache.derbyBuild.jirasoap.RemoteStatus[] getStatuses(java.lang.String in0) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException;
    public org.apache.derbyBuild.jirasoap.RemoteIssueType[] getIssueTypesForProject(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException;
    public org.apache.derbyBuild.jirasoap.RemoteProjectRole[] getProjectRoles(java.lang.String in0) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteProjectRole getProjectRole(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteProjectRoleActors getProjectRoleActors(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteProjectRole in1, org.apache.derbyBuild.jirasoap.RemoteProject in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteRoleActors getDefaultRoleActors(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteProjectRole in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void removeAllRoleActorsByNameAndType(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void deleteProjectRole(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteProjectRole in1, boolean in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void updateProjectRole(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteProjectRole in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteProjectRole createProjectRole(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteProjectRole in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public boolean isProjectRoleNameUnique(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void addActorsToProjectRole(java.lang.String in0, java.lang.String[] in1, org.apache.derbyBuild.jirasoap.RemoteProjectRole in2, org.apache.derbyBuild.jirasoap.RemoteProject in3, java.lang.String in4) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void removeActorsFromProjectRole(java.lang.String in0, java.lang.String[] in1, org.apache.derbyBuild.jirasoap.RemoteProjectRole in2, org.apache.derbyBuild.jirasoap.RemoteProject in3, java.lang.String in4) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void addDefaultActorsToProjectRole(java.lang.String in0, java.lang.String[] in1, org.apache.derbyBuild.jirasoap.RemoteProjectRole in2, java.lang.String in3) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void removeDefaultActorsFromProjectRole(java.lang.String in0, java.lang.String[] in1, org.apache.derbyBuild.jirasoap.RemoteProjectRole in2, java.lang.String in3) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteScheme[] getAssociatedNotificationSchemes(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteProjectRole in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteScheme[] getAssociatedPermissionSchemes(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteProjectRole in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void deleteProject(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteProject getProjectById(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteField[] getCustomFields(java.lang.String in0) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteComment[] getComments(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteFilter[] getFavouriteFilters(java.lang.String in0) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void releaseVersion(java.lang.String in0, java.lang.String in1, org.apache.derbyBuild.jirasoap.RemoteVersion in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void archiveVersion(java.lang.String in0, java.lang.String in1, java.lang.String in2, boolean in3) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteField[] getFieldsForEdit(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteIssueType[] getSubTaskIssueTypesForProject(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException;
    public void addUserToGroup(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteGroup in1, org.apache.derbyBuild.jirasoap.RemoteUser in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public void removeUserFromGroup(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteGroup in1, org.apache.derbyBuild.jirasoap.RemoteUser in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public org.apache.derbyBuild.jirasoap.RemoteSecurityLevel getSecurityLevel(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void addComment(java.lang.String in0, java.lang.String in1, org.apache.derbyBuild.jirasoap.RemoteComment in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteProject getProjectWithSchemesById(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteSecurityLevel[] getSecurityLevels(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteAvatar[] getProjectAvatars(java.lang.String in0, java.lang.String in1, boolean in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void setProjectAvatar(java.lang.String in0, java.lang.String in1, long in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteAvatar getProjectAvatar(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void deleteProjectAvatar(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteScheme[] getNotificationSchemes(java.lang.String in0) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemotePermissionScheme[] getPermissionSchemes(java.lang.String in0) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemotePermission[] getAllPermissions(java.lang.String in0) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemotePermissionScheme createPermissionScheme(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public org.apache.derbyBuild.jirasoap.RemotePermissionScheme addPermissionTo(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemotePermissionScheme in1, org.apache.derbyBuild.jirasoap.RemotePermission in2, org.apache.derbyBuild.jirasoap.RemoteEntity in3) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public org.apache.derbyBuild.jirasoap.RemotePermissionScheme deletePermissionFrom(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemotePermissionScheme in1, org.apache.derbyBuild.jirasoap.RemotePermission in2, org.apache.derbyBuild.jirasoap.RemoteEntity in3) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public void deletePermissionScheme(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public org.apache.derbyBuild.jirasoap.RemoteIssue createIssueWithSecurityLevel(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteIssue in1, long in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public boolean addAttachmentsToIssue(java.lang.String in0, java.lang.String in1, java.lang.String[] in2, byte[][] in3) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public org.apache.derbyBuild.jirasoap.RemoteAttachment[] getAttachmentsFromIssue(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public boolean hasPermissionToEditComment(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteComment in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteComment editComment(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteComment in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteField[] getFieldsForAction(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteIssue progressWorkflowAction(java.lang.String in0, java.lang.String in1, java.lang.String in2, org.apache.derbyBuild.jirasoap.RemoteFieldValue[] in3) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteIssue getIssueById(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteWorklog addWorklogWithNewRemainingEstimate(java.lang.String in0, java.lang.String in1, org.apache.derbyBuild.jirasoap.RemoteWorklog in2, java.lang.String in3) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public org.apache.derbyBuild.jirasoap.RemoteWorklog addWorklogAndAutoAdjustRemainingEstimate(java.lang.String in0, java.lang.String in1, org.apache.derbyBuild.jirasoap.RemoteWorklog in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public org.apache.derbyBuild.jirasoap.RemoteWorklog addWorklogAndRetainRemainingEstimate(java.lang.String in0, java.lang.String in1, org.apache.derbyBuild.jirasoap.RemoteWorklog in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public void deleteWorklogWithNewRemainingEstimate(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public void deleteWorklogAndAutoAdjustRemainingEstimate(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public void deleteWorklogAndRetainRemainingEstimate(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public void updateWorklogWithNewRemainingEstimate(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteWorklog in1, java.lang.String in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public void updateWorklogAndAutoAdjustRemainingEstimate(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteWorklog in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public void updateWorklogAndRetainRemainingEstimate(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteWorklog in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public org.apache.derbyBuild.jirasoap.RemoteWorklog[] getWorklogs(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public boolean hasPermissionToCreateWorklog(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public boolean hasPermissionToDeleteWorklog(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public boolean hasPermissionToUpdateWorklog(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public java.util.Calendar getResolutionDateByKey(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public java.util.Calendar getResolutionDateById(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public long getIssueCountForFilter(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteIssue[] getIssuesFromTextSearch(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteIssue[] getIssuesFromTextSearchWithProject(java.lang.String in0, java.lang.String[] in1, java.lang.String in2, int in3) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteIssue[] getIssuesFromJqlSearch(java.lang.String in0, java.lang.String in1, int in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void deleteUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public org.apache.derbyBuild.jirasoap.RemoteGroup updateGroup(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteGroup in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public void deleteGroup(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public void refreshCustomFields(java.lang.String in0) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteFilter[] getSavedFilters(java.lang.String in0) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public boolean addBase64EncodedAttachmentsToIssue(java.lang.String in0, java.lang.String in1, java.lang.String[] in2, java.lang.String[] in3) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public org.apache.derbyBuild.jirasoap.RemoteProject createProjectFromObject(java.lang.String in0, org.apache.derbyBuild.jirasoap.RemoteProject in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException, org.apache.derbyBuild.jirasoap.RemoteValidationException;
    public org.apache.derbyBuild.jirasoap.RemoteScheme[] getSecuritySchemes(java.lang.String in0) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteVersion addVersion(java.lang.String in0, java.lang.String in1, org.apache.derbyBuild.jirasoap.RemoteVersion in2) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteIssue[] getIssuesFromFilter(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteIssue[] getIssuesFromFilterWithLimit(java.lang.String in0, java.lang.String in1, int in2, int in3) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteIssue[] getIssuesFromTextSearchWithLimit(java.lang.String in0, java.lang.String in1, int in2, int in3) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteException;
    public org.apache.derbyBuild.jirasoap.RemoteProject[] getProjectsNoSchemes(java.lang.String in0) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemoteAuthenticationException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
    public void setNewProjectAvatar(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException, org.apache.derbyBuild.jirasoap.RemotePermissionException, org.apache.derbyBuild.jirasoap.RemoteException;
}