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

public interface AutoscalingPolicyCustomMetricUtilizationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A filter string, compatible with a Stackdriver Monitoring filter string for TimeSeries.list API call. This filter is used to select a specific TimeSeries for the purpose of autoscaling and to determine whether the metric is exporting per-instance or per-group data. For the filter to be valid for autoscaling purposes, the following rules apply: - You can only use the AND operator for joining selectors. - You can only use direct equality comparison operator (=) without any functions for each selector. - You can specify the metric in both the filter string and in the metric field. However, if specified in both places, the metric must be identical. - The monitored resource type determines what kind of values are expected for the metric. If it is a gce_instance, the autoscaler expects the metric to include a separate TimeSeries for each instance in a group. In such a case, you cannot filter on resource labels. If the resource type is any other value, the autoscaler expects this metric to contain values that apply to the entire autoscaled instance group and resource label filtering can be performed to point autoscaler at the correct TimeSeries to scale upon. This is called a *per-group metric* for the purpose of autoscaling. If not specified, the type defaults to gce_instance. Try to provide a filter that is selective enough to pick just one TimeSeries for the autoscaled group or for each of the instances (if you are using gce_instance resource type). If multiple TimeSeries are returned upon the query execution, the autoscaler will sum their respective values to obtain its scaling value.
   * </pre>
   *
   * <code>optional string filter = 336120696;</code>
   *
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   *
   *
   * <pre>
   * A filter string, compatible with a Stackdriver Monitoring filter string for TimeSeries.list API call. This filter is used to select a specific TimeSeries for the purpose of autoscaling and to determine whether the metric is exporting per-instance or per-group data. For the filter to be valid for autoscaling purposes, the following rules apply: - You can only use the AND operator for joining selectors. - You can only use direct equality comparison operator (=) without any functions for each selector. - You can specify the metric in both the filter string and in the metric field. However, if specified in both places, the metric must be identical. - The monitored resource type determines what kind of values are expected for the metric. If it is a gce_instance, the autoscaler expects the metric to include a separate TimeSeries for each instance in a group. In such a case, you cannot filter on resource labels. If the resource type is any other value, the autoscaler expects this metric to contain values that apply to the entire autoscaled instance group and resource label filtering can be performed to point autoscaler at the correct TimeSeries to scale upon. This is called a *per-group metric* for the purpose of autoscaling. If not specified, the type defaults to gce_instance. Try to provide a filter that is selective enough to pick just one TimeSeries for the autoscaled group or for each of the instances (if you are using gce_instance resource type). If multiple TimeSeries are returned upon the query execution, the autoscaler will sum their respective values to obtain its scaling value.
   * </pre>
   *
   * <code>optional string filter = 336120696;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * A filter string, compatible with a Stackdriver Monitoring filter string for TimeSeries.list API call. This filter is used to select a specific TimeSeries for the purpose of autoscaling and to determine whether the metric is exporting per-instance or per-group data. For the filter to be valid for autoscaling purposes, the following rules apply: - You can only use the AND operator for joining selectors. - You can only use direct equality comparison operator (=) without any functions for each selector. - You can specify the metric in both the filter string and in the metric field. However, if specified in both places, the metric must be identical. - The monitored resource type determines what kind of values are expected for the metric. If it is a gce_instance, the autoscaler expects the metric to include a separate TimeSeries for each instance in a group. In such a case, you cannot filter on resource labels. If the resource type is any other value, the autoscaler expects this metric to contain values that apply to the entire autoscaled instance group and resource label filtering can be performed to point autoscaler at the correct TimeSeries to scale upon. This is called a *per-group metric* for the purpose of autoscaling. If not specified, the type defaults to gce_instance. Try to provide a filter that is selective enough to pick just one TimeSeries for the autoscaled group or for each of the instances (if you are using gce_instance resource type). If multiple TimeSeries are returned upon the query execution, the autoscaler will sum their respective values to obtain its scaling value.
   * </pre>
   *
   * <code>optional string filter = 336120696;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The identifier (type) of the Stackdriver Monitoring metric. The metric cannot have negative values. The metric must have a value type of INT64 or DOUBLE.
   * </pre>
   *
   * <code>optional string metric = 533067184;</code>
   *
   * @return Whether the metric field is set.
   */
  boolean hasMetric();
  /**
   *
   *
   * <pre>
   * The identifier (type) of the Stackdriver Monitoring metric. The metric cannot have negative values. The metric must have a value type of INT64 or DOUBLE.
   * </pre>
   *
   * <code>optional string metric = 533067184;</code>
   *
   * @return The metric.
   */
  java.lang.String getMetric();
  /**
   *
   *
   * <pre>
   * The identifier (type) of the Stackdriver Monitoring metric. The metric cannot have negative values. The metric must have a value type of INT64 or DOUBLE.
   * </pre>
   *
   * <code>optional string metric = 533067184;</code>
   *
   * @return The bytes for metric.
   */
  com.google.protobuf.ByteString getMetricBytes();

  /**
   *
   *
   * <pre>
   * If scaling is based on a per-group metric value that represents the total amount of work to be done or resource usage, set this value to an amount assigned for a single instance of the scaled group. Autoscaler keeps the number of instances proportional to the value of this metric. The metric itself does not change value due to group resizing. A good metric to use with the target is for example pubsub.googleapis.com/subscription/num_undelivered_messages or a custom metric exporting the total number of requests coming to your instances. A bad example would be a metric exporting an average or median latency, since this value can't include a chunk assignable to a single instance, it could be better used with utilization_target instead.
   * </pre>
   *
   * <code>optional double single_instance_assignment = 504768064;</code>
   *
   * @return Whether the singleInstanceAssignment field is set.
   */
  boolean hasSingleInstanceAssignment();
  /**
   *
   *
   * <pre>
   * If scaling is based on a per-group metric value that represents the total amount of work to be done or resource usage, set this value to an amount assigned for a single instance of the scaled group. Autoscaler keeps the number of instances proportional to the value of this metric. The metric itself does not change value due to group resizing. A good metric to use with the target is for example pubsub.googleapis.com/subscription/num_undelivered_messages or a custom metric exporting the total number of requests coming to your instances. A bad example would be a metric exporting an average or median latency, since this value can't include a chunk assignable to a single instance, it could be better used with utilization_target instead.
   * </pre>
   *
   * <code>optional double single_instance_assignment = 504768064;</code>
   *
   * @return The singleInstanceAssignment.
   */
  double getSingleInstanceAssignment();

  /**
   *
   *
   * <pre>
   * The target value of the metric that autoscaler maintains. This must be a positive value. A utilization metric scales number of virtual machines handling requests to increase or decrease proportionally to the metric. For example, a good metric to use as a utilization_target is https://www.googleapis.com/compute/v1/instance/network/received_bytes_count. The autoscaler works to keep this value constant for each of the instances.
   * </pre>
   *
   * <code>optional double utilization_target = 215905870;</code>
   *
   * @return Whether the utilizationTarget field is set.
   */
  boolean hasUtilizationTarget();
  /**
   *
   *
   * <pre>
   * The target value of the metric that autoscaler maintains. This must be a positive value. A utilization metric scales number of virtual machines handling requests to increase or decrease proportionally to the metric. For example, a good metric to use as a utilization_target is https://www.googleapis.com/compute/v1/instance/network/received_bytes_count. The autoscaler works to keep this value constant for each of the instances.
   * </pre>
   *
   * <code>optional double utilization_target = 215905870;</code>
   *
   * @return The utilizationTarget.
   */
  double getUtilizationTarget();

  /**
   *
   *
   * <pre>
   * Defines how target utilization value is expressed for a Stackdriver Monitoring metric. Either GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE.
   * Check the UtilizationTargetType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string utilization_target_type = 340169355;</code>
   *
   * @return Whether the utilizationTargetType field is set.
   */
  boolean hasUtilizationTargetType();
  /**
   *
   *
   * <pre>
   * Defines how target utilization value is expressed for a Stackdriver Monitoring metric. Either GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE.
   * Check the UtilizationTargetType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string utilization_target_type = 340169355;</code>
   *
   * @return The utilizationTargetType.
   */
  java.lang.String getUtilizationTargetType();
  /**
   *
   *
   * <pre>
   * Defines how target utilization value is expressed for a Stackdriver Monitoring metric. Either GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE.
   * Check the UtilizationTargetType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string utilization_target_type = 340169355;</code>
   *
   * @return The bytes for utilizationTargetType.
   */
  com.google.protobuf.ByteString getUtilizationTargetTypeBytes();
}
