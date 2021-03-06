// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/v1/policy.proto

package com.google.iam.v1;

/**
 * <pre>
 * The difference delta between two policies.
 * </pre>
 *
 * Protobuf type {@code google.iam.v1.PolicyDelta}
 */
public  final class PolicyDelta extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.iam.v1.PolicyDelta)
    PolicyDeltaOrBuilder {
  // Use PolicyDelta.newBuilder() to construct.
  private PolicyDelta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PolicyDelta() {
    bindingDeltas_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PolicyDelta(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              bindingDeltas_ = new java.util.ArrayList<com.google.iam.v1.BindingDelta>();
              mutable_bitField0_ |= 0x00000001;
            }
            bindingDeltas_.add(
                input.readMessage(com.google.iam.v1.BindingDelta.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        bindingDeltas_ = java.util.Collections.unmodifiableList(bindingDeltas_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_PolicyDelta_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_PolicyDelta_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.v1.PolicyDelta.class, com.google.iam.v1.PolicyDelta.Builder.class);
  }

  public static final int BINDING_DELTAS_FIELD_NUMBER = 1;
  private java.util.List<com.google.iam.v1.BindingDelta> bindingDeltas_;
  /**
   * <pre>
   * The delta for Bindings between two policies.
   * </pre>
   *
   * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
   */
  public java.util.List<com.google.iam.v1.BindingDelta> getBindingDeltasList() {
    return bindingDeltas_;
  }
  /**
   * <pre>
   * The delta for Bindings between two policies.
   * </pre>
   *
   * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
   */
  public java.util.List<? extends com.google.iam.v1.BindingDeltaOrBuilder> 
      getBindingDeltasOrBuilderList() {
    return bindingDeltas_;
  }
  /**
   * <pre>
   * The delta for Bindings between two policies.
   * </pre>
   *
   * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
   */
  public int getBindingDeltasCount() {
    return bindingDeltas_.size();
  }
  /**
   * <pre>
   * The delta for Bindings between two policies.
   * </pre>
   *
   * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
   */
  public com.google.iam.v1.BindingDelta getBindingDeltas(int index) {
    return bindingDeltas_.get(index);
  }
  /**
   * <pre>
   * The delta for Bindings between two policies.
   * </pre>
   *
   * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
   */
  public com.google.iam.v1.BindingDeltaOrBuilder getBindingDeltasOrBuilder(
      int index) {
    return bindingDeltas_.get(index);
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
    for (int i = 0; i < bindingDeltas_.size(); i++) {
      output.writeMessage(1, bindingDeltas_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < bindingDeltas_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, bindingDeltas_.get(i));
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
    if (!(obj instanceof com.google.iam.v1.PolicyDelta)) {
      return super.equals(obj);
    }
    com.google.iam.v1.PolicyDelta other = (com.google.iam.v1.PolicyDelta) obj;

    boolean result = true;
    result = result && getBindingDeltasList()
        .equals(other.getBindingDeltasList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getBindingDeltasCount() > 0) {
      hash = (37 * hash) + BINDING_DELTAS_FIELD_NUMBER;
      hash = (53 * hash) + getBindingDeltasList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.v1.PolicyDelta parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.v1.PolicyDelta parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.v1.PolicyDelta parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.v1.PolicyDelta parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.v1.PolicyDelta parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.v1.PolicyDelta parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.v1.PolicyDelta parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.v1.PolicyDelta parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.v1.PolicyDelta parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.iam.v1.PolicyDelta parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.v1.PolicyDelta parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.v1.PolicyDelta parseFrom(
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
  public static Builder newBuilder(com.google.iam.v1.PolicyDelta prototype) {
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
   * The difference delta between two policies.
   * </pre>
   *
   * Protobuf type {@code google.iam.v1.PolicyDelta}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.iam.v1.PolicyDelta)
      com.google.iam.v1.PolicyDeltaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_PolicyDelta_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_PolicyDelta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.v1.PolicyDelta.class, com.google.iam.v1.PolicyDelta.Builder.class);
    }

    // Construct using com.google.iam.v1.PolicyDelta.newBuilder()
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
        getBindingDeltasFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (bindingDeltasBuilder_ == null) {
        bindingDeltas_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        bindingDeltasBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_PolicyDelta_descriptor;
    }

    public com.google.iam.v1.PolicyDelta getDefaultInstanceForType() {
      return com.google.iam.v1.PolicyDelta.getDefaultInstance();
    }

    public com.google.iam.v1.PolicyDelta build() {
      com.google.iam.v1.PolicyDelta result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.iam.v1.PolicyDelta buildPartial() {
      com.google.iam.v1.PolicyDelta result = new com.google.iam.v1.PolicyDelta(this);
      int from_bitField0_ = bitField0_;
      if (bindingDeltasBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          bindingDeltas_ = java.util.Collections.unmodifiableList(bindingDeltas_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bindingDeltas_ = bindingDeltas_;
      } else {
        result.bindingDeltas_ = bindingDeltasBuilder_.build();
      }
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
      if (other instanceof com.google.iam.v1.PolicyDelta) {
        return mergeFrom((com.google.iam.v1.PolicyDelta)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.v1.PolicyDelta other) {
      if (other == com.google.iam.v1.PolicyDelta.getDefaultInstance()) return this;
      if (bindingDeltasBuilder_ == null) {
        if (!other.bindingDeltas_.isEmpty()) {
          if (bindingDeltas_.isEmpty()) {
            bindingDeltas_ = other.bindingDeltas_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBindingDeltasIsMutable();
            bindingDeltas_.addAll(other.bindingDeltas_);
          }
          onChanged();
        }
      } else {
        if (!other.bindingDeltas_.isEmpty()) {
          if (bindingDeltasBuilder_.isEmpty()) {
            bindingDeltasBuilder_.dispose();
            bindingDeltasBuilder_ = null;
            bindingDeltas_ = other.bindingDeltas_;
            bitField0_ = (bitField0_ & ~0x00000001);
            bindingDeltasBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBindingDeltasFieldBuilder() : null;
          } else {
            bindingDeltasBuilder_.addAllMessages(other.bindingDeltas_);
          }
        }
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
      com.google.iam.v1.PolicyDelta parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.iam.v1.PolicyDelta) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.iam.v1.BindingDelta> bindingDeltas_ =
      java.util.Collections.emptyList();
    private void ensureBindingDeltasIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        bindingDeltas_ = new java.util.ArrayList<com.google.iam.v1.BindingDelta>(bindingDeltas_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.iam.v1.BindingDelta, com.google.iam.v1.BindingDelta.Builder, com.google.iam.v1.BindingDeltaOrBuilder> bindingDeltasBuilder_;

    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public java.util.List<com.google.iam.v1.BindingDelta> getBindingDeltasList() {
      if (bindingDeltasBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bindingDeltas_);
      } else {
        return bindingDeltasBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public int getBindingDeltasCount() {
      if (bindingDeltasBuilder_ == null) {
        return bindingDeltas_.size();
      } else {
        return bindingDeltasBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public com.google.iam.v1.BindingDelta getBindingDeltas(int index) {
      if (bindingDeltasBuilder_ == null) {
        return bindingDeltas_.get(index);
      } else {
        return bindingDeltasBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public Builder setBindingDeltas(
        int index, com.google.iam.v1.BindingDelta value) {
      if (bindingDeltasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBindingDeltasIsMutable();
        bindingDeltas_.set(index, value);
        onChanged();
      } else {
        bindingDeltasBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public Builder setBindingDeltas(
        int index, com.google.iam.v1.BindingDelta.Builder builderForValue) {
      if (bindingDeltasBuilder_ == null) {
        ensureBindingDeltasIsMutable();
        bindingDeltas_.set(index, builderForValue.build());
        onChanged();
      } else {
        bindingDeltasBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public Builder addBindingDeltas(com.google.iam.v1.BindingDelta value) {
      if (bindingDeltasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBindingDeltasIsMutable();
        bindingDeltas_.add(value);
        onChanged();
      } else {
        bindingDeltasBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public Builder addBindingDeltas(
        int index, com.google.iam.v1.BindingDelta value) {
      if (bindingDeltasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBindingDeltasIsMutable();
        bindingDeltas_.add(index, value);
        onChanged();
      } else {
        bindingDeltasBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public Builder addBindingDeltas(
        com.google.iam.v1.BindingDelta.Builder builderForValue) {
      if (bindingDeltasBuilder_ == null) {
        ensureBindingDeltasIsMutable();
        bindingDeltas_.add(builderForValue.build());
        onChanged();
      } else {
        bindingDeltasBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public Builder addBindingDeltas(
        int index, com.google.iam.v1.BindingDelta.Builder builderForValue) {
      if (bindingDeltasBuilder_ == null) {
        ensureBindingDeltasIsMutable();
        bindingDeltas_.add(index, builderForValue.build());
        onChanged();
      } else {
        bindingDeltasBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public Builder addAllBindingDeltas(
        java.lang.Iterable<? extends com.google.iam.v1.BindingDelta> values) {
      if (bindingDeltasBuilder_ == null) {
        ensureBindingDeltasIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bindingDeltas_);
        onChanged();
      } else {
        bindingDeltasBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public Builder clearBindingDeltas() {
      if (bindingDeltasBuilder_ == null) {
        bindingDeltas_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        bindingDeltasBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public Builder removeBindingDeltas(int index) {
      if (bindingDeltasBuilder_ == null) {
        ensureBindingDeltasIsMutable();
        bindingDeltas_.remove(index);
        onChanged();
      } else {
        bindingDeltasBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public com.google.iam.v1.BindingDelta.Builder getBindingDeltasBuilder(
        int index) {
      return getBindingDeltasFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public com.google.iam.v1.BindingDeltaOrBuilder getBindingDeltasOrBuilder(
        int index) {
      if (bindingDeltasBuilder_ == null) {
        return bindingDeltas_.get(index);  } else {
        return bindingDeltasBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public java.util.List<? extends com.google.iam.v1.BindingDeltaOrBuilder> 
         getBindingDeltasOrBuilderList() {
      if (bindingDeltasBuilder_ != null) {
        return bindingDeltasBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bindingDeltas_);
      }
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public com.google.iam.v1.BindingDelta.Builder addBindingDeltasBuilder() {
      return getBindingDeltasFieldBuilder().addBuilder(
          com.google.iam.v1.BindingDelta.getDefaultInstance());
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public com.google.iam.v1.BindingDelta.Builder addBindingDeltasBuilder(
        int index) {
      return getBindingDeltasFieldBuilder().addBuilder(
          index, com.google.iam.v1.BindingDelta.getDefaultInstance());
    }
    /**
     * <pre>
     * The delta for Bindings between two policies.
     * </pre>
     *
     * <code>repeated .google.iam.v1.BindingDelta binding_deltas = 1;</code>
     */
    public java.util.List<com.google.iam.v1.BindingDelta.Builder> 
         getBindingDeltasBuilderList() {
      return getBindingDeltasFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.iam.v1.BindingDelta, com.google.iam.v1.BindingDelta.Builder, com.google.iam.v1.BindingDeltaOrBuilder> 
        getBindingDeltasFieldBuilder() {
      if (bindingDeltasBuilder_ == null) {
        bindingDeltasBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.iam.v1.BindingDelta, com.google.iam.v1.BindingDelta.Builder, com.google.iam.v1.BindingDeltaOrBuilder>(
                bindingDeltas_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        bindingDeltas_ = null;
      }
      return bindingDeltasBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.iam.v1.PolicyDelta)
  }

  // @@protoc_insertion_point(class_scope:google.iam.v1.PolicyDelta)
  private static final com.google.iam.v1.PolicyDelta DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.iam.v1.PolicyDelta();
  }

  public static com.google.iam.v1.PolicyDelta getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PolicyDelta>
      PARSER = new com.google.protobuf.AbstractParser<PolicyDelta>() {
    public PolicyDelta parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PolicyDelta(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PolicyDelta> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicyDelta> getParserForType() {
    return PARSER;
  }

  public com.google.iam.v1.PolicyDelta getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

