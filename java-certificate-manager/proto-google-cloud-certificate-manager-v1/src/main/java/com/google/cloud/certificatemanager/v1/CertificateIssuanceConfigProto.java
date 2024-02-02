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
// source: google/cloud/certificatemanager/v1/certificate_issuance_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.certificatemanager.v1;

public final class CertificateIssuanceConfigProto {
  private CertificateIssuanceConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_certificatemanager_v1_GetCertificateIssuanceConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_GetCertificateIssuanceConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_certificatemanager_v1_CreateCertificateIssuanceConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_CreateCertificateIssuanceConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_certificatemanager_v1_DeleteCertificateIssuanceConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_DeleteCertificateIssuanceConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_CertificateAuthorityServiceConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_CertificateAuthorityServiceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/cloud/certificatemanager/v1/cer"
          + "tificate_issuance_config.proto\022\"google.c"
          + "loud.certificatemanager.v1\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/resource"
          + ".proto\032\036google/protobuf/duration.proto\032\037"
          + "google/protobuf/timestamp.proto\"\254\001\n%List"
          + "CertificateIssuanceConfigsRequest\022:\n\006par"
          + "ent\030\001 \001(\tB*\342A\001\002\372A#\n!locations.googleapis"
          + ".com/Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage"
          + "_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020\n\010order_by"
          + "\030\005 \001(\t\"\273\001\n&ListCertificateIssuanceConfig"
          + "sResponse\022c\n\034certificate_issuance_config"
          + "s\030\001 \003(\0132=.google.cloud.certificatemanage"
          + "r.v1.CertificateIssuanceConfig\022\027\n\017next_p"
          + "age_token\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"y\n#"
          + "GetCertificateIssuanceConfigRequest\022R\n\004n"
          + "ame\030\001 \001(\tBD\342A\001\002\372A=\n;certificatemanager.g"
          + "oogleapis.com/CertificateIssuanceConfig\""
          + "\374\001\n&CreateCertificateIssuanceConfigReque"
          + "st\022:\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\n!locations.g"
          + "oogleapis.com/Location\022,\n\036certificate_is"
          + "suance_config_id\030\002 \001(\tB\004\342A\001\002\022h\n\033certific"
          + "ate_issuance_config\030\003 \001(\0132=.google.cloud"
          + ".certificatemanager.v1.CertificateIssuan"
          + "ceConfigB\004\342A\001\002\"|\n&DeleteCertificateIssua"
          + "nceConfigRequest\022R\n\004name\030\001 \001(\tBD\342A\001\002\372A=\n"
          + ";certificatemanager.googleapis.com/Certi"
          + "ficateIssuanceConfig\"\252\t\n\031CertificateIssu"
          + "anceConfig\022\014\n\004name\030\001 \001(\t\0225\n\013create_time\030"
          + "\002 \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\022"
          + "5\n\013update_time\030\003 \001(\0132\032.google.protobuf.T"
          + "imestampB\004\342A\001\003\022Y\n\006labels\030\004 \003(\0132I.google."
          + "cloud.certificatemanager.v1.CertificateI"
          + "ssuanceConfig.LabelsEntry\022\023\n\013description"
          + "\030\005 \001(\t\022\204\001\n\034certificate_authority_config\030"
          + "\006 \001(\0132X.google.cloud.certificatemanager."
          + "v1.CertificateIssuanceConfig.Certificate"
          + "AuthorityConfigB\004\342A\001\002\0221\n\010lifetime\030\007 \001(\0132"
          + "\031.google.protobuf.DurationB\004\342A\001\002\022(\n\032rota"
          + "tion_window_percentage\030\010 \001(\005B\004\342A\001\002\022g\n\rke"
          + "y_algorithm\030\t \001(\0162J.google.cloud.certifi"
          + "catemanager.v1.CertificateIssuanceConfig"
          + ".KeyAlgorithmB\004\342A\001\002\032\261\002\n\032CertificateAutho"
          + "rityConfig\022\252\001\n$certificate_authority_ser"
          + "vice_config\030\001 \001(\0132z.google.cloud.certifi"
          + "catemanager.v1.CertificateIssuanceConfig"
          + ".CertificateAuthorityConfig.CertificateA"
          + "uthorityServiceConfigH\000\032^\n!CertificateAu"
          + "thorityServiceConfig\0229\n\007ca_pool\030\001 \001(\tB(\342"
          + "A\001\002\372A!\n\037privateca.googleapis.com/CaPoolB"
          + "\006\n\004kind\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v"
          + "alue\030\002 \001(\t:\0028\001\"K\n\014KeyAlgorithm\022\035\n\031KEY_AL"
          + "GORITHM_UNSPECIFIED\020\000\022\014\n\010RSA_2048\020\001\022\016\n\nE"
          + "CDSA_P256\020\004:\243\001\352A\237\001\n;certificatemanager.g"
          + "oogleapis.com/CertificateIssuanceConfig\022"
          + "`projects/{project}/locations/{location}"
          + "/certificateIssuanceConfigs/{certificate"
          + "_issuance_config}B\363\002\n&com.google.cloud.c"
          + "ertificatemanager.v1B\036CertificateIssuanc"
          + "eConfigProtoP\001ZVcloud.google.com/go/cert"
          + "ificatemanager/apiv1/certificatemanagerp"
          + "b;certificatemanagerpb\252\002\"Google.Cloud.Ce"
          + "rtificateManager.V1\312\002\"Google\\Cloud\\Certi"
          + "ficateManager\\V1\352\002%Google::Cloud::Certif"
          + "icateManager::V1\352A\\\n\037privateca.googleapi"
          + "s.com/CaPool\0229projects/{project}/locatio"
          + "ns/{location}/caPools/{ca_pool}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_certificatemanager_v1_ListCertificateIssuanceConfigsResponse_descriptor,
            new java.lang.String[] {
              "CertificateIssuanceConfigs", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_certificatemanager_v1_GetCertificateIssuanceConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_certificatemanager_v1_GetCertificateIssuanceConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_certificatemanager_v1_GetCertificateIssuanceConfigRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_certificatemanager_v1_CreateCertificateIssuanceConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_certificatemanager_v1_CreateCertificateIssuanceConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_certificatemanager_v1_CreateCertificateIssuanceConfigRequest_descriptor,
            new java.lang.String[] {
              "Parent", "CertificateIssuanceConfigId", "CertificateIssuanceConfig",
            });
    internal_static_google_cloud_certificatemanager_v1_DeleteCertificateIssuanceConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_certificatemanager_v1_DeleteCertificateIssuanceConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_certificatemanager_v1_DeleteCertificateIssuanceConfigRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Description",
              "CertificateAuthorityConfig",
              "Lifetime",
              "RotationWindowPercentage",
              "KeyAlgorithm",
            });
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_descriptor =
        internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_descriptor,
            new java.lang.String[] {
              "CertificateAuthorityServiceConfig", "Kind",
            });
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_CertificateAuthorityServiceConfig_descriptor =
        internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_CertificateAuthorityServiceConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_CertificateAuthorityConfig_CertificateAuthorityServiceConfig_descriptor,
            new java.lang.String[] {
              "CaPool",
            });
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_LabelsEntry_descriptor =
        internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_certificatemanager_v1_CertificateIssuanceConfig_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
