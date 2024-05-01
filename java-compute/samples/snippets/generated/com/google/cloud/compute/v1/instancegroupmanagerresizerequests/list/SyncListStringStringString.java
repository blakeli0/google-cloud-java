/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.compute.v1.samples;

// [START compute_v1_generated_InstanceGroupManagerResizeRequests_List_StringStringString_sync]
import com.google.cloud.compute.v1.InstanceGroupManagerResizeRequest;
import com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestsClient;

public class SyncListStringStringString {

  public static void main(String[] args) throws Exception {
    syncListStringStringString();
  }

  public static void syncListStringStringString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (InstanceGroupManagerResizeRequestsClient instanceGroupManagerResizeRequestsClient =
        InstanceGroupManagerResizeRequestsClient.create()) {
      String project = "project-309310695";
      String zone = "zone3744684";
      String instanceGroupManager = "instanceGroupManager-388242077";
      for (InstanceGroupManagerResizeRequest element :
          instanceGroupManagerResizeRequestsClient
              .list(project, zone, instanceGroupManager)
              .iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END compute_v1_generated_InstanceGroupManagerResizeRequests_List_StringStringString_sync]
