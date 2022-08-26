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

package com.google.cloud.datalabeling.v1beta1.samples;

// [START datalabeling_v1beta1_generated_datalabelingserviceclient_importdata_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient;
import com.google.cloud.datalabeling.v1beta1.DatasetName;
import com.google.cloud.datalabeling.v1beta1.ImportDataOperationMetadata;
import com.google.cloud.datalabeling.v1beta1.ImportDataOperationResponse;
import com.google.cloud.datalabeling.v1beta1.ImportDataRequest;
import com.google.cloud.datalabeling.v1beta1.InputConfig;

public class AsyncImportDataLRO {

  public static void main(String[] args) throws Exception {
    asyncImportDataLRO();
  }

  public static void asyncImportDataLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
      ImportDataRequest request =
          ImportDataRequest.newBuilder()
              .setName(DatasetName.of("[PROJECT]", "[DATASET]").toString())
              .setInputConfig(InputConfig.newBuilder().build())
              .setUserEmailAddress("userEmailAddress-1844787165")
              .build();
      OperationFuture<ImportDataOperationResponse, ImportDataOperationMetadata> future =
          dataLabelingServiceClient.importDataOperationCallable().futureCall(request);
      // Do something.
      ImportDataOperationResponse response = future.get();
    }
  }
}
// [END datalabeling_v1beta1_generated_datalabelingserviceclient_importdata_lro_async]