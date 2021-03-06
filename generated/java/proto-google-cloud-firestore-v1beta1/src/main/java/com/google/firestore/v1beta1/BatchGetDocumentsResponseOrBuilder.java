// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1beta1/firestore.proto

package com.google.firestore.v1beta1;

public interface BatchGetDocumentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1beta1.BatchGetDocumentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A document that was requested.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Document found = 1;</code>
   */
  com.google.firestore.v1beta1.Document getFound();
  /**
   * <pre>
   * A document that was requested.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Document found = 1;</code>
   */
  com.google.firestore.v1beta1.DocumentOrBuilder getFoundOrBuilder();

  /**
   * <pre>
   * A document name that was requested but does not exist. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * </pre>
   *
   * <code>string missing = 2;</code>
   */
  java.lang.String getMissing();
  /**
   * <pre>
   * A document name that was requested but does not exist. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * </pre>
   *
   * <code>string missing = 2;</code>
   */
  com.google.protobuf.ByteString
      getMissingBytes();

  /**
   * <pre>
   * The transaction that was started as part of this request.
   * Will only be set in the first response, and only if
   * [BatchGetDocumentsRequest.new_transaction][google.firestore.v1beta1.BatchGetDocumentsRequest.new_transaction] was set in the request.
   * </pre>
   *
   * <code>bytes transaction = 3;</code>
   */
  com.google.protobuf.ByteString getTransaction();

  /**
   * <pre>
   * The time at which the document was read.
   * This may be monotically increasing, in this case the previous documents in
   * the result stream are guaranteed not to have changed between their
   * read_time and this one.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   */
  boolean hasReadTime();
  /**
   * <pre>
   * The time at which the document was read.
   * This may be monotically increasing, in this case the previous documents in
   * the result stream are guaranteed not to have changed between their
   * read_time and this one.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   * <pre>
   * The time at which the document was read.
   * This may be monotically increasing, in this case the previous documents in
   * the result stream are guaranteed not to have changed between their
   * read_time and this one.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  public com.google.firestore.v1beta1.BatchGetDocumentsResponse.ResultCase getResultCase();
}
