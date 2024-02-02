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

public interface BfdStatusPacketCountsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.BfdStatusPacketCounts)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Number of packets received since the beginning of the current BFD session.
   * </pre>
   *
   * <code>optional uint32 num_rx = 39375263;</code>
   *
   * @return Whether the numRx field is set.
   */
  boolean hasNumRx();
  /**
   *
   *
   * <pre>
   * Number of packets received since the beginning of the current BFD session.
   * </pre>
   *
   * <code>optional uint32 num_rx = 39375263;</code>
   *
   * @return The numRx.
   */
  int getNumRx();

  /**
   *
   *
   * <pre>
   * Number of packets received that were rejected because of errors since the beginning of the current BFD session.
   * </pre>
   *
   * <code>optional uint32 num_rx_rejected = 281007902;</code>
   *
   * @return Whether the numRxRejected field is set.
   */
  boolean hasNumRxRejected();
  /**
   *
   *
   * <pre>
   * Number of packets received that were rejected because of errors since the beginning of the current BFD session.
   * </pre>
   *
   * <code>optional uint32 num_rx_rejected = 281007902;</code>
   *
   * @return The numRxRejected.
   */
  int getNumRxRejected();

  /**
   *
   *
   * <pre>
   * Number of packets received that were successfully processed since the beginning of the current BFD session.
   * </pre>
   *
   * <code>optional uint32 num_rx_successful = 455361850;</code>
   *
   * @return Whether the numRxSuccessful field is set.
   */
  boolean hasNumRxSuccessful();
  /**
   *
   *
   * <pre>
   * Number of packets received that were successfully processed since the beginning of the current BFD session.
   * </pre>
   *
   * <code>optional uint32 num_rx_successful = 455361850;</code>
   *
   * @return The numRxSuccessful.
   */
  int getNumRxSuccessful();

  /**
   *
   *
   * <pre>
   * Number of packets transmitted since the beginning of the current BFD session.
   * </pre>
   *
   * <code>optional uint32 num_tx = 39375325;</code>
   *
   * @return Whether the numTx field is set.
   */
  boolean hasNumTx();
  /**
   *
   *
   * <pre>
   * Number of packets transmitted since the beginning of the current BFD session.
   * </pre>
   *
   * <code>optional uint32 num_tx = 39375325;</code>
   *
   * @return The numTx.
   */
  int getNumTx();
}
