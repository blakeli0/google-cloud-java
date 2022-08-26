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
// source: google/monitoring/dashboard/v1/common.proto

package com.google.monitoring.dashboard.v1;

public interface StatisticalTimeSeriesFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * `rankingMethod` is applied to a set of time series, and then the produced
   * value for each individual time series is used to compare a given time
   * series to others.
   * These are methods that cannot be applied stream-by-stream, but rather
   * require the full context of a request to evaluate time series.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method ranking_method = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for rankingMethod.
   */
  int getRankingMethodValue();
  /**
   *
   *
   * <pre>
   * `rankingMethod` is applied to a set of time series, and then the produced
   * value for each individual time series is used to compare a given time
   * series to others.
   * These are methods that cannot be applied stream-by-stream, but rather
   * require the full context of a request to evaluate time series.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method ranking_method = 1;
   * </code>
   *
   * @return The rankingMethod.
   */
  com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method getRankingMethod();

  /**
   *
   *
   * <pre>
   * How many time series to output.
   * </pre>
   *
   * <code>int32 num_time_series = 2;</code>
   *
   * @return The numTimeSeries.
   */
  int getNumTimeSeries();
}