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
 * Connection properties specific to Salesforce DataCloud. This is intended for
 * use only by Salesforce partner projects.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties}
 */
public final class SalesforceDataCloudProperties extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties)
    SalesforceDataCloudPropertiesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SalesforceDataCloudProperties.newBuilder() to construct.
  private SalesforceDataCloudProperties(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SalesforceDataCloudProperties() {
    instanceUri_ = "";
    identity_ = "";
    tenantId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SalesforceDataCloudProperties();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
        .internal_static_google_cloud_bigquery_connection_v1_SalesforceDataCloudProperties_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
        .internal_static_google_cloud_bigquery_connection_v1_SalesforceDataCloudProperties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties.class,
            com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties.Builder.class);
  }

  public static final int INSTANCE_URI_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object instanceUri_ = "";
  /**
   *
   *
   * <pre>
   * The URL to the user's Salesforce DataCloud instance.
   * </pre>
   *
   * <code>string instance_uri = 1;</code>
   *
   * @return The instanceUri.
   */
  @java.lang.Override
  public java.lang.String getInstanceUri() {
    java.lang.Object ref = instanceUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The URL to the user's Salesforce DataCloud instance.
   * </pre>
   *
   * <code>string instance_uri = 1;</code>
   *
   * @return The bytes for instanceUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInstanceUriBytes() {
    java.lang.Object ref = instanceUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      instanceUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IDENTITY_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object identity_ = "";
  /**
   *
   *
   * <pre>
   * Output only. A unique Google-owned and Google-generated service account
   * identity for the connection.
   * </pre>
   *
   * <code>string identity = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The identity.
   */
  @java.lang.Override
  public java.lang.String getIdentity() {
    java.lang.Object ref = identity_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      identity_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. A unique Google-owned and Google-generated service account
   * identity for the connection.
   * </pre>
   *
   * <code>string identity = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for identity.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIdentityBytes() {
    java.lang.Object ref = identity_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      identity_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TENANT_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object tenantId_ = "";
  /**
   *
   *
   * <pre>
   * The ID of the user's Salesforce tenant.
   * </pre>
   *
   * <code>string tenant_id = 3;</code>
   *
   * @return The tenantId.
   */
  @java.lang.Override
  public java.lang.String getTenantId() {
    java.lang.Object ref = tenantId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tenantId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ID of the user's Salesforce tenant.
   * </pre>
   *
   * <code>string tenant_id = 3;</code>
   *
   * @return The bytes for tenantId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTenantIdBytes() {
    java.lang.Object ref = tenantId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tenantId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instanceUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(identity_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, identity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tenantId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tenantId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instanceUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(identity_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, identity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tenantId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, tenantId_);
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
    if (!(obj instanceof com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties other =
        (com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties) obj;

    if (!getInstanceUri().equals(other.getInstanceUri())) return false;
    if (!getIdentity().equals(other.getIdentity())) return false;
    if (!getTenantId().equals(other.getTenantId())) return false;
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
    hash = (37 * hash) + INSTANCE_URI_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceUri().hashCode();
    hash = (37 * hash) + IDENTITY_FIELD_NUMBER;
    hash = (53 * hash) + getIdentity().hashCode();
    hash = (37 * hash) + TENANT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTenantId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties parseFrom(
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
      com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties prototype) {
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
   * Connection properties specific to Salesforce DataCloud. This is intended for
   * use only by Salesforce partner projects.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties)
      com.google.cloud.bigquery.connection.v1.SalesforceDataCloudPropertiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
          .internal_static_google_cloud_bigquery_connection_v1_SalesforceDataCloudProperties_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
          .internal_static_google_cloud_bigquery_connection_v1_SalesforceDataCloudProperties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties.class,
              com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties.Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      instanceUri_ = "";
      identity_ = "";
      tenantId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
          .internal_static_google_cloud_bigquery_connection_v1_SalesforceDataCloudProperties_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties build() {
      com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties buildPartial() {
      com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties result =
          new com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.instanceUri_ = instanceUri_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.identity_ = identity_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.tenantId_ = tenantId_;
      }
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
      if (other instanceof com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties) {
        return mergeFrom(
            (com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties other) {
      if (other
          == com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties
              .getDefaultInstance()) return this;
      if (!other.getInstanceUri().isEmpty()) {
        instanceUri_ = other.instanceUri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getIdentity().isEmpty()) {
        identity_ = other.identity_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getTenantId().isEmpty()) {
        tenantId_ = other.tenantId_;
        bitField0_ |= 0x00000004;
        onChanged();
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
                instanceUri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                identity_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                tenantId_ = input.readStringRequireUtf8();
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

    private java.lang.Object instanceUri_ = "";
    /**
     *
     *
     * <pre>
     * The URL to the user's Salesforce DataCloud instance.
     * </pre>
     *
     * <code>string instance_uri = 1;</code>
     *
     * @return The instanceUri.
     */
    public java.lang.String getInstanceUri() {
      java.lang.Object ref = instanceUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URL to the user's Salesforce DataCloud instance.
     * </pre>
     *
     * <code>string instance_uri = 1;</code>
     *
     * @return The bytes for instanceUri.
     */
    public com.google.protobuf.ByteString getInstanceUriBytes() {
      java.lang.Object ref = instanceUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        instanceUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URL to the user's Salesforce DataCloud instance.
     * </pre>
     *
     * <code>string instance_uri = 1;</code>
     *
     * @param value The instanceUri to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      instanceUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URL to the user's Salesforce DataCloud instance.
     * </pre>
     *
     * <code>string instance_uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInstanceUri() {
      instanceUri_ = getDefaultInstance().getInstanceUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URL to the user's Salesforce DataCloud instance.
     * </pre>
     *
     * <code>string instance_uri = 1;</code>
     *
     * @param value The bytes for instanceUri to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      instanceUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object identity_ = "";
    /**
     *
     *
     * <pre>
     * Output only. A unique Google-owned and Google-generated service account
     * identity for the connection.
     * </pre>
     *
     * <code>string identity = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The identity.
     */
    public java.lang.String getIdentity() {
      java.lang.Object ref = identity_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        identity_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. A unique Google-owned and Google-generated service account
     * identity for the connection.
     * </pre>
     *
     * <code>string identity = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for identity.
     */
    public com.google.protobuf.ByteString getIdentityBytes() {
      java.lang.Object ref = identity_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        identity_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. A unique Google-owned and Google-generated service account
     * identity for the connection.
     * </pre>
     *
     * <code>string identity = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The identity to set.
     * @return This builder for chaining.
     */
    public Builder setIdentity(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      identity_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. A unique Google-owned and Google-generated service account
     * identity for the connection.
     * </pre>
     *
     * <code>string identity = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIdentity() {
      identity_ = getDefaultInstance().getIdentity();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. A unique Google-owned and Google-generated service account
     * identity for the connection.
     * </pre>
     *
     * <code>string identity = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for identity to set.
     * @return This builder for chaining.
     */
    public Builder setIdentityBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      identity_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object tenantId_ = "";
    /**
     *
     *
     * <pre>
     * The ID of the user's Salesforce tenant.
     * </pre>
     *
     * <code>string tenant_id = 3;</code>
     *
     * @return The tenantId.
     */
    public java.lang.String getTenantId() {
      java.lang.Object ref = tenantId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tenantId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID of the user's Salesforce tenant.
     * </pre>
     *
     * <code>string tenant_id = 3;</code>
     *
     * @return The bytes for tenantId.
     */
    public com.google.protobuf.ByteString getTenantIdBytes() {
      java.lang.Object ref = tenantId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tenantId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID of the user's Salesforce tenant.
     * </pre>
     *
     * <code>string tenant_id = 3;</code>
     *
     * @param value The tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      tenantId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the user's Salesforce tenant.
     * </pre>
     *
     * <code>string tenant_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTenantId() {
      tenantId_ = getDefaultInstance().getTenantId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the user's Salesforce tenant.
     * </pre>
     *
     * <code>string tenant_id = 3;</code>
     *
     * @param value The bytes for tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      tenantId_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties)
  private static final com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties();
  }

  public static com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SalesforceDataCloudProperties> PARSER =
      new com.google.protobuf.AbstractParser<SalesforceDataCloudProperties>() {
        @java.lang.Override
        public SalesforceDataCloudProperties parsePartialFrom(
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

  public static com.google.protobuf.Parser<SalesforceDataCloudProperties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SalesforceDataCloudProperties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.connection.v1.SalesforceDataCloudProperties
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
