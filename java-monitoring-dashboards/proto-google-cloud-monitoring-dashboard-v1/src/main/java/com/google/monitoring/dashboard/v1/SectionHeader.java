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
// source: google/monitoring/dashboard/v1/section_header.proto

// Protobuf Java Version: 3.25.2
package com.google.monitoring.dashboard.v1;

/**
 *
 *
 * <pre>
 * A widget that defines a new section header. Sections populate a table of
 * contents and allow easier navigation of long-form content.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.dashboard.v1.SectionHeader}
 */
public final class SectionHeader extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.dashboard.v1.SectionHeader)
    SectionHeaderOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SectionHeader.newBuilder() to construct.
  private SectionHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SectionHeader() {
    subtitle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SectionHeader();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.dashboard.v1.SectionHeaderProto
        .internal_static_google_monitoring_dashboard_v1_SectionHeader_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.dashboard.v1.SectionHeaderProto
        .internal_static_google_monitoring_dashboard_v1_SectionHeader_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.dashboard.v1.SectionHeader.class,
            com.google.monitoring.dashboard.v1.SectionHeader.Builder.class);
  }

  public static final int SUBTITLE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object subtitle_ = "";
  /**
   *
   *
   * <pre>
   * The subtitle of the section
   * </pre>
   *
   * <code>string subtitle = 1;</code>
   *
   * @return The subtitle.
   */
  @java.lang.Override
  public java.lang.String getSubtitle() {
    java.lang.Object ref = subtitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subtitle_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The subtitle of the section
   * </pre>
   *
   * <code>string subtitle = 1;</code>
   *
   * @return The bytes for subtitle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSubtitleBytes() {
    java.lang.Object ref = subtitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      subtitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIVIDER_BELOW_FIELD_NUMBER = 2;
  private boolean dividerBelow_ = false;
  /**
   *
   *
   * <pre>
   * Whether to insert a divider below the section in the table of contents
   * </pre>
   *
   * <code>bool divider_below = 2;</code>
   *
   * @return The dividerBelow.
   */
  @java.lang.Override
  public boolean getDividerBelow() {
    return dividerBelow_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subtitle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subtitle_);
    }
    if (dividerBelow_ != false) {
      output.writeBool(2, dividerBelow_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subtitle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subtitle_);
    }
    if (dividerBelow_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, dividerBelow_);
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
    if (!(obj instanceof com.google.monitoring.dashboard.v1.SectionHeader)) {
      return super.equals(obj);
    }
    com.google.monitoring.dashboard.v1.SectionHeader other =
        (com.google.monitoring.dashboard.v1.SectionHeader) obj;

    if (!getSubtitle().equals(other.getSubtitle())) return false;
    if (getDividerBelow() != other.getDividerBelow()) return false;
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
    hash = (37 * hash) + SUBTITLE_FIELD_NUMBER;
    hash = (53 * hash) + getSubtitle().hashCode();
    hash = (37 * hash) + DIVIDER_BELOW_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDividerBelow());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.dashboard.v1.SectionHeader parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.SectionHeader parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.SectionHeader parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.SectionHeader parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.SectionHeader parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.SectionHeader parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.SectionHeader parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.SectionHeader parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.SectionHeader parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.SectionHeader parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.SectionHeader parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.SectionHeader parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.dashboard.v1.SectionHeader prototype) {
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
   * A widget that defines a new section header. Sections populate a table of
   * contents and allow easier navigation of long-form content.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.dashboard.v1.SectionHeader}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.dashboard.v1.SectionHeader)
      com.google.monitoring.dashboard.v1.SectionHeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.dashboard.v1.SectionHeaderProto
          .internal_static_google_monitoring_dashboard_v1_SectionHeader_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.dashboard.v1.SectionHeaderProto
          .internal_static_google_monitoring_dashboard_v1_SectionHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.dashboard.v1.SectionHeader.class,
              com.google.monitoring.dashboard.v1.SectionHeader.Builder.class);
    }

    // Construct using com.google.monitoring.dashboard.v1.SectionHeader.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      subtitle_ = "";
      dividerBelow_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.dashboard.v1.SectionHeaderProto
          .internal_static_google_monitoring_dashboard_v1_SectionHeader_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.SectionHeader getDefaultInstanceForType() {
      return com.google.monitoring.dashboard.v1.SectionHeader.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.SectionHeader build() {
      com.google.monitoring.dashboard.v1.SectionHeader result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.SectionHeader buildPartial() {
      com.google.monitoring.dashboard.v1.SectionHeader result =
          new com.google.monitoring.dashboard.v1.SectionHeader(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.monitoring.dashboard.v1.SectionHeader result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subtitle_ = subtitle_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dividerBelow_ = dividerBelow_;
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
      if (other instanceof com.google.monitoring.dashboard.v1.SectionHeader) {
        return mergeFrom((com.google.monitoring.dashboard.v1.SectionHeader) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.dashboard.v1.SectionHeader other) {
      if (other == com.google.monitoring.dashboard.v1.SectionHeader.getDefaultInstance())
        return this;
      if (!other.getSubtitle().isEmpty()) {
        subtitle_ = other.subtitle_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getDividerBelow() != false) {
        setDividerBelow(other.getDividerBelow());
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
                subtitle_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                dividerBelow_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private java.lang.Object subtitle_ = "";
    /**
     *
     *
     * <pre>
     * The subtitle of the section
     * </pre>
     *
     * <code>string subtitle = 1;</code>
     *
     * @return The subtitle.
     */
    public java.lang.String getSubtitle() {
      java.lang.Object ref = subtitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subtitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The subtitle of the section
     * </pre>
     *
     * <code>string subtitle = 1;</code>
     *
     * @return The bytes for subtitle.
     */
    public com.google.protobuf.ByteString getSubtitleBytes() {
      java.lang.Object ref = subtitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subtitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The subtitle of the section
     * </pre>
     *
     * <code>string subtitle = 1;</code>
     *
     * @param value The subtitle to set.
     * @return This builder for chaining.
     */
    public Builder setSubtitle(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      subtitle_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The subtitle of the section
     * </pre>
     *
     * <code>string subtitle = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSubtitle() {
      subtitle_ = getDefaultInstance().getSubtitle();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The subtitle of the section
     * </pre>
     *
     * <code>string subtitle = 1;</code>
     *
     * @param value The bytes for subtitle to set.
     * @return This builder for chaining.
     */
    public Builder setSubtitleBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      subtitle_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean dividerBelow_;
    /**
     *
     *
     * <pre>
     * Whether to insert a divider below the section in the table of contents
     * </pre>
     *
     * <code>bool divider_below = 2;</code>
     *
     * @return The dividerBelow.
     */
    @java.lang.Override
    public boolean getDividerBelow() {
      return dividerBelow_;
    }
    /**
     *
     *
     * <pre>
     * Whether to insert a divider below the section in the table of contents
     * </pre>
     *
     * <code>bool divider_below = 2;</code>
     *
     * @param value The dividerBelow to set.
     * @return This builder for chaining.
     */
    public Builder setDividerBelow(boolean value) {

      dividerBelow_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether to insert a divider below the section in the table of contents
     * </pre>
     *
     * <code>bool divider_below = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDividerBelow() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dividerBelow_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.dashboard.v1.SectionHeader)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.dashboard.v1.SectionHeader)
  private static final com.google.monitoring.dashboard.v1.SectionHeader DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.dashboard.v1.SectionHeader();
  }

  public static com.google.monitoring.dashboard.v1.SectionHeader getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SectionHeader> PARSER =
      new com.google.protobuf.AbstractParser<SectionHeader>() {
        @java.lang.Override
        public SectionHeader parsePartialFrom(
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

  public static com.google.protobuf.Parser<SectionHeader> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SectionHeader> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.dashboard.v1.SectionHeader getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
