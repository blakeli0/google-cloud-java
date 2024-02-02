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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.2
package com.google.cloudbuild.v1;

public interface UpdateBuildTriggerRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.UpdateBuildTriggerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. ID of the project that owns the trigger.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. ID of the project that owns the trigger.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. ID of the `BuildTrigger` to update.
   * </pre>
   *
   * <code>string trigger_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The triggerId.
   */
  java.lang.String getTriggerId();
  /**
   *
   *
   * <pre>
   * Required. ID of the `BuildTrigger` to update.
   * </pre>
   *
   * <code>string trigger_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for triggerId.
   */
  com.google.protobuf.ByteString getTriggerIdBytes();

  /**
   *
   *
   * <pre>
   * Required. `BuildTrigger` to update.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.BuildTrigger trigger = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the trigger field is set.
   */
  boolean hasTrigger();
  /**
   *
   *
   * <pre>
   * Required. `BuildTrigger` to update.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.BuildTrigger trigger = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The trigger.
   */
  com.google.cloudbuild.v1.BuildTrigger getTrigger();
  /**
   *
   *
   * <pre>
   * Required. `BuildTrigger` to update.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.BuildTrigger trigger = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloudbuild.v1.BuildTriggerOrBuilder getTriggerOrBuilder();

  /**
   *
   *
   * <pre>
   * Update mask for the resource. If this is set,
   * the server will only update the fields specified in the field mask.
   * Otherwise, a full update of the mutable resource fields will be performed.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Update mask for the resource. If this is set,
   * the server will only update the fields specified in the field mask.
   * Otherwise, a full update of the mutable resource fields will be performed.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Update mask for the resource. If this is set,
   * the server will only update the fields specified in the field mask.
   * Otherwise, a full update of the mutable resource fields will be performed.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
