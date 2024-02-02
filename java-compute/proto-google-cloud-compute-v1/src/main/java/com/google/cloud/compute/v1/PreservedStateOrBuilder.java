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

public interface PreservedStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.PreservedState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedDisk&gt; disks = 95594102;
   * </code>
   */
  int getDisksCount();
  /**
   *
   *
   * <pre>
   * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedDisk&gt; disks = 95594102;
   * </code>
   */
  boolean containsDisks(java.lang.String key);
  /** Use {@link #getDisksMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
      getDisks();
  /**
   *
   *
   * <pre>
   * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedDisk&gt; disks = 95594102;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
      getDisksMap();
  /**
   *
   *
   * <pre>
   * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedDisk&gt; disks = 95594102;
   * </code>
   */
  /* nullable */
  com.google.cloud.compute.v1.PreservedStatePreservedDisk getDisksOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.compute.v1.PreservedStatePreservedDisk defaultValue);
  /**
   *
   *
   * <pre>
   * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedDisk&gt; disks = 95594102;
   * </code>
   */
  com.google.cloud.compute.v1.PreservedStatePreservedDisk getDisksOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Preserved external IPs defined for this instance. This map is keyed with the name of the network interface.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedNetworkIp&gt; external_i_ps = 532687245;
   * </code>
   */
  int getExternalIPsCount();
  /**
   *
   *
   * <pre>
   * Preserved external IPs defined for this instance. This map is keyed with the name of the network interface.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedNetworkIp&gt; external_i_ps = 532687245;
   * </code>
   */
  boolean containsExternalIPs(java.lang.String key);
  /** Use {@link #getExternalIPsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp>
      getExternalIPs();
  /**
   *
   *
   * <pre>
   * Preserved external IPs defined for this instance. This map is keyed with the name of the network interface.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedNetworkIp&gt; external_i_ps = 532687245;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp>
      getExternalIPsMap();
  /**
   *
   *
   * <pre>
   * Preserved external IPs defined for this instance. This map is keyed with the name of the network interface.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedNetworkIp&gt; external_i_ps = 532687245;
   * </code>
   */
  /* nullable */
  com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp getExternalIPsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp defaultValue);
  /**
   *
   *
   * <pre>
   * Preserved external IPs defined for this instance. This map is keyed with the name of the network interface.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedNetworkIp&gt; external_i_ps = 532687245;
   * </code>
   */
  com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp getExternalIPsOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * Preserved internal IPs defined for this instance. This map is keyed with the name of the network interface.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedNetworkIp&gt; internal_i_ps = 215731675;
   * </code>
   */
  int getInternalIPsCount();
  /**
   *
   *
   * <pre>
   * Preserved internal IPs defined for this instance. This map is keyed with the name of the network interface.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedNetworkIp&gt; internal_i_ps = 215731675;
   * </code>
   */
  boolean containsInternalIPs(java.lang.String key);
  /** Use {@link #getInternalIPsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp>
      getInternalIPs();
  /**
   *
   *
   * <pre>
   * Preserved internal IPs defined for this instance. This map is keyed with the name of the network interface.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedNetworkIp&gt; internal_i_ps = 215731675;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp>
      getInternalIPsMap();
  /**
   *
   *
   * <pre>
   * Preserved internal IPs defined for this instance. This map is keyed with the name of the network interface.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedNetworkIp&gt; internal_i_ps = 215731675;
   * </code>
   */
  /* nullable */
  com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp getInternalIPsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp defaultValue);
  /**
   *
   *
   * <pre>
   * Preserved internal IPs defined for this instance. This map is keyed with the name of the network interface.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedNetworkIp&gt; internal_i_ps = 215731675;
   * </code>
   */
  com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp getInternalIPsOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * Preserved metadata defined for this instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 86866735;</code>
   */
  int getMetadataCount();
  /**
   *
   *
   * <pre>
   * Preserved metadata defined for this instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 86866735;</code>
   */
  boolean containsMetadata(java.lang.String key);
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getMetadata();
  /**
   *
   *
   * <pre>
   * Preserved metadata defined for this instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 86866735;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getMetadataMap();
  /**
   *
   *
   * <pre>
   * Preserved metadata defined for this instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 86866735;</code>
   */
  /* nullable */
  java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Preserved metadata defined for this instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 86866735;</code>
   */
  java.lang.String getMetadataOrThrow(java.lang.String key);
}
