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

public interface PublicDelegatedPrefixOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.PublicDelegatedPrefix)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The version of BYOIP API.
   * Check the ByoipApiVersion enum for the list of possible values.
   * </pre>
   *
   * <code>optional string byoip_api_version = 162683283;</code>
   *
   * @return Whether the byoipApiVersion field is set.
   */
  boolean hasByoipApiVersion();
  /**
   *
   *
   * <pre>
   * [Output Only] The version of BYOIP API.
   * Check the ByoipApiVersion enum for the list of possible values.
   * </pre>
   *
   * <code>optional string byoip_api_version = 162683283;</code>
   *
   * @return The byoipApiVersion.
   */
  java.lang.String getByoipApiVersion();
  /**
   *
   *
   * <pre>
   * [Output Only] The version of BYOIP API.
   * Check the ByoipApiVersion enum for the list of possible values.
   * </pre>
   *
   * <code>optional string byoip_api_version = 162683283;</code>
   *
   * @return The bytes for byoipApiVersion.
   */
  com.google.protobuf.ByteString getByoipApiVersionBytes();

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
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a new PublicDelegatedPrefix. An up-to-date fingerprint must be provided in order to update the PublicDelegatedPrefix, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a PublicDelegatedPrefix.
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
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a new PublicDelegatedPrefix. An up-to-date fingerprint must be provided in order to update the PublicDelegatedPrefix, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a PublicDelegatedPrefix.
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
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a new PublicDelegatedPrefix. An up-to-date fingerprint must be provided in order to update the PublicDelegatedPrefix, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a PublicDelegatedPrefix.
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
   * The IP address range, in CIDR format, represented by this public delegated prefix.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   *
   * @return Whether the ipCidrRange field is set.
   */
  boolean hasIpCidrRange();
  /**
   *
   *
   * <pre>
   * The IP address range, in CIDR format, represented by this public delegated prefix.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   *
   * @return The ipCidrRange.
   */
  java.lang.String getIpCidrRange();
  /**
   *
   *
   * <pre>
   * The IP address range, in CIDR format, represented by this public delegated prefix.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   *
   * @return The bytes for ipCidrRange.
   */
  com.google.protobuf.ByteString getIpCidrRangeBytes();

  /**
   *
   *
   * <pre>
   * If true, the prefix will be live migrated.
   * </pre>
   *
   * <code>optional bool is_live_migration = 511823856;</code>
   *
   * @return Whether the isLiveMigration field is set.
   */
  boolean hasIsLiveMigration();
  /**
   *
   *
   * <pre>
   * If true, the prefix will be live migrated.
   * </pre>
   *
   * <code>optional bool is_live_migration = 511823856;</code>
   *
   * @return The isLiveMigration.
   */
  boolean getIsLiveMigration();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#publicDelegatedPrefix for public delegated prefixes.
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
   * [Output Only] Type of the resource. Always compute#publicDelegatedPrefix for public delegated prefixes.
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
   * [Output Only] Type of the resource. Always compute#publicDelegatedPrefix for public delegated prefixes.
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
   * The URL of parent prefix. Either PublicAdvertisedPrefix or PublicDelegatedPrefix.
   * </pre>
   *
   * <code>optional string parent_prefix = 15233991;</code>
   *
   * @return Whether the parentPrefix field is set.
   */
  boolean hasParentPrefix();
  /**
   *
   *
   * <pre>
   * The URL of parent prefix. Either PublicAdvertisedPrefix or PublicDelegatedPrefix.
   * </pre>
   *
   * <code>optional string parent_prefix = 15233991;</code>
   *
   * @return The parentPrefix.
   */
  java.lang.String getParentPrefix();
  /**
   *
   *
   * <pre>
   * The URL of parent prefix. Either PublicAdvertisedPrefix or PublicDelegatedPrefix.
   * </pre>
   *
   * <code>optional string parent_prefix = 15233991;</code>
   *
   * @return The bytes for parentPrefix.
   */
  com.google.protobuf.ByteString getParentPrefixBytes();

  /**
   *
   *
   * <pre>
   * The list of sub public delegated prefixes that exist for this public delegated prefix.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PublicDelegatedPrefixPublicDelegatedSubPrefix public_delegated_sub_prefixs = 188940044;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.PublicDelegatedPrefixPublicDelegatedSubPrefix>
      getPublicDelegatedSubPrefixsList();
  /**
   *
   *
   * <pre>
   * The list of sub public delegated prefixes that exist for this public delegated prefix.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PublicDelegatedPrefixPublicDelegatedSubPrefix public_delegated_sub_prefixs = 188940044;
   * </code>
   */
  com.google.cloud.compute.v1.PublicDelegatedPrefixPublicDelegatedSubPrefix
      getPublicDelegatedSubPrefixs(int index);
  /**
   *
   *
   * <pre>
   * The list of sub public delegated prefixes that exist for this public delegated prefix.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PublicDelegatedPrefixPublicDelegatedSubPrefix public_delegated_sub_prefixs = 188940044;
   * </code>
   */
  int getPublicDelegatedSubPrefixsCount();
  /**
   *
   *
   * <pre>
   * The list of sub public delegated prefixes that exist for this public delegated prefix.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PublicDelegatedPrefixPublicDelegatedSubPrefix public_delegated_sub_prefixs = 188940044;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.compute.v1.PublicDelegatedPrefixPublicDelegatedSubPrefixOrBuilder>
      getPublicDelegatedSubPrefixsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of sub public delegated prefixes that exist for this public delegated prefix.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PublicDelegatedPrefixPublicDelegatedSubPrefix public_delegated_sub_prefixs = 188940044;
   * </code>
   */
  com.google.cloud.compute.v1.PublicDelegatedPrefixPublicDelegatedSubPrefixOrBuilder
      getPublicDelegatedSubPrefixsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the public delegated prefix resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
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
   * [Output Only] URL of the region where the public delegated prefix resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
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
   * [Output Only] URL of the region where the public delegated prefix resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
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
   * [Output Only] The status of the public delegated prefix, which can be one of following values: - `INITIALIZING` The public delegated prefix is being initialized and addresses cannot be created yet. - `READY_TO_ANNOUNCE` The public delegated prefix is a live migration prefix and is active. - `ANNOUNCED` The public delegated prefix is active. - `DELETING` The public delegated prefix is being deprovsioned.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * [Output Only] The status of the public delegated prefix, which can be one of following values: - `INITIALIZING` The public delegated prefix is being initialized and addresses cannot be created yet. - `READY_TO_ANNOUNCE` The public delegated prefix is a live migration prefix and is active. - `ANNOUNCED` The public delegated prefix is active. - `DELETING` The public delegated prefix is being deprovsioned.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   *
   *
   * <pre>
   * [Output Only] The status of the public delegated prefix, which can be one of following values: - `INITIALIZING` The public delegated prefix is being initialized and addresses cannot be created yet. - `READY_TO_ANNOUNCE` The public delegated prefix is a live migration prefix and is active. - `ANNOUNCED` The public delegated prefix is active. - `DELETING` The public delegated prefix is being deprovsioned.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString getStatusBytes();
}
