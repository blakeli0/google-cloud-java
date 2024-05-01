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
// source: google/cloud/dialogflow/cx/v3beta1/webhook.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3beta1;

public interface LanguageInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.LanguageInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The language code specified in the original
   * [request][google.cloud.dialogflow.cx.v3beta1.QueryInput.language_code].
   * </pre>
   *
   * <code>string input_language_code = 1;</code>
   *
   * @return The inputLanguageCode.
   */
  java.lang.String getInputLanguageCode();
  /**
   *
   *
   * <pre>
   * The language code specified in the original
   * [request][google.cloud.dialogflow.cx.v3beta1.QueryInput.language_code].
   * </pre>
   *
   * <code>string input_language_code = 1;</code>
   *
   * @return The bytes for inputLanguageCode.
   */
  com.google.protobuf.ByteString getInputLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * The language code detected for this request based on the user
   * conversation.
   * </pre>
   *
   * <code>string resolved_language_code = 2;</code>
   *
   * @return The resolvedLanguageCode.
   */
  java.lang.String getResolvedLanguageCode();
  /**
   *
   *
   * <pre>
   * The language code detected for this request based on the user
   * conversation.
   * </pre>
   *
   * <code>string resolved_language_code = 2;</code>
   *
   * @return The bytes for resolvedLanguageCode.
   */
  com.google.protobuf.ByteString getResolvedLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * The confidence score of the detected language between 0 and 1.
   * </pre>
   *
   * <code>float confidence_score = 3;</code>
   *
   * @return The confidenceScore.
   */
  float getConfidenceScore();
}
