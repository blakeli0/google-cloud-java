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

public interface NetworkAttachmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NetworkAttachment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] An array of connections for all the producers connected to this network attachment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.NetworkAttachmentConnectedEndpoint connection_endpoints = 326078813;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.NetworkAttachmentConnectedEndpoint>
      getConnectionEndpointsList();
  /**
   *
   *
   * <pre>
   * [Output Only] An array of connections for all the producers connected to this network attachment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.NetworkAttachmentConnectedEndpoint connection_endpoints = 326078813;
   * </code>
   */
  com.google.cloud.compute.v1.NetworkAttachmentConnectedEndpoint getConnectionEndpoints(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] An array of connections for all the producers connected to this network attachment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.NetworkAttachmentConnectedEndpoint connection_endpoints = 326078813;
   * </code>
   */
  int getConnectionEndpointsCount();
  /**
   *
   *
   * <pre>
   * [Output Only] An array of connections for all the producers connected to this network attachment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.NetworkAttachmentConnectedEndpoint connection_endpoints = 326078813;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.NetworkAttachmentConnectedEndpointOrBuilder>
      getConnectionEndpointsOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] An array of connections for all the producers connected to this network attachment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.NetworkAttachmentConnectedEndpoint connection_endpoints = 326078813;
   * </code>
   */
  com.google.cloud.compute.v1.NetworkAttachmentConnectedEndpointOrBuilder
      getConnectionEndpointsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   *
   * Check the ConnectionPreference enum for the list of possible values.
   * </pre>
   *
   * <code>optional string connection_preference = 285818076;</code>
   *
   * @return Whether the connectionPreference field is set.
   */
  boolean hasConnectionPreference();
  /**
   *
   *
   * <pre>
   *
   * Check the ConnectionPreference enum for the list of possible values.
   * </pre>
   *
   * <code>optional string connection_preference = 285818076;</code>
   *
   * @return The connectionPreference.
   */
  java.lang.String getConnectionPreference();
  /**
   *
   *
   * <pre>
   *
   * Check the ConnectionPreference enum for the list of possible values.
   * </pre>
   *
   * <code>optional string connection_preference = 285818076;</code>
   *
   * @return The bytes for connectionPreference.
   */
  com.google.protobuf.ByteString getConnectionPreferenceBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. An up-to-date fingerprint must be provided in order to patch.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return Whether the fingerprint field is set.
   */
  boolean hasFingerprint();
  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. An up-to-date fingerprint must be provided in order to patch.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The fingerprint.
   */
  java.lang.String getFingerprint();
  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. An up-to-date fingerprint must be provided in order to patch.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The bytes for fingerprint.
   */
  com.google.protobuf.ByteString getFingerprintBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource type. The server generates this identifier.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource type. The server generates this identifier.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * [Output Only] The URL of the network which the Network Attachment belongs to. Practically it is inferred by fetching the network of the first subnetwork associated. Because it is required that all the subnetworks must be from the same network, it is assured that the Network Attachment belongs to the same network as all the subnetworks.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   *
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the network which the Network Attachment belongs to. Practically it is inferred by fetching the network of the first subnetwork associated. Because it is required that all the subnetworks must be from the same network, it is assured that the Network Attachment belongs to the same network as all the subnetworks.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the network which the Network Attachment belongs to. Practically it is inferred by fetching the network of the first subnetwork associated. Because it is required that all the subnetworks must be from the same network, it is assured that the Network Attachment belongs to the same network as all the subnetworks.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Projects that are allowed to connect to this network attachment. The project can be specified using its id or number.
   * </pre>
   *
   * <code>repeated string producer_accept_lists = 202804523;</code>
   *
   * @return A list containing the producerAcceptLists.
   */
  java.util.List<java.lang.String> getProducerAcceptListsList();
  /**
   *
   *
   * <pre>
   * Projects that are allowed to connect to this network attachment. The project can be specified using its id or number.
   * </pre>
   *
   * <code>repeated string producer_accept_lists = 202804523;</code>
   *
   * @return The count of producerAcceptLists.
   */
  int getProducerAcceptListsCount();
  /**
   *
   *
   * <pre>
   * Projects that are allowed to connect to this network attachment. The project can be specified using its id or number.
   * </pre>
   *
   * <code>repeated string producer_accept_lists = 202804523;</code>
   *
   * @param index The index of the element to return.
   * @return The producerAcceptLists at the given index.
   */
  java.lang.String getProducerAcceptLists(int index);
  /**
   *
   *
   * <pre>
   * Projects that are allowed to connect to this network attachment. The project can be specified using its id or number.
   * </pre>
   *
   * <code>repeated string producer_accept_lists = 202804523;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the producerAcceptLists at the given index.
   */
  com.google.protobuf.ByteString getProducerAcceptListsBytes(int index);

  /**
   *
   *
   * <pre>
   * Projects that are not allowed to connect to this network attachment. The project can be specified using its id or number.
   * </pre>
   *
   * <code>repeated string producer_reject_lists = 4112002;</code>
   *
   * @return A list containing the producerRejectLists.
   */
  java.util.List<java.lang.String> getProducerRejectListsList();
  /**
   *
   *
   * <pre>
   * Projects that are not allowed to connect to this network attachment. The project can be specified using its id or number.
   * </pre>
   *
   * <code>repeated string producer_reject_lists = 4112002;</code>
   *
   * @return The count of producerRejectLists.
   */
  int getProducerRejectListsCount();
  /**
   *
   *
   * <pre>
   * Projects that are not allowed to connect to this network attachment. The project can be specified using its id or number.
   * </pre>
   *
   * <code>repeated string producer_reject_lists = 4112002;</code>
   *
   * @param index The index of the element to return.
   * @return The producerRejectLists at the given index.
   */
  java.lang.String getProducerRejectLists(int index);
  /**
   *
   *
   * <pre>
   * Projects that are not allowed to connect to this network attachment. The project can be specified using its id or number.
   * </pre>
   *
   * <code>repeated string producer_reject_lists = 4112002;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the producerRejectLists at the given index.
   */
  com.google.protobuf.ByteString getProducerRejectListsBytes(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the network attachment resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the network attachment resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the network attachment resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource's resource id.
   * </pre>
   *
   * <code>optional string self_link_with_id = 44520962;</code>
   *
   * @return Whether the selfLinkWithId field is set.
   */
  boolean hasSelfLinkWithId();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource's resource id.
   * </pre>
   *
   * <code>optional string self_link_with_id = 44520962;</code>
   *
   * @return The selfLinkWithId.
   */
  java.lang.String getSelfLinkWithId();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource's resource id.
   * </pre>
   *
   * <code>optional string self_link_with_id = 44520962;</code>
   *
   * @return The bytes for selfLinkWithId.
   */
  com.google.protobuf.ByteString getSelfLinkWithIdBytes();

  /**
   *
   *
   * <pre>
   * An array of URLs where each entry is the URL of a subnet provided by the service consumer to use for endpoints in the producers that connect to this network attachment.
   * </pre>
   *
   * <code>repeated string subnetworks = 415853125;</code>
   *
   * @return A list containing the subnetworks.
   */
  java.util.List<java.lang.String> getSubnetworksList();
  /**
   *
   *
   * <pre>
   * An array of URLs where each entry is the URL of a subnet provided by the service consumer to use for endpoints in the producers that connect to this network attachment.
   * </pre>
   *
   * <code>repeated string subnetworks = 415853125;</code>
   *
   * @return The count of subnetworks.
   */
  int getSubnetworksCount();
  /**
   *
   *
   * <pre>
   * An array of URLs where each entry is the URL of a subnet provided by the service consumer to use for endpoints in the producers that connect to this network attachment.
   * </pre>
   *
   * <code>repeated string subnetworks = 415853125;</code>
   *
   * @param index The index of the element to return.
   * @return The subnetworks at the given index.
   */
  java.lang.String getSubnetworks(int index);
  /**
   *
   *
   * <pre>
   * An array of URLs where each entry is the URL of a subnet provided by the service consumer to use for endpoints in the producers that connect to this network attachment.
   * </pre>
   *
   * <code>repeated string subnetworks = 415853125;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the subnetworks at the given index.
   */
  com.google.protobuf.ByteString getSubnetworksBytes(int index);
}
