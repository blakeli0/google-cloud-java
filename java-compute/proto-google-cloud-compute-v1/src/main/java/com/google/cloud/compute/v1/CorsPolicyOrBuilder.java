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

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

public interface CorsPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.CorsPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * In response to a preflight request, setting this to true indicates that the actual request can include user credentials. This field translates to the Access-Control-Allow-Credentials header. Default is false.
   * </pre>
   *
   * <code>optional bool allow_credentials = 481263366;</code>
   *
   * @return Whether the allowCredentials field is set.
   */
  boolean hasAllowCredentials();
  /**
   *
   *
   * <pre>
   * In response to a preflight request, setting this to true indicates that the actual request can include user credentials. This field translates to the Access-Control-Allow-Credentials header. Default is false.
   * </pre>
   *
   * <code>optional bool allow_credentials = 481263366;</code>
   *
   * @return The allowCredentials.
   */
  boolean getAllowCredentials();

  /**
   *
   *
   * <pre>
   * Specifies the content for the Access-Control-Allow-Headers header.
   * </pre>
   *
   * <code>repeated string allow_headers = 45179024;</code>
   *
   * @return A list containing the allowHeaders.
   */
  java.util.List<java.lang.String> getAllowHeadersList();
  /**
   *
   *
   * <pre>
   * Specifies the content for the Access-Control-Allow-Headers header.
   * </pre>
   *
   * <code>repeated string allow_headers = 45179024;</code>
   *
   * @return The count of allowHeaders.
   */
  int getAllowHeadersCount();
  /**
   *
   *
   * <pre>
   * Specifies the content for the Access-Control-Allow-Headers header.
   * </pre>
   *
   * <code>repeated string allow_headers = 45179024;</code>
   *
   * @param index The index of the element to return.
   * @return The allowHeaders at the given index.
   */
  java.lang.String getAllowHeaders(int index);
  /**
   *
   *
   * <pre>
   * Specifies the content for the Access-Control-Allow-Headers header.
   * </pre>
   *
   * <code>repeated string allow_headers = 45179024;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the allowHeaders at the given index.
   */
  com.google.protobuf.ByteString getAllowHeadersBytes(int index);

  /**
   *
   *
   * <pre>
   * Specifies the content for the Access-Control-Allow-Methods header.
   * </pre>
   *
   * <code>repeated string allow_methods = 205405372;</code>
   *
   * @return A list containing the allowMethods.
   */
  java.util.List<java.lang.String> getAllowMethodsList();
  /**
   *
   *
   * <pre>
   * Specifies the content for the Access-Control-Allow-Methods header.
   * </pre>
   *
   * <code>repeated string allow_methods = 205405372;</code>
   *
   * @return The count of allowMethods.
   */
  int getAllowMethodsCount();
  /**
   *
   *
   * <pre>
   * Specifies the content for the Access-Control-Allow-Methods header.
   * </pre>
   *
   * <code>repeated string allow_methods = 205405372;</code>
   *
   * @param index The index of the element to return.
   * @return The allowMethods at the given index.
   */
  java.lang.String getAllowMethods(int index);
  /**
   *
   *
   * <pre>
   * Specifies the content for the Access-Control-Allow-Methods header.
   * </pre>
   *
   * <code>repeated string allow_methods = 205405372;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the allowMethods at the given index.
   */
  com.google.protobuf.ByteString getAllowMethodsBytes(int index);

  /**
   *
   *
   * <pre>
   * Specifies a regular expression that matches allowed origins. For more information, see regular expression syntax . An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes. Regular expressions can only be used when the loadBalancingScheme is set to INTERNAL_SELF_MANAGED.
   * </pre>
   *
   * <code>repeated string allow_origin_regexes = 215385810;</code>
   *
   * @return A list containing the allowOriginRegexes.
   */
  java.util.List<java.lang.String> getAllowOriginRegexesList();
  /**
   *
   *
   * <pre>
   * Specifies a regular expression that matches allowed origins. For more information, see regular expression syntax . An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes. Regular expressions can only be used when the loadBalancingScheme is set to INTERNAL_SELF_MANAGED.
   * </pre>
   *
   * <code>repeated string allow_origin_regexes = 215385810;</code>
   *
   * @return The count of allowOriginRegexes.
   */
  int getAllowOriginRegexesCount();
  /**
   *
   *
   * <pre>
   * Specifies a regular expression that matches allowed origins. For more information, see regular expression syntax . An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes. Regular expressions can only be used when the loadBalancingScheme is set to INTERNAL_SELF_MANAGED.
   * </pre>
   *
   * <code>repeated string allow_origin_regexes = 215385810;</code>
   *
   * @param index The index of the element to return.
   * @return The allowOriginRegexes at the given index.
   */
  java.lang.String getAllowOriginRegexes(int index);
  /**
   *
   *
   * <pre>
   * Specifies a regular expression that matches allowed origins. For more information, see regular expression syntax . An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes. Regular expressions can only be used when the loadBalancingScheme is set to INTERNAL_SELF_MANAGED.
   * </pre>
   *
   * <code>repeated string allow_origin_regexes = 215385810;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the allowOriginRegexes at the given index.
   */
  com.google.protobuf.ByteString getAllowOriginRegexesBytes(int index);

  /**
   *
   *
   * <pre>
   * Specifies the list of origins that is allowed to do CORS requests. An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
   * </pre>
   *
   * <code>repeated string allow_origins = 194914071;</code>
   *
   * @return A list containing the allowOrigins.
   */
  java.util.List<java.lang.String> getAllowOriginsList();
  /**
   *
   *
   * <pre>
   * Specifies the list of origins that is allowed to do CORS requests. An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
   * </pre>
   *
   * <code>repeated string allow_origins = 194914071;</code>
   *
   * @return The count of allowOrigins.
   */
  int getAllowOriginsCount();
  /**
   *
   *
   * <pre>
   * Specifies the list of origins that is allowed to do CORS requests. An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
   * </pre>
   *
   * <code>repeated string allow_origins = 194914071;</code>
   *
   * @param index The index of the element to return.
   * @return The allowOrigins at the given index.
   */
  java.lang.String getAllowOrigins(int index);
  /**
   *
   *
   * <pre>
   * Specifies the list of origins that is allowed to do CORS requests. An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
   * </pre>
   *
   * <code>repeated string allow_origins = 194914071;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the allowOrigins at the given index.
   */
  com.google.protobuf.ByteString getAllowOriginsBytes(int index);

  /**
   *
   *
   * <pre>
   * If true, disables the CORS policy. The default value is false, which indicates that the CORS policy is in effect.
   * </pre>
   *
   * <code>optional bool disabled = 270940796;</code>
   *
   * @return Whether the disabled field is set.
   */
  boolean hasDisabled();
  /**
   *
   *
   * <pre>
   * If true, disables the CORS policy. The default value is false, which indicates that the CORS policy is in effect.
   * </pre>
   *
   * <code>optional bool disabled = 270940796;</code>
   *
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   *
   *
   * <pre>
   * Specifies the content for the Access-Control-Expose-Headers header.
   * </pre>
   *
   * <code>repeated string expose_headers = 247604747;</code>
   *
   * @return A list containing the exposeHeaders.
   */
  java.util.List<java.lang.String> getExposeHeadersList();
  /**
   *
   *
   * <pre>
   * Specifies the content for the Access-Control-Expose-Headers header.
   * </pre>
   *
   * <code>repeated string expose_headers = 247604747;</code>
   *
   * @return The count of exposeHeaders.
   */
  int getExposeHeadersCount();
  /**
   *
   *
   * <pre>
   * Specifies the content for the Access-Control-Expose-Headers header.
   * </pre>
   *
   * <code>repeated string expose_headers = 247604747;</code>
   *
   * @param index The index of the element to return.
   * @return The exposeHeaders at the given index.
   */
  java.lang.String getExposeHeaders(int index);
  /**
   *
   *
   * <pre>
   * Specifies the content for the Access-Control-Expose-Headers header.
   * </pre>
   *
   * <code>repeated string expose_headers = 247604747;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the exposeHeaders at the given index.
   */
  com.google.protobuf.ByteString getExposeHeadersBytes(int index);

  /**
   *
   *
   * <pre>
   * Specifies how long results of a preflight request can be cached in seconds. This field translates to the Access-Control-Max-Age header.
   * </pre>
   *
   * <code>optional int32 max_age = 307559332;</code>
   *
   * @return Whether the maxAge field is set.
   */
  boolean hasMaxAge();
  /**
   *
   *
   * <pre>
   * Specifies how long results of a preflight request can be cached in seconds. This field translates to the Access-Control-Max-Age header.
   * </pre>
   *
   * <code>optional int32 max_age = 307559332;</code>
   *
   * @return The maxAge.
   */
  int getMaxAge();
}
