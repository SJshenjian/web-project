// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package online.shenjian.tio.im.common.packets;

/**
 * <pre>
 **
 * Client分页列表
 * </pre>
 *
 * Protobuf type {@code ClientPageRespBody}
 */
public  final class ClientPageRespBody extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ClientPageRespBody)
    ClientPageRespBodyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientPageRespBody.newBuilder() to construct.
  private ClientPageRespBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientPageRespBody() {
    pageIndex_ = 0;
    pageSize_ = 0;
    recordCount_ = 0;
    clients_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientPageRespBody(
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
          case 8: {

            pageIndex_ = input.readInt32();
            break;
          }
          case 16: {

            pageSize_ = input.readInt32();
            break;
          }
          case 24: {

            recordCount_ = input.readInt32();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              clients_ = new java.util.ArrayList<Client>();
              mutable_bitField0_ |= 0x00000008;
            }
            clients_.add(
                input.readMessage(Client.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        clients_ = java.util.Collections.unmodifiableList(clients_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Chat.internal_static_ClientPageRespBody_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Chat.internal_static_ClientPageRespBody_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ClientPageRespBody.class, ClientPageRespBody.Builder.class);
  }

  private int bitField0_;
  public static final int PAGEINDEX_FIELD_NUMBER = 1;
  private int pageIndex_;
  /**
   * <pre>
   * 第几页
   * </pre>
   *
   * <code>int32 pageIndex = 1;</code>
   */
  public int getPageIndex() {
    return pageIndex_;
  }

  public static final int PAGESIZE_FIELD_NUMBER = 2;
  private int pageSize_;
  /**
   * <pre>
   * 每页多少条
   * </pre>
   *
   * <code>int32 pageSize = 2;</code>
   */
  public int getPageSize() {
    return pageSize_;
  }

  public static final int RECORDCOUNT_FIELD_NUMBER = 3;
  private int recordCount_;
  /**
   * <pre>
   * 总条数
   * </pre>
   *
   * <code>int32 recordCount = 3;</code>
   */
  public int getRecordCount() {
    return recordCount_;
  }

  public static final int CLIENTS_FIELD_NUMBER = 4;
  private java.util.List<Client> clients_;
  /**
   * <code>repeated .Client clients = 4;</code>
   */
  public java.util.List<Client> getClientsList() {
    return clients_;
  }
  /**
   * <code>repeated .Client clients = 4;</code>
   */
  public java.util.List<? extends ClientOrBuilder>
      getClientsOrBuilderList() {
    return clients_;
  }
  /**
   * <code>repeated .Client clients = 4;</code>
   */
  public int getClientsCount() {
    return clients_.size();
  }
  /**
   * <code>repeated .Client clients = 4;</code>
   */
  public Client getClients(int index) {
    return clients_.get(index);
  }
  /**
   * <code>repeated .Client clients = 4;</code>
   */
  public ClientOrBuilder getClientsOrBuilder(
      int index) {
    return clients_.get(index);
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
    if (pageIndex_ != 0) {
      output.writeInt32(1, pageIndex_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(2, pageSize_);
    }
    if (recordCount_ != 0) {
      output.writeInt32(3, recordCount_);
    }
    for (int i = 0; i < clients_.size(); i++) {
      output.writeMessage(4, clients_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pageIndex_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageSize_);
    }
    if (recordCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, recordCount_);
    }
    for (int i = 0; i < clients_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, clients_.get(i));
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
    if (!(obj instanceof ClientPageRespBody)) {
      return super.equals(obj);
    }
    ClientPageRespBody other = (ClientPageRespBody) obj;

    boolean result = true;
    result = result && (getPageIndex()
        == other.getPageIndex());
    result = result && (getPageSize()
        == other.getPageSize());
    result = result && (getRecordCount()
        == other.getRecordCount());
    result = result && getClientsList()
        .equals(other.getClientsList());
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
    hash = (37 * hash) + PAGEINDEX_FIELD_NUMBER;
    hash = (53 * hash) + getPageIndex();
    hash = (37 * hash) + PAGESIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + RECORDCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getRecordCount();
    if (getClientsCount() > 0) {
      hash = (37 * hash) + CLIENTS_FIELD_NUMBER;
      hash = (53 * hash) + getClientsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ClientPageRespBody parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ClientPageRespBody parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ClientPageRespBody parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ClientPageRespBody parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ClientPageRespBody parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ClientPageRespBody parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ClientPageRespBody parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ClientPageRespBody parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ClientPageRespBody parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ClientPageRespBody parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ClientPageRespBody parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ClientPageRespBody parseFrom(
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
  public static Builder newBuilder(ClientPageRespBody prototype) {
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
   * Client分页列表
   * </pre>
   *
   * Protobuf type {@code ClientPageRespBody}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ClientPageRespBody)
          ClientPageRespBodyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Chat.internal_static_ClientPageRespBody_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Chat.internal_static_ClientPageRespBody_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ClientPageRespBody.class, ClientPageRespBody.Builder.class);
    }

    // Construct using ClientPageRespBody.newBuilder()
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
        getClientsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      pageIndex_ = 0;

      pageSize_ = 0;

      recordCount_ = 0;

      if (clientsBuilder_ == null) {
        clients_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        clientsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Chat.internal_static_ClientPageRespBody_descriptor;
    }

    public ClientPageRespBody getDefaultInstanceForType() {
      return ClientPageRespBody.getDefaultInstance();
    }

    public ClientPageRespBody build() {
      ClientPageRespBody result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ClientPageRespBody buildPartial() {
      ClientPageRespBody result = new ClientPageRespBody(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.pageIndex_ = pageIndex_;
      result.pageSize_ = pageSize_;
      result.recordCount_ = recordCount_;
      if (clientsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          clients_ = java.util.Collections.unmodifiableList(clients_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.clients_ = clients_;
      } else {
        result.clients_ = clientsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof ClientPageRespBody) {
        return mergeFrom((ClientPageRespBody)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ClientPageRespBody other) {
      if (other == ClientPageRespBody.getDefaultInstance()) return this;
      if (other.getPageIndex() != 0) {
        setPageIndex(other.getPageIndex());
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (other.getRecordCount() != 0) {
        setRecordCount(other.getRecordCount());
      }
      if (clientsBuilder_ == null) {
        if (!other.clients_.isEmpty()) {
          if (clients_.isEmpty()) {
            clients_ = other.clients_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureClientsIsMutable();
            clients_.addAll(other.clients_);
          }
          onChanged();
        }
      } else {
        if (!other.clients_.isEmpty()) {
          if (clientsBuilder_.isEmpty()) {
            clientsBuilder_.dispose();
            clientsBuilder_ = null;
            clients_ = other.clients_;
            bitField0_ = (bitField0_ & ~0x00000008);
            clientsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getClientsFieldBuilder() : null;
          } else {
            clientsBuilder_.addAllMessages(other.clients_);
          }
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
      ClientPageRespBody parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ClientPageRespBody) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int pageIndex_ ;
    /**
     * <pre>
     * 第几页
     * </pre>
     *
     * <code>int32 pageIndex = 1;</code>
     */
    public int getPageIndex() {
      return pageIndex_;
    }
    /**
     * <pre>
     * 第几页
     * </pre>
     *
     * <code>int32 pageIndex = 1;</code>
     */
    public Builder setPageIndex(int value) {
      
      pageIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 第几页
     * </pre>
     *
     * <code>int32 pageIndex = 1;</code>
     */
    public Builder clearPageIndex() {
      
      pageIndex_ = 0;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <pre>
     * 每页多少条
     * </pre>
     *
     * <code>int32 pageSize = 2;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * 每页多少条
     * </pre>
     *
     * <code>int32 pageSize = 2;</code>
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 每页多少条
     * </pre>
     *
     * <code>int32 pageSize = 2;</code>
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private int recordCount_ ;
    /**
     * <pre>
     * 总条数
     * </pre>
     *
     * <code>int32 recordCount = 3;</code>
     */
    public int getRecordCount() {
      return recordCount_;
    }
    /**
     * <pre>
     * 总条数
     * </pre>
     *
     * <code>int32 recordCount = 3;</code>
     */
    public Builder setRecordCount(int value) {
      
      recordCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 总条数
     * </pre>
     *
     * <code>int32 recordCount = 3;</code>
     */
    public Builder clearRecordCount() {
      
      recordCount_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<Client> clients_ =
      java.util.Collections.emptyList();
    private void ensureClientsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        clients_ = new java.util.ArrayList<Client>(clients_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            Client, Client.Builder, ClientOrBuilder> clientsBuilder_;

    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public java.util.List<Client> getClientsList() {
      if (clientsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(clients_);
      } else {
        return clientsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public int getClientsCount() {
      if (clientsBuilder_ == null) {
        return clients_.size();
      } else {
        return clientsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public Client getClients(int index) {
      if (clientsBuilder_ == null) {
        return clients_.get(index);
      } else {
        return clientsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public Builder setClients(
        int index, Client value) {
      if (clientsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientsIsMutable();
        clients_.set(index, value);
        onChanged();
      } else {
        clientsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public Builder setClients(
        int index, Client.Builder builderForValue) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        clients_.set(index, builderForValue.build());
        onChanged();
      } else {
        clientsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public Builder addClients(Client value) {
      if (clientsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientsIsMutable();
        clients_.add(value);
        onChanged();
      } else {
        clientsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public Builder addClients(
        int index, Client value) {
      if (clientsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientsIsMutable();
        clients_.add(index, value);
        onChanged();
      } else {
        clientsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public Builder addClients(
        Client.Builder builderForValue) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        clients_.add(builderForValue.build());
        onChanged();
      } else {
        clientsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public Builder addClients(
        int index, Client.Builder builderForValue) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        clients_.add(index, builderForValue.build());
        onChanged();
      } else {
        clientsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public Builder addAllClients(
        java.lang.Iterable<? extends Client> values) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        addAll(
            values, clients_);
        onChanged();
      } else {
        clientsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public Builder clearClients() {
      if (clientsBuilder_ == null) {
        clients_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        clientsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public Builder removeClients(int index) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        clients_.remove(index);
        onChanged();
      } else {
        clientsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public Client.Builder getClientsBuilder(
        int index) {
      return getClientsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public ClientOrBuilder getClientsOrBuilder(
        int index) {
      if (clientsBuilder_ == null) {
        return clients_.get(index);  } else {
        return clientsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public java.util.List<? extends ClientOrBuilder>
         getClientsOrBuilderList() {
      if (clientsBuilder_ != null) {
        return clientsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(clients_);
      }
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public Client.Builder addClientsBuilder() {
      return getClientsFieldBuilder().addBuilder(
          Client.getDefaultInstance());
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public Client.Builder addClientsBuilder(
        int index) {
      return getClientsFieldBuilder().addBuilder(
          index, Client.getDefaultInstance());
    }
    /**
     * <code>repeated .Client clients = 4;</code>
     */
    public java.util.List<Client.Builder>
         getClientsBuilderList() {
      return getClientsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
            Client, Client.Builder, ClientOrBuilder>
        getClientsFieldBuilder() {
      if (clientsBuilder_ == null) {
        clientsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                Client, Client.Builder, ClientOrBuilder>(
                clients_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        clients_ = null;
      }
      return clientsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ClientPageRespBody)
  }

  // @@protoc_insertion_point(class_scope:ClientPageRespBody)
  private static final ClientPageRespBody DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ClientPageRespBody();
  }

  public static ClientPageRespBody getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientPageRespBody>
      PARSER = new com.google.protobuf.AbstractParser<ClientPageRespBody>() {
    public ClientPageRespBody parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientPageRespBody(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientPageRespBody> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientPageRespBody> getParserForType() {
    return PARSER;
  }

  public ClientPageRespBody getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

