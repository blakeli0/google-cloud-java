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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.2
package com.google.cloudbuild.v1;

public interface BuildTriggerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.BuildTrigger)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The `Trigger` name with format:
   * `projects/{project}/locations/{location}/triggers/{trigger}`, where
   * {trigger} is a unique identifier generated by the service.
   * </pre>
   *
   * <code>string resource_name = 34;</code>
   *
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   *
   *
   * <pre>
   * The `Trigger` name with format:
   * `projects/{project}/locations/{location}/triggers/{trigger}`, where
   * {trigger} is a unique identifier generated by the service.
   * </pre>
   *
   * <code>string resource_name = 34;</code>
   *
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString getResourceNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Unique identifier of the trigger.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Output only. Unique identifier of the trigger.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Human-readable description of this trigger.
   * </pre>
   *
   * <code>string description = 10;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Human-readable description of this trigger.
   * </pre>
   *
   * <code>string description = 10;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * User-assigned name of the trigger. Must be unique within the project.
   * Trigger names must meet the following requirements:
   *
   * + They must contain only alphanumeric characters and dashes.
   * + They can be 1-64 characters long.
   * + They must begin and end with an alphanumeric character.
   * </pre>
   *
   * <code>string name = 21;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * User-assigned name of the trigger. Must be unique within the project.
   * Trigger names must meet the following requirements:
   *
   * + They must contain only alphanumeric characters and dashes.
   * + They can be 1-64 characters long.
   * + They must begin and end with an alphanumeric character.
   * </pre>
   *
   * <code>string name = 21;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Tags for annotation of a `BuildTrigger`
   * </pre>
   *
   * <code>repeated string tags = 19;</code>
   *
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String> getTagsList();
  /**
   *
   *
   * <pre>
   * Tags for annotation of a `BuildTrigger`
   * </pre>
   *
   * <code>repeated string tags = 19;</code>
   *
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   *
   *
   * <pre>
   * Tags for annotation of a `BuildTrigger`
   * </pre>
   *
   * <code>repeated string tags = 19;</code>
   *
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   *
   *
   * <pre>
   * Tags for annotation of a `BuildTrigger`
   * </pre>
   *
   * <code>repeated string tags = 19;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString getTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * Template describing the types of source changes to trigger a build.
   *
   * Branch and tag names in trigger templates are interpreted as regular
   * expressions. Any branch or tag change that matches that regular expression
   * will trigger a build.
   *
   * Mutually exclusive with `github`.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource trigger_template = 7;</code>
   *
   * @return Whether the triggerTemplate field is set.
   */
  boolean hasTriggerTemplate();
  /**
   *
   *
   * <pre>
   * Template describing the types of source changes to trigger a build.
   *
   * Branch and tag names in trigger templates are interpreted as regular
   * expressions. Any branch or tag change that matches that regular expression
   * will trigger a build.
   *
   * Mutually exclusive with `github`.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource trigger_template = 7;</code>
   *
   * @return The triggerTemplate.
   */
  com.google.cloudbuild.v1.RepoSource getTriggerTemplate();
  /**
   *
   *
   * <pre>
   * Template describing the types of source changes to trigger a build.
   *
   * Branch and tag names in trigger templates are interpreted as regular
   * expressions. Any branch or tag change that matches that regular expression
   * will trigger a build.
   *
   * Mutually exclusive with `github`.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource trigger_template = 7;</code>
   */
  com.google.cloudbuild.v1.RepoSourceOrBuilder getTriggerTemplateOrBuilder();

  /**
   *
   *
   * <pre>
   * GitHubEventsConfig describes the configuration of a trigger that creates
   * a build whenever a GitHub event is received.
   *
   * Mutually exclusive with `trigger_template`.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.GitHubEventsConfig github = 13;</code>
   *
   * @return Whether the github field is set.
   */
  boolean hasGithub();
  /**
   *
   *
   * <pre>
   * GitHubEventsConfig describes the configuration of a trigger that creates
   * a build whenever a GitHub event is received.
   *
   * Mutually exclusive with `trigger_template`.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.GitHubEventsConfig github = 13;</code>
   *
   * @return The github.
   */
  com.google.cloudbuild.v1.GitHubEventsConfig getGithub();
  /**
   *
   *
   * <pre>
   * GitHubEventsConfig describes the configuration of a trigger that creates
   * a build whenever a GitHub event is received.
   *
   * Mutually exclusive with `trigger_template`.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.GitHubEventsConfig github = 13;</code>
   */
  com.google.cloudbuild.v1.GitHubEventsConfigOrBuilder getGithubOrBuilder();

  /**
   *
   *
   * <pre>
   * PubsubConfig describes the configuration of a trigger that
   * creates a build whenever a Pub/Sub message is published.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PubsubConfig pubsub_config = 29;</code>
   *
   * @return Whether the pubsubConfig field is set.
   */
  boolean hasPubsubConfig();
  /**
   *
   *
   * <pre>
   * PubsubConfig describes the configuration of a trigger that
   * creates a build whenever a Pub/Sub message is published.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PubsubConfig pubsub_config = 29;</code>
   *
   * @return The pubsubConfig.
   */
  com.google.cloudbuild.v1.PubsubConfig getPubsubConfig();
  /**
   *
   *
   * <pre>
   * PubsubConfig describes the configuration of a trigger that
   * creates a build whenever a Pub/Sub message is published.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PubsubConfig pubsub_config = 29;</code>
   */
  com.google.cloudbuild.v1.PubsubConfigOrBuilder getPubsubConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * WebhookConfig describes the configuration of a trigger that
   * creates a build whenever a webhook is sent to a trigger's webhook URL.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.WebhookConfig webhook_config = 31;</code>
   *
   * @return Whether the webhookConfig field is set.
   */
  boolean hasWebhookConfig();
  /**
   *
   *
   * <pre>
   * WebhookConfig describes the configuration of a trigger that
   * creates a build whenever a webhook is sent to a trigger's webhook URL.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.WebhookConfig webhook_config = 31;</code>
   *
   * @return The webhookConfig.
   */
  com.google.cloudbuild.v1.WebhookConfig getWebhookConfig();
  /**
   *
   *
   * <pre>
   * WebhookConfig describes the configuration of a trigger that
   * creates a build whenever a webhook is sent to a trigger's webhook URL.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.WebhookConfig webhook_config = 31;</code>
   */
  com.google.cloudbuild.v1.WebhookConfigOrBuilder getWebhookConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Autodetect build configuration.  The following precedence is used (case
   * insensitive):
   *
   * 1. cloudbuild.yaml
   * 2. cloudbuild.yml
   * 3. cloudbuild.json
   * 4. Dockerfile
   *
   * Currently only available for GitHub App Triggers.
   * </pre>
   *
   * <code>bool autodetect = 18;</code>
   *
   * @return Whether the autodetect field is set.
   */
  boolean hasAutodetect();
  /**
   *
   *
   * <pre>
   * Autodetect build configuration.  The following precedence is used (case
   * insensitive):
   *
   * 1. cloudbuild.yaml
   * 2. cloudbuild.yml
   * 3. cloudbuild.json
   * 4. Dockerfile
   *
   * Currently only available for GitHub App Triggers.
   * </pre>
   *
   * <code>bool autodetect = 18;</code>
   *
   * @return The autodetect.
   */
  boolean getAutodetect();

  /**
   *
   *
   * <pre>
   * Contents of the build template.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build build = 4;</code>
   *
   * @return Whether the build field is set.
   */
  boolean hasBuild();
  /**
   *
   *
   * <pre>
   * Contents of the build template.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build build = 4;</code>
   *
   * @return The build.
   */
  com.google.cloudbuild.v1.Build getBuild();
  /**
   *
   *
   * <pre>
   * Contents of the build template.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build build = 4;</code>
   */
  com.google.cloudbuild.v1.BuildOrBuilder getBuildOrBuilder();

  /**
   *
   *
   * <pre>
   * Path, from the source root, to the build configuration file
   * (i.e. cloudbuild.yaml).
   * </pre>
   *
   * <code>string filename = 8;</code>
   *
   * @return Whether the filename field is set.
   */
  boolean hasFilename();
  /**
   *
   *
   * <pre>
   * Path, from the source root, to the build configuration file
   * (i.e. cloudbuild.yaml).
   * </pre>
   *
   * <code>string filename = 8;</code>
   *
   * @return The filename.
   */
  java.lang.String getFilename();
  /**
   *
   *
   * <pre>
   * Path, from the source root, to the build configuration file
   * (i.e. cloudbuild.yaml).
   * </pre>
   *
   * <code>string filename = 8;</code>
   *
   * @return The bytes for filename.
   */
  com.google.protobuf.ByteString getFilenameBytes();

  /**
   *
   *
   * <pre>
   * The file source describing the local or remote Build template.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.GitFileSource git_file_source = 24;</code>
   *
   * @return Whether the gitFileSource field is set.
   */
  boolean hasGitFileSource();
  /**
   *
   *
   * <pre>
   * The file source describing the local or remote Build template.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.GitFileSource git_file_source = 24;</code>
   *
   * @return The gitFileSource.
   */
  com.google.cloudbuild.v1.GitFileSource getGitFileSource();
  /**
   *
   *
   * <pre>
   * The file source describing the local or remote Build template.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.GitFileSource git_file_source = 24;</code>
   */
  com.google.cloudbuild.v1.GitFileSourceOrBuilder getGitFileSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the trigger was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the trigger was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the trigger was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * If true, the trigger will never automatically execute a build.
   * </pre>
   *
   * <code>bool disabled = 9;</code>
   *
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   *
   *
   * <pre>
   * Substitutions for Build resource. The keys must match the following
   * regular expression: `^_[A-Z0-9_]+$`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 11;</code>
   */
  int getSubstitutionsCount();
  /**
   *
   *
   * <pre>
   * Substitutions for Build resource. The keys must match the following
   * regular expression: `^_[A-Z0-9_]+$`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 11;</code>
   */
  boolean containsSubstitutions(java.lang.String key);
  /** Use {@link #getSubstitutionsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getSubstitutions();
  /**
   *
   *
   * <pre>
   * Substitutions for Build resource. The keys must match the following
   * regular expression: `^_[A-Z0-9_]+$`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 11;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getSubstitutionsMap();
  /**
   *
   *
   * <pre>
   * Substitutions for Build resource. The keys must match the following
   * regular expression: `^_[A-Z0-9_]+$`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 11;</code>
   */
  /* nullable */
  java.lang.String getSubstitutionsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Substitutions for Build resource. The keys must match the following
   * regular expression: `^_[A-Z0-9_]+$`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 11;</code>
   */
  java.lang.String getSubstitutionsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * ignored_files and included_files are file glob matches using
   * https://golang.org/pkg/path/filepath/#Match extended with support for "**".
   *
   * If ignored_files and changed files are both empty, then they are
   * not used to determine whether or not to trigger a build.
   *
   * If ignored_files is not empty, then we ignore any files that match
   * any of the ignored_file globs. If the change has no files that are
   * outside of the ignored_files globs, then we do not trigger a build.
   * </pre>
   *
   * <code>repeated string ignored_files = 15;</code>
   *
   * @return A list containing the ignoredFiles.
   */
  java.util.List<java.lang.String> getIgnoredFilesList();
  /**
   *
   *
   * <pre>
   * ignored_files and included_files are file glob matches using
   * https://golang.org/pkg/path/filepath/#Match extended with support for "**".
   *
   * If ignored_files and changed files are both empty, then they are
   * not used to determine whether or not to trigger a build.
   *
   * If ignored_files is not empty, then we ignore any files that match
   * any of the ignored_file globs. If the change has no files that are
   * outside of the ignored_files globs, then we do not trigger a build.
   * </pre>
   *
   * <code>repeated string ignored_files = 15;</code>
   *
   * @return The count of ignoredFiles.
   */
  int getIgnoredFilesCount();
  /**
   *
   *
   * <pre>
   * ignored_files and included_files are file glob matches using
   * https://golang.org/pkg/path/filepath/#Match extended with support for "**".
   *
   * If ignored_files and changed files are both empty, then they are
   * not used to determine whether or not to trigger a build.
   *
   * If ignored_files is not empty, then we ignore any files that match
   * any of the ignored_file globs. If the change has no files that are
   * outside of the ignored_files globs, then we do not trigger a build.
   * </pre>
   *
   * <code>repeated string ignored_files = 15;</code>
   *
   * @param index The index of the element to return.
   * @return The ignoredFiles at the given index.
   */
  java.lang.String getIgnoredFiles(int index);
  /**
   *
   *
   * <pre>
   * ignored_files and included_files are file glob matches using
   * https://golang.org/pkg/path/filepath/#Match extended with support for "**".
   *
   * If ignored_files and changed files are both empty, then they are
   * not used to determine whether or not to trigger a build.
   *
   * If ignored_files is not empty, then we ignore any files that match
   * any of the ignored_file globs. If the change has no files that are
   * outside of the ignored_files globs, then we do not trigger a build.
   * </pre>
   *
   * <code>repeated string ignored_files = 15;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ignoredFiles at the given index.
   */
  com.google.protobuf.ByteString getIgnoredFilesBytes(int index);

  /**
   *
   *
   * <pre>
   * If any of the files altered in the commit pass the ignored_files
   * filter and included_files is empty, then as far as this filter is
   * concerned, we should trigger the build.
   *
   * If any of the files altered in the commit pass the ignored_files
   * filter and included_files is not empty, then we make sure that at
   * least one of those files matches a included_files glob. If not,
   * then we do not trigger a build.
   * </pre>
   *
   * <code>repeated string included_files = 16;</code>
   *
   * @return A list containing the includedFiles.
   */
  java.util.List<java.lang.String> getIncludedFilesList();
  /**
   *
   *
   * <pre>
   * If any of the files altered in the commit pass the ignored_files
   * filter and included_files is empty, then as far as this filter is
   * concerned, we should trigger the build.
   *
   * If any of the files altered in the commit pass the ignored_files
   * filter and included_files is not empty, then we make sure that at
   * least one of those files matches a included_files glob. If not,
   * then we do not trigger a build.
   * </pre>
   *
   * <code>repeated string included_files = 16;</code>
   *
   * @return The count of includedFiles.
   */
  int getIncludedFilesCount();
  /**
   *
   *
   * <pre>
   * If any of the files altered in the commit pass the ignored_files
   * filter and included_files is empty, then as far as this filter is
   * concerned, we should trigger the build.
   *
   * If any of the files altered in the commit pass the ignored_files
   * filter and included_files is not empty, then we make sure that at
   * least one of those files matches a included_files glob. If not,
   * then we do not trigger a build.
   * </pre>
   *
   * <code>repeated string included_files = 16;</code>
   *
   * @param index The index of the element to return.
   * @return The includedFiles at the given index.
   */
  java.lang.String getIncludedFiles(int index);
  /**
   *
   *
   * <pre>
   * If any of the files altered in the commit pass the ignored_files
   * filter and included_files is empty, then as far as this filter is
   * concerned, we should trigger the build.
   *
   * If any of the files altered in the commit pass the ignored_files
   * filter and included_files is not empty, then we make sure that at
   * least one of those files matches a included_files glob. If not,
   * then we do not trigger a build.
   * </pre>
   *
   * <code>repeated string included_files = 16;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the includedFiles at the given index.
   */
  com.google.protobuf.ByteString getIncludedFilesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. A Common Expression Language string.
   * </pre>
   *
   * <code>string filter = 30 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. A Common Expression Language string.
   * </pre>
   *
   * <code>string filter = 30 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The repo and ref of the repository from which to build. This field
   * is used only for those triggers that do not respond to SCM events.
   * Triggers that respond to such events build source at whatever commit
   * caused the event.
   * This field is currently only used by Webhook, Pub/Sub, Manual, and Cron
   * triggers.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.GitRepoSource source_to_build = 26;</code>
   *
   * @return Whether the sourceToBuild field is set.
   */
  boolean hasSourceToBuild();
  /**
   *
   *
   * <pre>
   * The repo and ref of the repository from which to build. This field
   * is used only for those triggers that do not respond to SCM events.
   * Triggers that respond to such events build source at whatever commit
   * caused the event.
   * This field is currently only used by Webhook, Pub/Sub, Manual, and Cron
   * triggers.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.GitRepoSource source_to_build = 26;</code>
   *
   * @return The sourceToBuild.
   */
  com.google.cloudbuild.v1.GitRepoSource getSourceToBuild();
  /**
   *
   *
   * <pre>
   * The repo and ref of the repository from which to build. This field
   * is used only for those triggers that do not respond to SCM events.
   * Triggers that respond to such events build source at whatever commit
   * caused the event.
   * This field is currently only used by Webhook, Pub/Sub, Manual, and Cron
   * triggers.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.GitRepoSource source_to_build = 26;</code>
   */
  com.google.cloudbuild.v1.GitRepoSourceOrBuilder getSourceToBuildOrBuilder();

  /**
   *
   *
   * <pre>
   * The service account used for all user-controlled operations including
   * UpdateBuildTrigger, RunBuildTrigger, CreateBuild, and CancelBuild.
   * If no service account is set, then the standard Cloud Build service account
   * ([PROJECT_NUM]&#64;system.gserviceaccount.com) will be used instead.
   * Format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}`
   * </pre>
   *
   * <code>string service_account = 33 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * The service account used for all user-controlled operations including
   * UpdateBuildTrigger, RunBuildTrigger, CreateBuild, and CancelBuild.
   * If no service account is set, then the standard Cloud Build service account
   * ([PROJECT_NUM]&#64;system.gserviceaccount.com) will be used instead.
   * Format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}`
   * </pre>
   *
   * <code>string service_account = 33 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * The configuration of a trigger that creates a build whenever an event from
   * Repo API is received.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepositoryEventConfig repository_event_config = 39;</code>
   *
   * @return Whether the repositoryEventConfig field is set.
   */
  boolean hasRepositoryEventConfig();
  /**
   *
   *
   * <pre>
   * The configuration of a trigger that creates a build whenever an event from
   * Repo API is received.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepositoryEventConfig repository_event_config = 39;</code>
   *
   * @return The repositoryEventConfig.
   */
  com.google.cloudbuild.v1.RepositoryEventConfig getRepositoryEventConfig();
  /**
   *
   *
   * <pre>
   * The configuration of a trigger that creates a build whenever an event from
   * Repo API is received.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepositoryEventConfig repository_event_config = 39;</code>
   */
  com.google.cloudbuild.v1.RepositoryEventConfigOrBuilder getRepositoryEventConfigOrBuilder();

  com.google.cloudbuild.v1.BuildTrigger.BuildTemplateCase getBuildTemplateCase();
}
