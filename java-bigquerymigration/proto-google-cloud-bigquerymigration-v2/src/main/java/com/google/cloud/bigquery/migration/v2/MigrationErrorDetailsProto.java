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
// source: google/cloud/bigquery/migration/v2/migration_error_details.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.bigquery.migration.v2;

public final class MigrationErrorDetailsProto {
  private MigrationErrorDetailsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2_ResourceErrorDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2_ResourceErrorDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2_ErrorDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2_ErrorDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2_ErrorLocation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2_ErrorLocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n@google/cloud/bigquery/migration/v2/mig"
          + "ration_error_details.proto\022\"google.cloud"
          + ".bigquery.migration.v2\032\037google/api/field"
          + "_behavior.proto\032\036google/rpc/error_detail"
          + "s.proto\"\265\001\n\023ResourceErrorDetail\0225\n\rresou"
          + "rce_info\030\001 \001(\0132\030.google.rpc.ResourceInfo"
          + "B\004\342A\001\002\022L\n\rerror_details\030\002 \003(\0132/.google.c"
          + "loud.bigquery.migration.v2.ErrorDetailB\004"
          + "\342A\001\002\022\031\n\013error_count\030\003 \001(\005B\004\342A\001\002\"\211\001\n\013Erro"
          + "rDetail\022I\n\010location\030\001 \001(\01321.google.cloud"
          + ".bigquery.migration.v2.ErrorLocationB\004\342A"
          + "\001\001\022/\n\nerror_info\030\002 \001(\0132\025.google.rpc.Erro"
          + "rInfoB\004\342A\001\002\"9\n\rErrorLocation\022\022\n\004line\030\001 \001"
          + "(\005B\004\342A\001\001\022\024\n\006column\030\002 \001(\005B\004\342A\001\001B\326\001\n&com.g"
          + "oogle.cloud.bigquery.migration.v2B\032Migra"
          + "tionErrorDetailsProtoP\001ZDcloud.google.co"
          + "m/go/bigquery/migration/apiv2/migrationp"
          + "b;migrationpb\252\002\"Google.Cloud.BigQuery.Mi"
          + "gration.V2\312\002\"Google\\Cloud\\BigQuery\\Migra"
          + "tion\\V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.rpc.ErrorDetailsProto.getDescriptor(),
            });
    internal_static_google_cloud_bigquery_migration_v2_ResourceErrorDetail_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_migration_v2_ResourceErrorDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2_ResourceErrorDetail_descriptor,
            new java.lang.String[] {
              "ResourceInfo", "ErrorDetails", "ErrorCount",
            });
    internal_static_google_cloud_bigquery_migration_v2_ErrorDetail_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_migration_v2_ErrorDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2_ErrorDetail_descriptor,
            new java.lang.String[] {
              "Location", "ErrorInfo",
            });
    internal_static_google_cloud_bigquery_migration_v2_ErrorLocation_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_migration_v2_ErrorLocation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2_ErrorLocation_descriptor,
            new java.lang.String[] {
              "Line", "Column",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.rpc.ErrorDetailsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
