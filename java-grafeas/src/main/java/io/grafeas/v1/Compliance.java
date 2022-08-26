/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/compliance.proto

package io.grafeas.v1;

public final class Compliance {
  private Compliance() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_ComplianceNote_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_ComplianceNote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_ComplianceNote_CisBenchmark_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_ComplianceNote_CisBenchmark_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_ComplianceVersion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_ComplianceVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_ComplianceOccurrence_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_ComplianceOccurrence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_NonCompliantFile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_NonCompliantFile_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\033grafeas/v1/compliance.proto\022\ngrafeas.v"
          + "1\032\031grafeas/v1/severity.proto\"\313\002\n\016Complia"
          + "nceNote\022\r\n\005title\030\001 \001(\t\022\023\n\013description\030\002 "
          + "\001(\t\022.\n\007version\030\003 \003(\0132\035.grafeas.v1.Compli"
          + "anceVersion\022\021\n\trationale\030\004 \001(\t\022\023\n\013remedi"
          + "ation\030\005 \001(\t\022@\n\rcis_benchmark\030\006 \001(\0132\'.gra"
          + "feas.v1.ComplianceNote.CisBenchmarkH\000\022\031\n"
          + "\021scan_instructions\030\007 \001(\014\032M\n\014CisBenchmark"
          + "\022\025\n\rprofile_level\030\001 \001(\005\022&\n\010severity\030\002 \001("
          + "\0162\024.grafeas.v1.SeverityB\021\n\017compliance_ty"
          + "pe\"Q\n\021ComplianceVersion\022\017\n\007cpe_uri\030\001 \001(\t"
          + "\022\032\n\022benchmark_document\030\003 \001(\t\022\017\n\007version\030"
          + "\002 \001(\t\"p\n\024ComplianceOccurrence\0229\n\023non_com"
          + "pliant_files\030\002 \003(\0132\034.grafeas.v1.NonCompl"
          + "iantFile\022\035\n\025non_compliance_reason\030\003 \001(\t\""
          + "I\n\020NonCompliantFile\022\014\n\004path\030\001 \001(\t\022\027\n\017dis"
          + "play_command\030\002 \001(\t\022\016\n\006reason\030\003 \001(\tBQ\n\rio"
          + ".grafeas.v1P\001Z8google.golang.org/genprot"
          + "o/googleapis/grafeas/v1;grafeas\242\002\003GRAb\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              io.grafeas.v1.SeverityOuterClass.getDescriptor(),
            });
    internal_static_grafeas_v1_ComplianceNote_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_grafeas_v1_ComplianceNote_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_ComplianceNote_descriptor,
            new java.lang.String[] {
              "Title",
              "Description",
              "Version",
              "Rationale",
              "Remediation",
              "CisBenchmark",
              "ScanInstructions",
              "ComplianceType",
            });
    internal_static_grafeas_v1_ComplianceNote_CisBenchmark_descriptor =
        internal_static_grafeas_v1_ComplianceNote_descriptor.getNestedTypes().get(0);
    internal_static_grafeas_v1_ComplianceNote_CisBenchmark_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_ComplianceNote_CisBenchmark_descriptor,
            new java.lang.String[] {
              "ProfileLevel", "Severity",
            });
    internal_static_grafeas_v1_ComplianceVersion_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_grafeas_v1_ComplianceVersion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_ComplianceVersion_descriptor,
            new java.lang.String[] {
              "CpeUri", "BenchmarkDocument", "Version",
            });
    internal_static_grafeas_v1_ComplianceOccurrence_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_grafeas_v1_ComplianceOccurrence_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_ComplianceOccurrence_descriptor,
            new java.lang.String[] {
              "NonCompliantFiles", "NonComplianceReason",
            });
    internal_static_grafeas_v1_NonCompliantFile_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_grafeas_v1_NonCompliantFile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_NonCompliantFile_descriptor,
            new java.lang.String[] {
              "Path", "DisplayCommand", "Reason",
            });
    io.grafeas.v1.SeverityOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
