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
// source: google/cloud/bigquery/migration/v2alpha/translation_task.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.bigquery.migration.v2alpha;

public final class TranslationTaskProto {
  private TranslationTaskProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_TranslationFileMapping_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_TranslationFileMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_TranslationTaskDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_TranslationTaskDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_TranslationTaskDetails_SpecialTokenMapEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_TranslationTaskDetails_SpecialTokenMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_Filter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_Filter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_IdentifierSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_IdentifierSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_TeradataOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_TeradataOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_BteqOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_BteqOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_BteqOptions_FileReplacementMapEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_BteqOptions_FileReplacementMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_DatasetReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_DatasetReference_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n>google/cloud/bigquery/migration/v2alph"
          + "a/translation_task.proto\022\'google.cloud.b"
          + "igquery.migration.v2alpha\"A\n\026Translation"
          + "FileMapping\022\022\n\ninput_path\030\001 \001(\t\022\023\n\013outpu"
          + "t_path\030\002 \001(\t\"\372\010\n\026TranslationTaskDetails\022"
          + "T\n\020teradata_options\030\n \001(\01328.google.cloud"
          + ".bigquery.migration.v2alpha.TeradataOpti"
          + "onsH\000\022L\n\014bteq_options\030\013 \001(\01324.google.clo"
          + "ud.bigquery.migration.v2alpha.BteqOption"
          + "sH\000\022\022\n\ninput_path\030\001 \001(\t\022\023\n\013output_path\030\002"
          + " \001(\t\022S\n\nfile_paths\030\014 \003(\0132?.google.cloud."
          + "bigquery.migration.v2alpha.TranslationFi"
          + "leMapping\022\023\n\013schema_path\030\003 \001(\t\022c\n\rfile_e"
          + "ncoding\030\004 \001(\0162L.google.cloud.bigquery.mi"
          + "gration.v2alpha.TranslationTaskDetails.F"
          + "ileEncoding\022X\n\023identifier_settings\030\005 \001(\013"
          + "2;.google.cloud.bigquery.migration.v2alp"
          + "ha.IdentifierSettings\022o\n\021special_token_m"
          + "ap\030\006 \003(\0132T.google.cloud.bigquery.migrati"
          + "on.v2alpha.TranslationTaskDetails.Specia"
          + "lTokenMapEntry\022?\n\006filter\030\007 \001(\0132/.google."
          + "cloud.bigquery.migration.v2alpha.Filter\022"
          + "#\n\033translation_exception_table\030\r \001(\t\032\201\001\n"
          + "\024SpecialTokenMapEntry\022\013\n\003key\030\001 \001(\t\022X\n\005va"
          + "lue\030\002 \001(\0162I.google.cloud.bigquery.migrat"
          + "ion.v2alpha.TranslationTaskDetails.Token"
          + "Type:\0028\001\"~\n\014FileEncoding\022\035\n\031FILE_ENCODIN"
          + "G_UNSPECIFIED\020\000\022\t\n\005UTF_8\020\001\022\016\n\nISO_8859_1"
          + "\020\002\022\014\n\010US_ASCII\020\003\022\n\n\006UTF_16\020\004\022\014\n\010UTF_16LE"
          + "\020\005\022\014\n\010UTF_16BE\020\006\"{\n\tTokenType\022\032\n\026TOKEN_T"
          + "YPE_UNSPECIFIED\020\000\022\n\n\006STRING\020\001\022\t\n\005INT64\020\002"
          + "\022\013\n\007NUMERIC\020\003\022\010\n\004BOOL\020\004\022\013\n\007FLOAT64\020\005\022\010\n\004"
          + "DATE\020\006\022\r\n\tTIMESTAMP\020\007B\022\n\020language_option"
          + "s\"/\n\006Filter\022%\n\035input_file_exclusion_pref"
          + "ixes\030\001 \003(\t\"\250\003\n\022IdentifierSettings\022j\n\026out"
          + "put_identifier_case\030\001 \001(\0162J.google.cloud"
          + ".bigquery.migration.v2alpha.IdentifierSe"
          + "ttings.IdentifierCase\022r\n\027identifier_rewr"
          + "ite_mode\030\002 \001(\0162Q.google.cloud.bigquery.m"
          + "igration.v2alpha.IdentifierSettings.Iden"
          + "tifierRewriteMode\"U\n\016IdentifierCase\022\037\n\033I"
          + "DENTIFIER_CASE_UNSPECIFIED\020\000\022\014\n\010ORIGINAL"
          + "\020\001\022\t\n\005UPPER\020\002\022\t\n\005LOWER\020\003\"[\n\025IdentifierRe"
          + "writeMode\022\'\n#IDENTIFIER_REWRITE_MODE_UNS"
          + "PECIFIED\020\000\022\010\n\004NONE\020\001\022\017\n\013REWRITE_ALL\020\002\"\021\n"
          + "\017TeradataOptions\"\242\002\n\013BteqOptions\022R\n\017proj"
          + "ect_dataset\030\001 \001(\01329.google.cloud.bigquer"
          + "y.migration.v2alpha.DatasetReference\022\030\n\020"
          + "default_path_uri\030\002 \001(\t\022j\n\024file_replaceme"
          + "nt_map\030\003 \003(\0132L.google.cloud.bigquery.mig"
          + "ration.v2alpha.BteqOptions.FileReplaceme"
          + "ntMapEntry\0329\n\027FileReplacementMapEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\":\n\020Dataset"
          + "Reference\022\022\n\ndataset_id\030\001 \001(\t\022\022\n\nproject"
          + "_id\030\002 \001(\tB\344\001\n+com.google.cloud.bigquery."
          + "migration.v2alphaB\024TranslationTaskProtoP"
          + "\001ZIcloud.google.com/go/bigquery/migratio"
          + "n/apiv2alpha/migrationpb;migrationpb\252\002\'G"
          + "oogle.Cloud.BigQuery.Migration.V2Alpha\312\002"
          + "\'Google\\Cloud\\BigQuery\\Migration\\V2alpha"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_bigquery_migration_v2alpha_TranslationFileMapping_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_migration_v2alpha_TranslationFileMapping_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_TranslationFileMapping_descriptor,
            new java.lang.String[] {
              "InputPath", "OutputPath",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_TranslationTaskDetails_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_migration_v2alpha_TranslationTaskDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_TranslationTaskDetails_descriptor,
            new java.lang.String[] {
              "TeradataOptions",
              "BteqOptions",
              "InputPath",
              "OutputPath",
              "FilePaths",
              "SchemaPath",
              "FileEncoding",
              "IdentifierSettings",
              "SpecialTokenMap",
              "Filter",
              "TranslationExceptionTable",
              "LanguageOptions",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_TranslationTaskDetails_SpecialTokenMapEntry_descriptor =
        internal_static_google_cloud_bigquery_migration_v2alpha_TranslationTaskDetails_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_bigquery_migration_v2alpha_TranslationTaskDetails_SpecialTokenMapEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_TranslationTaskDetails_SpecialTokenMapEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_Filter_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_migration_v2alpha_Filter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_Filter_descriptor,
            new java.lang.String[] {
              "InputFileExclusionPrefixes",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_IdentifierSettings_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_bigquery_migration_v2alpha_IdentifierSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_IdentifierSettings_descriptor,
            new java.lang.String[] {
              "OutputIdentifierCase", "IdentifierRewriteMode",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_TeradataOptions_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_bigquery_migration_v2alpha_TeradataOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_TeradataOptions_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_bigquery_migration_v2alpha_BteqOptions_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_bigquery_migration_v2alpha_BteqOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_BteqOptions_descriptor,
            new java.lang.String[] {
              "ProjectDataset", "DefaultPathUri", "FileReplacementMap",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_BteqOptions_FileReplacementMapEntry_descriptor =
        internal_static_google_cloud_bigquery_migration_v2alpha_BteqOptions_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_bigquery_migration_v2alpha_BteqOptions_FileReplacementMapEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_BteqOptions_FileReplacementMapEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_DatasetReference_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_bigquery_migration_v2alpha_DatasetReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_DatasetReference_descriptor,
            new java.lang.String[] {
              "DatasetId", "ProjectId",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
