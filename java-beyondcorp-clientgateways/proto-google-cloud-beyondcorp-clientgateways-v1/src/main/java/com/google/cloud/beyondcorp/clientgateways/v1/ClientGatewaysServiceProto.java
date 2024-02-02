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
// source: google/cloud/beyondcorp/clientgateways/v1/client_gateways_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.beyondcorp.clientgateways.v1;

public final class ClientGatewaysServiceProto {
  private ClientGatewaysServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientgateways_v1_ClientGateway_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientgateways_v1_ClientGateway_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientgateways_v1_ListClientGatewaysRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientgateways_v1_ListClientGatewaysRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientgateways_v1_ListClientGatewaysResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientgateways_v1_ListClientGatewaysResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientgateways_v1_GetClientGatewayRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientgateways_v1_GetClientGatewayRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientgateways_v1_CreateClientGatewayRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientgateways_v1_CreateClientGatewayRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientgateways_v1_DeleteClientGatewayRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientgateways_v1_DeleteClientGatewayRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientgateways_v1_ClientGatewayOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientgateways_v1_ClientGatewayOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/cloud/beyondcorp/clientgateways"
          + "/v1/client_gateways_service.proto\022)googl"
          + "e.cloud.beyondcorp.clientgateways.v1\032\034go"
          + "ogle/api/annotations.proto\032\027google/api/c"
          + "lient.proto\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\032#google/"
          + "longrunning/operations.proto\032\037google/pro"
          + "tobuf/timestamp.proto\"\203\004\n\rClientGateway\022"
          + "\022\n\004name\030\001 \001(\tB\004\342A\001\002\0225\n\013create_time\030\002 \001(\013"
          + "2\032.google.protobuf.TimestampB\004\342A\001\003\0225\n\013up"
          + "date_time\030\003 \001(\0132\032.google.protobuf.Timest"
          + "ampB\004\342A\001\003\022S\n\005state\030\004 \001(\0162>.google.cloud."
          + "beyondcorp.clientgateways.v1.ClientGatew"
          + "ay.StateB\004\342A\001\003\022\020\n\002id\030\005 \001(\tB\004\342A\001\003\022&\n\030clie"
          + "nt_connector_service\030\006 \001(\tB\004\342A\001\003\"j\n\005Stat"
          + "e\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CREATING\020\001\022\014"
          + "\n\010UPDATING\020\002\022\014\n\010DELETING\020\003\022\013\n\007RUNNING\020\004\022"
          + "\010\n\004DOWN\020\005\022\t\n\005ERROR\020\006:u\352Ar\n\'beyondcorp.go"
          + "ogleapis.com/ClientGateway\022Gprojects/{pr"
          + "oject}/locations/{location}/clientGatewa"
          + "ys/{client_gateway}\"\276\001\n\031ListClientGatewa"
          + "ysRequest\022@\n\006parent\030\001 \001(\tB0\342A\001\002\372A)\022\'beyo"
          + "ndcorp.googleapis.com/ClientGateway\022\027\n\tp"
          + "age_size\030\002 \001(\005B\004\342A\001\001\022\030\n\npage_token\030\003 \001(\t"
          + "B\004\342A\001\001\022\024\n\006filter\030\004 \001(\tB\004\342A\001\001\022\026\n\010order_by"
          + "\030\005 \001(\tB\004\342A\001\001\"\235\001\n\032ListClientGatewaysRespo"
          + "nse\022Q\n\017client_gateways\030\001 \003(\01328.google.cl"
          + "oud.beyondcorp.clientgateways.v1.ClientG"
          + "ateway\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unrea"
          + "chable\030\003 \003(\t\"Y\n\027GetClientGatewayRequest\022"
          + ">\n\004name\030\001 \001(\tB0\342A\001\002\372A)\n\'beyondcorp.googl"
          + "eapis.com/ClientGateway\"\216\002\n\032CreateClient"
          + "GatewayRequest\022@\n\006parent\030\001 \001(\tB0\342A\001\002\372A)\022"
          + "\'beyondcorp.googleapis.com/ClientGateway"
          + "\022\037\n\021client_gateway_id\030\002 \001(\tB\004\342A\001\001\022V\n\016cli"
          + "ent_gateway\030\003 \001(\01328.google.cloud.beyondc"
          + "orp.clientgateways.v1.ClientGatewayB\004\342A\001"
          + "\002\022\030\n\nrequest_id\030\004 \001(\tB\004\342A\001\001\022\033\n\rvalidate_"
          + "only\030\005 \001(\010B\004\342A\001\001\"\223\001\n\032DeleteClientGateway"
          + "Request\022>\n\004name\030\001 \001(\tB0\342A\001\002\372A)\n\'beyondco"
          + "rp.googleapis.com/ClientGateway\022\030\n\nreque"
          + "st_id\030\002 \001(\tB\004\342A\001\001\022\033\n\rvalidate_only\030\003 \001(\010"
          + "B\004\342A\001\001\"\224\002\n\036ClientGatewayOperationMetadat"
          + "a\0225\n\013create_time\030\001 \001(\0132\032.google.protobuf"
          + ".TimestampB\004\342A\001\003\0222\n\010end_time\030\002 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\004\342A\001\003\022\024\n\006target\030\003"
          + " \001(\tB\004\342A\001\003\022\022\n\004verb\030\004 \001(\tB\004\342A\001\003\022\034\n\016status"
          + "_message\030\005 \001(\tB\004\342A\001\003\022$\n\026requested_cancel"
          + "lation\030\006 \001(\010B\004\342A\001\003\022\031\n\013api_version\030\007 \001(\tB"
          + "\004\342A\001\0032\307\010\n\025ClientGatewaysService\022\346\001\n\022List"
          + "ClientGateways\022D.google.cloud.beyondcorp"
          + ".clientgateways.v1.ListClientGatewaysReq"
          + "uest\032E.google.cloud.beyondcorp.clientgat"
          + "eways.v1.ListClientGatewaysResponse\"C\332A\006"
          + "parent\202\323\344\223\0024\0222/v1/{parent=projects/*/loc"
          + "ations/*}/clientGateways\022\323\001\n\020GetClientGa"
          + "teway\022B.google.cloud.beyondcorp.clientga"
          + "teways.v1.GetClientGatewayRequest\0328.goog"
          + "le.cloud.beyondcorp.clientgateways.v1.Cl"
          + "ientGateway\"A\332A\004name\202\323\344\223\0024\0222/v1/{name=pr"
          + "ojects/*/locations/*/clientGateways/*}\022\244"
          + "\002\n\023CreateClientGateway\022E.google.cloud.be"
          + "yondcorp.clientgateways.v1.CreateClientG"
          + "atewayRequest\032\035.google.longrunning.Opera"
          + "tion\"\246\001\312A/\n\rClientGateway\022\036ClientGateway"
          + "OperationMetadata\332A\'parent,client_gatewa"
          + "y,client_gateway_id\202\323\344\223\002D\"2/v1/{parent=p"
          + "rojects/*/locations/*}/clientGateways:\016c"
          + "lient_gateway\022\370\001\n\023DeleteClientGateway\022E."
          + "google.cloud.beyondcorp.clientgateways.v"
          + "1.DeleteClientGatewayRequest\032\035.google.lo"
          + "ngrunning.Operation\"{\312A7\n\025google.protobu"
          + "f.Empty\022\036ClientGatewayOperationMetadata\332"
          + "A\004name\202\323\344\223\0024*2/v1/{name=projects/*/locat"
          + "ions/*/clientGateways/*}\032M\312A\031beyondcorp."
          + "googleapis.com\322A.https://www.googleapis."
          + "com/auth/cloud-platformB\254\002\n-com.google.c"
          + "loud.beyondcorp.clientgateways.v1B\032Clien"
          + "tGatewaysServiceProtoP\001ZUcloud.google.co"
          + "m/go/beyondcorp/clientgateways/apiv1/cli"
          + "entgatewayspb;clientgatewayspb\252\002)Google."
          + "Cloud.BeyondCorp.ClientGateways.V1\312\002)Goo"
          + "gle\\Cloud\\BeyondCorp\\ClientGateways\\V1\352\002"
          + "-Google::Cloud::BeyondCorp::ClientGatewa"
          + "ys::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_beyondcorp_clientgateways_v1_ClientGateway_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_beyondcorp_clientgateways_v1_ClientGateway_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientgateways_v1_ClientGateway_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "UpdateTime", "State", "Id", "ClientConnectorService",
            });
    internal_static_google_cloud_beyondcorp_clientgateways_v1_ListClientGatewaysRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_beyondcorp_clientgateways_v1_ListClientGatewaysRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientgateways_v1_ListClientGatewaysRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_beyondcorp_clientgateways_v1_ListClientGatewaysResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_beyondcorp_clientgateways_v1_ListClientGatewaysResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientgateways_v1_ListClientGatewaysResponse_descriptor,
            new java.lang.String[] {
              "ClientGateways", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_beyondcorp_clientgateways_v1_GetClientGatewayRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_beyondcorp_clientgateways_v1_GetClientGatewayRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientgateways_v1_GetClientGatewayRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_beyondcorp_clientgateways_v1_CreateClientGatewayRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_beyondcorp_clientgateways_v1_CreateClientGatewayRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientgateways_v1_CreateClientGatewayRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ClientGatewayId", "ClientGateway", "RequestId", "ValidateOnly",
            });
    internal_static_google_cloud_beyondcorp_clientgateways_v1_DeleteClientGatewayRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_beyondcorp_clientgateways_v1_DeleteClientGatewayRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientgateways_v1_DeleteClientGatewayRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId", "ValidateOnly",
            });
    internal_static_google_cloud_beyondcorp_clientgateways_v1_ClientGatewayOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_beyondcorp_clientgateways_v1_ClientGatewayOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientgateways_v1_ClientGatewayOperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
