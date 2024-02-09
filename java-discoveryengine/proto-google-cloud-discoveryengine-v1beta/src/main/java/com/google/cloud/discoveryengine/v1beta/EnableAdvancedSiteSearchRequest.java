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
// source: google/cloud/discoveryengine/v1beta/site_search_engine_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1beta;

/**
 *
 *
 * <pre>
 * Request message for
 * [SiteSearchEngineService.EnableAdvancedSiteSearch][google.cloud.discoveryengine.v1beta.SiteSearchEngineService.EnableAdvancedSiteSearch]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest}
 */
public final class EnableAdvancedSiteSearchRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest)
    EnableAdvancedSiteSearchRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EnableAdvancedSiteSearchRequest.newBuilder() to construct.
  private EnableAdvancedSiteSearchRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EnableAdvancedSiteSearchRequest() {
    siteSearchEngine_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EnableAdvancedSiteSearchRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1beta.SiteSearchEngineServiceProto
        .internal_static_google_cloud_discoveryengine_v1beta_EnableAdvancedSiteSearchRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1beta.SiteSearchEngineServiceProto
        .internal_static_google_cloud_discoveryengine_v1beta_EnableAdvancedSiteSearchRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest.class,
            com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest.Builder.class);
  }

  public static final int SITE_SEARCH_ENGINE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object siteSearchEngine_ = "";
  /**
   *
   *
   * <pre>
   * Required. Full resource name of the
   * [SiteSearchEngine][google.cloud.discoveryengine.v1beta.SiteSearchEngine],
   * such as
   * `projects/{project}/locations/{location}/dataStores/{data_store_id}/siteSearchEngine`.
   * </pre>
   *
   * <code>
   * string site_search_engine = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The siteSearchEngine.
   */
  @java.lang.Override
  public java.lang.String getSiteSearchEngine() {
    java.lang.Object ref = siteSearchEngine_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      siteSearchEngine_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Full resource name of the
   * [SiteSearchEngine][google.cloud.discoveryengine.v1beta.SiteSearchEngine],
   * such as
   * `projects/{project}/locations/{location}/dataStores/{data_store_id}/siteSearchEngine`.
   * </pre>
   *
   * <code>
   * string site_search_engine = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for siteSearchEngine.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSiteSearchEngineBytes() {
    java.lang.Object ref = siteSearchEngine_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      siteSearchEngine_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(siteSearchEngine_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, siteSearchEngine_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(siteSearchEngine_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, siteSearchEngine_);
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest other =
        (com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest) obj;

    if (!getSiteSearchEngine().equals(other.getSiteSearchEngine())) return false;
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
    hash = (37 * hash) + SITE_SEARCH_ENGINE_FIELD_NUMBER;
    hash = (53 * hash) + getSiteSearchEngine().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest parseFrom(
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
      com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest prototype) {
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
   * [SiteSearchEngineService.EnableAdvancedSiteSearch][google.cloud.discoveryengine.v1beta.SiteSearchEngineService.EnableAdvancedSiteSearch]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest)
      com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1beta.SiteSearchEngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1beta_EnableAdvancedSiteSearchRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1beta.SiteSearchEngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1beta_EnableAdvancedSiteSearchRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest.class,
              com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      siteSearchEngine_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1beta.SiteSearchEngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1beta_EnableAdvancedSiteSearchRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest
        getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest build() {
      com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest buildPartial() {
      com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest result =
          new com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.siteSearchEngine_ = siteSearchEngine_;
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
      if (other
          instanceof com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest) {
        return mergeFrom(
            (com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest other) {
      if (other
          == com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest
              .getDefaultInstance()) return this;
      if (!other.getSiteSearchEngine().isEmpty()) {
        siteSearchEngine_ = other.siteSearchEngine_;
        bitField0_ |= 0x00000001;
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
                siteSearchEngine_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private java.lang.Object siteSearchEngine_ = "";
    /**
     *
     *
     * <pre>
     * Required. Full resource name of the
     * [SiteSearchEngine][google.cloud.discoveryengine.v1beta.SiteSearchEngine],
     * such as
     * `projects/{project}/locations/{location}/dataStores/{data_store_id}/siteSearchEngine`.
     * </pre>
     *
     * <code>
     * string site_search_engine = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The siteSearchEngine.
     */
    public java.lang.String getSiteSearchEngine() {
      java.lang.Object ref = siteSearchEngine_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        siteSearchEngine_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Full resource name of the
     * [SiteSearchEngine][google.cloud.discoveryengine.v1beta.SiteSearchEngine],
     * such as
     * `projects/{project}/locations/{location}/dataStores/{data_store_id}/siteSearchEngine`.
     * </pre>
     *
     * <code>
     * string site_search_engine = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for siteSearchEngine.
     */
    public com.google.protobuf.ByteString getSiteSearchEngineBytes() {
      java.lang.Object ref = siteSearchEngine_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        siteSearchEngine_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Full resource name of the
     * [SiteSearchEngine][google.cloud.discoveryengine.v1beta.SiteSearchEngine],
     * such as
     * `projects/{project}/locations/{location}/dataStores/{data_store_id}/siteSearchEngine`.
     * </pre>
     *
     * <code>
     * string site_search_engine = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The siteSearchEngine to set.
     * @return This builder for chaining.
     */
    public Builder setSiteSearchEngine(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      siteSearchEngine_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Full resource name of the
     * [SiteSearchEngine][google.cloud.discoveryengine.v1beta.SiteSearchEngine],
     * such as
     * `projects/{project}/locations/{location}/dataStores/{data_store_id}/siteSearchEngine`.
     * </pre>
     *
     * <code>
     * string site_search_engine = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSiteSearchEngine() {
      siteSearchEngine_ = getDefaultInstance().getSiteSearchEngine();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Full resource name of the
     * [SiteSearchEngine][google.cloud.discoveryengine.v1beta.SiteSearchEngine],
     * such as
     * `projects/{project}/locations/{location}/dataStores/{data_store_id}/siteSearchEngine`.
     * </pre>
     *
     * <code>
     * string site_search_engine = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for siteSearchEngine to set.
     * @return This builder for chaining.
     */
    public Builder setSiteSearchEngineBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      siteSearchEngine_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest)
  private static final com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest();
  }

  public static com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnableAdvancedSiteSearchRequest> PARSER =
      new com.google.protobuf.AbstractParser<EnableAdvancedSiteSearchRequest>() {
        @java.lang.Override
        public EnableAdvancedSiteSearchRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<EnableAdvancedSiteSearchRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnableAdvancedSiteSearchRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1beta.EnableAdvancedSiteSearchRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
