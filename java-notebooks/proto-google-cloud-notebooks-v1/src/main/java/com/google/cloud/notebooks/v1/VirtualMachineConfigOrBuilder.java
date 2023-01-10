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
// source: google/cloud/notebooks/v1/runtime.proto

package com.google.cloud.notebooks.v1;

public interface VirtualMachineConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.VirtualMachineConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The zone where the virtual machine is located.
   * If using regional request, the notebooks service will pick a location
   * in the corresponding runtime region.
   * On a get request, zone will always be present. Example:
   * * `us-central1-b`
   * </pre>
   *
   * <code>string zone = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * Output only. The zone where the virtual machine is located.
   * If using regional request, the notebooks service will pick a location
   * in the corresponding runtime region.
   * On a get request, zone will always be present. Example:
   * * `us-central1-b`
   * </pre>
   *
   * <code>string zone = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * Required. The Compute Engine machine type used for runtimes.
   * Short name is valid. Examples:
   * * `n1-standard-2`
   * * `e2-standard-8`
   * </pre>
   *
   * <code>string machine_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   *
   *
   * <pre>
   * Required. The Compute Engine machine type used for runtimes.
   * Short name is valid. Examples:
   * * `n1-standard-2`
   * * `e2-standard-8`
   * </pre>
   *
   * <code>string machine_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Use a list of container images to use as Kernels in the notebook instance.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.notebooks.v1.ContainerImage container_images = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.notebooks.v1.ContainerImage> getContainerImagesList();
  /**
   *
   *
   * <pre>
   * Optional. Use a list of container images to use as Kernels in the notebook instance.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.notebooks.v1.ContainerImage container_images = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.notebooks.v1.ContainerImage getContainerImages(int index);
  /**
   *
   *
   * <pre>
   * Optional. Use a list of container images to use as Kernels in the notebook instance.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.notebooks.v1.ContainerImage container_images = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getContainerImagesCount();
  /**
   *
   *
   * <pre>
   * Optional. Use a list of container images to use as Kernels in the notebook instance.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.notebooks.v1.ContainerImage container_images = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.notebooks.v1.ContainerImageOrBuilder>
      getContainerImagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Use a list of container images to use as Kernels in the notebook instance.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.notebooks.v1.ContainerImage container_images = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.notebooks.v1.ContainerImageOrBuilder getContainerImagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Required. Data disk option configuration settings.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.LocalDisk data_disk = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataDisk field is set.
   */
  boolean hasDataDisk();
  /**
   *
   *
   * <pre>
   * Required. Data disk option configuration settings.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.LocalDisk data_disk = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataDisk.
   */
  com.google.cloud.notebooks.v1.LocalDisk getDataDisk();
  /**
   *
   *
   * <pre>
   * Required. Data disk option configuration settings.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.LocalDisk data_disk = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.notebooks.v1.LocalDiskOrBuilder getDataDiskOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Encryption settings for virtual machine data disk.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.EncryptionConfig encryption_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the encryptionConfig field is set.
   */
  boolean hasEncryptionConfig();
  /**
   *
   *
   * <pre>
   * Optional. Encryption settings for virtual machine data disk.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.EncryptionConfig encryption_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The encryptionConfig.
   */
  com.google.cloud.notebooks.v1.EncryptionConfig getEncryptionConfig();
  /**
   *
   *
   * <pre>
   * Optional. Encryption settings for virtual machine data disk.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.EncryptionConfig encryption_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.notebooks.v1.EncryptionConfigOrBuilder getEncryptionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Shielded VM Instance configuration settings.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig shielded_instance_config = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the shieldedInstanceConfig field is set.
   */
  boolean hasShieldedInstanceConfig();
  /**
   *
   *
   * <pre>
   * Optional. Shielded VM Instance configuration settings.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig shielded_instance_config = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The shieldedInstanceConfig.
   */
  com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig getShieldedInstanceConfig();
  /**
   *
   *
   * <pre>
   * Optional. Shielded VM Instance configuration settings.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig shielded_instance_config = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfigOrBuilder
      getShieldedInstanceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine accelerator configuration for this runtime.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.RuntimeAcceleratorConfig accelerator_config = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the acceleratorConfig field is set.
   */
  boolean hasAcceleratorConfig();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine accelerator configuration for this runtime.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.RuntimeAcceleratorConfig accelerator_config = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The acceleratorConfig.
   */
  com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig getAcceleratorConfig();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine accelerator configuration for this runtime.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.RuntimeAcceleratorConfig accelerator_config = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.notebooks.v1.RuntimeAcceleratorConfigOrBuilder getAcceleratorConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine network to be used for machine
   * communications. Cannot be specified with subnetwork. If neither
   * `network` nor `subnet` is specified, the "default" network of
   * the project is used, if it exists.
   * A full URL or partial URI. Examples:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/global/networks/default`
   * * `projects/[project_id]/global/networks/default`
   * Runtimes are managed resources inside Google Infrastructure.
   * Runtimes support the following network configurations:
   * * Google Managed Network (Network &amp; subnet are empty)
   * * Consumer Project VPC (network &amp; subnet are required). Requires
   * configuring Private Service Access.
   * * Shared VPC (network &amp; subnet are required). Requires configuring Private
   * Service Access.
   * </pre>
   *
   * <code>string network = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine network to be used for machine
   * communications. Cannot be specified with subnetwork. If neither
   * `network` nor `subnet` is specified, the "default" network of
   * the project is used, if it exists.
   * A full URL or partial URI. Examples:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/global/networks/default`
   * * `projects/[project_id]/global/networks/default`
   * Runtimes are managed resources inside Google Infrastructure.
   * Runtimes support the following network configurations:
   * * Google Managed Network (Network &amp; subnet are empty)
   * * Consumer Project VPC (network &amp; subnet are required). Requires
   * configuring Private Service Access.
   * * Shared VPC (network &amp; subnet are required). Requires configuring Private
   * Service Access.
   * </pre>
   *
   * <code>string network = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine subnetwork to be used for machine
   * communications. Cannot be specified with network.
   * A full URL or partial URI are valid. Examples:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0`
   * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
   * </pre>
   *
   * <code>string subnet = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The subnet.
   */
  java.lang.String getSubnet();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine subnetwork to be used for machine
   * communications. Cannot be specified with network.
   * A full URL or partial URI are valid. Examples:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0`
   * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
   * </pre>
   *
   * <code>string subnet = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for subnet.
   */
  com.google.protobuf.ByteString getSubnetBytes();

  /**
   *
   *
   * <pre>
   * Optional. If true, runtime will only have internal IP
   * addresses. By default, runtimes are not restricted to internal IP
   * addresses, and will have ephemeral external IP addresses assigned to each
   * vm. This `internal_ip_only` restriction can only be enabled for
   * subnetwork enabled networks, and all dependencies must be
   * configured to be accessible without external IP addresses.
   * </pre>
   *
   * <code>bool internal_ip_only = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The internalIpOnly.
   */
  boolean getInternalIpOnly();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
   * </pre>
   *
   * <code>repeated string tags = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String> getTagsList();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
   * </pre>
   *
   * <code>repeated string tags = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
   * </pre>
   *
   * <code>repeated string tags = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
   * </pre>
   *
   * <code>repeated string tags = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString getTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The Compute Engine guest attributes. (see
   * [Project and instance
   * guest
   * attributes](https://cloud.google.com/compute/docs/storing-retrieving-metadata#guest_attributes)).
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; guest_attributes = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getGuestAttributesCount();
  /**
   *
   *
   * <pre>
   * Output only. The Compute Engine guest attributes. (see
   * [Project and instance
   * guest
   * attributes](https://cloud.google.com/compute/docs/storing-retrieving-metadata#guest_attributes)).
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; guest_attributes = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsGuestAttributes(java.lang.String key);
  /** Use {@link #getGuestAttributesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getGuestAttributes();
  /**
   *
   *
   * <pre>
   * Output only. The Compute Engine guest attributes. (see
   * [Project and instance
   * guest
   * attributes](https://cloud.google.com/compute/docs/storing-retrieving-metadata#guest_attributes)).
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; guest_attributes = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getGuestAttributesMap();
  /**
   *
   *
   * <pre>
   * Output only. The Compute Engine guest attributes. (see
   * [Project and instance
   * guest
   * attributes](https://cloud.google.com/compute/docs/storing-retrieving-metadata#guest_attributes)).
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; guest_attributes = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */

  /* nullable */
  java.lang.String getGuestAttributesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. The Compute Engine guest attributes. (see
   * [Project and instance
   * guest
   * attributes](https://cloud.google.com/compute/docs/storing-retrieving-metadata#guest_attributes)).
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; guest_attributes = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.lang.String getGuestAttributesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine metadata entries to add to virtual machine. (see
   * [Project and instance
   * metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getMetadataCount();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine metadata entries to add to virtual machine. (see
   * [Project and instance
   * metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsMetadata(java.lang.String key);
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getMetadata();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine metadata entries to add to virtual machine. (see
   * [Project and instance
   * metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getMetadataMap();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine metadata entries to add to virtual machine. (see
   * [Project and instance
   * metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  /* nullable */
  java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine metadata entries to add to virtual machine. (see
   * [Project and instance
   * metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getMetadataOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this runtime.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this runtime.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this runtime.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this runtime.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this runtime.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The type of vNIC to be used on this interface. This may be gVNIC or
   * VirtioNet.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.VirtualMachineConfig.NicType nic_type = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for nicType.
   */
  int getNicTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. The type of vNIC to be used on this interface. This may be gVNIC or
   * VirtioNet.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.VirtualMachineConfig.NicType nic_type = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The nicType.
   */
  com.google.cloud.notebooks.v1.VirtualMachineConfig.NicType getNicType();

  /**
   *
   *
   * <pre>
   * Optional. Reserved IP Range name is used for VPC Peering.
   * The subnetwork allocation will use the range *name* if it's assigned.
   * Example: managed-notebooks-range-c
   *     PEERING_RANGE_NAME_3=managed-notebooks-range-c
   *     gcloud compute addresses create $PEERING_RANGE_NAME_3 &#92;
   *       --global &#92;
   *       --prefix-length=24 &#92;
   *       --description="Google Cloud Managed Notebooks Range 24 c" &#92;
   *       --network=$NETWORK &#92;
   *       --addresses=192.168.0.0 &#92;
   *       --purpose=VPC_PEERING
   * Field value will be: `managed-notebooks-range-c`
   * </pre>
   *
   * <code>string reserved_ip_range = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The reservedIpRange.
   */
  java.lang.String getReservedIpRange();
  /**
   *
   *
   * <pre>
   * Optional. Reserved IP Range name is used for VPC Peering.
   * The subnetwork allocation will use the range *name* if it's assigned.
   * Example: managed-notebooks-range-c
   *     PEERING_RANGE_NAME_3=managed-notebooks-range-c
   *     gcloud compute addresses create $PEERING_RANGE_NAME_3 &#92;
   *       --global &#92;
   *       --prefix-length=24 &#92;
   *       --description="Google Cloud Managed Notebooks Range 24 c" &#92;
   *       --network=$NETWORK &#92;
   *       --addresses=192.168.0.0 &#92;
   *       --purpose=VPC_PEERING
   * Field value will be: `managed-notebooks-range-c`
   * </pre>
   *
   * <code>string reserved_ip_range = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for reservedIpRange.
   */
  com.google.protobuf.ByteString getReservedIpRangeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Boot image metadata used for runtime upgradeability.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.VirtualMachineConfig.BootImage boot_image = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the bootImage field is set.
   */
  boolean hasBootImage();
  /**
   *
   *
   * <pre>
   * Optional. Boot image metadata used for runtime upgradeability.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.VirtualMachineConfig.BootImage boot_image = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bootImage.
   */
  com.google.cloud.notebooks.v1.VirtualMachineConfig.BootImage getBootImage();
  /**
   *
   *
   * <pre>
   * Optional. Boot image metadata used for runtime upgradeability.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.VirtualMachineConfig.BootImage boot_image = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.notebooks.v1.VirtualMachineConfig.BootImageOrBuilder getBootImageOrBuilder();
}
