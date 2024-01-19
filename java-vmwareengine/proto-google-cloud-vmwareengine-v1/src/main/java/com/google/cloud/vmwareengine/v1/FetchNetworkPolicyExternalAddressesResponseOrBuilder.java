/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/vmwareengine/v1/vmwareengine.proto

package com.google.cloud.vmwareengine.v1;

public interface FetchNetworkPolicyExternalAddressesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.FetchNetworkPolicyExternalAddressesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of external IP addresses assigned to VMware workload VMs within the
   * scope of the given network policy.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.ExternalAddress external_addresses = 1;</code>
   */
  java.util.List<com.google.cloud.vmwareengine.v1.ExternalAddress> getExternalAddressesList();
  /**
   *
   *
   * <pre>
   * A list of external IP addresses assigned to VMware workload VMs within the
   * scope of the given network policy.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.ExternalAddress external_addresses = 1;</code>
   */
  com.google.cloud.vmwareengine.v1.ExternalAddress getExternalAddresses(int index);
  /**
   *
   *
   * <pre>
   * A list of external IP addresses assigned to VMware workload VMs within the
   * scope of the given network policy.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.ExternalAddress external_addresses = 1;</code>
   */
  int getExternalAddressesCount();
  /**
   *
   *
   * <pre>
   * A list of external IP addresses assigned to VMware workload VMs within the
   * scope of the given network policy.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.ExternalAddress external_addresses = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vmwareengine.v1.ExternalAddressOrBuilder>
      getExternalAddressesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of external IP addresses assigned to VMware workload VMs within the
   * scope of the given network policy.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.ExternalAddress external_addresses = 1;</code>
   */
  com.google.cloud.vmwareengine.v1.ExternalAddressOrBuilder getExternalAddressesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
