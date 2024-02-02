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

public interface ScalingScheduleStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ScalingScheduleStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The last time the scaling schedule became active. Note: this is a timestamp when a schedule actually became active, not when it was planned to do so. The timestamp is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string last_start_time = 34545107;</code>
   *
   * @return Whether the lastStartTime field is set.
   */
  boolean hasLastStartTime();
  /**
   *
   *
   * <pre>
   * [Output Only] The last time the scaling schedule became active. Note: this is a timestamp when a schedule actually became active, not when it was planned to do so. The timestamp is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string last_start_time = 34545107;</code>
   *
   * @return The lastStartTime.
   */
  java.lang.String getLastStartTime();
  /**
   *
   *
   * <pre>
   * [Output Only] The last time the scaling schedule became active. Note: this is a timestamp when a schedule actually became active, not when it was planned to do so. The timestamp is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string last_start_time = 34545107;</code>
   *
   * @return The bytes for lastStartTime.
   */
  com.google.protobuf.ByteString getLastStartTimeBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The next time the scaling schedule is to become active. Note: this is a timestamp when a schedule is planned to run, but the actual time might be slightly different. The timestamp is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string next_start_time = 97270102;</code>
   *
   * @return Whether the nextStartTime field is set.
   */
  boolean hasNextStartTime();
  /**
   *
   *
   * <pre>
   * [Output Only] The next time the scaling schedule is to become active. Note: this is a timestamp when a schedule is planned to run, but the actual time might be slightly different. The timestamp is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string next_start_time = 97270102;</code>
   *
   * @return The nextStartTime.
   */
  java.lang.String getNextStartTime();
  /**
   *
   *
   * <pre>
   * [Output Only] The next time the scaling schedule is to become active. Note: this is a timestamp when a schedule is planned to run, but the actual time might be slightly different. The timestamp is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string next_start_time = 97270102;</code>
   *
   * @return The bytes for nextStartTime.
   */
  com.google.protobuf.ByteString getNextStartTimeBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The current state of a scaling schedule.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   *
   *
   * <pre>
   * [Output Only] The current state of a scaling schedule.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   *
   * @return The state.
   */
  java.lang.String getState();
  /**
   *
   *
   * <pre>
   * [Output Only] The current state of a scaling schedule.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   *
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString getStateBytes();
}
