/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

public interface ListDeviceStatesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.ListDeviceStatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The last few device states. States are listed in descending order of server
   * update time, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
   */
  java.util.List<com.google.cloud.iot.v1.DeviceState> getDeviceStatesList();
  /**
   *
   *
   * <pre>
   * The last few device states. States are listed in descending order of server
   * update time, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
   */
  com.google.cloud.iot.v1.DeviceState getDeviceStates(int index);
  /**
   *
   *
   * <pre>
   * The last few device states. States are listed in descending order of server
   * update time, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
   */
  int getDeviceStatesCount();
  /**
   *
   *
   * <pre>
   * The last few device states. States are listed in descending order of server
   * update time, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
   */
  java.util.List<? extends com.google.cloud.iot.v1.DeviceStateOrBuilder>
      getDeviceStatesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The last few device states. States are listed in descending order of server
   * update time, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
   */
  com.google.cloud.iot.v1.DeviceStateOrBuilder getDeviceStatesOrBuilder(int index);
}