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

public interface RouterNatRuleActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RouterNatRuleAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
   * </pre>
   *
   * <code>repeated string source_nat_active_ips = 210378229;</code>
   *
   * @return A list containing the sourceNatActiveIps.
   */
  java.util.List<java.lang.String> getSourceNatActiveIpsList();
  /**
   *
   *
   * <pre>
   * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
   * </pre>
   *
   * <code>repeated string source_nat_active_ips = 210378229;</code>
   *
   * @return The count of sourceNatActiveIps.
   */
  int getSourceNatActiveIpsCount();
  /**
   *
   *
   * <pre>
   * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
   * </pre>
   *
   * <code>repeated string source_nat_active_ips = 210378229;</code>
   *
   * @param index The index of the element to return.
   * @return The sourceNatActiveIps at the given index.
   */
  java.lang.String getSourceNatActiveIps(int index);
  /**
   *
   *
   * <pre>
   * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
   * </pre>
   *
   * <code>repeated string source_nat_active_ips = 210378229;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sourceNatActiveIps at the given index.
   */
  com.google.protobuf.ByteString getSourceNatActiveIpsBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of URLs of the subnetworks used as source ranges for this NAT Rule. These subnetworks must have purpose set to PRIVATE_NAT. This field is used for private NAT.
   * </pre>
   *
   * <code>repeated string source_nat_active_ranges = 190556269;</code>
   *
   * @return A list containing the sourceNatActiveRanges.
   */
  java.util.List<java.lang.String> getSourceNatActiveRangesList();
  /**
   *
   *
   * <pre>
   * A list of URLs of the subnetworks used as source ranges for this NAT Rule. These subnetworks must have purpose set to PRIVATE_NAT. This field is used for private NAT.
   * </pre>
   *
   * <code>repeated string source_nat_active_ranges = 190556269;</code>
   *
   * @return The count of sourceNatActiveRanges.
   */
  int getSourceNatActiveRangesCount();
  /**
   *
   *
   * <pre>
   * A list of URLs of the subnetworks used as source ranges for this NAT Rule. These subnetworks must have purpose set to PRIVATE_NAT. This field is used for private NAT.
   * </pre>
   *
   * <code>repeated string source_nat_active_ranges = 190556269;</code>
   *
   * @param index The index of the element to return.
   * @return The sourceNatActiveRanges at the given index.
   */
  java.lang.String getSourceNatActiveRanges(int index);
  /**
   *
   *
   * <pre>
   * A list of URLs of the subnetworks used as source ranges for this NAT Rule. These subnetworks must have purpose set to PRIVATE_NAT. This field is used for private NAT.
   * </pre>
   *
   * <code>repeated string source_nat_active_ranges = 190556269;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sourceNatActiveRanges at the given index.
   */
  com.google.protobuf.ByteString getSourceNatActiveRangesBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
   * </pre>
   *
   * <code>repeated string source_nat_drain_ips = 340812451;</code>
   *
   * @return A list containing the sourceNatDrainIps.
   */
  java.util.List<java.lang.String> getSourceNatDrainIpsList();
  /**
   *
   *
   * <pre>
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
   * </pre>
   *
   * <code>repeated string source_nat_drain_ips = 340812451;</code>
   *
   * @return The count of sourceNatDrainIps.
   */
  int getSourceNatDrainIpsCount();
  /**
   *
   *
   * <pre>
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
   * </pre>
   *
   * <code>repeated string source_nat_drain_ips = 340812451;</code>
   *
   * @param index The index of the element to return.
   * @return The sourceNatDrainIps at the given index.
   */
  java.lang.String getSourceNatDrainIps(int index);
  /**
   *
   *
   * <pre>
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
   * </pre>
   *
   * <code>repeated string source_nat_drain_ips = 340812451;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sourceNatDrainIps at the given index.
   */
  com.google.protobuf.ByteString getSourceNatDrainIpsBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of URLs of subnetworks representing source ranges to be drained. This is only supported on patch/update, and these subnetworks must have previously been used as active ranges in this NAT Rule. This field is used for private NAT.
   * </pre>
   *
   * <code>repeated string source_nat_drain_ranges = 84802815;</code>
   *
   * @return A list containing the sourceNatDrainRanges.
   */
  java.util.List<java.lang.String> getSourceNatDrainRangesList();
  /**
   *
   *
   * <pre>
   * A list of URLs of subnetworks representing source ranges to be drained. This is only supported on patch/update, and these subnetworks must have previously been used as active ranges in this NAT Rule. This field is used for private NAT.
   * </pre>
   *
   * <code>repeated string source_nat_drain_ranges = 84802815;</code>
   *
   * @return The count of sourceNatDrainRanges.
   */
  int getSourceNatDrainRangesCount();
  /**
   *
   *
   * <pre>
   * A list of URLs of subnetworks representing source ranges to be drained. This is only supported on patch/update, and these subnetworks must have previously been used as active ranges in this NAT Rule. This field is used for private NAT.
   * </pre>
   *
   * <code>repeated string source_nat_drain_ranges = 84802815;</code>
   *
   * @param index The index of the element to return.
   * @return The sourceNatDrainRanges at the given index.
   */
  java.lang.String getSourceNatDrainRanges(int index);
  /**
   *
   *
   * <pre>
   * A list of URLs of subnetworks representing source ranges to be drained. This is only supported on patch/update, and these subnetworks must have previously been used as active ranges in this NAT Rule. This field is used for private NAT.
   * </pre>
   *
   * <code>repeated string source_nat_drain_ranges = 84802815;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sourceNatDrainRanges at the given index.
   */
  com.google.protobuf.ByteString getSourceNatDrainRangesBytes(int index);
}
