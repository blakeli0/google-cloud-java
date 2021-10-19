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
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * The artifacts produced by a target render operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.TargetArtifact}
 */
public final class TargetArtifact extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.TargetArtifact)
    TargetArtifactOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TargetArtifact.newBuilder() to construct.
  private TargetArtifact(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TargetArtifact() {
    skaffoldConfigPath_ = "";
    manifestPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TargetArtifact();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TargetArtifact(
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
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              skaffoldConfigPath_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              manifestPath_ = s;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();
              uriCase_ = 4;
              uri_ = s;
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
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_TargetArtifact_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_TargetArtifact_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.TargetArtifact.class,
            com.google.cloud.deploy.v1.TargetArtifact.Builder.class);
  }

  private int uriCase_ = 0;
  private java.lang.Object uri_;

  public enum UriCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ARTIFACT_URI(4),
    URI_NOT_SET(0);
    private final int value;

    private UriCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static UriCase valueOf(int value) {
      return forNumber(value);
    }

    public static UriCase forNumber(int value) {
      switch (value) {
        case 4:
          return ARTIFACT_URI;
        case 0:
          return URI_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public UriCase getUriCase() {
    return UriCase.forNumber(uriCase_);
  }

  public static final int ARTIFACT_URI_FIELD_NUMBER = 4;
  /**
   *
   *
   * <pre>
   * Output only. URI of a directory containing the artifacts. This contains
   * deployment configuration used by Skaffold during a rollout, and all
   * paths are relative to this location.
   * </pre>
   *
   * <code>string artifact_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the artifactUri field is set.
   */
  public boolean hasArtifactUri() {
    return uriCase_ == 4;
  }
  /**
   *
   *
   * <pre>
   * Output only. URI of a directory containing the artifacts. This contains
   * deployment configuration used by Skaffold during a rollout, and all
   * paths are relative to this location.
   * </pre>
   *
   * <code>string artifact_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The artifactUri.
   */
  public java.lang.String getArtifactUri() {
    java.lang.Object ref = "";
    if (uriCase_ == 4) {
      ref = uri_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (uriCase_ == 4) {
        uri_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. URI of a directory containing the artifacts. This contains
   * deployment configuration used by Skaffold during a rollout, and all
   * paths are relative to this location.
   * </pre>
   *
   * <code>string artifact_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for artifactUri.
   */
  public com.google.protobuf.ByteString getArtifactUriBytes() {
    java.lang.Object ref = "";
    if (uriCase_ == 4) {
      ref = uri_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (uriCase_ == 4) {
        uri_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SKAFFOLD_CONFIG_PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object skaffoldConfigPath_;
  /**
   *
   *
   * <pre>
   * Output only. File path of the resolved Skaffold configuration relative to the URI.
   * </pre>
   *
   * <code>string skaffold_config_path = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The skaffoldConfigPath.
   */
  @java.lang.Override
  public java.lang.String getSkaffoldConfigPath() {
    java.lang.Object ref = skaffoldConfigPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skaffoldConfigPath_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. File path of the resolved Skaffold configuration relative to the URI.
   * </pre>
   *
   * <code>string skaffold_config_path = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for skaffoldConfigPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSkaffoldConfigPathBytes() {
    java.lang.Object ref = skaffoldConfigPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      skaffoldConfigPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MANIFEST_PATH_FIELD_NUMBER = 3;
  private volatile java.lang.Object manifestPath_;
  /**
   *
   *
   * <pre>
   * Output only. File path of the rendered manifest relative to the URI.
   * </pre>
   *
   * <code>string manifest_path = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The manifestPath.
   */
  @java.lang.Override
  public java.lang.String getManifestPath() {
    java.lang.Object ref = manifestPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      manifestPath_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. File path of the rendered manifest relative to the URI.
   * </pre>
   *
   * <code>string manifest_path = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for manifestPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getManifestPathBytes() {
    java.lang.Object ref = manifestPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      manifestPath_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skaffoldConfigPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, skaffoldConfigPath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(manifestPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, manifestPath_);
    }
    if (uriCase_ == 4) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, uri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skaffoldConfigPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, skaffoldConfigPath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(manifestPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, manifestPath_);
    }
    if (uriCase_ == 4) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, uri_);
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
    if (!(obj instanceof com.google.cloud.deploy.v1.TargetArtifact)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.TargetArtifact other =
        (com.google.cloud.deploy.v1.TargetArtifact) obj;

    if (!getSkaffoldConfigPath().equals(other.getSkaffoldConfigPath())) return false;
    if (!getManifestPath().equals(other.getManifestPath())) return false;
    if (!getUriCase().equals(other.getUriCase())) return false;
    switch (uriCase_) {
      case 4:
        if (!getArtifactUri().equals(other.getArtifactUri())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + SKAFFOLD_CONFIG_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getSkaffoldConfigPath().hashCode();
    hash = (37 * hash) + MANIFEST_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getManifestPath().hashCode();
    switch (uriCase_) {
      case 4:
        hash = (37 * hash) + ARTIFACT_URI_FIELD_NUMBER;
        hash = (53 * hash) + getArtifactUri().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.TargetArtifact parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.TargetArtifact parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.TargetArtifact parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.TargetArtifact parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.TargetArtifact parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.TargetArtifact parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.TargetArtifact parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.TargetArtifact parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.TargetArtifact parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.TargetArtifact parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.TargetArtifact parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.TargetArtifact parseFrom(
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

  public static Builder newBuilder(com.google.cloud.deploy.v1.TargetArtifact prototype) {
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
   * The artifacts produced by a target render operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.TargetArtifact}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.TargetArtifact)
      com.google.cloud.deploy.v1.TargetArtifactOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_TargetArtifact_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_TargetArtifact_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.TargetArtifact.class,
              com.google.cloud.deploy.v1.TargetArtifact.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.TargetArtifact.newBuilder()
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
      skaffoldConfigPath_ = "";

      manifestPath_ = "";

      uriCase_ = 0;
      uri_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_TargetArtifact_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.TargetArtifact getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.TargetArtifact.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.TargetArtifact build() {
      com.google.cloud.deploy.v1.TargetArtifact result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.TargetArtifact buildPartial() {
      com.google.cloud.deploy.v1.TargetArtifact result =
          new com.google.cloud.deploy.v1.TargetArtifact(this);
      if (uriCase_ == 4) {
        result.uri_ = uri_;
      }
      result.skaffoldConfigPath_ = skaffoldConfigPath_;
      result.manifestPath_ = manifestPath_;
      result.uriCase_ = uriCase_;
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
      if (other instanceof com.google.cloud.deploy.v1.TargetArtifact) {
        return mergeFrom((com.google.cloud.deploy.v1.TargetArtifact) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.TargetArtifact other) {
      if (other == com.google.cloud.deploy.v1.TargetArtifact.getDefaultInstance()) return this;
      if (!other.getSkaffoldConfigPath().isEmpty()) {
        skaffoldConfigPath_ = other.skaffoldConfigPath_;
        onChanged();
      }
      if (!other.getManifestPath().isEmpty()) {
        manifestPath_ = other.manifestPath_;
        onChanged();
      }
      switch (other.getUriCase()) {
        case ARTIFACT_URI:
          {
            uriCase_ = 4;
            uri_ = other.uri_;
            onChanged();
            break;
          }
        case URI_NOT_SET:
          {
            break;
          }
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
      com.google.cloud.deploy.v1.TargetArtifact parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.deploy.v1.TargetArtifact) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int uriCase_ = 0;
    private java.lang.Object uri_;

    public UriCase getUriCase() {
      return UriCase.forNumber(uriCase_);
    }

    public Builder clearUri() {
      uriCase_ = 0;
      uri_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. URI of a directory containing the artifacts. This contains
     * deployment configuration used by Skaffold during a rollout, and all
     * paths are relative to this location.
     * </pre>
     *
     * <code>string artifact_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return Whether the artifactUri field is set.
     */
    @java.lang.Override
    public boolean hasArtifactUri() {
      return uriCase_ == 4;
    }
    /**
     *
     *
     * <pre>
     * Output only. URI of a directory containing the artifacts. This contains
     * deployment configuration used by Skaffold during a rollout, and all
     * paths are relative to this location.
     * </pre>
     *
     * <code>string artifact_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The artifactUri.
     */
    @java.lang.Override
    public java.lang.String getArtifactUri() {
      java.lang.Object ref = "";
      if (uriCase_ == 4) {
        ref = uri_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (uriCase_ == 4) {
          uri_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. URI of a directory containing the artifacts. This contains
     * deployment configuration used by Skaffold during a rollout, and all
     * paths are relative to this location.
     * </pre>
     *
     * <code>string artifact_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for artifactUri.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getArtifactUriBytes() {
      java.lang.Object ref = "";
      if (uriCase_ == 4) {
        ref = uri_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (uriCase_ == 4) {
          uri_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. URI of a directory containing the artifacts. This contains
     * deployment configuration used by Skaffold during a rollout, and all
     * paths are relative to this location.
     * </pre>
     *
     * <code>string artifact_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The artifactUri to set.
     * @return This builder for chaining.
     */
    public Builder setArtifactUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      uriCase_ = 4;
      uri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. URI of a directory containing the artifacts. This contains
     * deployment configuration used by Skaffold during a rollout, and all
     * paths are relative to this location.
     * </pre>
     *
     * <code>string artifact_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearArtifactUri() {
      if (uriCase_ == 4) {
        uriCase_ = 0;
        uri_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. URI of a directory containing the artifacts. This contains
     * deployment configuration used by Skaffold during a rollout, and all
     * paths are relative to this location.
     * </pre>
     *
     * <code>string artifact_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for artifactUri to set.
     * @return This builder for chaining.
     */
    public Builder setArtifactUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      uriCase_ = 4;
      uri_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object skaffoldConfigPath_ = "";
    /**
     *
     *
     * <pre>
     * Output only. File path of the resolved Skaffold configuration relative to the URI.
     * </pre>
     *
     * <code>string skaffold_config_path = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The skaffoldConfigPath.
     */
    public java.lang.String getSkaffoldConfigPath() {
      java.lang.Object ref = skaffoldConfigPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skaffoldConfigPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. File path of the resolved Skaffold configuration relative to the URI.
     * </pre>
     *
     * <code>string skaffold_config_path = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for skaffoldConfigPath.
     */
    public com.google.protobuf.ByteString getSkaffoldConfigPathBytes() {
      java.lang.Object ref = skaffoldConfigPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        skaffoldConfigPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. File path of the resolved Skaffold configuration relative to the URI.
     * </pre>
     *
     * <code>string skaffold_config_path = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The skaffoldConfigPath to set.
     * @return This builder for chaining.
     */
    public Builder setSkaffoldConfigPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      skaffoldConfigPath_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. File path of the resolved Skaffold configuration relative to the URI.
     * </pre>
     *
     * <code>string skaffold_config_path = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSkaffoldConfigPath() {

      skaffoldConfigPath_ = getDefaultInstance().getSkaffoldConfigPath();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. File path of the resolved Skaffold configuration relative to the URI.
     * </pre>
     *
     * <code>string skaffold_config_path = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for skaffoldConfigPath to set.
     * @return This builder for chaining.
     */
    public Builder setSkaffoldConfigPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      skaffoldConfigPath_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object manifestPath_ = "";
    /**
     *
     *
     * <pre>
     * Output only. File path of the rendered manifest relative to the URI.
     * </pre>
     *
     * <code>string manifest_path = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The manifestPath.
     */
    public java.lang.String getManifestPath() {
      java.lang.Object ref = manifestPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        manifestPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. File path of the rendered manifest relative to the URI.
     * </pre>
     *
     * <code>string manifest_path = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for manifestPath.
     */
    public com.google.protobuf.ByteString getManifestPathBytes() {
      java.lang.Object ref = manifestPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        manifestPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. File path of the rendered manifest relative to the URI.
     * </pre>
     *
     * <code>string manifest_path = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The manifestPath to set.
     * @return This builder for chaining.
     */
    public Builder setManifestPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      manifestPath_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. File path of the rendered manifest relative to the URI.
     * </pre>
     *
     * <code>string manifest_path = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearManifestPath() {

      manifestPath_ = getDefaultInstance().getManifestPath();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. File path of the rendered manifest relative to the URI.
     * </pre>
     *
     * <code>string manifest_path = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for manifestPath to set.
     * @return This builder for chaining.
     */
    public Builder setManifestPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      manifestPath_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.TargetArtifact)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.TargetArtifact)
  private static final com.google.cloud.deploy.v1.TargetArtifact DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.TargetArtifact();
  }

  public static com.google.cloud.deploy.v1.TargetArtifact getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetArtifact> PARSER =
      new com.google.protobuf.AbstractParser<TargetArtifact>() {
        @java.lang.Override
        public TargetArtifact parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TargetArtifact(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TargetArtifact> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetArtifact> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.TargetArtifact getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
