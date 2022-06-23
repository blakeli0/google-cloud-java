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

package com.google.cloud.documentai.v1.samples;

// [START documentai_v1_generated_documentprocessorserviceclient_reviewdocument_string_sync]
import com.google.cloud.documentai.v1.DocumentProcessorServiceClient;
import com.google.cloud.documentai.v1.HumanReviewConfigName;
import com.google.cloud.documentai.v1.ReviewDocumentResponse;

public class SyncReviewDocumentString {

  public static void main(String[] args) throws Exception {
    syncReviewDocumentString();
  }

  public static void syncReviewDocumentString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DocumentProcessorServiceClient documentProcessorServiceClient =
        DocumentProcessorServiceClient.create()) {
      String humanReviewConfig =
          HumanReviewConfigName.of("[PROJECT]", "[LOCATION]", "[PROCESSOR]").toString();
      ReviewDocumentResponse response =
          documentProcessorServiceClient.reviewDocumentAsync(humanReviewConfig).get();
    }
  }
}
// [END documentai_v1_generated_documentprocessorserviceclient_reviewdocument_string_sync]
