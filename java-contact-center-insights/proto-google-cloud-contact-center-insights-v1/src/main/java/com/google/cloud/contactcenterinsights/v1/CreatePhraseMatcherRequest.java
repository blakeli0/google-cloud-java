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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 *
 *
 * <pre>
 * Request to create a phrase matcher.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest}
 */
public final class CreatePhraseMatcherRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest)
    CreatePhraseMatcherRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreatePhraseMatcherRequest.newBuilder() to construct.
  private CreatePhraseMatcherRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreatePhraseMatcherRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreatePhraseMatcherRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreatePhraseMatcherRequest(
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

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.contactcenterinsights.v1.PhraseMatcher.Builder subBuilder = null;
              if (phraseMatcher_ != null) {
                subBuilder = phraseMatcher_.toBuilder();
              }
              phraseMatcher_ =
                  input.readMessage(
                      com.google.cloud.contactcenterinsights.v1.PhraseMatcher.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(phraseMatcher_);
                phraseMatcher_ = subBuilder.buildPartial();
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
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_CreatePhraseMatcherRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_CreatePhraseMatcherRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest.class,
            com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent resource of the phrase matcher. Required. The location to create
   * a phrase matcher for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;` or
   * `projects/&lt;Project Number&gt;/locations/&lt;Location ID&gt;`
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
   * Required. The parent resource of the phrase matcher. Required. The location to create
   * a phrase matcher for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;` or
   * `projects/&lt;Project Number&gt;/locations/&lt;Location ID&gt;`
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

  public static final int PHRASE_MATCHER_FIELD_NUMBER = 2;
  private com.google.cloud.contactcenterinsights.v1.PhraseMatcher phraseMatcher_;
  /**
   *
   *
   * <pre>
   * Required. The phrase matcher resource to create.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.PhraseMatcher phrase_matcher = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the phraseMatcher field is set.
   */
  @java.lang.Override
  public boolean hasPhraseMatcher() {
    return phraseMatcher_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The phrase matcher resource to create.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.PhraseMatcher phrase_matcher = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The phraseMatcher.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.PhraseMatcher getPhraseMatcher() {
    return phraseMatcher_ == null
        ? com.google.cloud.contactcenterinsights.v1.PhraseMatcher.getDefaultInstance()
        : phraseMatcher_;
  }
  /**
   *
   *
   * <pre>
   * Required. The phrase matcher resource to create.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.PhraseMatcher phrase_matcher = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.PhraseMatcherOrBuilder
      getPhraseMatcherOrBuilder() {
    return getPhraseMatcher();
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
    if (phraseMatcher_ != null) {
      output.writeMessage(2, getPhraseMatcher());
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
    if (phraseMatcher_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getPhraseMatcher());
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest other =
        (com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasPhraseMatcher() != other.hasPhraseMatcher()) return false;
    if (hasPhraseMatcher()) {
      if (!getPhraseMatcher().equals(other.getPhraseMatcher())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasPhraseMatcher()) {
      hash = (37 * hash) + PHRASE_MATCHER_FIELD_NUMBER;
      hash = (53 * hash) + getPhraseMatcher().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest parseFrom(
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
      com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest prototype) {
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
   * Request to create a phrase matcher.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest)
      com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_CreatePhraseMatcherRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_CreatePhraseMatcherRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest.class,
              com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest.newBuilder()
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

      if (phraseMatcherBuilder_ == null) {
        phraseMatcher_ = null;
      } else {
        phraseMatcher_ = null;
        phraseMatcherBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_CreatePhraseMatcherRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest
        getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest build() {
      com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest buildPartial() {
      com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest result =
          new com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest(this);
      result.parent_ = parent_;
      if (phraseMatcherBuilder_ == null) {
        result.phraseMatcher_ = phraseMatcher_;
      } else {
        result.phraseMatcher_ = phraseMatcherBuilder_.build();
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest) {
        return mergeFrom(
            (com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest other) {
      if (other
          == com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasPhraseMatcher()) {
        mergePhraseMatcher(other.getPhraseMatcher());
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
      com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the phrase matcher. Required. The location to create
     * a phrase matcher for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;` or
     * `projects/&lt;Project Number&gt;/locations/&lt;Location ID&gt;`
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
     * Required. The parent resource of the phrase matcher. Required. The location to create
     * a phrase matcher for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;` or
     * `projects/&lt;Project Number&gt;/locations/&lt;Location ID&gt;`
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
     * Required. The parent resource of the phrase matcher. Required. The location to create
     * a phrase matcher for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;` or
     * `projects/&lt;Project Number&gt;/locations/&lt;Location ID&gt;`
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the phrase matcher. Required. The location to create
     * a phrase matcher for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;` or
     * `projects/&lt;Project Number&gt;/locations/&lt;Location ID&gt;`
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the phrase matcher. Required. The location to create
     * a phrase matcher for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;` or
     * `projects/&lt;Project Number&gt;/locations/&lt;Location ID&gt;`
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
      onChanged();
      return this;
    }

    private com.google.cloud.contactcenterinsights.v1.PhraseMatcher phraseMatcher_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.PhraseMatcher,
            com.google.cloud.contactcenterinsights.v1.PhraseMatcher.Builder,
            com.google.cloud.contactcenterinsights.v1.PhraseMatcherOrBuilder>
        phraseMatcherBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The phrase matcher resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.PhraseMatcher phrase_matcher = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the phraseMatcher field is set.
     */
    public boolean hasPhraseMatcher() {
      return phraseMatcherBuilder_ != null || phraseMatcher_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase matcher resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.PhraseMatcher phrase_matcher = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The phraseMatcher.
     */
    public com.google.cloud.contactcenterinsights.v1.PhraseMatcher getPhraseMatcher() {
      if (phraseMatcherBuilder_ == null) {
        return phraseMatcher_ == null
            ? com.google.cloud.contactcenterinsights.v1.PhraseMatcher.getDefaultInstance()
            : phraseMatcher_;
      } else {
        return phraseMatcherBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase matcher resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.PhraseMatcher phrase_matcher = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPhraseMatcher(com.google.cloud.contactcenterinsights.v1.PhraseMatcher value) {
      if (phraseMatcherBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        phraseMatcher_ = value;
        onChanged();
      } else {
        phraseMatcherBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase matcher resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.PhraseMatcher phrase_matcher = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPhraseMatcher(
        com.google.cloud.contactcenterinsights.v1.PhraseMatcher.Builder builderForValue) {
      if (phraseMatcherBuilder_ == null) {
        phraseMatcher_ = builderForValue.build();
        onChanged();
      } else {
        phraseMatcherBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase matcher resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.PhraseMatcher phrase_matcher = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergePhraseMatcher(
        com.google.cloud.contactcenterinsights.v1.PhraseMatcher value) {
      if (phraseMatcherBuilder_ == null) {
        if (phraseMatcher_ != null) {
          phraseMatcher_ =
              com.google.cloud.contactcenterinsights.v1.PhraseMatcher.newBuilder(phraseMatcher_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          phraseMatcher_ = value;
        }
        onChanged();
      } else {
        phraseMatcherBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase matcher resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.PhraseMatcher phrase_matcher = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearPhraseMatcher() {
      if (phraseMatcherBuilder_ == null) {
        phraseMatcher_ = null;
        onChanged();
      } else {
        phraseMatcher_ = null;
        phraseMatcherBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase matcher resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.PhraseMatcher phrase_matcher = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.contactcenterinsights.v1.PhraseMatcher.Builder
        getPhraseMatcherBuilder() {

      onChanged();
      return getPhraseMatcherFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase matcher resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.PhraseMatcher phrase_matcher = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.contactcenterinsights.v1.PhraseMatcherOrBuilder
        getPhraseMatcherOrBuilder() {
      if (phraseMatcherBuilder_ != null) {
        return phraseMatcherBuilder_.getMessageOrBuilder();
      } else {
        return phraseMatcher_ == null
            ? com.google.cloud.contactcenterinsights.v1.PhraseMatcher.getDefaultInstance()
            : phraseMatcher_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase matcher resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.PhraseMatcher phrase_matcher = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.PhraseMatcher,
            com.google.cloud.contactcenterinsights.v1.PhraseMatcher.Builder,
            com.google.cloud.contactcenterinsights.v1.PhraseMatcherOrBuilder>
        getPhraseMatcherFieldBuilder() {
      if (phraseMatcherBuilder_ == null) {
        phraseMatcherBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contactcenterinsights.v1.PhraseMatcher,
                com.google.cloud.contactcenterinsights.v1.PhraseMatcher.Builder,
                com.google.cloud.contactcenterinsights.v1.PhraseMatcherOrBuilder>(
                getPhraseMatcher(), getParentForChildren(), isClean());
        phraseMatcher_ = null;
      }
      return phraseMatcherBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest)
  private static final com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest();
  }

  public static com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePhraseMatcherRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreatePhraseMatcherRequest>() {
        @java.lang.Override
        public CreatePhraseMatcherRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreatePhraseMatcherRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreatePhraseMatcherRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePhraseMatcherRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
