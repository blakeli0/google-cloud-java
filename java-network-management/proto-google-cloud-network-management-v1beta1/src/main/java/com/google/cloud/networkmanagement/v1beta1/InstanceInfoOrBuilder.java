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
// source: google/cloud/networkmanagement/v1beta1/trace.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.networkmanagement.v1beta1;

public interface InstanceInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1beta1.InstanceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of a Compute Engine instance.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Name of a Compute Engine instance.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * URI of a Compute Engine instance.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * URI of a Compute Engine instance.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Name of the network interface of a Compute Engine instance.
   * </pre>
   *
   * <code>string interface = 3;</code>
   *
   * @return The interface.
   */
  java.lang.String getInterface();
  /**
   *
   *
   * <pre>
   * Name of the network interface of a Compute Engine instance.
   * </pre>
   *
   * <code>string interface = 3;</code>
   *
   * @return The bytes for interface.
   */
  com.google.protobuf.ByteString getInterfaceBytes();

  /**
   *
   *
   * <pre>
   * URI of a Compute Engine network.
   * </pre>
   *
   * <code>string network_uri = 4;</code>
   *
   * @return The networkUri.
   */
  java.lang.String getNetworkUri();
  /**
   *
   *
   * <pre>
   * URI of a Compute Engine network.
   * </pre>
   *
   * <code>string network_uri = 4;</code>
   *
   * @return The bytes for networkUri.
   */
  com.google.protobuf.ByteString getNetworkUriBytes();

  /**
   *
   *
   * <pre>
   * Internal IP address of the network interface.
   * </pre>
   *
   * <code>string internal_ip = 5;</code>
   *
   * @return The internalIp.
   */
  java.lang.String getInternalIp();
  /**
   *
   *
   * <pre>
   * Internal IP address of the network interface.
   * </pre>
   *
   * <code>string internal_ip = 5;</code>
   *
   * @return The bytes for internalIp.
   */
  com.google.protobuf.ByteString getInternalIpBytes();

  /**
   *
   *
   * <pre>
   * External IP address of the network interface.
   * </pre>
   *
   * <code>string external_ip = 6;</code>
   *
   * @return The externalIp.
   */
  java.lang.String getExternalIp();
  /**
   *
   *
   * <pre>
   * External IP address of the network interface.
   * </pre>
   *
   * <code>string external_ip = 6;</code>
   *
   * @return The bytes for externalIp.
   */
  com.google.protobuf.ByteString getExternalIpBytes();

  /**
   *
   *
   * <pre>
   * Network tags configured on the instance.
   * </pre>
   *
   * <code>repeated string network_tags = 7;</code>
   *
   * @return A list containing the networkTags.
   */
  java.util.List<java.lang.String> getNetworkTagsList();
  /**
   *
   *
   * <pre>
   * Network tags configured on the instance.
   * </pre>
   *
   * <code>repeated string network_tags = 7;</code>
   *
   * @return The count of networkTags.
   */
  int getNetworkTagsCount();
  /**
   *
   *
   * <pre>
   * Network tags configured on the instance.
   * </pre>
   *
   * <code>repeated string network_tags = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The networkTags at the given index.
   */
  java.lang.String getNetworkTags(int index);
  /**
   *
   *
   * <pre>
   * Network tags configured on the instance.
   * </pre>
   *
   * <code>repeated string network_tags = 7;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the networkTags at the given index.
   */
  com.google.protobuf.ByteString getNetworkTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * Service account authorized for the instance.
   * </pre>
   *
   * <code>string service_account = 8 [deprecated = true];</code>
   *
   * @deprecated google.cloud.networkmanagement.v1beta1.InstanceInfo.service_account is deprecated.
   *     See google/cloud/networkmanagement/v1beta1/trace.proto;l=285
   * @return The serviceAccount.
   */
  @java.lang.Deprecated
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * Service account authorized for the instance.
   * </pre>
   *
   * <code>string service_account = 8 [deprecated = true];</code>
   *
   * @deprecated google.cloud.networkmanagement.v1beta1.InstanceInfo.service_account is deprecated.
   *     See google/cloud/networkmanagement/v1beta1/trace.proto;l=285
   * @return The bytes for serviceAccount.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getServiceAccountBytes();
}
