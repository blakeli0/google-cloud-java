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

package com.google.cloud.tasks.v2beta2.samples;

// [START tasks_v2beta2_generated_cloudtasksclient_runtask_sync]
import com.google.cloud.tasks.v2beta2.CloudTasksClient;
import com.google.cloud.tasks.v2beta2.RunTaskRequest;
import com.google.cloud.tasks.v2beta2.Task;
import com.google.cloud.tasks.v2beta2.TaskName;

public class SyncRunTask {

  public static void main(String[] args) throws Exception {
    syncRunTask();
  }

  public static void syncRunTask() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
      RunTaskRequest request =
          RunTaskRequest.newBuilder()
              .setName(TaskName.of("[PROJECT]", "[LOCATION]", "[QUEUE]", "[TASK]").toString())
              .build();
      Task response = cloudTasksClient.runTask(request);
    }
  }
}
// [END tasks_v2beta2_generated_cloudtasksclient_runtask_sync]