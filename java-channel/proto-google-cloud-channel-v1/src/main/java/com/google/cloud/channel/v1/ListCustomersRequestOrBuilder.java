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
// source: google/cloud/channel/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.channel.v1;

public interface ListCustomersRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ListCustomersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the reseller account to list customers from.
   * Parent uses the format: accounts/{account_id}.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the reseller account to list customers from.
   * Parent uses the format: accounts/{account_id}.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of customers to return. The service may return
   * fewer than this value. If unspecified, returns at most 10 customers. The
   * maximum value is 50.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results other than the first page.
   * Obtained through
   * [ListCustomersResponse.next_page_token][google.cloud.channel.v1.ListCustomersResponse.next_page_token]
   * of the previous
   * [CloudChannelService.ListCustomers][google.cloud.channel.v1.CloudChannelService.ListCustomers]
   * call.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results other than the first page.
   * Obtained through
   * [ListCustomersResponse.next_page_token][google.cloud.channel.v1.ListCustomersResponse.next_page_token]
   * of the previous
   * [CloudChannelService.ListCustomers][google.cloud.channel.v1.CloudChannelService.ListCustomers]
   * call.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. Filters applied to the [CloudChannelService.ListCustomers]
   * results. See
   * https://cloud.google.com/channel/docs/concepts/google-cloud/filter-customers
   * for more information.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. Filters applied to the [CloudChannelService.ListCustomers]
   * results. See
   * https://cloud.google.com/channel/docs/concepts/google-cloud/filter-customers
   * for more information.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
