/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/bigquery/connection/v1/connection.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.bigquery.connection.v1;

/**
 *
 *
 * <pre>
 * The request for
 * [ConnectionService.CreateConnection][google.cloud.bigquery.connection.v1.ConnectionService.CreateConnection].
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.connection.v1.CreateConnectionRequest}
 */
public final class CreateConnectionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.connection.v1.CreateConnectionRequest)
    CreateConnectionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateConnectionRequest.newBuilder() to construct.
  private CreateConnectionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateConnectionRequest() {
    parent_ = "";
    connectionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateConnectionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
        .internal_static_google_cloud_bigquery_connection_v1_CreateConnectionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
        .internal_static_google_cloud_bigquery_connection_v1_CreateConnectionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.connection.v1.CreateConnectionRequest.class,
            com.google.cloud.bigquery.connection.v1.CreateConnectionRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. Parent resource name.
   * Must be in the format `projects/{project_id}/locations/{location_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
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
   * Required. Parent resource name.
   * Must be in the format `projects/{project_id}/locations/{location_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
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

  public static final int CONNECTION_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object connectionId_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Connection id that should be assigned to the created connection.
   * </pre>
   *
   * <code>string connection_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The connectionId.
   */
  @java.lang.Override
  public java.lang.String getConnectionId() {
    java.lang.Object ref = connectionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      connectionId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Connection id that should be assigned to the created connection.
   * </pre>
   *
   * <code>string connection_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for connectionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getConnectionIdBytes() {
    java.lang.Object ref = connectionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      connectionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONNECTION_FIELD_NUMBER = 3;
  private com.google.cloud.bigquery.connection.v1.Connection connection_;
  /**
   *
   *
   * <pre>
   * Required. Connection to create.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.connection.v1.Connection connection = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the connection field is set.
   */
  @java.lang.Override
  public boolean hasConnection() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Connection to create.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.connection.v1.Connection connection = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The connection.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.connection.v1.Connection getConnection() {
    return connection_ == null
        ? com.google.cloud.bigquery.connection.v1.Connection.getDefaultInstance()
        : connection_;
  }
  /**
   *
   *
   * <pre>
   * Required. Connection to create.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.connection.v1.Connection connection = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.connection.v1.ConnectionOrBuilder getConnectionOrBuilder() {
    return connection_ == null
        ? com.google.cloud.bigquery.connection.v1.Connection.getDefaultInstance()
        : connection_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(connectionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, connectionId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getConnection());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(connectionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, connectionId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getConnection());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.bigquery.connection.v1.CreateConnectionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.connection.v1.CreateConnectionRequest other =
        (com.google.cloud.bigquery.connection.v1.CreateConnectionRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getConnectionId().equals(other.getConnectionId())) return false;
    if (hasConnection() != other.hasConnection()) return false;
    if (hasConnection()) {
      if (!getConnection().equals(other.getConnection())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
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
    hash = (37 * hash) + CONNECTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConnectionId().hashCode();
    if (hasConnection()) {
      hash = (37 * hash) + CONNECTION_FIELD_NUMBER;
      hash = (53 * hash) + getConnection().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.connection.v1.CreateConnectionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.connection.v1.CreateConnectionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.CreateConnectionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.connection.v1.CreateConnectionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.CreateConnectionRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.connection.v1.CreateConnectionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.CreateConnectionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.connection.v1.CreateConnectionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.CreateConnectionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.connection.v1.CreateConnectionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.CreateConnectionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.connection.v1.CreateConnectionRequest parseFrom(
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
      com.google.cloud.bigquery.connection.v1.CreateConnectionRequest prototype) {
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
   * The request for
   * [ConnectionService.CreateConnection][google.cloud.bigquery.connection.v1.ConnectionService.CreateConnection].
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.connection.v1.CreateConnectionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.connection.v1.CreateConnectionRequest)
      com.google.cloud.bigquery.connection.v1.CreateConnectionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
          .internal_static_google_cloud_bigquery_connection_v1_CreateConnectionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
          .internal_static_google_cloud_bigquery_connection_v1_CreateConnectionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.connection.v1.CreateConnectionRequest.class,
              com.google.cloud.bigquery.connection.v1.CreateConnectionRequest.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.connection.v1.CreateConnectionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getConnectionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      connectionId_ = "";
      connection_ = null;
      if (connectionBuilder_ != null) {
        connectionBuilder_.dispose();
        connectionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
          .internal_static_google_cloud_bigquery_connection_v1_CreateConnectionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.CreateConnectionRequest
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.connection.v1.CreateConnectionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.CreateConnectionRequest build() {
      com.google.cloud.bigquery.connection.v1.CreateConnectionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.CreateConnectionRequest buildPartial() {
      com.google.cloud.bigquery.connection.v1.CreateConnectionRequest result =
          new com.google.cloud.bigquery.connection.v1.CreateConnectionRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.connection.v1.CreateConnectionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.connectionId_ = connectionId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.connection_ = connectionBuilder_ == null ? connection_ : connectionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.bigquery.connection.v1.CreateConnectionRequest) {
        return mergeFrom((com.google.cloud.bigquery.connection.v1.CreateConnectionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.connection.v1.CreateConnectionRequest other) {
      if (other
          == com.google.cloud.bigquery.connection.v1.CreateConnectionRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getConnectionId().isEmpty()) {
        connectionId_ = other.connectionId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasConnection()) {
        mergeConnection(other.getConnection());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                connectionId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getConnectionFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Parent resource name.
     * Must be in the format `projects/{project_id}/locations/{location_id}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
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
     * Required. Parent resource name.
     * Must be in the format `projects/{project_id}/locations/{location_id}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
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
     * Required. Parent resource name.
     * Must be in the format `projects/{project_id}/locations/{location_id}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Parent resource name.
     * Must be in the format `projects/{project_id}/locations/{location_id}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Parent resource name.
     * Must be in the format `projects/{project_id}/locations/{location_id}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object connectionId_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Connection id that should be assigned to the created connection.
     * </pre>
     *
     * <code>string connection_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The connectionId.
     */
    public java.lang.String getConnectionId() {
      java.lang.Object ref = connectionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        connectionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Connection id that should be assigned to the created connection.
     * </pre>
     *
     * <code>string connection_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for connectionId.
     */
    public com.google.protobuf.ByteString getConnectionIdBytes() {
      java.lang.Object ref = connectionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        connectionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Connection id that should be assigned to the created connection.
     * </pre>
     *
     * <code>string connection_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The connectionId to set.
     * @return This builder for chaining.
     */
    public Builder setConnectionId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      connectionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Connection id that should be assigned to the created connection.
     * </pre>
     *
     * <code>string connection_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConnectionId() {
      connectionId_ = getDefaultInstance().getConnectionId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Connection id that should be assigned to the created connection.
     * </pre>
     *
     * <code>string connection_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for connectionId to set.
     * @return This builder for chaining.
     */
    public Builder setConnectionIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      connectionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.bigquery.connection.v1.Connection connection_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.connection.v1.Connection,
            com.google.cloud.bigquery.connection.v1.Connection.Builder,
            com.google.cloud.bigquery.connection.v1.ConnectionOrBuilder>
        connectionBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Connection to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.connection.v1.Connection connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the connection field is set.
     */
    public boolean hasConnection() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Connection to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.connection.v1.Connection connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The connection.
     */
    public com.google.cloud.bigquery.connection.v1.Connection getConnection() {
      if (connectionBuilder_ == null) {
        return connection_ == null
            ? com.google.cloud.bigquery.connection.v1.Connection.getDefaultInstance()
            : connection_;
      } else {
        return connectionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Connection to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.connection.v1.Connection connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConnection(com.google.cloud.bigquery.connection.v1.Connection value) {
      if (connectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        connection_ = value;
      } else {
        connectionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Connection to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.connection.v1.Connection connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConnection(
        com.google.cloud.bigquery.connection.v1.Connection.Builder builderForValue) {
      if (connectionBuilder_ == null) {
        connection_ = builderForValue.build();
      } else {
        connectionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Connection to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.connection.v1.Connection connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeConnection(com.google.cloud.bigquery.connection.v1.Connection value) {
      if (connectionBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && connection_ != null
            && connection_
                != com.google.cloud.bigquery.connection.v1.Connection.getDefaultInstance()) {
          getConnectionBuilder().mergeFrom(value);
        } else {
          connection_ = value;
        }
      } else {
        connectionBuilder_.mergeFrom(value);
      }
      if (connection_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Connection to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.connection.v1.Connection connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearConnection() {
      bitField0_ = (bitField0_ & ~0x00000004);
      connection_ = null;
      if (connectionBuilder_ != null) {
        connectionBuilder_.dispose();
        connectionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Connection to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.connection.v1.Connection connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.bigquery.connection.v1.Connection.Builder getConnectionBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getConnectionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Connection to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.connection.v1.Connection connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.bigquery.connection.v1.ConnectionOrBuilder getConnectionOrBuilder() {
      if (connectionBuilder_ != null) {
        return connectionBuilder_.getMessageOrBuilder();
      } else {
        return connection_ == null
            ? com.google.cloud.bigquery.connection.v1.Connection.getDefaultInstance()
            : connection_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Connection to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.connection.v1.Connection connection = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.connection.v1.Connection,
            com.google.cloud.bigquery.connection.v1.Connection.Builder,
            com.google.cloud.bigquery.connection.v1.ConnectionOrBuilder>
        getConnectionFieldBuilder() {
      if (connectionBuilder_ == null) {
        connectionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.connection.v1.Connection,
                com.google.cloud.bigquery.connection.v1.Connection.Builder,
                com.google.cloud.bigquery.connection.v1.ConnectionOrBuilder>(
                getConnection(), getParentForChildren(), isClean());
        connection_ = null;
      }
      return connectionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.connection.v1.CreateConnectionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.connection.v1.CreateConnectionRequest)
  private static final com.google.cloud.bigquery.connection.v1.CreateConnectionRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.connection.v1.CreateConnectionRequest();
  }

  public static com.google.cloud.bigquery.connection.v1.CreateConnectionRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateConnectionRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateConnectionRequest>() {
        @java.lang.Override
        public CreateConnectionRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<CreateConnectionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateConnectionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.connection.v1.CreateConnectionRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
