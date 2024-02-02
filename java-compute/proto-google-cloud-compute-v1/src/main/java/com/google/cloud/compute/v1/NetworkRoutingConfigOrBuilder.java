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

public interface NetworkRoutingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NetworkRoutingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The network-wide routing mode to use. If set to REGIONAL, this network's Cloud Routers will only advertise routes with subnets of this network in the same region as the router. If set to GLOBAL, this network's Cloud Routers will advertise routes with all subnets of this network, across regions.
   * Check the RoutingMode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string routing_mode = 475143548;</code>
   *
   * @return Whether the routingMode field is set.
   */
  boolean hasRoutingMode();
  /**
   *
   *
   * <pre>
   * The network-wide routing mode to use. If set to REGIONAL, this network's Cloud Routers will only advertise routes with subnets of this network in the same region as the router. If set to GLOBAL, this network's Cloud Routers will advertise routes with all subnets of this network, across regions.
   * Check the RoutingMode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string routing_mode = 475143548;</code>
   *
   * @return The routingMode.
   */
  java.lang.String getRoutingMode();
  /**
   *
   *
   * <pre>
   * The network-wide routing mode to use. If set to REGIONAL, this network's Cloud Routers will only advertise routes with subnets of this network in the same region as the router. If set to GLOBAL, this network's Cloud Routers will advertise routes with all subnets of this network, across regions.
   * Check the RoutingMode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string routing_mode = 475143548;</code>
   *
   * @return The bytes for routingMode.
   */
  com.google.protobuf.ByteString getRoutingModeBytes();
}
