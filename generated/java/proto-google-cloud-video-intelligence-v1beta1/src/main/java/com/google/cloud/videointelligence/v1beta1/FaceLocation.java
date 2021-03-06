// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1beta1;

/**
 * <pre>
 * Face location.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1beta1.FaceLocation}
 */
public  final class FaceLocation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1beta1.FaceLocation)
    FaceLocationOrBuilder {
  // Use FaceLocation.newBuilder() to construct.
  private FaceLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FaceLocation() {
    timeOffset_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FaceLocation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.cloud.videointelligence.v1beta1.BoundingBox.Builder subBuilder = null;
            if (boundingBox_ != null) {
              subBuilder = boundingBox_.toBuilder();
            }
            boundingBox_ = input.readMessage(com.google.cloud.videointelligence.v1beta1.BoundingBox.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(boundingBox_);
              boundingBox_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            timeOffset_ = input.readInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta1_FaceLocation_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta1_FaceLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1beta1.FaceLocation.class, com.google.cloud.videointelligence.v1beta1.FaceLocation.Builder.class);
  }

  public static final int BOUNDING_BOX_FIELD_NUMBER = 1;
  private com.google.cloud.videointelligence.v1beta1.BoundingBox boundingBox_;
  /**
   * <pre>
   * Bounding box in a frame.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta1.BoundingBox bounding_box = 1;</code>
   */
  public boolean hasBoundingBox() {
    return boundingBox_ != null;
  }
  /**
   * <pre>
   * Bounding box in a frame.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta1.BoundingBox bounding_box = 1;</code>
   */
  public com.google.cloud.videointelligence.v1beta1.BoundingBox getBoundingBox() {
    return boundingBox_ == null ? com.google.cloud.videointelligence.v1beta1.BoundingBox.getDefaultInstance() : boundingBox_;
  }
  /**
   * <pre>
   * Bounding box in a frame.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta1.BoundingBox bounding_box = 1;</code>
   */
  public com.google.cloud.videointelligence.v1beta1.BoundingBoxOrBuilder getBoundingBoxOrBuilder() {
    return getBoundingBox();
  }

  public static final int TIME_OFFSET_FIELD_NUMBER = 2;
  private long timeOffset_;
  /**
   * <pre>
   * Video time offset in microseconds.
   * </pre>
   *
   * <code>int64 time_offset = 2;</code>
   */
  public long getTimeOffset() {
    return timeOffset_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (boundingBox_ != null) {
      output.writeMessage(1, getBoundingBox());
    }
    if (timeOffset_ != 0L) {
      output.writeInt64(2, timeOffset_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (boundingBox_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBoundingBox());
    }
    if (timeOffset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, timeOffset_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.videointelligence.v1beta1.FaceLocation)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1beta1.FaceLocation other = (com.google.cloud.videointelligence.v1beta1.FaceLocation) obj;

    boolean result = true;
    result = result && (hasBoundingBox() == other.hasBoundingBox());
    if (hasBoundingBox()) {
      result = result && getBoundingBox()
          .equals(other.getBoundingBox());
    }
    result = result && (getTimeOffset()
        == other.getTimeOffset());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasBoundingBox()) {
      hash = (37 * hash) + BOUNDING_BOX_FIELD_NUMBER;
      hash = (53 * hash) + getBoundingBox().hashCode();
    }
    hash = (37 * hash) + TIME_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimeOffset());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1beta1.FaceLocation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1beta1.FaceLocation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta1.FaceLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1beta1.FaceLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta1.FaceLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1beta1.FaceLocation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta1.FaceLocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1beta1.FaceLocation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta1.FaceLocation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1beta1.FaceLocation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta1.FaceLocation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1beta1.FaceLocation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.videointelligence.v1beta1.FaceLocation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Face location.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1beta1.FaceLocation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1beta1.FaceLocation)
      com.google.cloud.videointelligence.v1beta1.FaceLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta1_FaceLocation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta1_FaceLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1beta1.FaceLocation.class, com.google.cloud.videointelligence.v1beta1.FaceLocation.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1beta1.FaceLocation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (boundingBoxBuilder_ == null) {
        boundingBox_ = null;
      } else {
        boundingBox_ = null;
        boundingBoxBuilder_ = null;
      }
      timeOffset_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta1_FaceLocation_descriptor;
    }

    public com.google.cloud.videointelligence.v1beta1.FaceLocation getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1beta1.FaceLocation.getDefaultInstance();
    }

    public com.google.cloud.videointelligence.v1beta1.FaceLocation build() {
      com.google.cloud.videointelligence.v1beta1.FaceLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.videointelligence.v1beta1.FaceLocation buildPartial() {
      com.google.cloud.videointelligence.v1beta1.FaceLocation result = new com.google.cloud.videointelligence.v1beta1.FaceLocation(this);
      if (boundingBoxBuilder_ == null) {
        result.boundingBox_ = boundingBox_;
      } else {
        result.boundingBox_ = boundingBoxBuilder_.build();
      }
      result.timeOffset_ = timeOffset_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.videointelligence.v1beta1.FaceLocation) {
        return mergeFrom((com.google.cloud.videointelligence.v1beta1.FaceLocation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1beta1.FaceLocation other) {
      if (other == com.google.cloud.videointelligence.v1beta1.FaceLocation.getDefaultInstance()) return this;
      if (other.hasBoundingBox()) {
        mergeBoundingBox(other.getBoundingBox());
      }
      if (other.getTimeOffset() != 0L) {
        setTimeOffset(other.getTimeOffset());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.videointelligence.v1beta1.FaceLocation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.videointelligence.v1beta1.FaceLocation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.videointelligence.v1beta1.BoundingBox boundingBox_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.videointelligence.v1beta1.BoundingBox, com.google.cloud.videointelligence.v1beta1.BoundingBox.Builder, com.google.cloud.videointelligence.v1beta1.BoundingBoxOrBuilder> boundingBoxBuilder_;
    /**
     * <pre>
     * Bounding box in a frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.BoundingBox bounding_box = 1;</code>
     */
    public boolean hasBoundingBox() {
      return boundingBoxBuilder_ != null || boundingBox_ != null;
    }
    /**
     * <pre>
     * Bounding box in a frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.BoundingBox bounding_box = 1;</code>
     */
    public com.google.cloud.videointelligence.v1beta1.BoundingBox getBoundingBox() {
      if (boundingBoxBuilder_ == null) {
        return boundingBox_ == null ? com.google.cloud.videointelligence.v1beta1.BoundingBox.getDefaultInstance() : boundingBox_;
      } else {
        return boundingBoxBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Bounding box in a frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.BoundingBox bounding_box = 1;</code>
     */
    public Builder setBoundingBox(com.google.cloud.videointelligence.v1beta1.BoundingBox value) {
      if (boundingBoxBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        boundingBox_ = value;
        onChanged();
      } else {
        boundingBoxBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Bounding box in a frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.BoundingBox bounding_box = 1;</code>
     */
    public Builder setBoundingBox(
        com.google.cloud.videointelligence.v1beta1.BoundingBox.Builder builderForValue) {
      if (boundingBoxBuilder_ == null) {
        boundingBox_ = builderForValue.build();
        onChanged();
      } else {
        boundingBoxBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Bounding box in a frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.BoundingBox bounding_box = 1;</code>
     */
    public Builder mergeBoundingBox(com.google.cloud.videointelligence.v1beta1.BoundingBox value) {
      if (boundingBoxBuilder_ == null) {
        if (boundingBox_ != null) {
          boundingBox_ =
            com.google.cloud.videointelligence.v1beta1.BoundingBox.newBuilder(boundingBox_).mergeFrom(value).buildPartial();
        } else {
          boundingBox_ = value;
        }
        onChanged();
      } else {
        boundingBoxBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Bounding box in a frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.BoundingBox bounding_box = 1;</code>
     */
    public Builder clearBoundingBox() {
      if (boundingBoxBuilder_ == null) {
        boundingBox_ = null;
        onChanged();
      } else {
        boundingBox_ = null;
        boundingBoxBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Bounding box in a frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.BoundingBox bounding_box = 1;</code>
     */
    public com.google.cloud.videointelligence.v1beta1.BoundingBox.Builder getBoundingBoxBuilder() {
      
      onChanged();
      return getBoundingBoxFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Bounding box in a frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.BoundingBox bounding_box = 1;</code>
     */
    public com.google.cloud.videointelligence.v1beta1.BoundingBoxOrBuilder getBoundingBoxOrBuilder() {
      if (boundingBoxBuilder_ != null) {
        return boundingBoxBuilder_.getMessageOrBuilder();
      } else {
        return boundingBox_ == null ?
            com.google.cloud.videointelligence.v1beta1.BoundingBox.getDefaultInstance() : boundingBox_;
      }
    }
    /**
     * <pre>
     * Bounding box in a frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.BoundingBox bounding_box = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.videointelligence.v1beta1.BoundingBox, com.google.cloud.videointelligence.v1beta1.BoundingBox.Builder, com.google.cloud.videointelligence.v1beta1.BoundingBoxOrBuilder> 
        getBoundingBoxFieldBuilder() {
      if (boundingBoxBuilder_ == null) {
        boundingBoxBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.videointelligence.v1beta1.BoundingBox, com.google.cloud.videointelligence.v1beta1.BoundingBox.Builder, com.google.cloud.videointelligence.v1beta1.BoundingBoxOrBuilder>(
                getBoundingBox(),
                getParentForChildren(),
                isClean());
        boundingBox_ = null;
      }
      return boundingBoxBuilder_;
    }

    private long timeOffset_ ;
    /**
     * <pre>
     * Video time offset in microseconds.
     * </pre>
     *
     * <code>int64 time_offset = 2;</code>
     */
    public long getTimeOffset() {
      return timeOffset_;
    }
    /**
     * <pre>
     * Video time offset in microseconds.
     * </pre>
     *
     * <code>int64 time_offset = 2;</code>
     */
    public Builder setTimeOffset(long value) {
      
      timeOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Video time offset in microseconds.
     * </pre>
     *
     * <code>int64 time_offset = 2;</code>
     */
    public Builder clearTimeOffset() {
      
      timeOffset_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1beta1.FaceLocation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1beta1.FaceLocation)
  private static final com.google.cloud.videointelligence.v1beta1.FaceLocation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1beta1.FaceLocation();
  }

  public static com.google.cloud.videointelligence.v1beta1.FaceLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FaceLocation>
      PARSER = new com.google.protobuf.AbstractParser<FaceLocation>() {
    public FaceLocation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FaceLocation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FaceLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FaceLocation> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.videointelligence.v1beta1.FaceLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

