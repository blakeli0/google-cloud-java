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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo}
 */
public final class PacketMirroringMirroredResourceInfoSubnetInfo
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo)
    PacketMirroringMirroredResourceInfoSubnetInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PacketMirroringMirroredResourceInfoSubnetInfo.newBuilder() to construct.
  private PacketMirroringMirroredResourceInfoSubnetInfo(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PacketMirroringMirroredResourceInfoSubnetInfo() {
    canonicalUrl_ = "";
    url_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PacketMirroringMirroredResourceInfoSubnetInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_PacketMirroringMirroredResourceInfoSubnetInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_PacketMirroringMirroredResourceInfoSubnetInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo.class,
            com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo.Builder
                .class);
  }

  private int bitField0_;
  public static final int CANONICAL_URL_FIELD_NUMBER = 512294820;

  @SuppressWarnings("serial")
  private volatile java.lang.Object canonicalUrl_ = "";
  /**
   *
   *
   * <pre>
   * [Output Only] Unique identifier for the subnetwork; defined by the server.
   * </pre>
   *
   * <code>optional string canonical_url = 512294820;</code>
   *
   * @return Whether the canonicalUrl field is set.
   */
  @java.lang.Override
  public boolean hasCanonicalUrl() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * [Output Only] Unique identifier for the subnetwork; defined by the server.
   * </pre>
   *
   * <code>optional string canonical_url = 512294820;</code>
   *
   * @return The canonicalUrl.
   */
  @java.lang.Override
  public java.lang.String getCanonicalUrl() {
    java.lang.Object ref = canonicalUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      canonicalUrl_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * [Output Only] Unique identifier for the subnetwork; defined by the server.
   * </pre>
   *
   * <code>optional string canonical_url = 512294820;</code>
   *
   * @return The bytes for canonicalUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCanonicalUrlBytes() {
    java.lang.Object ref = canonicalUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      canonicalUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_FIELD_NUMBER = 116079;

  @SuppressWarnings("serial")
  private volatile java.lang.Object url_ = "";
  /**
   *
   *
   * <pre>
   * Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
   * </pre>
   *
   * <code>optional string url = 116079;</code>
   *
   * @return Whether the url field is set.
   */
  @java.lang.Override
  public boolean hasUrl() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
   * </pre>
   *
   * <code>optional string url = 116079;</code>
   *
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
   * </pre>
   *
   * <code>optional string url = 116079;</code>
   *
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      url_ = b;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 116079, url_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 512294820, canonicalUrl_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(116079, url_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(512294820, canonicalUrl_);
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
    if (!(obj
        instanceof com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo other =
        (com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo) obj;

    if (hasCanonicalUrl() != other.hasCanonicalUrl()) return false;
    if (hasCanonicalUrl()) {
      if (!getCanonicalUrl().equals(other.getCanonicalUrl())) return false;
    }
    if (hasUrl() != other.hasUrl()) return false;
    if (hasUrl()) {
      if (!getUrl().equals(other.getUrl())) return false;
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
    if (hasCanonicalUrl()) {
      hash = (37 * hash) + CANONICAL_URL_FIELD_NUMBER;
      hash = (53 * hash) + getCanonicalUrl().hashCode();
    }
    if (hasUrl()) {
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo parseFrom(
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
      com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo)
      com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_PacketMirroringMirroredResourceInfoSubnetInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_PacketMirroringMirroredResourceInfoSubnetInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo.class,
              com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      canonicalUrl_ = "";
      url_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_PacketMirroringMirroredResourceInfoSubnetInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo build() {
      com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo
        buildPartial() {
      com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo result =
          new com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.canonicalUrl_ = canonicalUrl_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.url_ = url_;
        to_bitField0_ |= 0x00000002;
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
      if (other
          instanceof com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo) {
        return mergeFrom(
            (com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo other) {
      if (other
          == com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo
              .getDefaultInstance()) return this;
      if (other.hasCanonicalUrl()) {
        canonicalUrl_ = other.canonicalUrl_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasUrl()) {
        url_ = other.url_;
        bitField0_ |= 0x00000002;
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
            case 928634:
              {
                url_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 928634
            case -196608734:
              {
                canonicalUrl_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case -196608734
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

    private java.lang.Object canonicalUrl_ = "";
    /**
     *
     *
     * <pre>
     * [Output Only] Unique identifier for the subnetwork; defined by the server.
     * </pre>
     *
     * <code>optional string canonical_url = 512294820;</code>
     *
     * @return Whether the canonicalUrl field is set.
     */
    public boolean hasCanonicalUrl() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Unique identifier for the subnetwork; defined by the server.
     * </pre>
     *
     * <code>optional string canonical_url = 512294820;</code>
     *
     * @return The canonicalUrl.
     */
    public java.lang.String getCanonicalUrl() {
      java.lang.Object ref = canonicalUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        canonicalUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Unique identifier for the subnetwork; defined by the server.
     * </pre>
     *
     * <code>optional string canonical_url = 512294820;</code>
     *
     * @return The bytes for canonicalUrl.
     */
    public com.google.protobuf.ByteString getCanonicalUrlBytes() {
      java.lang.Object ref = canonicalUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        canonicalUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Unique identifier for the subnetwork; defined by the server.
     * </pre>
     *
     * <code>optional string canonical_url = 512294820;</code>
     *
     * @param value The canonicalUrl to set.
     * @return This builder for chaining.
     */
    public Builder setCanonicalUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      canonicalUrl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Unique identifier for the subnetwork; defined by the server.
     * </pre>
     *
     * <code>optional string canonical_url = 512294820;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCanonicalUrl() {
      canonicalUrl_ = getDefaultInstance().getCanonicalUrl();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Unique identifier for the subnetwork; defined by the server.
     * </pre>
     *
     * <code>optional string canonical_url = 512294820;</code>
     *
     * @param value The bytes for canonicalUrl to set.
     * @return This builder for chaining.
     */
    public Builder setCanonicalUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      canonicalUrl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     *
     *
     * <pre>
     * Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
     * </pre>
     *
     * <code>optional string url = 116079;</code>
     *
     * @return Whether the url field is set.
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
     * </pre>
     *
     * <code>optional string url = 116079;</code>
     *
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
     * </pre>
     *
     * <code>optional string url = 116079;</code>
     *
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
     * </pre>
     *
     * <code>optional string url = 116079;</code>
     *
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      url_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
     * </pre>
     *
     * <code>optional string url = 116079;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      url_ = getDefaultInstance().getUrl();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
     * </pre>
     *
     * <code>optional string url = 116079;</code>
     *
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      url_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo)
  private static final com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo();
  }

  public static com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PacketMirroringMirroredResourceInfoSubnetInfo>
      PARSER =
          new com.google.protobuf.AbstractParser<PacketMirroringMirroredResourceInfoSubnetInfo>() {
            @java.lang.Override
            public PacketMirroringMirroredResourceInfoSubnetInfo parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<PacketMirroringMirroredResourceInfoSubnetInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PacketMirroringMirroredResourceInfoSubnetInfo>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
