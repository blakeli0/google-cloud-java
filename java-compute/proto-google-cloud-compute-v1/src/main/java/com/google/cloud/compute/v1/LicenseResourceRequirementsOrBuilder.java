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

public interface LicenseResourceRequirementsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.LicenseResourceRequirements)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
   * </pre>
   *
   * <code>optional int32 min_guest_cpu_count = 477964836;</code>
   *
   * @return Whether the minGuestCpuCount field is set.
   */
  boolean hasMinGuestCpuCount();
  /**
   *
   *
   * <pre>
   * Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
   * </pre>
   *
   * <code>optional int32 min_guest_cpu_count = 477964836;</code>
   *
   * @return The minGuestCpuCount.
   */
  int getMinGuestCpuCount();

  /**
   *
   *
   * <pre>
   * Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
   * </pre>
   *
   * <code>optional int32 min_memory_mb = 504785894;</code>
   *
   * @return Whether the minMemoryMb field is set.
   */
  boolean hasMinMemoryMb();
  /**
   *
   *
   * <pre>
   * Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
   * </pre>
   *
   * <code>optional int32 min_memory_mb = 504785894;</code>
   *
   * @return The minMemoryMb.
   */
  int getMinMemoryMb();
}
