/*
 * Copyright 2023 Google LLC
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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

/**
 *
 *
 * <pre>
 * Location of the source in an archive file in Cloud Storage.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.StorageSource}
 */
public final class StorageSource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.StorageSource)
    StorageSourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StorageSource.newBuilder() to construct.
  private StorageSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StorageSource() {
    bucket_ = "";
    object_ = "";
    sourceFetcher_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StorageSource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_StorageSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_StorageSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.StorageSource.class,
            com.google.cloudbuild.v1.StorageSource.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Specifies the tool to fetch the source file for the build.
   * </pre>
   *
   * Protobuf enum {@code google.devtools.cloudbuild.v1.StorageSource.SourceFetcher}
   */
  public enum SourceFetcher implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified. Defaults to GSUTIL.
     * </pre>
     *
     * <code>SOURCE_FETCHER_UNSPECIFIED = 0;</code>
     */
    SOURCE_FETCHER_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Use the "gsutil" tool to download the source file.
     * </pre>
     *
     * <code>GSUTIL = 1;</code>
     */
    GSUTIL(1),
    /**
     *
     *
     * <pre>
     * Use the Cloud Storage Fetcher tool to download the source file.
     * </pre>
     *
     * <code>GCS_FETCHER = 2;</code>
     */
    GCS_FETCHER(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified. Defaults to GSUTIL.
     * </pre>
     *
     * <code>SOURCE_FETCHER_UNSPECIFIED = 0;</code>
     */
    public static final int SOURCE_FETCHER_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Use the "gsutil" tool to download the source file.
     * </pre>
     *
     * <code>GSUTIL = 1;</code>
     */
    public static final int GSUTIL_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Use the Cloud Storage Fetcher tool to download the source file.
     * </pre>
     *
     * <code>GCS_FETCHER = 2;</code>
     */
    public static final int GCS_FETCHER_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceFetcher valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SourceFetcher forNumber(int value) {
      switch (value) {
        case 0:
          return SOURCE_FETCHER_UNSPECIFIED;
        case 1:
          return GSUTIL;
        case 2:
          return GCS_FETCHER;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SourceFetcher> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<SourceFetcher> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SourceFetcher>() {
          public SourceFetcher findValueByNumber(int number) {
            return SourceFetcher.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloudbuild.v1.StorageSource.getDescriptor().getEnumTypes().get(0);
    }

    private static final SourceFetcher[] VALUES = values();

    public static SourceFetcher valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SourceFetcher(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.devtools.cloudbuild.v1.StorageSource.SourceFetcher)
  }

  public static final int BUCKET_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object bucket_ = "";
  /**
   *
   *
   * <pre>
   * Cloud Storage bucket containing the source (see
   * [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * </pre>
   *
   * <code>string bucket = 1;</code>
   *
   * @return The bucket.
   */
  @java.lang.Override
  public java.lang.String getBucket() {
    java.lang.Object ref = bucket_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bucket_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Cloud Storage bucket containing the source (see
   * [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * </pre>
   *
   * <code>string bucket = 1;</code>
   *
   * @return The bytes for bucket.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBucketBytes() {
    java.lang.Object ref = bucket_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      bucket_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OBJECT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object object_ = "";
  /**
   *
   *
   * <pre>
   * Cloud Storage object containing the source.
   *
   * This object must be a zipped (`.zip`) or gzipped archive file (`.tar.gz`)
   * containing source to build.
   * </pre>
   *
   * <code>string object = 2;</code>
   *
   * @return The object.
   */
  @java.lang.Override
  public java.lang.String getObject() {
    java.lang.Object ref = object_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      object_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Cloud Storage object containing the source.
   *
   * This object must be a zipped (`.zip`) or gzipped archive file (`.tar.gz`)
   * containing source to build.
   * </pre>
   *
   * <code>string object = 2;</code>
   *
   * @return The bytes for object.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getObjectBytes() {
    java.lang.Object ref = object_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      object_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GENERATION_FIELD_NUMBER = 3;
  private long generation_ = 0L;
  /**
   *
   *
   * <pre>
   * Cloud Storage generation for the object. If the generation is
   * omitted, the latest generation will be used.
   * </pre>
   *
   * <code>int64 generation = 3;</code>
   *
   * @return The generation.
   */
  @java.lang.Override
  public long getGeneration() {
    return generation_;
  }

  public static final int SOURCE_FETCHER_FIELD_NUMBER = 5;
  private int sourceFetcher_ = 0;
  /**
   *
   *
   * <pre>
   * Option to specify the tool to fetch the source file for the build.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.StorageSource.SourceFetcher source_fetcher = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for sourceFetcher.
   */
  @java.lang.Override
  public int getSourceFetcherValue() {
    return sourceFetcher_;
  }
  /**
   *
   *
   * <pre>
   * Option to specify the tool to fetch the source file for the build.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.StorageSource.SourceFetcher source_fetcher = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sourceFetcher.
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.StorageSource.SourceFetcher getSourceFetcher() {
    com.google.cloudbuild.v1.StorageSource.SourceFetcher result =
        com.google.cloudbuild.v1.StorageSource.SourceFetcher.forNumber(sourceFetcher_);
    return result == null
        ? com.google.cloudbuild.v1.StorageSource.SourceFetcher.UNRECOGNIZED
        : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucket_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bucket_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(object_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, object_);
    }
    if (generation_ != 0L) {
      output.writeInt64(3, generation_);
    }
    if (sourceFetcher_
        != com.google.cloudbuild.v1.StorageSource.SourceFetcher.SOURCE_FETCHER_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(5, sourceFetcher_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucket_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bucket_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(object_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, object_);
    }
    if (generation_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, generation_);
    }
    if (sourceFetcher_
        != com.google.cloudbuild.v1.StorageSource.SourceFetcher.SOURCE_FETCHER_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(5, sourceFetcher_);
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
    if (!(obj instanceof com.google.cloudbuild.v1.StorageSource)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.StorageSource other = (com.google.cloudbuild.v1.StorageSource) obj;

    if (!getBucket().equals(other.getBucket())) return false;
    if (!getObject().equals(other.getObject())) return false;
    if (getGeneration() != other.getGeneration()) return false;
    if (sourceFetcher_ != other.sourceFetcher_) return false;
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
    hash = (37 * hash) + BUCKET_FIELD_NUMBER;
    hash = (53 * hash) + getBucket().hashCode();
    hash = (37 * hash) + OBJECT_FIELD_NUMBER;
    hash = (53 * hash) + getObject().hashCode();
    hash = (37 * hash) + GENERATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getGeneration());
    hash = (37 * hash) + SOURCE_FETCHER_FIELD_NUMBER;
    hash = (53 * hash) + sourceFetcher_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.StorageSource parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.StorageSource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.StorageSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.StorageSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.StorageSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.StorageSource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.StorageSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.StorageSource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.StorageSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.StorageSource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.StorageSource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.StorageSource parseFrom(
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

  public static Builder newBuilder(com.google.cloudbuild.v1.StorageSource prototype) {
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
   * Location of the source in an archive file in Cloud Storage.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.StorageSource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.StorageSource)
      com.google.cloudbuild.v1.StorageSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_StorageSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_StorageSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.StorageSource.class,
              com.google.cloudbuild.v1.StorageSource.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.StorageSource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      bucket_ = "";
      object_ = "";
      generation_ = 0L;
      sourceFetcher_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_StorageSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.StorageSource getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.StorageSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.StorageSource build() {
      com.google.cloudbuild.v1.StorageSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.StorageSource buildPartial() {
      com.google.cloudbuild.v1.StorageSource result =
          new com.google.cloudbuild.v1.StorageSource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloudbuild.v1.StorageSource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bucket_ = bucket_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.object_ = object_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.generation_ = generation_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.sourceFetcher_ = sourceFetcher_;
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
      if (other instanceof com.google.cloudbuild.v1.StorageSource) {
        return mergeFrom((com.google.cloudbuild.v1.StorageSource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.StorageSource other) {
      if (other == com.google.cloudbuild.v1.StorageSource.getDefaultInstance()) return this;
      if (!other.getBucket().isEmpty()) {
        bucket_ = other.bucket_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getObject().isEmpty()) {
        object_ = other.object_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getGeneration() != 0L) {
        setGeneration(other.getGeneration());
      }
      if (other.sourceFetcher_ != 0) {
        setSourceFetcherValue(other.getSourceFetcherValue());
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
                bucket_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                object_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                generation_ = input.readInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 40:
              {
                sourceFetcher_ = input.readEnum();
                bitField0_ |= 0x00000008;
                break;
              } // case 40
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

    private java.lang.Object bucket_ = "";
    /**
     *
     *
     * <pre>
     * Cloud Storage bucket containing the source (see
     * [Bucket Name
     * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * </pre>
     *
     * <code>string bucket = 1;</code>
     *
     * @return The bucket.
     */
    public java.lang.String getBucket() {
      java.lang.Object ref = bucket_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bucket_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage bucket containing the source (see
     * [Bucket Name
     * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * </pre>
     *
     * <code>string bucket = 1;</code>
     *
     * @return The bytes for bucket.
     */
    public com.google.protobuf.ByteString getBucketBytes() {
      java.lang.Object ref = bucket_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        bucket_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage bucket containing the source (see
     * [Bucket Name
     * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * </pre>
     *
     * <code>string bucket = 1;</code>
     *
     * @param value The bucket to set.
     * @return This builder for chaining.
     */
    public Builder setBucket(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bucket_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage bucket containing the source (see
     * [Bucket Name
     * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * </pre>
     *
     * <code>string bucket = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBucket() {
      bucket_ = getDefaultInstance().getBucket();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage bucket containing the source (see
     * [Bucket Name
     * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * </pre>
     *
     * <code>string bucket = 1;</code>
     *
     * @param value The bytes for bucket to set.
     * @return This builder for chaining.
     */
    public Builder setBucketBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bucket_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object object_ = "";
    /**
     *
     *
     * <pre>
     * Cloud Storage object containing the source.
     *
     * This object must be a zipped (`.zip`) or gzipped archive file (`.tar.gz`)
     * containing source to build.
     * </pre>
     *
     * <code>string object = 2;</code>
     *
     * @return The object.
     */
    public java.lang.String getObject() {
      java.lang.Object ref = object_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        object_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage object containing the source.
     *
     * This object must be a zipped (`.zip`) or gzipped archive file (`.tar.gz`)
     * containing source to build.
     * </pre>
     *
     * <code>string object = 2;</code>
     *
     * @return The bytes for object.
     */
    public com.google.protobuf.ByteString getObjectBytes() {
      java.lang.Object ref = object_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        object_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage object containing the source.
     *
     * This object must be a zipped (`.zip`) or gzipped archive file (`.tar.gz`)
     * containing source to build.
     * </pre>
     *
     * <code>string object = 2;</code>
     *
     * @param value The object to set.
     * @return This builder for chaining.
     */
    public Builder setObject(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      object_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage object containing the source.
     *
     * This object must be a zipped (`.zip`) or gzipped archive file (`.tar.gz`)
     * containing source to build.
     * </pre>
     *
     * <code>string object = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearObject() {
      object_ = getDefaultInstance().getObject();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage object containing the source.
     *
     * This object must be a zipped (`.zip`) or gzipped archive file (`.tar.gz`)
     * containing source to build.
     * </pre>
     *
     * <code>string object = 2;</code>
     *
     * @param value The bytes for object to set.
     * @return This builder for chaining.
     */
    public Builder setObjectBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      object_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long generation_;
    /**
     *
     *
     * <pre>
     * Cloud Storage generation for the object. If the generation is
     * omitted, the latest generation will be used.
     * </pre>
     *
     * <code>int64 generation = 3;</code>
     *
     * @return The generation.
     */
    @java.lang.Override
    public long getGeneration() {
      return generation_;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage generation for the object. If the generation is
     * omitted, the latest generation will be used.
     * </pre>
     *
     * <code>int64 generation = 3;</code>
     *
     * @param value The generation to set.
     * @return This builder for chaining.
     */
    public Builder setGeneration(long value) {

      generation_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage generation for the object. If the generation is
     * omitted, the latest generation will be used.
     * </pre>
     *
     * <code>int64 generation = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGeneration() {
      bitField0_ = (bitField0_ & ~0x00000004);
      generation_ = 0L;
      onChanged();
      return this;
    }

    private int sourceFetcher_ = 0;
    /**
     *
     *
     * <pre>
     * Option to specify the tool to fetch the source file for the build.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.StorageSource.SourceFetcher source_fetcher = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for sourceFetcher.
     */
    @java.lang.Override
    public int getSourceFetcherValue() {
      return sourceFetcher_;
    }
    /**
     *
     *
     * <pre>
     * Option to specify the tool to fetch the source file for the build.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.StorageSource.SourceFetcher source_fetcher = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for sourceFetcher to set.
     * @return This builder for chaining.
     */
    public Builder setSourceFetcherValue(int value) {
      sourceFetcher_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Option to specify the tool to fetch the source file for the build.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.StorageSource.SourceFetcher source_fetcher = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The sourceFetcher.
     */
    @java.lang.Override
    public com.google.cloudbuild.v1.StorageSource.SourceFetcher getSourceFetcher() {
      com.google.cloudbuild.v1.StorageSource.SourceFetcher result =
          com.google.cloudbuild.v1.StorageSource.SourceFetcher.forNumber(sourceFetcher_);
      return result == null
          ? com.google.cloudbuild.v1.StorageSource.SourceFetcher.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Option to specify the tool to fetch the source file for the build.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.StorageSource.SourceFetcher source_fetcher = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The sourceFetcher to set.
     * @return This builder for chaining.
     */
    public Builder setSourceFetcher(com.google.cloudbuild.v1.StorageSource.SourceFetcher value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      sourceFetcher_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Option to specify the tool to fetch the source file for the build.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.StorageSource.SourceFetcher source_fetcher = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceFetcher() {
      bitField0_ = (bitField0_ & ~0x00000008);
      sourceFetcher_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.StorageSource)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.StorageSource)
  private static final com.google.cloudbuild.v1.StorageSource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.StorageSource();
  }

  public static com.google.cloudbuild.v1.StorageSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StorageSource> PARSER =
      new com.google.protobuf.AbstractParser<StorageSource>() {
        @java.lang.Override
        public StorageSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<StorageSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StorageSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.StorageSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
