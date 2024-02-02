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
// source: google/api/cloudquotas/v1/cloudquotas.proto

// Protobuf Java Version: 3.25.2
package com.google.api.cloudquotas.v1;

public interface ListQuotaInfosResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.cloudquotas.v1.ListQuotaInfosResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of QuotaInfo
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1.QuotaInfo quota_infos = 1;</code>
   */
  java.util.List<com.google.api.cloudquotas.v1.QuotaInfo> getQuotaInfosList();
  /**
   *
   *
   * <pre>
   * The list of QuotaInfo
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1.QuotaInfo quota_infos = 1;</code>
   */
  com.google.api.cloudquotas.v1.QuotaInfo getQuotaInfos(int index);
  /**
   *
   *
   * <pre>
   * The list of QuotaInfo
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1.QuotaInfo quota_infos = 1;</code>
   */
  int getQuotaInfosCount();
  /**
   *
   *
   * <pre>
   * The list of QuotaInfo
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1.QuotaInfo quota_infos = 1;</code>
   */
  java.util.List<? extends com.google.api.cloudquotas.v1.QuotaInfoOrBuilder>
      getQuotaInfosOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of QuotaInfo
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1.QuotaInfo quota_infos = 1;</code>
   */
  com.google.api.cloudquotas.v1.QuotaInfoOrBuilder getQuotaInfosOrBuilder(int index);

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
