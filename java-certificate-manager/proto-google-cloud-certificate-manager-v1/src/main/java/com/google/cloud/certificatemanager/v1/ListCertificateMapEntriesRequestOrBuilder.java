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
// source: google/cloud/certificatemanager/v1/certificate_manager.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.certificatemanager.v1;

public interface ListCertificateMapEntriesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.certificatemanager.v1.ListCertificateMapEntriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project, location and certificate map from which the
   * certificate map entries should be listed, specified in the format
   * `projects/&#42;&#47;locations/&#42;&#47;certificateMaps/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The project, location and certificate map from which the
   * certificate map entries should be listed, specified in the format
   * `projects/&#42;&#47;locations/&#42;&#47;certificateMaps/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Maximum number of certificate map entries to return. The service may return
   * fewer than this value.
   * If unspecified, at most 50 certificate map entries will be returned.
   * The maximum value is 1000; values above 1000 will be coerced to 1000.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The value returned by the last `ListCertificateMapEntriesResponse`.
   * Indicates that this is a continuation of a prior
   * `ListCertificateMapEntries` call, and that the system should return the
   * next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The value returned by the last `ListCertificateMapEntriesResponse`.
   * Indicates that this is a continuation of a prior
   * `ListCertificateMapEntries` call, and that the system should return the
   * next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Filter expression to restrict the returned Certificate Map Entries.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Filter expression to restrict the returned Certificate Map Entries.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * A list of Certificate Map Entry field names used to specify
   * the order of the returned results. The default sorting order is ascending.
   * To specify descending order for a field, add a suffix " desc".
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * A list of Certificate Map Entry field names used to specify
   * the order of the returned results. The default sorting order is ascending.
   * To specify descending order for a field, add a suffix " desc".
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
