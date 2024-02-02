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
// source: google/cloud/bigquery/reservation/v1/reservation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.bigquery.reservation.v1;

/**
 *
 *
 * <pre>
 * The type of editions.
 * Different features and behaviors are provided to different editions
 * Capacity commitments and reservations are linked to editions.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.bigquery.reservation.v1.Edition}
 */
public enum Edition implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value, which will be treated as ENTERPRISE.
   * </pre>
   *
   * <code>EDITION_UNSPECIFIED = 0;</code>
   */
  EDITION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Standard edition.
   * </pre>
   *
   * <code>STANDARD = 1;</code>
   */
  STANDARD(1),
  /**
   *
   *
   * <pre>
   * Enterprise edition.
   * </pre>
   *
   * <code>ENTERPRISE = 2;</code>
   */
  ENTERPRISE(2),
  /**
   *
   *
   * <pre>
   * Enterprise plus edition.
   * </pre>
   *
   * <code>ENTERPRISE_PLUS = 3;</code>
   */
  ENTERPRISE_PLUS(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value, which will be treated as ENTERPRISE.
   * </pre>
   *
   * <code>EDITION_UNSPECIFIED = 0;</code>
   */
  public static final int EDITION_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Standard edition.
   * </pre>
   *
   * <code>STANDARD = 1;</code>
   */
  public static final int STANDARD_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Enterprise edition.
   * </pre>
   *
   * <code>ENTERPRISE = 2;</code>
   */
  public static final int ENTERPRISE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Enterprise plus edition.
   * </pre>
   *
   * <code>ENTERPRISE_PLUS = 3;</code>
   */
  public static final int ENTERPRISE_PLUS_VALUE = 3;

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
  public static Edition valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Edition forNumber(int value) {
    switch (value) {
      case 0:
        return EDITION_UNSPECIFIED;
      case 1:
        return STANDARD;
      case 2:
        return ENTERPRISE;
      case 3:
        return ENTERPRISE_PLUS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Edition> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<Edition> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<Edition>() {
        public Edition findValueByNumber(int number) {
          return Edition.forNumber(number);
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
    return com.google.cloud.bigquery.reservation.v1.ReservationProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final Edition[] VALUES = values();

  public static Edition valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Edition(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.bigquery.reservation.v1.Edition)
}
