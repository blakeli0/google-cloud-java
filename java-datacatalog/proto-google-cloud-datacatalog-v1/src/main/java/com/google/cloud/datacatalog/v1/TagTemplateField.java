/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/tags.proto

package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * The template for an individual field within a tag template.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.TagTemplateField}
 */
public final class TagTemplateField extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.TagTemplateField)
    TagTemplateFieldOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TagTemplateField.newBuilder() to construct.
  private TagTemplateField(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TagTemplateField() {
    name_ = "";
    displayName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TagTemplateField();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TagTemplateField(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

              displayName_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.datacatalog.v1.FieldType.Builder subBuilder = null;
              if (type_ != null) {
                subBuilder = type_.toBuilder();
              }
              type_ =
                  input.readMessage(
                      com.google.cloud.datacatalog.v1.FieldType.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(type_);
                type_ = subBuilder.buildPartial();
              }

              break;
            }
          case 24:
            {
              isRequired_ = input.readBool();
              break;
            }
          case 40:
            {
              order_ = input.readInt32();
              break;
            }
          case 50:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.Tags
        .internal_static_google_cloud_datacatalog_v1_TagTemplateField_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Tags
        .internal_static_google_cloud_datacatalog_v1_TagTemplateField_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.TagTemplateField.class,
            com.google.cloud.datacatalog.v1.TagTemplateField.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 6;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the tag template field in URL format. Example:
   * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template}/fields/{field}
   * Note that this TagTemplateField may not actually be stored in the location
   * in this name.
   * </pre>
   *
   * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the tag template field in URL format. Example:
   * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template}/fields/{field}
   * Note that this TagTemplateField may not actually be stored in the location
   * in this name.
   * </pre>
   *
   * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object displayName_;
  /**
   *
   *
   * <pre>
   * The display name for this field. Defaults to an empty string.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The display name for this field. Defaults to an empty string.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  public com.google.protobuf.ByteString getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.v1.FieldType type_;
  /**
   *
   *
   * <pre>
   * Required. The type of value this tag field can contain.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the type field is set.
   */
  public boolean hasType() {
    return type_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The type of value this tag field can contain.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  public com.google.cloud.datacatalog.v1.FieldType getType() {
    return type_ == null ? com.google.cloud.datacatalog.v1.FieldType.getDefaultInstance() : type_;
  }
  /**
   *
   *
   * <pre>
   * Required. The type of value this tag field can contain.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.datacatalog.v1.FieldTypeOrBuilder getTypeOrBuilder() {
    return getType();
  }

  public static final int IS_REQUIRED_FIELD_NUMBER = 3;
  private boolean isRequired_;
  /**
   *
   *
   * <pre>
   * Whether this is a required field. Defaults to false.
   * </pre>
   *
   * <code>bool is_required = 3;</code>
   *
   * @return The isRequired.
   */
  public boolean getIsRequired() {
    return isRequired_;
  }

  public static final int ORDER_FIELD_NUMBER = 5;
  private int order_;
  /**
   *
   *
   * <pre>
   * The order of this field with respect to other fields in this tag
   * template. For example, a higher value can indicate a more important field.
   * The value can be negative. Multiple fields can have the same order, and
   * field orders within a tag do not have to be sequential.
   * </pre>
   *
   * <code>int32 order = 5;</code>
   *
   * @return The order.
   */
  public int getOrder() {
    return order_;
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
    if (!getDisplayNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, displayName_);
    }
    if (type_ != null) {
      output.writeMessage(2, getType());
    }
    if (isRequired_ != false) {
      output.writeBool(3, isRequired_);
    }
    if (order_ != 0) {
      output.writeInt32(5, order_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, name_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDisplayNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, displayName_);
    }
    if (type_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getType());
    }
    if (isRequired_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, isRequired_);
    }
    if (order_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(5, order_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, name_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.TagTemplateField)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.TagTemplateField other =
        (com.google.cloud.datacatalog.v1.TagTemplateField) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getDisplayName().equals(other.getDisplayName())) return false;
    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (!getType().equals(other.getType())) return false;
    }
    if (getIsRequired() != other.getIsRequired()) return false;
    if (getOrder() != other.getOrder()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
    }
    hash = (37 * hash) + IS_REQUIRED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsRequired());
    hash = (37 * hash) + ORDER_FIELD_NUMBER;
    hash = (53 * hash) + getOrder();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.TagTemplateField parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.TagTemplateField parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.TagTemplateField parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.TagTemplateField parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.TagTemplateField parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.TagTemplateField parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.TagTemplateField parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.TagTemplateField parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.TagTemplateField parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.TagTemplateField parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.TagTemplateField parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.TagTemplateField parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.v1.TagTemplateField prototype) {
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
   * The template for an individual field within a tag template.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.TagTemplateField}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.TagTemplateField)
      com.google.cloud.datacatalog.v1.TagTemplateFieldOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.Tags
          .internal_static_google_cloud_datacatalog_v1_TagTemplateField_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Tags
          .internal_static_google_cloud_datacatalog_v1_TagTemplateField_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.TagTemplateField.class,
              com.google.cloud.datacatalog.v1.TagTemplateField.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.TagTemplateField.newBuilder()
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
      name_ = "";

      displayName_ = "";

      if (typeBuilder_ == null) {
        type_ = null;
      } else {
        type_ = null;
        typeBuilder_ = null;
      }
      isRequired_ = false;

      order_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Tags
          .internal_static_google_cloud_datacatalog_v1_TagTemplateField_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.TagTemplateField getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.TagTemplateField.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.TagTemplateField build() {
      com.google.cloud.datacatalog.v1.TagTemplateField result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.TagTemplateField buildPartial() {
      com.google.cloud.datacatalog.v1.TagTemplateField result =
          new com.google.cloud.datacatalog.v1.TagTemplateField(this);
      result.name_ = name_;
      result.displayName_ = displayName_;
      if (typeBuilder_ == null) {
        result.type_ = type_;
      } else {
        result.type_ = typeBuilder_.build();
      }
      result.isRequired_ = isRequired_;
      result.order_ = order_;
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
      if (other instanceof com.google.cloud.datacatalog.v1.TagTemplateField) {
        return mergeFrom((com.google.cloud.datacatalog.v1.TagTemplateField) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.TagTemplateField other) {
      if (other == com.google.cloud.datacatalog.v1.TagTemplateField.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
      }
      if (other.hasType()) {
        mergeType(other.getType());
      }
      if (other.getIsRequired() != false) {
        setIsRequired(other.getIsRequired());
      }
      if (other.getOrder() != 0) {
        setOrder(other.getOrder());
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
      com.google.cloud.datacatalog.v1.TagTemplateField parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datacatalog.v1.TagTemplateField) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The resource name of the tag template field in URL format. Example:
     * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template}/fields/{field}
     * Note that this TagTemplateField may not actually be stored in the location
     * in this name.
     * </pre>
     *
     * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The resource name of the tag template field in URL format. Example:
     * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template}/fields/{field}
     * Note that this TagTemplateField may not actually be stored in the location
     * in this name.
     * </pre>
     *
     * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The resource name of the tag template field in URL format. Example:
     * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template}/fields/{field}
     * Note that this TagTemplateField may not actually be stored in the location
     * in this name.
     * </pre>
     *
     * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The resource name of the tag template field in URL format. Example:
     * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template}/fields/{field}
     * Note that this TagTemplateField may not actually be stored in the location
     * in this name.
     * </pre>
     *
     * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The resource name of the tag template field in URL format. Example:
     * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template}/fields/{field}
     * Note that this TagTemplateField may not actually be stored in the location
     * in this name.
     * </pre>
     *
     * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * The display name for this field. Defaults to an empty string.
     * </pre>
     *
     * <code>string display_name = 1;</code>
     *
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The display name for this field. Defaults to an empty string.
     * </pre>
     *
     * <code>string display_name = 1;</code>
     *
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The display name for this field. Defaults to an empty string.
     * </pre>
     *
     * <code>string display_name = 1;</code>
     *
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The display name for this field. Defaults to an empty string.
     * </pre>
     *
     * <code>string display_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {

      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The display name for this field. Defaults to an empty string.
     * </pre>
     *
     * <code>string display_name = 1;</code>
     *
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      displayName_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.datacatalog.v1.FieldType type_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.FieldType,
            com.google.cloud.datacatalog.v1.FieldType.Builder,
            com.google.cloud.datacatalog.v1.FieldTypeOrBuilder>
        typeBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The type of value this tag field can contain.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the type field is set.
     */
    public boolean hasType() {
      return typeBuilder_ != null || type_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of value this tag field can contain.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The type.
     */
    public com.google.cloud.datacatalog.v1.FieldType getType() {
      if (typeBuilder_ == null) {
        return type_ == null
            ? com.google.cloud.datacatalog.v1.FieldType.getDefaultInstance()
            : type_;
      } else {
        return typeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The type of value this tag field can contain.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setType(com.google.cloud.datacatalog.v1.FieldType value) {
      if (typeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        typeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of value this tag field can contain.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setType(com.google.cloud.datacatalog.v1.FieldType.Builder builderForValue) {
      if (typeBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        typeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of value this tag field can contain.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeType(com.google.cloud.datacatalog.v1.FieldType value) {
      if (typeBuilder_ == null) {
        if (type_ != null) {
          type_ =
              com.google.cloud.datacatalog.v1.FieldType.newBuilder(type_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        typeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of value this tag field can contain.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearType() {
      if (typeBuilder_ == null) {
        type_ = null;
        onChanged();
      } else {
        type_ = null;
        typeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of value this tag field can contain.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.FieldType.Builder getTypeBuilder() {

      onChanged();
      return getTypeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The type of value this tag field can contain.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.FieldTypeOrBuilder getTypeOrBuilder() {
      if (typeBuilder_ != null) {
        return typeBuilder_.getMessageOrBuilder();
      } else {
        return type_ == null
            ? com.google.cloud.datacatalog.v1.FieldType.getDefaultInstance()
            : type_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The type of value this tag field can contain.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.FieldType,
            com.google.cloud.datacatalog.v1.FieldType.Builder,
            com.google.cloud.datacatalog.v1.FieldTypeOrBuilder>
        getTypeFieldBuilder() {
      if (typeBuilder_ == null) {
        typeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1.FieldType,
                com.google.cloud.datacatalog.v1.FieldType.Builder,
                com.google.cloud.datacatalog.v1.FieldTypeOrBuilder>(
                getType(), getParentForChildren(), isClean());
        type_ = null;
      }
      return typeBuilder_;
    }

    private boolean isRequired_;
    /**
     *
     *
     * <pre>
     * Whether this is a required field. Defaults to false.
     * </pre>
     *
     * <code>bool is_required = 3;</code>
     *
     * @return The isRequired.
     */
    public boolean getIsRequired() {
      return isRequired_;
    }
    /**
     *
     *
     * <pre>
     * Whether this is a required field. Defaults to false.
     * </pre>
     *
     * <code>bool is_required = 3;</code>
     *
     * @param value The isRequired to set.
     * @return This builder for chaining.
     */
    public Builder setIsRequired(boolean value) {

      isRequired_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether this is a required field. Defaults to false.
     * </pre>
     *
     * <code>bool is_required = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIsRequired() {

      isRequired_ = false;
      onChanged();
      return this;
    }

    private int order_;
    /**
     *
     *
     * <pre>
     * The order of this field with respect to other fields in this tag
     * template. For example, a higher value can indicate a more important field.
     * The value can be negative. Multiple fields can have the same order, and
     * field orders within a tag do not have to be sequential.
     * </pre>
     *
     * <code>int32 order = 5;</code>
     *
     * @return The order.
     */
    public int getOrder() {
      return order_;
    }
    /**
     *
     *
     * <pre>
     * The order of this field with respect to other fields in this tag
     * template. For example, a higher value can indicate a more important field.
     * The value can be negative. Multiple fields can have the same order, and
     * field orders within a tag do not have to be sequential.
     * </pre>
     *
     * <code>int32 order = 5;</code>
     *
     * @param value The order to set.
     * @return This builder for chaining.
     */
    public Builder setOrder(int value) {

      order_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The order of this field with respect to other fields in this tag
     * template. For example, a higher value can indicate a more important field.
     * The value can be negative. Multiple fields can have the same order, and
     * field orders within a tag do not have to be sequential.
     * </pre>
     *
     * <code>int32 order = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOrder() {

      order_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.TagTemplateField)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.TagTemplateField)
  private static final com.google.cloud.datacatalog.v1.TagTemplateField DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.TagTemplateField();
  }

  public static com.google.cloud.datacatalog.v1.TagTemplateField getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TagTemplateField> PARSER =
      new com.google.protobuf.AbstractParser<TagTemplateField>() {
        @java.lang.Override
        public TagTemplateField parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TagTemplateField(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TagTemplateField> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TagTemplateField> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.TagTemplateField getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
