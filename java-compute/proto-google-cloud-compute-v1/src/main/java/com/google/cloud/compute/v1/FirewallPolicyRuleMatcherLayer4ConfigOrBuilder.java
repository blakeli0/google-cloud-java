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

public interface FirewallPolicyRuleMatcherLayer4ConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.FirewallPolicyRuleMatcherLayer4Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
   * </pre>
   *
   * <code>optional string ip_protocol = 475958960;</code>
   *
   * @return Whether the ipProtocol field is set.
   */
  boolean hasIpProtocol();
  /**
   *
   *
   * <pre>
   * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
   * </pre>
   *
   * <code>optional string ip_protocol = 475958960;</code>
   *
   * @return The ipProtocol.
   */
  java.lang.String getIpProtocol();
  /**
   *
   *
   * <pre>
   * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
   * </pre>
   *
   * <code>optional string ip_protocol = 475958960;</code>
   *
   * @return The bytes for ipProtocol.
   */
  com.google.protobuf.ByteString getIpProtocolBytes();

  /**
   *
   *
   * <pre>
   * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
   * </pre>
   *
   * <code>repeated string ports = 106854418;</code>
   *
   * @return A list containing the ports.
   */
  java.util.List<java.lang.String> getPortsList();
  /**
   *
   *
   * <pre>
   * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
   * </pre>
   *
   * <code>repeated string ports = 106854418;</code>
   *
   * @return The count of ports.
   */
  int getPortsCount();
  /**
   *
   *
   * <pre>
   * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
   * </pre>
   *
   * <code>repeated string ports = 106854418;</code>
   *
   * @param index The index of the element to return.
   * @return The ports at the given index.
   */
  java.lang.String getPorts(int index);
  /**
   *
   *
   * <pre>
   * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
   * </pre>
   *
   * <code>repeated string ports = 106854418;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ports at the given index.
   */
  com.google.protobuf.ByteString getPortsBytes(int index);
}
