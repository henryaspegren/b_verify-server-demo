// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/api.proto

package io.grpc.bverify;

/**
 * Protobuf type {@code api.PathResponse}
 */
public  final class PathResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.PathResponse)
    PathResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PathResponse.newBuilder() to construct.
  private PathResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PathResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PathResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            serialization.generated.MptSerialization.MerklePrefixTrie.Builder subBuilder = null;
            if (path_ != null) {
              subBuilder = path_.toBuilder();
            }
            path_ = input.readMessage(serialization.generated.MptSerialization.MerklePrefixTrie.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(path_);
              path_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.bverify.BVerifyAPI.internal_static_api_PathResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.bverify.BVerifyAPI.internal_static_api_PathResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.bverify.PathResponse.class, io.grpc.bverify.PathResponse.Builder.class);
  }

  public static final int PATH_FIELD_NUMBER = 1;
  private serialization.generated.MptSerialization.MerklePrefixTrie path_;
  /**
   * <code>.serialization.generated.MerklePrefixTrie path = 1;</code>
   */
  public boolean hasPath() {
    return path_ != null;
  }
  /**
   * <code>.serialization.generated.MerklePrefixTrie path = 1;</code>
   */
  public serialization.generated.MptSerialization.MerklePrefixTrie getPath() {
    return path_ == null ? serialization.generated.MptSerialization.MerklePrefixTrie.getDefaultInstance() : path_;
  }
  /**
   * <code>.serialization.generated.MerklePrefixTrie path = 1;</code>
   */
  public serialization.generated.MptSerialization.MerklePrefixTrieOrBuilder getPathOrBuilder() {
    return getPath();
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
    if (path_ != null) {
      output.writeMessage(1, getPath());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (path_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPath());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.bverify.PathResponse)) {
      return super.equals(obj);
    }
    io.grpc.bverify.PathResponse other = (io.grpc.bverify.PathResponse) obj;

    boolean result = true;
    result = result && (hasPath() == other.hasPath());
    if (hasPath()) {
      result = result && getPath()
          .equals(other.getPath());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPath()) {
      hash = (37 * hash) + PATH_FIELD_NUMBER;
      hash = (53 * hash) + getPath().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.bverify.PathResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.bverify.PathResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.bverify.PathResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.bverify.PathResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.bverify.PathResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.bverify.PathResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.bverify.PathResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.bverify.PathResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.bverify.PathResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.bverify.PathResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.bverify.PathResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.bverify.PathResponse parseFrom(
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
  public static Builder newBuilder(io.grpc.bverify.PathResponse prototype) {
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
   * Protobuf type {@code api.PathResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.PathResponse)
      io.grpc.bverify.PathResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.bverify.BVerifyAPI.internal_static_api_PathResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.bverify.BVerifyAPI.internal_static_api_PathResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.bverify.PathResponse.class, io.grpc.bverify.PathResponse.Builder.class);
    }

    // Construct using io.grpc.bverify.PathResponse.newBuilder()
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
      if (pathBuilder_ == null) {
        path_ = null;
      } else {
        path_ = null;
        pathBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.bverify.BVerifyAPI.internal_static_api_PathResponse_descriptor;
    }

    public io.grpc.bverify.PathResponse getDefaultInstanceForType() {
      return io.grpc.bverify.PathResponse.getDefaultInstance();
    }

    public io.grpc.bverify.PathResponse build() {
      io.grpc.bverify.PathResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.bverify.PathResponse buildPartial() {
      io.grpc.bverify.PathResponse result = new io.grpc.bverify.PathResponse(this);
      if (pathBuilder_ == null) {
        result.path_ = path_;
      } else {
        result.path_ = pathBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.bverify.PathResponse) {
        return mergeFrom((io.grpc.bverify.PathResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.bverify.PathResponse other) {
      if (other == io.grpc.bverify.PathResponse.getDefaultInstance()) return this;
      if (other.hasPath()) {
        mergePath(other.getPath());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      io.grpc.bverify.PathResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.bverify.PathResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private serialization.generated.MptSerialization.MerklePrefixTrie path_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        serialization.generated.MptSerialization.MerklePrefixTrie, serialization.generated.MptSerialization.MerklePrefixTrie.Builder, serialization.generated.MptSerialization.MerklePrefixTrieOrBuilder> pathBuilder_;
    /**
     * <code>.serialization.generated.MerklePrefixTrie path = 1;</code>
     */
    public boolean hasPath() {
      return pathBuilder_ != null || path_ != null;
    }
    /**
     * <code>.serialization.generated.MerklePrefixTrie path = 1;</code>
     */
    public serialization.generated.MptSerialization.MerklePrefixTrie getPath() {
      if (pathBuilder_ == null) {
        return path_ == null ? serialization.generated.MptSerialization.MerklePrefixTrie.getDefaultInstance() : path_;
      } else {
        return pathBuilder_.getMessage();
      }
    }
    /**
     * <code>.serialization.generated.MerklePrefixTrie path = 1;</code>
     */
    public Builder setPath(serialization.generated.MptSerialization.MerklePrefixTrie value) {
      if (pathBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        path_ = value;
        onChanged();
      } else {
        pathBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.serialization.generated.MerklePrefixTrie path = 1;</code>
     */
    public Builder setPath(
        serialization.generated.MptSerialization.MerklePrefixTrie.Builder builderForValue) {
      if (pathBuilder_ == null) {
        path_ = builderForValue.build();
        onChanged();
      } else {
        pathBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.serialization.generated.MerklePrefixTrie path = 1;</code>
     */
    public Builder mergePath(serialization.generated.MptSerialization.MerklePrefixTrie value) {
      if (pathBuilder_ == null) {
        if (path_ != null) {
          path_ =
            serialization.generated.MptSerialization.MerklePrefixTrie.newBuilder(path_).mergeFrom(value).buildPartial();
        } else {
          path_ = value;
        }
        onChanged();
      } else {
        pathBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.serialization.generated.MerklePrefixTrie path = 1;</code>
     */
    public Builder clearPath() {
      if (pathBuilder_ == null) {
        path_ = null;
        onChanged();
      } else {
        path_ = null;
        pathBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.serialization.generated.MerklePrefixTrie path = 1;</code>
     */
    public serialization.generated.MptSerialization.MerklePrefixTrie.Builder getPathBuilder() {
      
      onChanged();
      return getPathFieldBuilder().getBuilder();
    }
    /**
     * <code>.serialization.generated.MerklePrefixTrie path = 1;</code>
     */
    public serialization.generated.MptSerialization.MerklePrefixTrieOrBuilder getPathOrBuilder() {
      if (pathBuilder_ != null) {
        return pathBuilder_.getMessageOrBuilder();
      } else {
        return path_ == null ?
            serialization.generated.MptSerialization.MerklePrefixTrie.getDefaultInstance() : path_;
      }
    }
    /**
     * <code>.serialization.generated.MerklePrefixTrie path = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        serialization.generated.MptSerialization.MerklePrefixTrie, serialization.generated.MptSerialization.MerklePrefixTrie.Builder, serialization.generated.MptSerialization.MerklePrefixTrieOrBuilder> 
        getPathFieldBuilder() {
      if (pathBuilder_ == null) {
        pathBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            serialization.generated.MptSerialization.MerklePrefixTrie, serialization.generated.MptSerialization.MerklePrefixTrie.Builder, serialization.generated.MptSerialization.MerklePrefixTrieOrBuilder>(
                getPath(),
                getParentForChildren(),
                isClean());
        path_ = null;
      }
      return pathBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.PathResponse)
  }

  // @@protoc_insertion_point(class_scope:api.PathResponse)
  private static final io.grpc.bverify.PathResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.bverify.PathResponse();
  }

  public static io.grpc.bverify.PathResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PathResponse>
      PARSER = new com.google.protobuf.AbstractParser<PathResponse>() {
    public PathResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PathResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PathResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PathResponse> getParserForType() {
    return PARSER;
  }

  public io.grpc.bverify.PathResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

