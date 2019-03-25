// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: toaster.proto

package org.example.toaster;

/**
 * Protobuf type {@code toaster.BreadRequest}
 */
public  final class BreadRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:toaster.BreadRequest)
    BreadRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BreadRequest.newBuilder() to construct.
  private BreadRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BreadRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BreadRequest(
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
          case 10: {
            org.example.toaster.Bread.Builder subBuilder = null;
            if (bread_ != null) {
              subBuilder = bread_.toBuilder();
            }
            bread_ = input.readMessage(org.example.toaster.Bread.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bread_);
              bread_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
    return org.example.toaster.ToasterProto.internal_static_toaster_BreadRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.toaster.ToasterProto.internal_static_toaster_BreadRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.toaster.BreadRequest.class, org.example.toaster.BreadRequest.Builder.class);
  }

  public static final int BREAD_FIELD_NUMBER = 1;
  private org.example.toaster.Bread bread_;
  /**
   * <code>.toaster.Bread bread = 1;</code>
   */
  public boolean hasBread() {
    return bread_ != null;
  }
  /**
   * <code>.toaster.Bread bread = 1;</code>
   */
  public org.example.toaster.Bread getBread() {
    return bread_ == null ? org.example.toaster.Bread.getDefaultInstance() : bread_;
  }
  /**
   * <code>.toaster.Bread bread = 1;</code>
   */
  public org.example.toaster.BreadOrBuilder getBreadOrBuilder() {
    return getBread();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (bread_ != null) {
      output.writeMessage(1, getBread());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bread_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBread());
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
    if (!(obj instanceof org.example.toaster.BreadRequest)) {
      return super.equals(obj);
    }
    org.example.toaster.BreadRequest other = (org.example.toaster.BreadRequest) obj;

    boolean result = true;
    result = result && (hasBread() == other.hasBread());
    if (hasBread()) {
      result = result && getBread()
          .equals(other.getBread());
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
    if (hasBread()) {
      hash = (37 * hash) + BREAD_FIELD_NUMBER;
      hash = (53 * hash) + getBread().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.toaster.BreadRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.toaster.BreadRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.toaster.BreadRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.toaster.BreadRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.toaster.BreadRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.toaster.BreadRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.toaster.BreadRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.toaster.BreadRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.toaster.BreadRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.toaster.BreadRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.toaster.BreadRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.toaster.BreadRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.example.toaster.BreadRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code toaster.BreadRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:toaster.BreadRequest)
      org.example.toaster.BreadRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.toaster.ToasterProto.internal_static_toaster_BreadRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.toaster.ToasterProto.internal_static_toaster_BreadRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.toaster.BreadRequest.class, org.example.toaster.BreadRequest.Builder.class);
    }

    // Construct using org.example.toaster.BreadRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (breadBuilder_ == null) {
        bread_ = null;
      } else {
        bread_ = null;
        breadBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.toaster.ToasterProto.internal_static_toaster_BreadRequest_descriptor;
    }

    @java.lang.Override
    public org.example.toaster.BreadRequest getDefaultInstanceForType() {
      return org.example.toaster.BreadRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.toaster.BreadRequest build() {
      org.example.toaster.BreadRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.toaster.BreadRequest buildPartial() {
      org.example.toaster.BreadRequest result = new org.example.toaster.BreadRequest(this);
      if (breadBuilder_ == null) {
        result.bread_ = bread_;
      } else {
        result.bread_ = breadBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.example.toaster.BreadRequest) {
        return mergeFrom((org.example.toaster.BreadRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.toaster.BreadRequest other) {
      if (other == org.example.toaster.BreadRequest.getDefaultInstance()) return this;
      if (other.hasBread()) {
        mergeBread(other.getBread());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.example.toaster.BreadRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.example.toaster.BreadRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.example.toaster.Bread bread_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.example.toaster.Bread, org.example.toaster.Bread.Builder, org.example.toaster.BreadOrBuilder> breadBuilder_;
    /**
     * <code>.toaster.Bread bread = 1;</code>
     */
    public boolean hasBread() {
      return breadBuilder_ != null || bread_ != null;
    }
    /**
     * <code>.toaster.Bread bread = 1;</code>
     */
    public org.example.toaster.Bread getBread() {
      if (breadBuilder_ == null) {
        return bread_ == null ? org.example.toaster.Bread.getDefaultInstance() : bread_;
      } else {
        return breadBuilder_.getMessage();
      }
    }
    /**
     * <code>.toaster.Bread bread = 1;</code>
     */
    public Builder setBread(org.example.toaster.Bread value) {
      if (breadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bread_ = value;
        onChanged();
      } else {
        breadBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.toaster.Bread bread = 1;</code>
     */
    public Builder setBread(
        org.example.toaster.Bread.Builder builderForValue) {
      if (breadBuilder_ == null) {
        bread_ = builderForValue.build();
        onChanged();
      } else {
        breadBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.toaster.Bread bread = 1;</code>
     */
    public Builder mergeBread(org.example.toaster.Bread value) {
      if (breadBuilder_ == null) {
        if (bread_ != null) {
          bread_ =
            org.example.toaster.Bread.newBuilder(bread_).mergeFrom(value).buildPartial();
        } else {
          bread_ = value;
        }
        onChanged();
      } else {
        breadBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.toaster.Bread bread = 1;</code>
     */
    public Builder clearBread() {
      if (breadBuilder_ == null) {
        bread_ = null;
        onChanged();
      } else {
        bread_ = null;
        breadBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.toaster.Bread bread = 1;</code>
     */
    public org.example.toaster.Bread.Builder getBreadBuilder() {
      
      onChanged();
      return getBreadFieldBuilder().getBuilder();
    }
    /**
     * <code>.toaster.Bread bread = 1;</code>
     */
    public org.example.toaster.BreadOrBuilder getBreadOrBuilder() {
      if (breadBuilder_ != null) {
        return breadBuilder_.getMessageOrBuilder();
      } else {
        return bread_ == null ?
            org.example.toaster.Bread.getDefaultInstance() : bread_;
      }
    }
    /**
     * <code>.toaster.Bread bread = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.example.toaster.Bread, org.example.toaster.Bread.Builder, org.example.toaster.BreadOrBuilder> 
        getBreadFieldBuilder() {
      if (breadBuilder_ == null) {
        breadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.example.toaster.Bread, org.example.toaster.Bread.Builder, org.example.toaster.BreadOrBuilder>(
                getBread(),
                getParentForChildren(),
                isClean());
        bread_ = null;
      }
      return breadBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:toaster.BreadRequest)
  }

  // @@protoc_insertion_point(class_scope:toaster.BreadRequest)
  private static final org.example.toaster.BreadRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.toaster.BreadRequest();
  }

  public static org.example.toaster.BreadRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BreadRequest>
      PARSER = new com.google.protobuf.AbstractParser<BreadRequest>() {
    @java.lang.Override
    public BreadRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BreadRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BreadRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BreadRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.toaster.BreadRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

