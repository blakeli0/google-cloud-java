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

public interface RouterInterfaceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RouterInterface)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * IP address and range of the interface. The IP range must be in the RFC3927 link-local IP address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do not truncate the address as it represents the IP address of the interface.
   * </pre>
   *
   * <code>optional string ip_range = 145092645;</code>
   *
   * @return Whether the ipRange field is set.
   */
  boolean hasIpRange();
  /**
   *
   *
   * <pre>
   * IP address and range of the interface. The IP range must be in the RFC3927 link-local IP address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do not truncate the address as it represents the IP address of the interface.
   * </pre>
   *
   * <code>optional string ip_range = 145092645;</code>
   *
   * @return The ipRange.
   */
  java.lang.String getIpRange();
  /**
   *
   *
   * <pre>
   * IP address and range of the interface. The IP range must be in the RFC3927 link-local IP address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do not truncate the address as it represents the IP address of the interface.
   * </pre>
   *
   * <code>optional string ip_range = 145092645;</code>
   *
   * @return The bytes for ipRange.
   */
  com.google.protobuf.ByteString getIpRangeBytes();

  /**
   *
   *
   * <pre>
   * URI of the linked Interconnect attachment. It must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a subnetwork.
   * </pre>
   *
   * <code>optional string linked_interconnect_attachment = 501085518;</code>
   *
   * @return Whether the linkedInterconnectAttachment field is set.
   */
  boolean hasLinkedInterconnectAttachment();
  /**
   *
   *
   * <pre>
   * URI of the linked Interconnect attachment. It must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a subnetwork.
   * </pre>
   *
   * <code>optional string linked_interconnect_attachment = 501085518;</code>
   *
   * @return The linkedInterconnectAttachment.
   */
  java.lang.String getLinkedInterconnectAttachment();
  /**
   *
   *
   * <pre>
   * URI of the linked Interconnect attachment. It must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a subnetwork.
   * </pre>
   *
   * <code>optional string linked_interconnect_attachment = 501085518;</code>
   *
   * @return The bytes for linkedInterconnectAttachment.
   */
  com.google.protobuf.ByteString getLinkedInterconnectAttachmentBytes();

  /**
   *
   *
   * <pre>
   * URI of the linked VPN tunnel, which must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a subnetwork.
   * </pre>
   *
   * <code>optional string linked_vpn_tunnel = 352296953;</code>
   *
   * @return Whether the linkedVpnTunnel field is set.
   */
  boolean hasLinkedVpnTunnel();
  /**
   *
   *
   * <pre>
   * URI of the linked VPN tunnel, which must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a subnetwork.
   * </pre>
   *
   * <code>optional string linked_vpn_tunnel = 352296953;</code>
   *
   * @return The linkedVpnTunnel.
   */
  java.lang.String getLinkedVpnTunnel();
  /**
   *
   *
   * <pre>
   * URI of the linked VPN tunnel, which must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a subnetwork.
   * </pre>
   *
   * <code>optional string linked_vpn_tunnel = 352296953;</code>
   *
   * @return The bytes for linkedVpnTunnel.
   */
  com.google.protobuf.ByteString getLinkedVpnTunnelBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The resource that configures and manages this interface. - MANAGED_BY_USER is the default value and can be managed directly by users. - MANAGED_BY_ATTACHMENT is an interface that is configured and managed by Cloud Interconnect, specifically, by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
   * Check the ManagementType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string management_type = 173703606;</code>
   *
   * @return Whether the managementType field is set.
   */
  boolean hasManagementType();
  /**
   *
   *
   * <pre>
   * [Output Only] The resource that configures and manages this interface. - MANAGED_BY_USER is the default value and can be managed directly by users. - MANAGED_BY_ATTACHMENT is an interface that is configured and managed by Cloud Interconnect, specifically, by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
   * Check the ManagementType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string management_type = 173703606;</code>
   *
   * @return The managementType.
   */
  java.lang.String getManagementType();
  /**
   *
   *
   * <pre>
   * [Output Only] The resource that configures and manages this interface. - MANAGED_BY_USER is the default value and can be managed directly by users. - MANAGED_BY_ATTACHMENT is an interface that is configured and managed by Cloud Interconnect, specifically, by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
   * Check the ManagementType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string management_type = 173703606;</code>
   *
   * @return The bytes for managementType.
   */
  com.google.protobuf.ByteString getManagementTypeBytes();

  /**
   *
   *
   * <pre>
   * Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * The regional private internal IP address that is used to establish BGP sessions to a VM instance acting as a third-party Router Appliance, such as a Next Gen Firewall, a Virtual Router, or an SD-WAN VM.
   * </pre>
   *
   * <code>optional string private_ip_address = 100854040;</code>
   *
   * @return Whether the privateIpAddress field is set.
   */
  boolean hasPrivateIpAddress();
  /**
   *
   *
   * <pre>
   * The regional private internal IP address that is used to establish BGP sessions to a VM instance acting as a third-party Router Appliance, such as a Next Gen Firewall, a Virtual Router, or an SD-WAN VM.
   * </pre>
   *
   * <code>optional string private_ip_address = 100854040;</code>
   *
   * @return The privateIpAddress.
   */
  java.lang.String getPrivateIpAddress();
  /**
   *
   *
   * <pre>
   * The regional private internal IP address that is used to establish BGP sessions to a VM instance acting as a third-party Router Appliance, such as a Next Gen Firewall, a Virtual Router, or an SD-WAN VM.
   * </pre>
   *
   * <code>optional string private_ip_address = 100854040;</code>
   *
   * @return The bytes for privateIpAddress.
   */
  com.google.protobuf.ByteString getPrivateIpAddressBytes();

  /**
   *
   *
   * <pre>
   * Name of the interface that will be redundant with the current interface you are creating. The redundantInterface must belong to the same Cloud Router as the interface here. To establish the BGP session to a Router Appliance VM, you must create two BGP peers. The two BGP peers must be attached to two separate interfaces that are redundant with each other. The redundant_interface must be 1-63 characters long, and comply with RFC1035. Specifically, the redundant_interface must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string redundant_interface = 523187303;</code>
   *
   * @return Whether the redundantInterface field is set.
   */
  boolean hasRedundantInterface();
  /**
   *
   *
   * <pre>
   * Name of the interface that will be redundant with the current interface you are creating. The redundantInterface must belong to the same Cloud Router as the interface here. To establish the BGP session to a Router Appliance VM, you must create two BGP peers. The two BGP peers must be attached to two separate interfaces that are redundant with each other. The redundant_interface must be 1-63 characters long, and comply with RFC1035. Specifically, the redundant_interface must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string redundant_interface = 523187303;</code>
   *
   * @return The redundantInterface.
   */
  java.lang.String getRedundantInterface();
  /**
   *
   *
   * <pre>
   * Name of the interface that will be redundant with the current interface you are creating. The redundantInterface must belong to the same Cloud Router as the interface here. To establish the BGP session to a Router Appliance VM, you must create two BGP peers. The two BGP peers must be attached to two separate interfaces that are redundant with each other. The redundant_interface must be 1-63 characters long, and comply with RFC1035. Specifically, the redundant_interface must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string redundant_interface = 523187303;</code>
   *
   * @return The bytes for redundantInterface.
   */
  com.google.protobuf.ByteString getRedundantInterfaceBytes();

  /**
   *
   *
   * <pre>
   * The URI of the subnetwork resource that this interface belongs to, which must be in the same region as the Cloud Router. When you establish a BGP session to a VM instance using this interface, the VM instance must belong to the same subnetwork as the subnetwork specified here.
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   *
   * @return Whether the subnetwork field is set.
   */
  boolean hasSubnetwork();
  /**
   *
   *
   * <pre>
   * The URI of the subnetwork resource that this interface belongs to, which must be in the same region as the Cloud Router. When you establish a BGP session to a VM instance using this interface, the VM instance must belong to the same subnetwork as the subnetwork specified here.
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   *
   *
   * <pre>
   * The URI of the subnetwork resource that this interface belongs to, which must be in the same region as the Cloud Router. When you establish a BGP session to a VM instance using this interface, the VM instance must belong to the same subnetwork as the subnetwork specified here.
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();
}
