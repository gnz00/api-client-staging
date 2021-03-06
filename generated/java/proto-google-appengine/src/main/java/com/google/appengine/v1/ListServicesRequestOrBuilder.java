// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/appengine.proto

package com.google.appengine.v1;

public interface ListServicesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.ListServicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the parent Application resource. Example: `apps/myapp`.
   * </pre>
   *
   * <code>optional string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Name of the parent Application resource. Example: `apps/myapp`.
   * </pre>
   *
   * <code>optional string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Maximum results to return per page.
   * </pre>
   *
   * <code>optional int32 page_size = 2;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * Continuation token for fetching the next page of results.
   * </pre>
   *
   * <code>optional string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Continuation token for fetching the next page of results.
   * </pre>
   *
   * <code>optional string page_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
