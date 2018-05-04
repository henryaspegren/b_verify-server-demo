// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/api.proto

package io.grpc.bverify;

/**
 * <pre>
 **
 *	Node in the merkle prefix trie 
 * </pre>
 *
 * Protobuf type {@code bverify.Node}
 */
public  final class Node extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bverify.Node)
    NodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Node.newBuilder() to construct.
  private Node(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Node() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Node(
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
            io.grpc.bverify.InteriorNode.Builder subBuilder = null;
            if (nodeCase_ == 1) {
              subBuilder = ((io.grpc.bverify.InteriorNode) node_).toBuilder();
            }
            node_ =
                input.readMessage(io.grpc.bverify.InteriorNode.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.grpc.bverify.InteriorNode) node_);
              node_ = subBuilder.buildPartial();
            }
            nodeCase_ = 1;
            break;
          }
          case 18: {
            io.grpc.bverify.Leaf.Builder subBuilder = null;
            if (nodeCase_ == 2) {
              subBuilder = ((io.grpc.bverify.Leaf) node_).toBuilder();
            }
            node_ =
                input.readMessage(io.grpc.bverify.Leaf.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.grpc.bverify.Leaf) node_);
              node_ = subBuilder.buildPartial();
            }
            nodeCase_ = 2;
            break;
          }
          case 26: {
            io.grpc.bverify.Stub.Builder subBuilder = null;
            if (nodeCase_ == 3) {
              subBuilder = ((io.grpc.bverify.Stub) node_).toBuilder();
            }
            node_ =
                input.readMessage(io.grpc.bverify.Stub.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.grpc.bverify.Stub) node_);
              node_ = subBuilder.buildPartial();
            }
            nodeCase_ = 3;
            break;
          }
          case 34: {
            io.grpc.bverify.EmptyLeaf.Builder subBuilder = null;
            if (nodeCase_ == 4) {
              subBuilder = ((io.grpc.bverify.EmptyLeaf) node_).toBuilder();
            }
            node_ =
                input.readMessage(io.grpc.bverify.EmptyLeaf.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.grpc.bverify.EmptyLeaf) node_);
              node_ = subBuilder.buildPartial();
            }
            nodeCase_ = 4;
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
    return io.grpc.bverify.BVerifyAPI.internal_static_bverify_Node_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.bverify.BVerifyAPI.internal_static_bverify_Node_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.bverify.Node.class, io.grpc.bverify.Node.Builder.class);
  }

  private int nodeCase_ = 0;
  private java.lang.Object node_;
  public enum NodeCase
      implements com.google.protobuf.Internal.EnumLite {
    INTERIOR_NODE(1),
    LEAF(2),
    STUB(3),
    EMPTYLEAF(4),
    NODE_NOT_SET(0);
    private final int value;
    private NodeCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static NodeCase valueOf(int value) {
      return forNumber(value);
    }

    public static NodeCase forNumber(int value) {
      switch (value) {
        case 1: return INTERIOR_NODE;
        case 2: return LEAF;
        case 3: return STUB;
        case 4: return EMPTYLEAF;
        case 0: return NODE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public NodeCase
  getNodeCase() {
    return NodeCase.forNumber(
        nodeCase_);
  }

  public static final int INTERIOR_NODE_FIELD_NUMBER = 1;
  /**
   * <code>.bverify.InteriorNode interior_node = 1;</code>
   */
  public boolean hasInteriorNode() {
    return nodeCase_ == 1;
  }
  /**
   * <code>.bverify.InteriorNode interior_node = 1;</code>
   */
  public io.grpc.bverify.InteriorNode getInteriorNode() {
    if (nodeCase_ == 1) {
       return (io.grpc.bverify.InteriorNode) node_;
    }
    return io.grpc.bverify.InteriorNode.getDefaultInstance();
  }
  /**
   * <code>.bverify.InteriorNode interior_node = 1;</code>
   */
  public io.grpc.bverify.InteriorNodeOrBuilder getInteriorNodeOrBuilder() {
    if (nodeCase_ == 1) {
       return (io.grpc.bverify.InteriorNode) node_;
    }
    return io.grpc.bverify.InteriorNode.getDefaultInstance();
  }

  public static final int LEAF_FIELD_NUMBER = 2;
  /**
   * <code>.bverify.Leaf leaf = 2;</code>
   */
  public boolean hasLeaf() {
    return nodeCase_ == 2;
  }
  /**
   * <code>.bverify.Leaf leaf = 2;</code>
   */
  public io.grpc.bverify.Leaf getLeaf() {
    if (nodeCase_ == 2) {
       return (io.grpc.bverify.Leaf) node_;
    }
    return io.grpc.bverify.Leaf.getDefaultInstance();
  }
  /**
   * <code>.bverify.Leaf leaf = 2;</code>
   */
  public io.grpc.bverify.LeafOrBuilder getLeafOrBuilder() {
    if (nodeCase_ == 2) {
       return (io.grpc.bverify.Leaf) node_;
    }
    return io.grpc.bverify.Leaf.getDefaultInstance();
  }

  public static final int STUB_FIELD_NUMBER = 3;
  /**
   * <code>.bverify.Stub stub = 3;</code>
   */
  public boolean hasStub() {
    return nodeCase_ == 3;
  }
  /**
   * <code>.bverify.Stub stub = 3;</code>
   */
  public io.grpc.bverify.Stub getStub() {
    if (nodeCase_ == 3) {
       return (io.grpc.bverify.Stub) node_;
    }
    return io.grpc.bverify.Stub.getDefaultInstance();
  }
  /**
   * <code>.bverify.Stub stub = 3;</code>
   */
  public io.grpc.bverify.StubOrBuilder getStubOrBuilder() {
    if (nodeCase_ == 3) {
       return (io.grpc.bverify.Stub) node_;
    }
    return io.grpc.bverify.Stub.getDefaultInstance();
  }

  public static final int EMPTYLEAF_FIELD_NUMBER = 4;
  /**
   * <code>.bverify.EmptyLeaf emptyleaf = 4;</code>
   */
  public boolean hasEmptyleaf() {
    return nodeCase_ == 4;
  }
  /**
   * <code>.bverify.EmptyLeaf emptyleaf = 4;</code>
   */
  public io.grpc.bverify.EmptyLeaf getEmptyleaf() {
    if (nodeCase_ == 4) {
       return (io.grpc.bverify.EmptyLeaf) node_;
    }
    return io.grpc.bverify.EmptyLeaf.getDefaultInstance();
  }
  /**
   * <code>.bverify.EmptyLeaf emptyleaf = 4;</code>
   */
  public io.grpc.bverify.EmptyLeafOrBuilder getEmptyleafOrBuilder() {
    if (nodeCase_ == 4) {
       return (io.grpc.bverify.EmptyLeaf) node_;
    }
    return io.grpc.bverify.EmptyLeaf.getDefaultInstance();
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
    if (nodeCase_ == 1) {
      output.writeMessage(1, (io.grpc.bverify.InteriorNode) node_);
    }
    if (nodeCase_ == 2) {
      output.writeMessage(2, (io.grpc.bverify.Leaf) node_);
    }
    if (nodeCase_ == 3) {
      output.writeMessage(3, (io.grpc.bverify.Stub) node_);
    }
    if (nodeCase_ == 4) {
      output.writeMessage(4, (io.grpc.bverify.EmptyLeaf) node_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nodeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (io.grpc.bverify.InteriorNode) node_);
    }
    if (nodeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (io.grpc.bverify.Leaf) node_);
    }
    if (nodeCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (io.grpc.bverify.Stub) node_);
    }
    if (nodeCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, (io.grpc.bverify.EmptyLeaf) node_);
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
    if (!(obj instanceof io.grpc.bverify.Node)) {
      return super.equals(obj);
    }
    io.grpc.bverify.Node other = (io.grpc.bverify.Node) obj;

    boolean result = true;
    result = result && getNodeCase().equals(
        other.getNodeCase());
    if (!result) return false;
    switch (nodeCase_) {
      case 1:
        result = result && getInteriorNode()
            .equals(other.getInteriorNode());
        break;
      case 2:
        result = result && getLeaf()
            .equals(other.getLeaf());
        break;
      case 3:
        result = result && getStub()
            .equals(other.getStub());
        break;
      case 4:
        result = result && getEmptyleaf()
            .equals(other.getEmptyleaf());
        break;
      case 0:
      default:
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
    switch (nodeCase_) {
      case 1:
        hash = (37 * hash) + INTERIOR_NODE_FIELD_NUMBER;
        hash = (53 * hash) + getInteriorNode().hashCode();
        break;
      case 2:
        hash = (37 * hash) + LEAF_FIELD_NUMBER;
        hash = (53 * hash) + getLeaf().hashCode();
        break;
      case 3:
        hash = (37 * hash) + STUB_FIELD_NUMBER;
        hash = (53 * hash) + getStub().hashCode();
        break;
      case 4:
        hash = (37 * hash) + EMPTYLEAF_FIELD_NUMBER;
        hash = (53 * hash) + getEmptyleaf().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.bverify.Node parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.bverify.Node parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.bverify.Node parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.bverify.Node parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.bverify.Node parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.bverify.Node parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.bverify.Node parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.bverify.Node parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.bverify.Node parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.bverify.Node parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.bverify.Node parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.bverify.Node parseFrom(
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
  public static Builder newBuilder(io.grpc.bverify.Node prototype) {
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
   **
   *	Node in the merkle prefix trie 
   * </pre>
   *
   * Protobuf type {@code bverify.Node}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bverify.Node)
      io.grpc.bverify.NodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.bverify.BVerifyAPI.internal_static_bverify_Node_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.bverify.BVerifyAPI.internal_static_bverify_Node_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.bverify.Node.class, io.grpc.bverify.Node.Builder.class);
    }

    // Construct using io.grpc.bverify.Node.newBuilder()
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
      nodeCase_ = 0;
      node_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.bverify.BVerifyAPI.internal_static_bverify_Node_descriptor;
    }

    public io.grpc.bverify.Node getDefaultInstanceForType() {
      return io.grpc.bverify.Node.getDefaultInstance();
    }

    public io.grpc.bverify.Node build() {
      io.grpc.bverify.Node result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.bverify.Node buildPartial() {
      io.grpc.bverify.Node result = new io.grpc.bverify.Node(this);
      if (nodeCase_ == 1) {
        if (interiorNodeBuilder_ == null) {
          result.node_ = node_;
        } else {
          result.node_ = interiorNodeBuilder_.build();
        }
      }
      if (nodeCase_ == 2) {
        if (leafBuilder_ == null) {
          result.node_ = node_;
        } else {
          result.node_ = leafBuilder_.build();
        }
      }
      if (nodeCase_ == 3) {
        if (stubBuilder_ == null) {
          result.node_ = node_;
        } else {
          result.node_ = stubBuilder_.build();
        }
      }
      if (nodeCase_ == 4) {
        if (emptyleafBuilder_ == null) {
          result.node_ = node_;
        } else {
          result.node_ = emptyleafBuilder_.build();
        }
      }
      result.nodeCase_ = nodeCase_;
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
      if (other instanceof io.grpc.bverify.Node) {
        return mergeFrom((io.grpc.bverify.Node)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.bverify.Node other) {
      if (other == io.grpc.bverify.Node.getDefaultInstance()) return this;
      switch (other.getNodeCase()) {
        case INTERIOR_NODE: {
          mergeInteriorNode(other.getInteriorNode());
          break;
        }
        case LEAF: {
          mergeLeaf(other.getLeaf());
          break;
        }
        case STUB: {
          mergeStub(other.getStub());
          break;
        }
        case EMPTYLEAF: {
          mergeEmptyleaf(other.getEmptyleaf());
          break;
        }
        case NODE_NOT_SET: {
          break;
        }
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
      io.grpc.bverify.Node parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.bverify.Node) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int nodeCase_ = 0;
    private java.lang.Object node_;
    public NodeCase
        getNodeCase() {
      return NodeCase.forNumber(
          nodeCase_);
    }

    public Builder clearNode() {
      nodeCase_ = 0;
      node_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.bverify.InteriorNode, io.grpc.bverify.InteriorNode.Builder, io.grpc.bverify.InteriorNodeOrBuilder> interiorNodeBuilder_;
    /**
     * <code>.bverify.InteriorNode interior_node = 1;</code>
     */
    public boolean hasInteriorNode() {
      return nodeCase_ == 1;
    }
    /**
     * <code>.bverify.InteriorNode interior_node = 1;</code>
     */
    public io.grpc.bverify.InteriorNode getInteriorNode() {
      if (interiorNodeBuilder_ == null) {
        if (nodeCase_ == 1) {
          return (io.grpc.bverify.InteriorNode) node_;
        }
        return io.grpc.bverify.InteriorNode.getDefaultInstance();
      } else {
        if (nodeCase_ == 1) {
          return interiorNodeBuilder_.getMessage();
        }
        return io.grpc.bverify.InteriorNode.getDefaultInstance();
      }
    }
    /**
     * <code>.bverify.InteriorNode interior_node = 1;</code>
     */
    public Builder setInteriorNode(io.grpc.bverify.InteriorNode value) {
      if (interiorNodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        node_ = value;
        onChanged();
      } else {
        interiorNodeBuilder_.setMessage(value);
      }
      nodeCase_ = 1;
      return this;
    }
    /**
     * <code>.bverify.InteriorNode interior_node = 1;</code>
     */
    public Builder setInteriorNode(
        io.grpc.bverify.InteriorNode.Builder builderForValue) {
      if (interiorNodeBuilder_ == null) {
        node_ = builderForValue.build();
        onChanged();
      } else {
        interiorNodeBuilder_.setMessage(builderForValue.build());
      }
      nodeCase_ = 1;
      return this;
    }
    /**
     * <code>.bverify.InteriorNode interior_node = 1;</code>
     */
    public Builder mergeInteriorNode(io.grpc.bverify.InteriorNode value) {
      if (interiorNodeBuilder_ == null) {
        if (nodeCase_ == 1 &&
            node_ != io.grpc.bverify.InteriorNode.getDefaultInstance()) {
          node_ = io.grpc.bverify.InteriorNode.newBuilder((io.grpc.bverify.InteriorNode) node_)
              .mergeFrom(value).buildPartial();
        } else {
          node_ = value;
        }
        onChanged();
      } else {
        if (nodeCase_ == 1) {
          interiorNodeBuilder_.mergeFrom(value);
        }
        interiorNodeBuilder_.setMessage(value);
      }
      nodeCase_ = 1;
      return this;
    }
    /**
     * <code>.bverify.InteriorNode interior_node = 1;</code>
     */
    public Builder clearInteriorNode() {
      if (interiorNodeBuilder_ == null) {
        if (nodeCase_ == 1) {
          nodeCase_ = 0;
          node_ = null;
          onChanged();
        }
      } else {
        if (nodeCase_ == 1) {
          nodeCase_ = 0;
          node_ = null;
        }
        interiorNodeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.bverify.InteriorNode interior_node = 1;</code>
     */
    public io.grpc.bverify.InteriorNode.Builder getInteriorNodeBuilder() {
      return getInteriorNodeFieldBuilder().getBuilder();
    }
    /**
     * <code>.bverify.InteriorNode interior_node = 1;</code>
     */
    public io.grpc.bverify.InteriorNodeOrBuilder getInteriorNodeOrBuilder() {
      if ((nodeCase_ == 1) && (interiorNodeBuilder_ != null)) {
        return interiorNodeBuilder_.getMessageOrBuilder();
      } else {
        if (nodeCase_ == 1) {
          return (io.grpc.bverify.InteriorNode) node_;
        }
        return io.grpc.bverify.InteriorNode.getDefaultInstance();
      }
    }
    /**
     * <code>.bverify.InteriorNode interior_node = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.bverify.InteriorNode, io.grpc.bverify.InteriorNode.Builder, io.grpc.bverify.InteriorNodeOrBuilder> 
        getInteriorNodeFieldBuilder() {
      if (interiorNodeBuilder_ == null) {
        if (!(nodeCase_ == 1)) {
          node_ = io.grpc.bverify.InteriorNode.getDefaultInstance();
        }
        interiorNodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.bverify.InteriorNode, io.grpc.bverify.InteriorNode.Builder, io.grpc.bverify.InteriorNodeOrBuilder>(
                (io.grpc.bverify.InteriorNode) node_,
                getParentForChildren(),
                isClean());
        node_ = null;
      }
      nodeCase_ = 1;
      onChanged();;
      return interiorNodeBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.bverify.Leaf, io.grpc.bverify.Leaf.Builder, io.grpc.bverify.LeafOrBuilder> leafBuilder_;
    /**
     * <code>.bverify.Leaf leaf = 2;</code>
     */
    public boolean hasLeaf() {
      return nodeCase_ == 2;
    }
    /**
     * <code>.bverify.Leaf leaf = 2;</code>
     */
    public io.grpc.bverify.Leaf getLeaf() {
      if (leafBuilder_ == null) {
        if (nodeCase_ == 2) {
          return (io.grpc.bverify.Leaf) node_;
        }
        return io.grpc.bverify.Leaf.getDefaultInstance();
      } else {
        if (nodeCase_ == 2) {
          return leafBuilder_.getMessage();
        }
        return io.grpc.bverify.Leaf.getDefaultInstance();
      }
    }
    /**
     * <code>.bverify.Leaf leaf = 2;</code>
     */
    public Builder setLeaf(io.grpc.bverify.Leaf value) {
      if (leafBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        node_ = value;
        onChanged();
      } else {
        leafBuilder_.setMessage(value);
      }
      nodeCase_ = 2;
      return this;
    }
    /**
     * <code>.bverify.Leaf leaf = 2;</code>
     */
    public Builder setLeaf(
        io.grpc.bverify.Leaf.Builder builderForValue) {
      if (leafBuilder_ == null) {
        node_ = builderForValue.build();
        onChanged();
      } else {
        leafBuilder_.setMessage(builderForValue.build());
      }
      nodeCase_ = 2;
      return this;
    }
    /**
     * <code>.bverify.Leaf leaf = 2;</code>
     */
    public Builder mergeLeaf(io.grpc.bverify.Leaf value) {
      if (leafBuilder_ == null) {
        if (nodeCase_ == 2 &&
            node_ != io.grpc.bverify.Leaf.getDefaultInstance()) {
          node_ = io.grpc.bverify.Leaf.newBuilder((io.grpc.bverify.Leaf) node_)
              .mergeFrom(value).buildPartial();
        } else {
          node_ = value;
        }
        onChanged();
      } else {
        if (nodeCase_ == 2) {
          leafBuilder_.mergeFrom(value);
        }
        leafBuilder_.setMessage(value);
      }
      nodeCase_ = 2;
      return this;
    }
    /**
     * <code>.bverify.Leaf leaf = 2;</code>
     */
    public Builder clearLeaf() {
      if (leafBuilder_ == null) {
        if (nodeCase_ == 2) {
          nodeCase_ = 0;
          node_ = null;
          onChanged();
        }
      } else {
        if (nodeCase_ == 2) {
          nodeCase_ = 0;
          node_ = null;
        }
        leafBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.bverify.Leaf leaf = 2;</code>
     */
    public io.grpc.bverify.Leaf.Builder getLeafBuilder() {
      return getLeafFieldBuilder().getBuilder();
    }
    /**
     * <code>.bverify.Leaf leaf = 2;</code>
     */
    public io.grpc.bverify.LeafOrBuilder getLeafOrBuilder() {
      if ((nodeCase_ == 2) && (leafBuilder_ != null)) {
        return leafBuilder_.getMessageOrBuilder();
      } else {
        if (nodeCase_ == 2) {
          return (io.grpc.bverify.Leaf) node_;
        }
        return io.grpc.bverify.Leaf.getDefaultInstance();
      }
    }
    /**
     * <code>.bverify.Leaf leaf = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.bverify.Leaf, io.grpc.bverify.Leaf.Builder, io.grpc.bverify.LeafOrBuilder> 
        getLeafFieldBuilder() {
      if (leafBuilder_ == null) {
        if (!(nodeCase_ == 2)) {
          node_ = io.grpc.bverify.Leaf.getDefaultInstance();
        }
        leafBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.bverify.Leaf, io.grpc.bverify.Leaf.Builder, io.grpc.bverify.LeafOrBuilder>(
                (io.grpc.bverify.Leaf) node_,
                getParentForChildren(),
                isClean());
        node_ = null;
      }
      nodeCase_ = 2;
      onChanged();;
      return leafBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.bverify.Stub, io.grpc.bverify.Stub.Builder, io.grpc.bverify.StubOrBuilder> stubBuilder_;
    /**
     * <code>.bverify.Stub stub = 3;</code>
     */
    public boolean hasStub() {
      return nodeCase_ == 3;
    }
    /**
     * <code>.bverify.Stub stub = 3;</code>
     */
    public io.grpc.bverify.Stub getStub() {
      if (stubBuilder_ == null) {
        if (nodeCase_ == 3) {
          return (io.grpc.bverify.Stub) node_;
        }
        return io.grpc.bverify.Stub.getDefaultInstance();
      } else {
        if (nodeCase_ == 3) {
          return stubBuilder_.getMessage();
        }
        return io.grpc.bverify.Stub.getDefaultInstance();
      }
    }
    /**
     * <code>.bverify.Stub stub = 3;</code>
     */
    public Builder setStub(io.grpc.bverify.Stub value) {
      if (stubBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        node_ = value;
        onChanged();
      } else {
        stubBuilder_.setMessage(value);
      }
      nodeCase_ = 3;
      return this;
    }
    /**
     * <code>.bverify.Stub stub = 3;</code>
     */
    public Builder setStub(
        io.grpc.bverify.Stub.Builder builderForValue) {
      if (stubBuilder_ == null) {
        node_ = builderForValue.build();
        onChanged();
      } else {
        stubBuilder_.setMessage(builderForValue.build());
      }
      nodeCase_ = 3;
      return this;
    }
    /**
     * <code>.bverify.Stub stub = 3;</code>
     */
    public Builder mergeStub(io.grpc.bverify.Stub value) {
      if (stubBuilder_ == null) {
        if (nodeCase_ == 3 &&
            node_ != io.grpc.bverify.Stub.getDefaultInstance()) {
          node_ = io.grpc.bverify.Stub.newBuilder((io.grpc.bverify.Stub) node_)
              .mergeFrom(value).buildPartial();
        } else {
          node_ = value;
        }
        onChanged();
      } else {
        if (nodeCase_ == 3) {
          stubBuilder_.mergeFrom(value);
        }
        stubBuilder_.setMessage(value);
      }
      nodeCase_ = 3;
      return this;
    }
    /**
     * <code>.bverify.Stub stub = 3;</code>
     */
    public Builder clearStub() {
      if (stubBuilder_ == null) {
        if (nodeCase_ == 3) {
          nodeCase_ = 0;
          node_ = null;
          onChanged();
        }
      } else {
        if (nodeCase_ == 3) {
          nodeCase_ = 0;
          node_ = null;
        }
        stubBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.bverify.Stub stub = 3;</code>
     */
    public io.grpc.bverify.Stub.Builder getStubBuilder() {
      return getStubFieldBuilder().getBuilder();
    }
    /**
     * <code>.bverify.Stub stub = 3;</code>
     */
    public io.grpc.bverify.StubOrBuilder getStubOrBuilder() {
      if ((nodeCase_ == 3) && (stubBuilder_ != null)) {
        return stubBuilder_.getMessageOrBuilder();
      } else {
        if (nodeCase_ == 3) {
          return (io.grpc.bverify.Stub) node_;
        }
        return io.grpc.bverify.Stub.getDefaultInstance();
      }
    }
    /**
     * <code>.bverify.Stub stub = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.bverify.Stub, io.grpc.bverify.Stub.Builder, io.grpc.bverify.StubOrBuilder> 
        getStubFieldBuilder() {
      if (stubBuilder_ == null) {
        if (!(nodeCase_ == 3)) {
          node_ = io.grpc.bverify.Stub.getDefaultInstance();
        }
        stubBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.bverify.Stub, io.grpc.bverify.Stub.Builder, io.grpc.bverify.StubOrBuilder>(
                (io.grpc.bverify.Stub) node_,
                getParentForChildren(),
                isClean());
        node_ = null;
      }
      nodeCase_ = 3;
      onChanged();;
      return stubBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.bverify.EmptyLeaf, io.grpc.bverify.EmptyLeaf.Builder, io.grpc.bverify.EmptyLeafOrBuilder> emptyleafBuilder_;
    /**
     * <code>.bverify.EmptyLeaf emptyleaf = 4;</code>
     */
    public boolean hasEmptyleaf() {
      return nodeCase_ == 4;
    }
    /**
     * <code>.bverify.EmptyLeaf emptyleaf = 4;</code>
     */
    public io.grpc.bverify.EmptyLeaf getEmptyleaf() {
      if (emptyleafBuilder_ == null) {
        if (nodeCase_ == 4) {
          return (io.grpc.bverify.EmptyLeaf) node_;
        }
        return io.grpc.bverify.EmptyLeaf.getDefaultInstance();
      } else {
        if (nodeCase_ == 4) {
          return emptyleafBuilder_.getMessage();
        }
        return io.grpc.bverify.EmptyLeaf.getDefaultInstance();
      }
    }
    /**
     * <code>.bverify.EmptyLeaf emptyleaf = 4;</code>
     */
    public Builder setEmptyleaf(io.grpc.bverify.EmptyLeaf value) {
      if (emptyleafBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        node_ = value;
        onChanged();
      } else {
        emptyleafBuilder_.setMessage(value);
      }
      nodeCase_ = 4;
      return this;
    }
    /**
     * <code>.bverify.EmptyLeaf emptyleaf = 4;</code>
     */
    public Builder setEmptyleaf(
        io.grpc.bverify.EmptyLeaf.Builder builderForValue) {
      if (emptyleafBuilder_ == null) {
        node_ = builderForValue.build();
        onChanged();
      } else {
        emptyleafBuilder_.setMessage(builderForValue.build());
      }
      nodeCase_ = 4;
      return this;
    }
    /**
     * <code>.bverify.EmptyLeaf emptyleaf = 4;</code>
     */
    public Builder mergeEmptyleaf(io.grpc.bverify.EmptyLeaf value) {
      if (emptyleafBuilder_ == null) {
        if (nodeCase_ == 4 &&
            node_ != io.grpc.bverify.EmptyLeaf.getDefaultInstance()) {
          node_ = io.grpc.bverify.EmptyLeaf.newBuilder((io.grpc.bverify.EmptyLeaf) node_)
              .mergeFrom(value).buildPartial();
        } else {
          node_ = value;
        }
        onChanged();
      } else {
        if (nodeCase_ == 4) {
          emptyleafBuilder_.mergeFrom(value);
        }
        emptyleafBuilder_.setMessage(value);
      }
      nodeCase_ = 4;
      return this;
    }
    /**
     * <code>.bverify.EmptyLeaf emptyleaf = 4;</code>
     */
    public Builder clearEmptyleaf() {
      if (emptyleafBuilder_ == null) {
        if (nodeCase_ == 4) {
          nodeCase_ = 0;
          node_ = null;
          onChanged();
        }
      } else {
        if (nodeCase_ == 4) {
          nodeCase_ = 0;
          node_ = null;
        }
        emptyleafBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.bverify.EmptyLeaf emptyleaf = 4;</code>
     */
    public io.grpc.bverify.EmptyLeaf.Builder getEmptyleafBuilder() {
      return getEmptyleafFieldBuilder().getBuilder();
    }
    /**
     * <code>.bverify.EmptyLeaf emptyleaf = 4;</code>
     */
    public io.grpc.bverify.EmptyLeafOrBuilder getEmptyleafOrBuilder() {
      if ((nodeCase_ == 4) && (emptyleafBuilder_ != null)) {
        return emptyleafBuilder_.getMessageOrBuilder();
      } else {
        if (nodeCase_ == 4) {
          return (io.grpc.bverify.EmptyLeaf) node_;
        }
        return io.grpc.bverify.EmptyLeaf.getDefaultInstance();
      }
    }
    /**
     * <code>.bverify.EmptyLeaf emptyleaf = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.bverify.EmptyLeaf, io.grpc.bverify.EmptyLeaf.Builder, io.grpc.bverify.EmptyLeafOrBuilder> 
        getEmptyleafFieldBuilder() {
      if (emptyleafBuilder_ == null) {
        if (!(nodeCase_ == 4)) {
          node_ = io.grpc.bverify.EmptyLeaf.getDefaultInstance();
        }
        emptyleafBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.bverify.EmptyLeaf, io.grpc.bverify.EmptyLeaf.Builder, io.grpc.bverify.EmptyLeafOrBuilder>(
                (io.grpc.bverify.EmptyLeaf) node_,
                getParentForChildren(),
                isClean());
        node_ = null;
      }
      nodeCase_ = 4;
      onChanged();;
      return emptyleafBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bverify.Node)
  }

  // @@protoc_insertion_point(class_scope:bverify.Node)
  private static final io.grpc.bverify.Node DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.bverify.Node();
  }

  public static io.grpc.bverify.Node getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Node>
      PARSER = new com.google.protobuf.AbstractParser<Node>() {
    public Node parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Node(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Node> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Node> getParserForType() {
    return PARSER;
  }

  public io.grpc.bverify.Node getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

