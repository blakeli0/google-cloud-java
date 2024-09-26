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
// source: google/marketingplatform/admin/v1alpha/marketingplatform_admin.proto

// Protobuf Java Version: 3.25.5
package com.google.ads.marketingplatform.admin.v1alpha;

public interface CreateAnalyticsAccountLinkRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.marketingplatform.admin.v1alpha.CreateAnalyticsAccountLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this Analytics account link will be
   * created. Format: organizations/{org_id}
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
   * Required. The parent resource where this Analytics account link will be
   * created. Format: organizations/{org_id}
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
   * Required. The Analytics account link to create.
   * </pre>
   *
   * <code>
   * .google.marketingplatform.admin.v1alpha.AnalyticsAccountLink analytics_account_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the analyticsAccountLink field is set.
   */
  boolean hasAnalyticsAccountLink();
  /**
   *
   *
   * <pre>
   * Required. The Analytics account link to create.
   * </pre>
   *
   * <code>
   * .google.marketingplatform.admin.v1alpha.AnalyticsAccountLink analytics_account_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The analyticsAccountLink.
   */
  com.google.ads.marketingplatform.admin.v1alpha.AnalyticsAccountLink getAnalyticsAccountLink();
  /**
   *
   *
   * <pre>
   * Required. The Analytics account link to create.
   * </pre>
   *
   * <code>
   * .google.marketingplatform.admin.v1alpha.AnalyticsAccountLink analytics_account_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.ads.marketingplatform.admin.v1alpha.AnalyticsAccountLinkOrBuilder
      getAnalyticsAccountLinkOrBuilder();
}
