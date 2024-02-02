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

public interface RouterNatSubnetworkToNatOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RouterNatSubnetworkToNat)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * URL for the subnetwork resource that will use NAT.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * URL for the subnetwork resource that will use NAT.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * URL for the subnetwork resource that will use NAT.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if "LIST_OF_SECONDARY_IP_RANGES" is one of the values in source_ip_ranges_to_nat.
   * </pre>
   *
   * <code>repeated string secondary_ip_range_names = 264315097;</code>
   *
   * @return A list containing the secondaryIpRangeNames.
   */
  java.util.List<java.lang.String> getSecondaryIpRangeNamesList();
  /**
   *
   *
   * <pre>
   * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if "LIST_OF_SECONDARY_IP_RANGES" is one of the values in source_ip_ranges_to_nat.
   * </pre>
   *
   * <code>repeated string secondary_ip_range_names = 264315097;</code>
   *
   * @return The count of secondaryIpRangeNames.
   */
  int getSecondaryIpRangeNamesCount();
  /**
   *
   *
   * <pre>
   * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if "LIST_OF_SECONDARY_IP_RANGES" is one of the values in source_ip_ranges_to_nat.
   * </pre>
   *
   * <code>repeated string secondary_ip_range_names = 264315097;</code>
   *
   * @param index The index of the element to return.
   * @return The secondaryIpRangeNames at the given index.
   */
  java.lang.String getSecondaryIpRangeNames(int index);
  /**
   *
   *
   * <pre>
   * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if "LIST_OF_SECONDARY_IP_RANGES" is one of the values in source_ip_ranges_to_nat.
   * </pre>
   *
   * <code>repeated string secondary_ip_range_names = 264315097;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the secondaryIpRangeNames at the given index.
   */
  com.google.protobuf.ByteString getSecondaryIpRangeNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is: ["PRIMARY_IP_RANGE", "LIST_OF_SECONDARY_IP_RANGES"] Default: [ALL_IP_RANGES]
   * Check the SourceIpRangesToNat enum for the list of possible values.
   * </pre>
   *
   * <code>repeated string source_ip_ranges_to_nat = 388310386;</code>
   *
   * @return A list containing the sourceIpRangesToNat.
   */
  java.util.List<java.lang.String> getSourceIpRangesToNatList();
  /**
   *
   *
   * <pre>
   * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is: ["PRIMARY_IP_RANGE", "LIST_OF_SECONDARY_IP_RANGES"] Default: [ALL_IP_RANGES]
   * Check the SourceIpRangesToNat enum for the list of possible values.
   * </pre>
   *
   * <code>repeated string source_ip_ranges_to_nat = 388310386;</code>
   *
   * @return The count of sourceIpRangesToNat.
   */
  int getSourceIpRangesToNatCount();
  /**
   *
   *
   * <pre>
   * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is: ["PRIMARY_IP_RANGE", "LIST_OF_SECONDARY_IP_RANGES"] Default: [ALL_IP_RANGES]
   * Check the SourceIpRangesToNat enum for the list of possible values.
   * </pre>
   *
   * <code>repeated string source_ip_ranges_to_nat = 388310386;</code>
   *
   * @param index The index of the element to return.
   * @return The sourceIpRangesToNat at the given index.
   */
  java.lang.String getSourceIpRangesToNat(int index);
  /**
   *
   *
   * <pre>
   * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is: ["PRIMARY_IP_RANGE", "LIST_OF_SECONDARY_IP_RANGES"] Default: [ALL_IP_RANGES]
   * Check the SourceIpRangesToNat enum for the list of possible values.
   * </pre>
   *
   * <code>repeated string source_ip_ranges_to_nat = 388310386;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sourceIpRangesToNat at the given index.
   */
  com.google.protobuf.ByteString getSourceIpRangesToNatBytes(int index);
}
