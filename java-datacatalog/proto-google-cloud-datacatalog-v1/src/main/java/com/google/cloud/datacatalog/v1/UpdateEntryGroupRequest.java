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
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [UpdateEntryGroup][google.cloud.datacatalog.v1.DataCatalog.UpdateEntryGroup].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.UpdateEntryGroupRequest}
 */
public final class UpdateEntryGroupRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.UpdateEntryGroupRequest)
    UpdateEntryGroupRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateEntryGroupRequest.newBuilder() to construct.
  private UpdateEntryGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateEntryGroupRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateEntryGroupRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateEntryGroupRequest(
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
              com.google.cloud.datacatalog.v1.EntryGroup.Builder subBuilder = null;
              if (entryGroup_ != null) {
                subBuilder = entryGroup_.toBuilder();
              }
              entryGroup_ =
                  input.readMessage(
                      com.google.cloud.datacatalog.v1.EntryGroup.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entryGroup_);
                entryGroup_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_UpdateEntryGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_UpdateEntryGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest.class,
            com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest.Builder.class);
  }

  public static final int ENTRY_GROUP_FIELD_NUMBER = 1;
  private com.google.cloud.datacatalog.v1.EntryGroup entryGroup_;
  /**
   *
   *
   * <pre>
   * Required. The updated entry group. "name" field must be set.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the entryGroup field is set.
   */
  public boolean hasEntryGroup() {
    return entryGroup_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The updated entry group. "name" field must be set.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The entryGroup.
   */
  public com.google.cloud.datacatalog.v1.EntryGroup getEntryGroup() {
    return entryGroup_ == null
        ? com.google.cloud.datacatalog.v1.EntryGroup.getDefaultInstance()
        : entryGroup_;
  }
  /**
   *
   *
   * <pre>
   * Required. The updated entry group. "name" field must be set.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.datacatalog.v1.EntryGroupOrBuilder getEntryGroupOrBuilder() {
    return getEntryGroup();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The fields to update on the entry group. If absent or empty, all modifiable
   * fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The fields to update on the entry group. If absent or empty, all modifiable
   * fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The fields to update on the entry group. If absent or empty, all modifiable
   * fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (entryGroup_ != null) {
      output.writeMessage(1, getEntryGroup());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entryGroup_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getEntryGroup());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest other =
        (com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest) obj;

    if (hasEntryGroup() != other.hasEntryGroup()) return false;
    if (hasEntryGroup()) {
      if (!getEntryGroup().equals(other.getEntryGroup())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
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
    if (hasEntryGroup()) {
      hash = (37 * hash) + ENTRY_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getEntryGroup().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest parseFrom(
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
      com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest prototype) {
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
   * Request message for
   * [UpdateEntryGroup][google.cloud.datacatalog.v1.DataCatalog.UpdateEntryGroup].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.UpdateEntryGroupRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.UpdateEntryGroupRequest)
      com.google.cloud.datacatalog.v1.UpdateEntryGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_UpdateEntryGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_UpdateEntryGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest.class,
              com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest.newBuilder()
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
      if (entryGroupBuilder_ == null) {
        entryGroup_ = null;
      } else {
        entryGroup_ = null;
        entryGroupBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_UpdateEntryGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest build() {
      com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest buildPartial() {
      com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest result =
          new com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest(this);
      if (entryGroupBuilder_ == null) {
        result.entryGroup_ = entryGroup_;
      } else {
        result.entryGroup_ = entryGroupBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest other) {
      if (other == com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest.getDefaultInstance())
        return this;
      if (other.hasEntryGroup()) {
        mergeEntryGroup(other.getEntryGroup());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.datacatalog.v1.EntryGroup entryGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.EntryGroup,
            com.google.cloud.datacatalog.v1.EntryGroup.Builder,
            com.google.cloud.datacatalog.v1.EntryGroupOrBuilder>
        entryGroupBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The updated entry group. "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the entryGroup field is set.
     */
    public boolean hasEntryGroup() {
      return entryGroupBuilder_ != null || entryGroup_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated entry group. "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The entryGroup.
     */
    public com.google.cloud.datacatalog.v1.EntryGroup getEntryGroup() {
      if (entryGroupBuilder_ == null) {
        return entryGroup_ == null
            ? com.google.cloud.datacatalog.v1.EntryGroup.getDefaultInstance()
            : entryGroup_;
      } else {
        return entryGroupBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The updated entry group. "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntryGroup(com.google.cloud.datacatalog.v1.EntryGroup value) {
      if (entryGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entryGroup_ = value;
        onChanged();
      } else {
        entryGroupBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated entry group. "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntryGroup(
        com.google.cloud.datacatalog.v1.EntryGroup.Builder builderForValue) {
      if (entryGroupBuilder_ == null) {
        entryGroup_ = builderForValue.build();
        onChanged();
      } else {
        entryGroupBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated entry group. "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEntryGroup(com.google.cloud.datacatalog.v1.EntryGroup value) {
      if (entryGroupBuilder_ == null) {
        if (entryGroup_ != null) {
          entryGroup_ =
              com.google.cloud.datacatalog.v1.EntryGroup.newBuilder(entryGroup_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          entryGroup_ = value;
        }
        onChanged();
      } else {
        entryGroupBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated entry group. "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEntryGroup() {
      if (entryGroupBuilder_ == null) {
        entryGroup_ = null;
        onChanged();
      } else {
        entryGroup_ = null;
        entryGroupBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated entry group. "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.EntryGroup.Builder getEntryGroupBuilder() {

      onChanged();
      return getEntryGroupFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The updated entry group. "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.EntryGroupOrBuilder getEntryGroupOrBuilder() {
      if (entryGroupBuilder_ != null) {
        return entryGroupBuilder_.getMessageOrBuilder();
      } else {
        return entryGroup_ == null
            ? com.google.cloud.datacatalog.v1.EntryGroup.getDefaultInstance()
            : entryGroup_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The updated entry group. "name" field must be set.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.EntryGroup,
            com.google.cloud.datacatalog.v1.EntryGroup.Builder,
            com.google.cloud.datacatalog.v1.EntryGroupOrBuilder>
        getEntryGroupFieldBuilder() {
      if (entryGroupBuilder_ == null) {
        entryGroupBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1.EntryGroup,
                com.google.cloud.datacatalog.v1.EntryGroup.Builder,
                com.google.cloud.datacatalog.v1.EntryGroupOrBuilder>(
                getEntryGroup(), getParentForChildren(), isClean());
        entryGroup_ = null;
      }
      return entryGroupBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The fields to update on the entry group. If absent or empty, all modifiable
     * fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The fields to update on the entry group. If absent or empty, all modifiable
     * fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The fields to update on the entry group. If absent or empty, all modifiable
     * fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to update on the entry group. If absent or empty, all modifiable
     * fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to update on the entry group. If absent or empty, all modifiable
     * fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to update on the entry group. If absent or empty, all modifiable
     * fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to update on the entry group. If absent or empty, all modifiable
     * fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The fields to update on the entry group. If absent or empty, all modifiable
     * fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The fields to update on the entry group. If absent or empty, all modifiable
     * fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.UpdateEntryGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.UpdateEntryGroupRequest)
  private static final com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest();
  }

  public static com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEntryGroupRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateEntryGroupRequest>() {
        @java.lang.Override
        public UpdateEntryGroupRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateEntryGroupRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateEntryGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEntryGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.UpdateEntryGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
