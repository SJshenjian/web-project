// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package com.haotu369.tio.im.common.packets;

/**
 * <pre>
 **
 * 进入群组通知消息体
 * </pre>
 *
 * Protobuf type {@code JoinGroupNotifyRespBody}
 */
public  final class JoinGroupNotifyRespBody extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:JoinGroupNotifyRespBody)
    JoinGroupNotifyRespBodyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JoinGroupNotifyRespBody.newBuilder() to construct.
  private JoinGroupNotifyRespBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JoinGroupNotifyRespBody() {
    group_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JoinGroupNotifyRespBody(
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
            com.haotu369.tio.im.common.packets.Client.Builder subBuilder = null;
            if (client_ != null) {
              subBuilder = client_.toBuilder();
            }
            client_ = input.readMessage(com.haotu369.tio.im.common.packets.Client.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(client_);
              client_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            group_ = s;
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
    return com.haotu369.tio.im.common.packets.Chat.internal_static_JoinGroupNotifyRespBody_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.haotu369.tio.im.common.packets.Chat.internal_static_JoinGroupNotifyRespBody_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody.class, com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody.Builder.class);
  }

  public static final int CLIENT_FIELD_NUMBER = 1;
  private com.haotu369.tio.im.common.packets.Client client_;
  /**
   * <code>.Client client = 1;</code>
   */
  public boolean hasClient() {
    return client_ != null;
  }
  /**
   * <code>.Client client = 1;</code>
   */
  public com.haotu369.tio.im.common.packets.Client getClient() {
    return client_ == null ? com.haotu369.tio.im.common.packets.Client.getDefaultInstance() : client_;
  }
  /**
   * <code>.Client client = 1;</code>
   */
  public com.haotu369.tio.im.common.packets.ClientOrBuilder getClientOrBuilder() {
    return getClient();
  }

  public static final int GROUP_FIELD_NUMBER = 2;
  private volatile java.lang.Object group_;
  /**
   * <code>string group = 2;</code>
   */
  public java.lang.String getGroup() {
    java.lang.Object ref = group_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      group_ = s;
      return s;
    }
  }
  /**
   * <code>string group = 2;</code>
   */
  public com.google.protobuf.ByteString
      getGroupBytes() {
    java.lang.Object ref = group_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      group_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (client_ != null) {
      output.writeMessage(1, getClient());
    }
    if (!getGroupBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, group_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (client_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClient());
    }
    if (!getGroupBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, group_);
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
    if (!(obj instanceof com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody)) {
      return super.equals(obj);
    }
    com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody other = (com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody) obj;

    boolean result = true;
    result = result && (hasClient() == other.hasClient());
    if (hasClient()) {
      result = result && getClient()
          .equals(other.getClient());
    }
    result = result && getGroup()
        .equals(other.getGroup());
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
    if (hasClient()) {
      hash = (37 * hash) + CLIENT_FIELD_NUMBER;
      hash = (53 * hash) + getClient().hashCode();
    }
    hash = (37 * hash) + GROUP_FIELD_NUMBER;
    hash = (53 * hash) + getGroup().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody parseFrom(
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
  public static Builder newBuilder(com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody prototype) {
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
   * 进入群组通知消息体
   * </pre>
   *
   * Protobuf type {@code JoinGroupNotifyRespBody}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:JoinGroupNotifyRespBody)
      com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBodyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.haotu369.tio.im.common.packets.Chat.internal_static_JoinGroupNotifyRespBody_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.haotu369.tio.im.common.packets.Chat.internal_static_JoinGroupNotifyRespBody_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody.class, com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody.Builder.class);
    }

    // Construct using com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody.newBuilder()
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
      if (clientBuilder_ == null) {
        client_ = null;
      } else {
        client_ = null;
        clientBuilder_ = null;
      }
      group_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.haotu369.tio.im.common.packets.Chat.internal_static_JoinGroupNotifyRespBody_descriptor;
    }

    public com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody getDefaultInstanceForType() {
      return com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody.getDefaultInstance();
    }

    public com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody build() {
      com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody buildPartial() {
      com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody result = new com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody(this);
      if (clientBuilder_ == null) {
        result.client_ = client_;
      } else {
        result.client_ = clientBuilder_.build();
      }
      result.group_ = group_;
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
      if (other instanceof com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody) {
        return mergeFrom((com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody other) {
      if (other == com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody.getDefaultInstance()) return this;
      if (other.hasClient()) {
        mergeClient(other.getClient());
      }
      if (!other.getGroup().isEmpty()) {
        group_ = other.group_;
        onChanged();
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
      com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.haotu369.tio.im.common.packets.Client client_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.haotu369.tio.im.common.packets.Client, com.haotu369.tio.im.common.packets.Client.Builder, com.haotu369.tio.im.common.packets.ClientOrBuilder> clientBuilder_;
    /**
     * <code>.Client client = 1;</code>
     */
    public boolean hasClient() {
      return clientBuilder_ != null || client_ != null;
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public com.haotu369.tio.im.common.packets.Client getClient() {
      if (clientBuilder_ == null) {
        return client_ == null ? com.haotu369.tio.im.common.packets.Client.getDefaultInstance() : client_;
      } else {
        return clientBuilder_.getMessage();
      }
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public Builder setClient(com.haotu369.tio.im.common.packets.Client value) {
      if (clientBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        client_ = value;
        onChanged();
      } else {
        clientBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public Builder setClient(
        com.haotu369.tio.im.common.packets.Client.Builder builderForValue) {
      if (clientBuilder_ == null) {
        client_ = builderForValue.build();
        onChanged();
      } else {
        clientBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public Builder mergeClient(com.haotu369.tio.im.common.packets.Client value) {
      if (clientBuilder_ == null) {
        if (client_ != null) {
          client_ =
            com.haotu369.tio.im.common.packets.Client.newBuilder(client_).mergeFrom(value).buildPartial();
        } else {
          client_ = value;
        }
        onChanged();
      } else {
        clientBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public Builder clearClient() {
      if (clientBuilder_ == null) {
        client_ = null;
        onChanged();
      } else {
        client_ = null;
        clientBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public com.haotu369.tio.im.common.packets.Client.Builder getClientBuilder() {
      
      onChanged();
      return getClientFieldBuilder().getBuilder();
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public com.haotu369.tio.im.common.packets.ClientOrBuilder getClientOrBuilder() {
      if (clientBuilder_ != null) {
        return clientBuilder_.getMessageOrBuilder();
      } else {
        return client_ == null ?
            com.haotu369.tio.im.common.packets.Client.getDefaultInstance() : client_;
      }
    }
    /**
     * <code>.Client client = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.haotu369.tio.im.common.packets.Client, com.haotu369.tio.im.common.packets.Client.Builder, com.haotu369.tio.im.common.packets.ClientOrBuilder> 
        getClientFieldBuilder() {
      if (clientBuilder_ == null) {
        clientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.haotu369.tio.im.common.packets.Client, com.haotu369.tio.im.common.packets.Client.Builder, com.haotu369.tio.im.common.packets.ClientOrBuilder>(
                getClient(),
                getParentForChildren(),
                isClean());
        client_ = null;
      }
      return clientBuilder_;
    }

    private java.lang.Object group_ = "";
    /**
     * <code>string group = 2;</code>
     */
    public java.lang.String getGroup() {
      java.lang.Object ref = group_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        group_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string group = 2;</code>
     */
    public com.google.protobuf.ByteString
        getGroupBytes() {
      java.lang.Object ref = group_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        group_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string group = 2;</code>
     */
    public Builder setGroup(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      group_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string group = 2;</code>
     */
    public Builder clearGroup() {
      
      group_ = getDefaultInstance().getGroup();
      onChanged();
      return this;
    }
    /**
     * <code>string group = 2;</code>
     */
    public Builder setGroupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      group_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:JoinGroupNotifyRespBody)
  }

  // @@protoc_insertion_point(class_scope:JoinGroupNotifyRespBody)
  private static final com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody();
  }

  public static com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JoinGroupNotifyRespBody>
      PARSER = new com.google.protobuf.AbstractParser<JoinGroupNotifyRespBody>() {
    public JoinGroupNotifyRespBody parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JoinGroupNotifyRespBody(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JoinGroupNotifyRespBody> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JoinGroupNotifyRespBody> getParserForType() {
    return PARSER;
  }

  public com.haotu369.tio.im.common.packets.JoinGroupNotifyRespBody getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

