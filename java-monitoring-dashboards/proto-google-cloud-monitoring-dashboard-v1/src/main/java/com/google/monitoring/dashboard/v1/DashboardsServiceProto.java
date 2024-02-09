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
// source: google/monitoring/dashboard/v1/dashboards_service.proto

// Protobuf Java Version: 3.25.2
package com.google.monitoring.dashboard.v1;

public final class DashboardsServiceProto {
  private DashboardsServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_ListDashboardsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_ListDashboardsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_ListDashboardsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_ListDashboardsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_GetDashboardRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_GetDashboardRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_DeleteDashboardRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_DeleteDashboardRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/monitoring/dashboard/v1/dashboa"
          + "rds_service.proto\022\036google.monitoring.das"
          + "hboard.v1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032.google/monitoring/dashboard/v1/das"
          + "hboard.proto\032\033google/protobuf/empty.prot"
          + "o\"\267\001\n\026CreateDashboardRequest\022C\n\006parent\030\001"
          + " \001(\tB3\340A\002\372A-\n+cloudresourcemanager.googl"
          + "eapis.com/Project\022A\n\tdashboard\030\002 \001(\0132).g"
          + "oogle.monitoring.dashboard.v1.DashboardB"
          + "\003\340A\002\022\025\n\rvalidate_only\030\003 \001(\010\"\210\001\n\025ListDash"
          + "boardsRequest\022C\n\006parent\030\001 \001(\tB3\340A\002\372A-\n+c"
          + "loudresourcemanager.googleapis.com/Proje"
          + "ct\022\021\n\tpage_size\030\002 \001(\005\022\027\n\npage_token\030\003 \001("
          + "\tB\003\340A\001\"p\n\026ListDashboardsResponse\022=\n\ndash"
          + "boards\030\001 \003(\0132).google.monitoring.dashboa"
          + "rd.v1.Dashboard\022\027\n\017next_page_token\030\002 \001(\t"
          + "\"P\n\023GetDashboardRequest\0229\n\004name\030\001 \001(\tB+\340"
          + "A\002\372A%\n#monitoring.googleapis.com/Dashboa"
          + "rd\"S\n\026DeleteDashboardRequest\0229\n\004name\030\001 \001"
          + "(\tB+\340A\002\372A%\n#monitoring.googleapis.com/Da"
          + "shboard\"r\n\026UpdateDashboardRequest\022A\n\tdas"
          + "hboard\030\001 \001(\0132).google.monitoring.dashboa"
          + "rd.v1.DashboardB\003\340A\002\022\025\n\rvalidate_only\030\003 "
          + "\001(\0102\333\010\n\021DashboardsService\022\276\001\n\017CreateDash"
          + "board\0226.google.monitoring.dashboard.v1.C"
          + "reateDashboardRequest\032).google.monitorin"
          + "g.dashboard.v1.Dashboard\"H\332A\020parent,dash"
          + "board\202\323\344\223\002/\"\"/v1/{parent=projects/*}/das"
          + "hboards:\tdashboard\022\264\001\n\016ListDashboards\0225."
          + "google.monitoring.dashboard.v1.ListDashb"
          + "oardsRequest\0326.google.monitoring.dashboa"
          + "rd.v1.ListDashboardsResponse\"3\332A\006parent\202"
          + "\323\344\223\002$\022\"/v1/{parent=projects/*}/dashboard"
          + "s\022\241\001\n\014GetDashboard\0223.google.monitoring.d"
          + "ashboard.v1.GetDashboardRequest\032).google"
          + ".monitoring.dashboard.v1.Dashboard\"1\332A\004n"
          + "ame\202\323\344\223\002$\022\"/v1/{name=projects/*/dashboar"
          + "ds/*}\022\224\001\n\017DeleteDashboard\0226.google.monit"
          + "oring.dashboard.v1.DeleteDashboardReques"
          + "t\032\026.google.protobuf.Empty\"1\332A\004name\202\323\344\223\002$"
          + "*\"/v1/{name=projects/*/dashboards/*}\022\265\001\n"
          + "\017UpdateDashboard\0226.google.monitoring.das"
          + "hboard.v1.UpdateDashboardRequest\032).googl"
          + "e.monitoring.dashboard.v1.Dashboard\"?\202\323\344"
          + "\223\00292,/v1/{dashboard.name=projects/*/dash"
          + "boards/*}:\tdashboard\032\332\001\312A\031monitoring.goo"
          + "gleapis.com\322A\272\001https://www.googleapis.co"
          + "m/auth/cloud-platform,https://www.google"
          + "apis.com/auth/monitoring,https://www.goo"
          + "gleapis.com/auth/monitoring.read,https:/"
          + "/www.googleapis.com/auth/monitoring.writ"
          + "eB\377\001\n\"com.google.monitoring.dashboard.v1"
          + "B\026DashboardsServiceProtoP\001ZFcloud.google"
          + ".com/go/monitoring/dashboard/apiv1/dashb"
          + "oardpb;dashboardpb\252\002$Google.Cloud.Monito"
          + "ring.Dashboard.V1\312\002$Google\\Cloud\\Monitor"
          + "ing\\Dashboard\\V1\352\002(Google::Cloud::Monito"
          + "ring::Dashboard::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.DashboardsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Dashboard", "ValidateOnly",
            });
    internal_static_google_monitoring_dashboard_v1_ListDashboardsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_dashboard_v1_ListDashboardsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_ListDashboardsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_dashboard_v1_ListDashboardsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_dashboard_v1_ListDashboardsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_ListDashboardsResponse_descriptor,
            new java.lang.String[] {
              "Dashboards", "NextPageToken",
            });
    internal_static_google_monitoring_dashboard_v1_GetDashboardRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_dashboard_v1_GetDashboardRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_GetDashboardRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_dashboard_v1_DeleteDashboardRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_dashboard_v1_DeleteDashboardRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_DeleteDashboardRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_descriptor,
            new java.lang.String[] {
              "Dashboard", "ValidateOnly",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.monitoring.dashboard.v1.DashboardsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
