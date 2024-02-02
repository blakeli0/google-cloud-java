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

public interface SnapshotSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SnapshotSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Policy of which storage location is going to be resolved, and additional data that particularizes how the policy is going to be carried out.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SnapshotSettingsStorageLocationSettings storage_location = 460859641;
   * </code>
   *
   * @return Whether the storageLocation field is set.
   */
  boolean hasStorageLocation();
  /**
   *
   *
   * <pre>
   * Policy of which storage location is going to be resolved, and additional data that particularizes how the policy is going to be carried out.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SnapshotSettingsStorageLocationSettings storage_location = 460859641;
   * </code>
   *
   * @return The storageLocation.
   */
  com.google.cloud.compute.v1.SnapshotSettingsStorageLocationSettings getStorageLocation();
  /**
   *
   *
   * <pre>
   * Policy of which storage location is going to be resolved, and additional data that particularizes how the policy is going to be carried out.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SnapshotSettingsStorageLocationSettings storage_location = 460859641;
   * </code>
   */
  com.google.cloud.compute.v1.SnapshotSettingsStorageLocationSettingsOrBuilder
      getStorageLocationOrBuilder();
}
