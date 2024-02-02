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
// source: google/cloud/commerce/consumer/procurement/v1alpha1/order.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.commerce.consumer.procurement.v1alpha1;

/**
 *
 *
 * <pre>
 * Predefined types for line item change state reason.
 * </pre>
 *
 * Protobuf enum {@code
 * google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChangeStateReasonType}
 */
public enum LineItemChangeStateReasonType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value, indicating there's no predefined type for change state
   * reason.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_STATE_REASON_TYPE_UNSPECIFIED = 0;</code>
   */
  LINE_ITEM_CHANGE_STATE_REASON_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Change is in current state due to term expiration.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_STATE_REASON_TYPE_EXPIRED = 1;</code>
   */
  LINE_ITEM_CHANGE_STATE_REASON_TYPE_EXPIRED(1),
  /**
   *
   *
   * <pre>
   * Change is in current state due to user-initiated cancellation.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_STATE_REASON_TYPE_USER_CANCELLED = 2;</code>
   */
  LINE_ITEM_CHANGE_STATE_REASON_TYPE_USER_CANCELLED(2),
  /**
   *
   *
   * <pre>
   * Change is in current state due to system-initiated cancellation.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_STATE_REASON_TYPE_SYSTEM_CANCELLED = 3;</code>
   */
  LINE_ITEM_CHANGE_STATE_REASON_TYPE_SYSTEM_CANCELLED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value, indicating there's no predefined type for change state
   * reason.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_STATE_REASON_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int LINE_ITEM_CHANGE_STATE_REASON_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Change is in current state due to term expiration.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_STATE_REASON_TYPE_EXPIRED = 1;</code>
   */
  public static final int LINE_ITEM_CHANGE_STATE_REASON_TYPE_EXPIRED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Change is in current state due to user-initiated cancellation.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_STATE_REASON_TYPE_USER_CANCELLED = 2;</code>
   */
  public static final int LINE_ITEM_CHANGE_STATE_REASON_TYPE_USER_CANCELLED_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Change is in current state due to system-initiated cancellation.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_STATE_REASON_TYPE_SYSTEM_CANCELLED = 3;</code>
   */
  public static final int LINE_ITEM_CHANGE_STATE_REASON_TYPE_SYSTEM_CANCELLED_VALUE = 3;

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
  public static LineItemChangeStateReasonType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LineItemChangeStateReasonType forNumber(int value) {
    switch (value) {
      case 0:
        return LINE_ITEM_CHANGE_STATE_REASON_TYPE_UNSPECIFIED;
      case 1:
        return LINE_ITEM_CHANGE_STATE_REASON_TYPE_EXPIRED;
      case 2:
        return LINE_ITEM_CHANGE_STATE_REASON_TYPE_USER_CANCELLED;
      case 3:
        return LINE_ITEM_CHANGE_STATE_REASON_TYPE_SYSTEM_CANCELLED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LineItemChangeStateReasonType>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<LineItemChangeStateReasonType>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LineItemChangeStateReasonType>() {
            public LineItemChangeStateReasonType findValueByNumber(int number) {
              return LineItemChangeStateReasonType.forNumber(number);
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
    return com.google.cloud.commerce.consumer.procurement.v1alpha1.OrderOuterClass.getDescriptor()
        .getEnumTypes()
        .get(2);
  }

  private static final LineItemChangeStateReasonType[] VALUES = values();

  public static LineItemChangeStateReasonType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private LineItemChangeStateReasonType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChangeStateReasonType)
}
