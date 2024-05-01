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

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt}
 */
public final class InstanceGroupManagerResizeRequestStatusLastAttempt
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt)
    InstanceGroupManagerResizeRequestStatusLastAttemptOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstanceGroupManagerResizeRequestStatusLastAttempt.newBuilder() to construct.
  private InstanceGroupManagerResizeRequestStatusLastAttempt(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceGroupManagerResizeRequestStatusLastAttempt() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceGroupManagerResizeRequestStatusLastAttempt();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagerResizeRequestStatusLastAttempt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagerResizeRequestStatusLastAttempt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt.class,
            com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt.Builder
                .class);
  }

  private int bitField0_;
  public static final int ERROR_FIELD_NUMBER = 96784904;
  private com.google.cloud.compute.v1.Error error_;
  /**
   *
   *
   * <pre>
   * Errors that prevented the ResizeRequest to be fulfilled.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
   *
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Errors that prevented the ResizeRequest to be fulfilled.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
   *
   * @return The error.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Error getError() {
    return error_ == null ? com.google.cloud.compute.v1.Error.getDefaultInstance() : error_;
  }
  /**
   *
   *
   * <pre>
   * Errors that prevented the ResizeRequest to be fulfilled.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ErrorOrBuilder getErrorOrBuilder() {
    return error_ == null ? com.google.cloud.compute.v1.Error.getDefaultInstance() : error_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(96784904, getError());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(96784904, getError());
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
        instanceof
        com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt other =
        (com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt) obj;

    if (hasError() != other.hasError()) return false;
    if (hasError()) {
      if (!getError().equals(other.getError())) return false;
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
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
      parseFrom(
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
      com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt prototype) {
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
   * Protobuf type {@code
   * google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt)
      com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttemptOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerResizeRequestStatusLastAttempt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerResizeRequestStatusLastAttempt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt.class,
              com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getErrorFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerResizeRequestStatusLastAttempt_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt build() {
      com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
        buildPartial() {
      com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt result =
          new com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.error_ = errorBuilder_ == null ? error_ : errorBuilder_.build();
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
      if (other
          instanceof
          com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt) {
        return mergeFrom(
            (com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt other) {
      if (other
          == com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
              .getDefaultInstance()) return this;
      if (other.hasError()) {
        mergeError(other.getError());
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
            case 774279234:
              {
                input.readMessage(getErrorFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 774279234
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

    private com.google.cloud.compute.v1.Error error_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Error,
            com.google.cloud.compute.v1.Error.Builder,
            com.google.cloud.compute.v1.ErrorOrBuilder>
        errorBuilder_;
    /**
     *
     *
     * <pre>
     * Errors that prevented the ResizeRequest to be fulfilled.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
     *
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Errors that prevented the ResizeRequest to be fulfilled.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
     *
     * @return The error.
     */
    public com.google.cloud.compute.v1.Error getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? com.google.cloud.compute.v1.Error.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Errors that prevented the ResizeRequest to be fulfilled.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
     */
    public Builder setError(com.google.cloud.compute.v1.Error value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
      } else {
        errorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Errors that prevented the ResizeRequest to be fulfilled.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
     */
    public Builder setError(com.google.cloud.compute.v1.Error.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Errors that prevented the ResizeRequest to be fulfilled.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
     */
    public Builder mergeError(com.google.cloud.compute.v1.Error value) {
      if (errorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && error_ != null
            && error_ != com.google.cloud.compute.v1.Error.getDefaultInstance()) {
          getErrorBuilder().mergeFrom(value);
        } else {
          error_ = value;
        }
      } else {
        errorBuilder_.mergeFrom(value);
      }
      if (error_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Errors that prevented the ResizeRequest to be fulfilled.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
     */
    public Builder clearError() {
      bitField0_ = (bitField0_ & ~0x00000001);
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Errors that prevented the ResizeRequest to be fulfilled.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
     */
    public com.google.cloud.compute.v1.Error.Builder getErrorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Errors that prevented the ResizeRequest to be fulfilled.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
     */
    public com.google.cloud.compute.v1.ErrorOrBuilder getErrorOrBuilder() {
      if (errorBuilder_ != null) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        return error_ == null ? com.google.cloud.compute.v1.Error.getDefaultInstance() : error_;
      }
    }
    /**
     *
     *
     * <pre>
     * Errors that prevented the ResizeRequest to be fulfilled.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Error,
            com.google.cloud.compute.v1.Error.Builder,
            com.google.cloud.compute.v1.ErrorOrBuilder>
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.Error,
                com.google.cloud.compute.v1.Error.Builder,
                com.google.cloud.compute.v1.ErrorOrBuilder>(
                getError(), getParentForChildren(), isClean());
        error_ = null;
      }
      return errorBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt)
  private static final com.google.cloud.compute.v1
          .InstanceGroupManagerResizeRequestStatusLastAttempt
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt();
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<
          InstanceGroupManagerResizeRequestStatusLastAttempt>
      PARSER =
          new com.google.protobuf.AbstractParser<
              InstanceGroupManagerResizeRequestStatusLastAttempt>() {
            @java.lang.Override
            public InstanceGroupManagerResizeRequestStatusLastAttempt parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstanceGroupManagerResizeRequestStatusLastAttempt>
      parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceGroupManagerResizeRequestStatusLastAttempt>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
