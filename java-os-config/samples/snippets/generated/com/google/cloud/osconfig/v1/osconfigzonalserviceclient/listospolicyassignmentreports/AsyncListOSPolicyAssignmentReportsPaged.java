/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.osconfig.v1.samples;

// [START
// osconfig_v1_generated_osconfigzonalserviceclient_listospolicyassignmentreports_paged_async]
import com.google.cloud.osconfig.v1.InstanceOSPolicyAssignmentName;
import com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsRequest;
import com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse;
import com.google.cloud.osconfig.v1.OSPolicyAssignmentReport;
import com.google.cloud.osconfig.v1.OsConfigZonalServiceClient;
import com.google.common.base.Strings;

public class AsyncListOSPolicyAssignmentReportsPaged {

  public static void main(String[] args) throws Exception {
    asyncListOSPolicyAssignmentReportsPaged();
  }

  public static void asyncListOSPolicyAssignmentReportsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (OsConfigZonalServiceClient osConfigZonalServiceClient =
        OsConfigZonalServiceClient.create()) {
      ListOSPolicyAssignmentReportsRequest request =
          ListOSPolicyAssignmentReportsRequest.newBuilder()
              .setParent(
                  InstanceOSPolicyAssignmentName.of(
                          "[PROJECT]", "[LOCATION]", "[INSTANCE]", "[ASSIGNMENT]")
                      .toString())
              .setPageSize(883849137)
              .setFilter("filter-1274492040")
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListOSPolicyAssignmentReportsResponse response =
            osConfigZonalServiceClient.listOSPolicyAssignmentReportsCallable().call(request);
        for (OSPolicyAssignmentReport element : response.getOsPolicyAssignmentReportsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END osconfig_v1_generated_osconfigzonalserviceclient_listospolicyassignmentreports_paged_async]
