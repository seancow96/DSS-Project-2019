// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speaker.proto

package org.example.speaker;

/**
 * Protobuf type {@code speaker.DeviceRequest}
 */
public  final class DeviceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speaker.DeviceRequest)
    DeviceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceRequest.newBuilder() to construct.
  private DeviceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeviceRequest(
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
            org.example.speaker.Speaker.Builder subBuilder = null;
            if (speaker_ != null) {
              subBuilder = speaker_.toBuilder();
            }
            speaker_ = input.readMessage(org.example.speaker.Speaker.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(speaker_);
              speaker_ = subBuilder.buildPartial();
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
    return org.example.speaker.SpeakerProto.internal_static_speaker_DeviceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.speaker.SpeakerProto.internal_static_speaker_DeviceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.speaker.DeviceRequest.class, org.example.speaker.DeviceRequest.Builder.class);
  }

  public static final int SPEAKER_FIELD_NUMBER = 1;
  private org.example.speaker.Speaker speaker_;
  /**
   * <code>.speaker.Speaker speaker = 1;</code>
   */
  public boolean hasSpeaker() {
    return speaker_ != null;
  }
  /**
   * <code>.speaker.Speaker speaker = 1;</code>
   */
  public org.example.speaker.Speaker getSpeaker() {
    return speaker_ == null ? org.example.speaker.Speaker.getDefaultInstance() : speaker_;
  }
  /**
   * <code>.speaker.Speaker speaker = 1;</code>
   */
  public org.example.speaker.SpeakerOrBuilder getSpeakerOrBuilder() {
    return getSpeaker();
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
    if (speaker_ != null) {
      output.writeMessage(1, getSpeaker());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (speaker_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSpeaker());
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
    if (!(obj instanceof org.example.speaker.DeviceRequest)) {
      return super.equals(obj);
    }
    org.example.speaker.DeviceRequest other = (org.example.speaker.DeviceRequest) obj;

    boolean result = true;
    result = result && (hasSpeaker() == other.hasSpeaker());
    if (hasSpeaker()) {
      result = result && getSpeaker()
          .equals(other.getSpeaker());
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
    if (hasSpeaker()) {
      hash = (37 * hash) + SPEAKER_FIELD_NUMBER;
      hash = (53 * hash) + getSpeaker().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.speaker.DeviceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.speaker.DeviceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.speaker.DeviceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.speaker.DeviceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.speaker.DeviceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.speaker.DeviceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.speaker.DeviceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.speaker.DeviceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.speaker.DeviceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.speaker.DeviceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.speaker.DeviceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.speaker.DeviceRequest parseFrom(
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
  public static Builder newBuilder(org.example.speaker.DeviceRequest prototype) {
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
   * Protobuf type {@code speaker.DeviceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speaker.DeviceRequest)
      org.example.speaker.DeviceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.speaker.SpeakerProto.internal_static_speaker_DeviceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.speaker.SpeakerProto.internal_static_speaker_DeviceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.speaker.DeviceRequest.class, org.example.speaker.DeviceRequest.Builder.class);
    }

    // Construct using org.example.speaker.DeviceRequest.newBuilder()
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
      if (speakerBuilder_ == null) {
        speaker_ = null;
      } else {
        speaker_ = null;
        speakerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.speaker.SpeakerProto.internal_static_speaker_DeviceRequest_descriptor;
    }

    @java.lang.Override
    public org.example.speaker.DeviceRequest getDefaultInstanceForType() {
      return org.example.speaker.DeviceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.speaker.DeviceRequest build() {
      org.example.speaker.DeviceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.speaker.DeviceRequest buildPartial() {
      org.example.speaker.DeviceRequest result = new org.example.speaker.DeviceRequest(this);
      if (speakerBuilder_ == null) {
        result.speaker_ = speaker_;
      } else {
        result.speaker_ = speakerBuilder_.build();
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
      if (other instanceof org.example.speaker.DeviceRequest) {
        return mergeFrom((org.example.speaker.DeviceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.speaker.DeviceRequest other) {
      if (other == org.example.speaker.DeviceRequest.getDefaultInstance()) return this;
      if (other.hasSpeaker()) {
        mergeSpeaker(other.getSpeaker());
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
      org.example.speaker.DeviceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.example.speaker.DeviceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.example.speaker.Speaker speaker_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.example.speaker.Speaker, org.example.speaker.Speaker.Builder, org.example.speaker.SpeakerOrBuilder> speakerBuilder_;
    /**
     * <code>.speaker.Speaker speaker = 1;</code>
     */
    public boolean hasSpeaker() {
      return speakerBuilder_ != null || speaker_ != null;
    }
    /**
     * <code>.speaker.Speaker speaker = 1;</code>
     */
    public org.example.speaker.Speaker getSpeaker() {
      if (speakerBuilder_ == null) {
        return speaker_ == null ? org.example.speaker.Speaker.getDefaultInstance() : speaker_;
      } else {
        return speakerBuilder_.getMessage();
      }
    }
    /**
     * <code>.speaker.Speaker speaker = 1;</code>
     */
    public Builder setSpeaker(org.example.speaker.Speaker value) {
      if (speakerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        speaker_ = value;
        onChanged();
      } else {
        speakerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.speaker.Speaker speaker = 1;</code>
     */
    public Builder setSpeaker(
        org.example.speaker.Speaker.Builder builderForValue) {
      if (speakerBuilder_ == null) {
        speaker_ = builderForValue.build();
        onChanged();
      } else {
        speakerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.speaker.Speaker speaker = 1;</code>
     */
    public Builder mergeSpeaker(org.example.speaker.Speaker value) {
      if (speakerBuilder_ == null) {
        if (speaker_ != null) {
          speaker_ =
            org.example.speaker.Speaker.newBuilder(speaker_).mergeFrom(value).buildPartial();
        } else {
          speaker_ = value;
        }
        onChanged();
      } else {
        speakerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.speaker.Speaker speaker = 1;</code>
     */
    public Builder clearSpeaker() {
      if (speakerBuilder_ == null) {
        speaker_ = null;
        onChanged();
      } else {
        speaker_ = null;
        speakerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.speaker.Speaker speaker = 1;</code>
     */
    public org.example.speaker.Speaker.Builder getSpeakerBuilder() {
      
      onChanged();
      return getSpeakerFieldBuilder().getBuilder();
    }
    /**
     * <code>.speaker.Speaker speaker = 1;</code>
     */
    public org.example.speaker.SpeakerOrBuilder getSpeakerOrBuilder() {
      if (speakerBuilder_ != null) {
        return speakerBuilder_.getMessageOrBuilder();
      } else {
        return speaker_ == null ?
            org.example.speaker.Speaker.getDefaultInstance() : speaker_;
      }
    }
    /**
     * <code>.speaker.Speaker speaker = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.example.speaker.Speaker, org.example.speaker.Speaker.Builder, org.example.speaker.SpeakerOrBuilder> 
        getSpeakerFieldBuilder() {
      if (speakerBuilder_ == null) {
        speakerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.example.speaker.Speaker, org.example.speaker.Speaker.Builder, org.example.speaker.SpeakerOrBuilder>(
                getSpeaker(),
                getParentForChildren(),
                isClean());
        speaker_ = null;
      }
      return speakerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:speaker.DeviceRequest)
  }

  // @@protoc_insertion_point(class_scope:speaker.DeviceRequest)
  private static final org.example.speaker.DeviceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.speaker.DeviceRequest();
  }

  public static org.example.speaker.DeviceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeviceRequest>() {
    @java.lang.Override
    public DeviceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeviceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeviceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.speaker.DeviceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

