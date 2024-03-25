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
// source: google/cloud/networkmanagement/v1/trace.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.networkmanagement.v1;

public interface LoadBalancerInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1.LoadBalancerInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Type of the load balancer.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1.LoadBalancerInfo.LoadBalancerType load_balancer_type = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for loadBalancerType.
   */
  int getLoadBalancerTypeValue();
  /**
   *
   *
   * <pre>
   * Type of the load balancer.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1.LoadBalancerInfo.LoadBalancerType load_balancer_type = 1;
   * </code>
   *
   * @return The loadBalancerType.
   */
  com.google.cloud.networkmanagement.v1.LoadBalancerInfo.LoadBalancerType getLoadBalancerType();

  /**
   *
   *
   * <pre>
   * URI of the health check for the load balancer. Deprecated and no longer
   * populated as different load balancer backends might have different health
   * checks.
   * </pre>
   *
   * <code>string health_check_uri = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.networkmanagement.v1.LoadBalancerInfo.health_check_uri is deprecated.
   *     See google/cloud/networkmanagement/v1/trace.proto;l=632
   * @return The healthCheckUri.
   */
  @java.lang.Deprecated
  java.lang.String getHealthCheckUri();
  /**
   *
   *
   * <pre>
   * URI of the health check for the load balancer. Deprecated and no longer
   * populated as different load balancer backends might have different health
   * checks.
   * </pre>
   *
   * <code>string health_check_uri = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.networkmanagement.v1.LoadBalancerInfo.health_check_uri is deprecated.
   *     See google/cloud/networkmanagement/v1/trace.proto;l=632
   * @return The bytes for healthCheckUri.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getHealthCheckUriBytes();

  /**
   *
   *
   * <pre>
   * Information for the loadbalancer backends.
   * </pre>
   *
   * <code>repeated .google.cloud.networkmanagement.v1.LoadBalancerBackend backends = 3;</code>
   */
  java.util.List<com.google.cloud.networkmanagement.v1.LoadBalancerBackend> getBackendsList();
  /**
   *
   *
   * <pre>
   * Information for the loadbalancer backends.
   * </pre>
   *
   * <code>repeated .google.cloud.networkmanagement.v1.LoadBalancerBackend backends = 3;</code>
   */
  com.google.cloud.networkmanagement.v1.LoadBalancerBackend getBackends(int index);
  /**
   *
   *
   * <pre>
   * Information for the loadbalancer backends.
   * </pre>
   *
   * <code>repeated .google.cloud.networkmanagement.v1.LoadBalancerBackend backends = 3;</code>
   */
  int getBackendsCount();
  /**
   *
   *
   * <pre>
   * Information for the loadbalancer backends.
   * </pre>
   *
   * <code>repeated .google.cloud.networkmanagement.v1.LoadBalancerBackend backends = 3;</code>
   */
  java.util.List<? extends com.google.cloud.networkmanagement.v1.LoadBalancerBackendOrBuilder>
      getBackendsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Information for the loadbalancer backends.
   * </pre>
   *
   * <code>repeated .google.cloud.networkmanagement.v1.LoadBalancerBackend backends = 3;</code>
   */
  com.google.cloud.networkmanagement.v1.LoadBalancerBackendOrBuilder getBackendsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Type of load balancer's backend configuration.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.LoadBalancerInfo.BackendType backend_type = 4;</code>
   *
   * @return The enum numeric value on the wire for backendType.
   */
  int getBackendTypeValue();
  /**
   *
   *
   * <pre>
   * Type of load balancer's backend configuration.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.LoadBalancerInfo.BackendType backend_type = 4;</code>
   *
   * @return The backendType.
   */
  com.google.cloud.networkmanagement.v1.LoadBalancerInfo.BackendType getBackendType();

  /**
   *
   *
   * <pre>
   * Backend configuration URI.
   * </pre>
   *
   * <code>string backend_uri = 5;</code>
   *
   * @return The backendUri.
   */
  java.lang.String getBackendUri();
  /**
   *
   *
   * <pre>
   * Backend configuration URI.
   * </pre>
   *
   * <code>string backend_uri = 5;</code>
   *
   * @return The bytes for backendUri.
   */
  com.google.protobuf.ByteString getBackendUriBytes();
}
