// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package com.haotu369.tio.im.common.packets;

/**
 * <pre>
 **
 * 登录响应
 * </pre>
 *
 * Protobuf type {@code LoginRespBody}
 */
public  final class LoginRespBody extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LoginRespBody)
    LoginRespBodyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoginRespBody.newBuilder() to construct.
  private LoginRespBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoginRespBody() {
    token_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LoginRespBody(
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
            java.lang.String s = input.readStringRequireUtf8();

            token_ = s;
            break;
          }
          case 18: {
            com.haotu369.tio.im.common.packets.User.Builder subBuilder = null;
            if (user_ != null) {
              subBuilder = user_.toBuilder();
            }
            user_ = input.readMessage(com.haotu369.tio.im.common.packets.User.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(user_);
              user_ = subBuilder.buildPartial();
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
    return com.haotu369.tio.im.common.packets.Chat.internal_static_LoginRespBody_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.haotu369.tio.im.common.packets.Chat.internal_static_LoginRespBody_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.haotu369.tio.im.common.packets.LoginRespBody.class, com.haotu369.tio.im.common.packets.LoginRespBody.Builder.class);
  }

  public static final int TOKEN_FIELD_NUMBER = 1;
  private volatile java.lang.Object token_;
  /**
   * <pre>
   *用于免密码的token，登录成功才有
   * </pre>
   *
   * <code>string token = 1;</code>
   */
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      token_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *用于免密码的token，登录成功才有
   * </pre>
   *
   * <code>string token = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_FIELD_NUMBER = 2;
  private com.haotu369.tio.im.common.packets.User user_;
  /**
   * <pre>
   *登录成功才有
   * </pre>
   *
   * <code>.User user = 2;</code>
   */
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <pre>
   *登录成功才有
   * </pre>
   *
   * <code>.User user = 2;</code>
   */
  public com.haotu369.tio.im.common.packets.User getUser() {
    return user_ == null ? com.haotu369.tio.im.common.packets.User.getDefaultInstance() : user_;
  }
  /**
   * <pre>
   *登录成功才有
   * </pre>
   *
   * <code>.User user = 2;</code>
   */
  public com.haotu369.tio.im.common.packets.UserOrBuilder getUserOrBuilder() {
    return getUser();
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
    if (!getTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, token_);
    }
    if (user_ != null) {
      output.writeMessage(2, getUser());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, token_);
    }
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUser());
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
    if (!(obj instanceof com.haotu369.tio.im.common.packets.LoginRespBody)) {
      return super.equals(obj);
    }
    com.haotu369.tio.im.common.packets.LoginRespBody other = (com.haotu369.tio.im.common.packets.LoginRespBody) obj;

    boolean result = true;
    result = result && getToken()
        .equals(other.getToken());
    result = result && (hasUser() == other.hasUser());
    if (hasUser()) {
      result = result && getUser()
          .equals(other.getUser());
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
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.haotu369.tio.im.common.packets.LoginRespBody parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.haotu369.tio.im.common.packets.LoginRespBody parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.haotu369.tio.im.common.packets.LoginRespBody parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.haotu369.tio.im.common.packets.LoginRespBody parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.haotu369.tio.im.common.packets.LoginRespBody parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.haotu369.tio.im.common.packets.LoginRespBody parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.haotu369.tio.im.common.packets.LoginRespBody parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.haotu369.tio.im.common.packets.LoginRespBody parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.haotu369.tio.im.common.packets.LoginRespBody parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.haotu369.tio.im.common.packets.LoginRespBody parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.haotu369.tio.im.common.packets.LoginRespBody parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.haotu369.tio.im.common.packets.LoginRespBody parseFrom(
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
  public static Builder newBuilder(com.haotu369.tio.im.common.packets.LoginRespBody prototype) {
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
   * 登录响应
   * </pre>
   *
   * Protobuf type {@code LoginRespBody}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LoginRespBody)
      com.haotu369.tio.im.common.packets.LoginRespBodyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.haotu369.tio.im.common.packets.Chat.internal_static_LoginRespBody_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.haotu369.tio.im.common.packets.Chat.internal_static_LoginRespBody_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.haotu369.tio.im.common.packets.LoginRespBody.class, com.haotu369.tio.im.common.packets.LoginRespBody.Builder.class);
    }

    // Construct using com.haotu369.tio.im.common.packets.LoginRespBody.newBuilder()
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
      token_ = "";

      if (userBuilder_ == null) {
        user_ = null;
      } else {
        user_ = null;
        userBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.haotu369.tio.im.common.packets.Chat.internal_static_LoginRespBody_descriptor;
    }

    public com.haotu369.tio.im.common.packets.LoginRespBody getDefaultInstanceForType() {
      return com.haotu369.tio.im.common.packets.LoginRespBody.getDefaultInstance();
    }

    public com.haotu369.tio.im.common.packets.LoginRespBody build() {
      com.haotu369.tio.im.common.packets.LoginRespBody result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.haotu369.tio.im.common.packets.LoginRespBody buildPartial() {
      com.haotu369.tio.im.common.packets.LoginRespBody result = new com.haotu369.tio.im.common.packets.LoginRespBody(this);
      result.token_ = token_;
      if (userBuilder_ == null) {
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
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
      if (other instanceof com.haotu369.tio.im.common.packets.LoginRespBody) {
        return mergeFrom((com.haotu369.tio.im.common.packets.LoginRespBody)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.haotu369.tio.im.common.packets.LoginRespBody other) {
      if (other == com.haotu369.tio.im.common.packets.LoginRespBody.getDefaultInstance()) return this;
      if (!other.getToken().isEmpty()) {
        token_ = other.token_;
        onChanged();
      }
      if (other.hasUser()) {
        mergeUser(other.getUser());
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
      com.haotu369.tio.im.common.packets.LoginRespBody parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.haotu369.tio.im.common.packets.LoginRespBody) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object token_ = "";
    /**
     * <pre>
     *用于免密码的token，登录成功才有
     * </pre>
     *
     * <code>string token = 1;</code>
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *用于免密码的token，登录成功才有
     * </pre>
     *
     * <code>string token = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *用于免密码的token，登录成功才有
     * </pre>
     *
     * <code>string token = 1;</code>
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      token_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *用于免密码的token，登录成功才有
     * </pre>
     *
     * <code>string token = 1;</code>
     */
    public Builder clearToken() {
      
      token_ = getDefaultInstance().getToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *用于免密码的token，登录成功才有
     * </pre>
     *
     * <code>string token = 1;</code>
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      token_ = value;
      onChanged();
      return this;
    }

    private com.haotu369.tio.im.common.packets.User user_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.haotu369.tio.im.common.packets.User, com.haotu369.tio.im.common.packets.User.Builder, com.haotu369.tio.im.common.packets.UserOrBuilder> userBuilder_;
    /**
     * <pre>
     *登录成功才有
     * </pre>
     *
     * <code>.User user = 2;</code>
     */
    public boolean hasUser() {
      return userBuilder_ != null || user_ != null;
    }
    /**
     * <pre>
     *登录成功才有
     * </pre>
     *
     * <code>.User user = 2;</code>
     */
    public com.haotu369.tio.im.common.packets.User getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? com.haotu369.tio.im.common.packets.User.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *登录成功才有
     * </pre>
     *
     * <code>.User user = 2;</code>
     */
    public Builder setUser(com.haotu369.tio.im.common.packets.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
        onChanged();
      } else {
        userBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *登录成功才有
     * </pre>
     *
     * <code>.User user = 2;</code>
     */
    public Builder setUser(
        com.haotu369.tio.im.common.packets.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
        onChanged();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *登录成功才有
     * </pre>
     *
     * <code>.User user = 2;</code>
     */
    public Builder mergeUser(com.haotu369.tio.im.common.packets.User value) {
      if (userBuilder_ == null) {
        if (user_ != null) {
          user_ =
            com.haotu369.tio.im.common.packets.User.newBuilder(user_).mergeFrom(value).buildPartial();
        } else {
          user_ = value;
        }
        onChanged();
      } else {
        userBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *登录成功才有
     * </pre>
     *
     * <code>.User user = 2;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = null;
        onChanged();
      } else {
        user_ = null;
        userBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *登录成功才有
     * </pre>
     *
     * <code>.User user = 2;</code>
     */
    public com.haotu369.tio.im.common.packets.User.Builder getUserBuilder() {
      
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *登录成功才有
     * </pre>
     *
     * <code>.User user = 2;</code>
     */
    public com.haotu369.tio.im.common.packets.UserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            com.haotu369.tio.im.common.packets.User.getDefaultInstance() : user_;
      }
    }
    /**
     * <pre>
     *登录成功才有
     * </pre>
     *
     * <code>.User user = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.haotu369.tio.im.common.packets.User, com.haotu369.tio.im.common.packets.User.Builder, com.haotu369.tio.im.common.packets.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.haotu369.tio.im.common.packets.User, com.haotu369.tio.im.common.packets.User.Builder, com.haotu369.tio.im.common.packets.UserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:LoginRespBody)
  }

  // @@protoc_insertion_point(class_scope:LoginRespBody)
  private static final com.haotu369.tio.im.common.packets.LoginRespBody DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.haotu369.tio.im.common.packets.LoginRespBody();
  }

  public static com.haotu369.tio.im.common.packets.LoginRespBody getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoginRespBody>
      PARSER = new com.google.protobuf.AbstractParser<LoginRespBody>() {
    public LoginRespBody parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LoginRespBody(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LoginRespBody> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoginRespBody> getParserForType() {
    return PARSER;
  }

  public com.haotu369.tio.im.common.packets.LoginRespBody getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
