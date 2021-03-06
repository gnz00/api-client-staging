// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/instance.proto

package com.google.appengine.v1;

public final class InstanceProto {
  private InstanceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1_Instance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Instance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"google/appengine/v1/instance.proto\022\023go" +
      "ogle.appengine.v1\032\034google/api/annotation" +
      "s.proto\032\037google/protobuf/timestamp.proto" +
      "\"\257\003\n\010Instance\022\014\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(\t\022" +
      "\032\n\022app_engine_release\030\003 \001(\t\022@\n\014availabil" +
      "ity\030\004 \001(\0162*.google.appengine.v1.Instance" +
      ".Availability\022\017\n\007vm_name\030\005 \001(\t\022\024\n\014vm_zon" +
      "e_name\030\006 \001(\t\022\r\n\005vm_id\030\007 \001(\t\022.\n\nstart_tim" +
      "e\030\010 \001(\0132\032.google.protobuf.Timestamp\022\020\n\010r" +
      "equests\030\t \001(\005\022\016\n\006errors\030\n \001(\005\022\013\n\003qps\030\013 \001",
      "(\002\022\027\n\017average_latency\030\014 \001(\005\022\024\n\014memory_us" +
      "age\030\r \001(\003\022\021\n\tvm_status\030\016 \001(\t\022\030\n\020vm_debug" +
      "_enabled\030\017 \001(\010\":\n\014Availability\022\017\n\013UNSPEC" +
      "IFIED\020\000\022\014\n\010RESIDENT\020\001\022\013\n\007DYNAMIC\020\002Bh\n\027co" +
      "m.google.appengine.v1B\rInstanceProtoP\001Z<" +
      "google.golang.org/genproto/googleapis/ap" +
      "pengine/v1;appengineb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_appengine_v1_Instance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1_Instance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1_Instance_descriptor,
        new java.lang.String[] { "Name", "Id", "AppEngineRelease", "Availability", "VmName", "VmZoneName", "VmId", "StartTime", "Requests", "Errors", "Qps", "AverageLatency", "MemoryUsage", "VmStatus", "VmDebugEnabled", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
