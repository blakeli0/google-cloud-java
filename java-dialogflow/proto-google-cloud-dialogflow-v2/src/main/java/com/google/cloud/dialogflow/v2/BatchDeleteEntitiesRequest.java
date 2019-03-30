// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/entity_type.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The request message for [EntityTypes.BatchDeleteEntities][google.cloud.dialogflow.v2.EntityTypes.BatchDeleteEntities].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest}
 */
public final class BatchDeleteEntitiesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest)
    BatchDeleteEntitiesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchDeleteEntitiesRequest.newBuilder() to construct.
  private BatchDeleteEntitiesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchDeleteEntitiesRequest() {
    parent_ = "";
    entityValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    languageCode_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BatchDeleteEntitiesRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                entityValues_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              entityValues_.add(s);
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              languageCode_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        entityValues_ = entityValues_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.EntityTypeProto
        .internal_static_google_cloud_dialogflow_v2_BatchDeleteEntitiesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.EntityTypeProto
        .internal_static_google_cloud_dialogflow_v2_BatchDeleteEntitiesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest.class,
            com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The name of the entity type to delete entries for. Format:
   * `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the entity type to delete entries for. Format:
   * `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITY_VALUES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList entityValues_;
  /**
   *
   *
   * <pre>
   * Required. The canonical `values` of the entities to delete. Note that
   * these are not fully-qualified names, i.e. they don't start with
   * `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>repeated string entity_values = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList getEntityValuesList() {
    return entityValues_;
  }
  /**
   *
   *
   * <pre>
   * Required. The canonical `values` of the entities to delete. Note that
   * these are not fully-qualified names, i.e. they don't start with
   * `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>repeated string entity_values = 2;</code>
   */
  public int getEntityValuesCount() {
    return entityValues_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. The canonical `values` of the entities to delete. Note that
   * these are not fully-qualified names, i.e. they don't start with
   * `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>repeated string entity_values = 2;</code>
   */
  public java.lang.String getEntityValues(int index) {
    return entityValues_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. The canonical `values` of the entities to delete. Note that
   * these are not fully-qualified names, i.e. they don't start with
   * `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>repeated string entity_values = 2;</code>
   */
  public com.google.protobuf.ByteString getEntityValuesBytes(int index) {
    return entityValues_.getByteString(index);
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
  private volatile java.lang.Object languageCode_;
  /**
   *
   *
   * <pre>
   * Optional. The language of entity synonyms defined in `entities`. If not
   * specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
   * are supported. Note: languages must be enabled in the agent before they can
   * be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The language of entity synonyms defined in `entities`. If not
   * specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
   * are supported. Note: languages must be enabled in the agent before they can
   * be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  public com.google.protobuf.ByteString getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      languageCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    for (int i = 0; i < entityValues_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, entityValues_.getRaw(i));
    }
    if (!getLanguageCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, languageCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < entityValues_.size(); i++) {
        dataSize += computeStringSizeNoTag(entityValues_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEntityValuesList().size();
    }
    if (!getLanguageCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, languageCode_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest other =
        (com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getEntityValuesList().equals(other.getEntityValuesList())) return false;
    if (!getLanguageCode().equals(other.getLanguageCode())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (getEntityValuesCount() > 0) {
      hash = (37 * hash) + ENTITY_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getEntityValuesList().hashCode();
    }
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The request message for [EntityTypes.BatchDeleteEntities][google.cloud.dialogflow.v2.EntityTypes.BatchDeleteEntities].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest)
      com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2_BatchDeleteEntitiesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2_BatchDeleteEntitiesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest.class,
              com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      entityValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      languageCode_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2_BatchDeleteEntitiesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest build() {
      com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest buildPartial() {
      com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest result =
          new com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.parent_ = parent_;
      if (((bitField0_ & 0x00000002) != 0)) {
        entityValues_ = entityValues_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.entityValues_ = entityValues_;
      result.languageCode_ = languageCode_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest other) {
      if (other == com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.entityValues_.isEmpty()) {
        if (entityValues_.isEmpty()) {
          entityValues_ = other.entityValues_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureEntityValuesIsMutable();
          entityValues_.addAll(other.entityValues_);
        }
        onChanged();
      }
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
        onChanged();
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
      com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the entity type to delete entries for. Format:
     * `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the entity type to delete entries for. Format:
     * `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the entity type to delete entries for. Format:
     * `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the entity type to delete entries for. Format:
     * `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the entity type to delete entries for. Format:
     * `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList entityValues_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureEntityValuesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        entityValues_ = new com.google.protobuf.LazyStringArrayList(entityValues_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The canonical `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList getEntityValuesList() {
      return entityValues_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Required. The canonical `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2;</code>
     */
    public int getEntityValuesCount() {
      return entityValues_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. The canonical `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2;</code>
     */
    public java.lang.String getEntityValues(int index) {
      return entityValues_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The canonical `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2;</code>
     */
    public com.google.protobuf.ByteString getEntityValuesBytes(int index) {
      return entityValues_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The canonical `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2;</code>
     */
    public Builder setEntityValues(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEntityValuesIsMutable();
      entityValues_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The canonical `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2;</code>
     */
    public Builder addEntityValues(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEntityValuesIsMutable();
      entityValues_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The canonical `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2;</code>
     */
    public Builder addAllEntityValues(java.lang.Iterable<java.lang.String> values) {
      ensureEntityValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, entityValues_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The canonical `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2;</code>
     */
    public Builder clearEntityValues() {
      entityValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The canonical `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2;</code>
     */
    public Builder addEntityValuesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureEntityValuesIsMutable();
      entityValues_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object languageCode_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The language of entity synonyms defined in `entities`. If not
     * specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
     * are supported. Note: languages must be enabled in the agent before they can
     * be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The language of entity synonyms defined in `entities`. If not
     * specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
     * are supported. Note: languages must be enabled in the agent before they can
     * be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public com.google.protobuf.ByteString getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The language of entity synonyms defined in `entities`. If not
     * specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
     * are supported. Note: languages must be enabled in the agent before they can
     * be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public Builder setLanguageCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      languageCode_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The language of entity synonyms defined in `entities`. If not
     * specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
     * are supported. Note: languages must be enabled in the agent before they can
     * be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public Builder clearLanguageCode() {

      languageCode_ = getDefaultInstance().getLanguageCode();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The language of entity synonyms defined in `entities`. If not
     * specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
     * are supported. Note: languages must be enabled in the agent before they can
     * be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public Builder setLanguageCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      languageCode_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest)
  private static final com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest();
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchDeleteEntitiesRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchDeleteEntitiesRequest>() {
        @java.lang.Override
        public BatchDeleteEntitiesRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BatchDeleteEntitiesRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BatchDeleteEntitiesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchDeleteEntitiesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
