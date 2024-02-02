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

public interface NetworkEndpointGroupCloudFunctionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NetworkEndpointGroupCloudFunction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: "func1".
   * </pre>
   *
   * <code>optional string function = 307196888;</code>
   *
   * @return Whether the function field is set.
   */
  boolean hasFunction();
  /**
   *
   *
   * <pre>
   * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: "func1".
   * </pre>
   *
   * <code>optional string function = 307196888;</code>
   *
   * @return The function.
   */
  java.lang.String getFunction();
  /**
   *
   *
   * <pre>
   * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: "func1".
   * </pre>
   *
   * <code>optional string function = 307196888;</code>
   *
   * @return The bytes for function.
   */
  com.google.protobuf.ByteString getFunctionBytes();

  /**
   *
   *
   * <pre>
   * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs " mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/&lt;function&gt;". The URL mask will parse them to { function = "function1" } and { function = "function2" } respectively.
   * </pre>
   *
   * <code>optional string url_mask = 103352252;</code>
   *
   * @return Whether the urlMask field is set.
   */
  boolean hasUrlMask();
  /**
   *
   *
   * <pre>
   * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs " mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/&lt;function&gt;". The URL mask will parse them to { function = "function1" } and { function = "function2" } respectively.
   * </pre>
   *
   * <code>optional string url_mask = 103352252;</code>
   *
   * @return The urlMask.
   */
  java.lang.String getUrlMask();
  /**
   *
   *
   * <pre>
   * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs " mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/&lt;function&gt;". The URL mask will parse them to { function = "function1" } and { function = "function2" } respectively.
   * </pre>
   *
   * <code>optional string url_mask = 103352252;</code>
   *
   * @return The bytes for urlMask.
   */
  com.google.protobuf.ByteString getUrlMaskBytes();
}
