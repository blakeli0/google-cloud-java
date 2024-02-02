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

public interface BuildStepOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.BuildStep)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the container image that will run this particular
   * build step.
   *
   * If the image is available in the host's Docker daemon's cache, it
   * will be run directly. If not, the host will attempt to pull the image
   * first, using the builder service account's credentials if necessary.
   *
   * The Docker daemon's cache will already have the latest versions of all of
   * the officially supported build steps
   * ([https://github.com/GoogleCloudPlatform/cloud-builders](https://github.com/GoogleCloudPlatform/cloud-builders)).
   * The Docker daemon will also have cached many of the layers for some popular
   * images, like "ubuntu", "debian", but they will be refreshed at the time you
   * attempt to use them.
   *
   * If you built an image in a previous build step, it will be stored in the
   * host's Docker daemon's cache and is available to use as the name for a
   * later build step.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the container image that will run this particular
   * build step.
   *
   * If the image is available in the host's Docker daemon's cache, it
   * will be run directly. If not, the host will attempt to pull the image
   * first, using the builder service account's credentials if necessary.
   *
   * The Docker daemon's cache will already have the latest versions of all of
   * the officially supported build steps
   * ([https://github.com/GoogleCloudPlatform/cloud-builders](https://github.com/GoogleCloudPlatform/cloud-builders)).
   * The Docker daemon will also have cached many of the layers for some popular
   * images, like "ubuntu", "debian", but they will be refreshed at the time you
   * attempt to use them.
   *
   * If you built an image in a previous build step, it will be stored in the
   * host's Docker daemon's cache and is available to use as the name for a
   * later build step.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A list of environment variable definitions to be used when running a step.
   *
   * The elements are of the form "KEY=VALUE" for the environment variable "KEY"
   * being given the value "VALUE".
   * </pre>
   *
   * <code>repeated string env = 2;</code>
   *
   * @return A list containing the env.
   */
  java.util.List<java.lang.String> getEnvList();
  /**
   *
   *
   * <pre>
   * A list of environment variable definitions to be used when running a step.
   *
   * The elements are of the form "KEY=VALUE" for the environment variable "KEY"
   * being given the value "VALUE".
   * </pre>
   *
   * <code>repeated string env = 2;</code>
   *
   * @return The count of env.
   */
  int getEnvCount();
  /**
   *
   *
   * <pre>
   * A list of environment variable definitions to be used when running a step.
   *
   * The elements are of the form "KEY=VALUE" for the environment variable "KEY"
   * being given the value "VALUE".
   * </pre>
   *
   * <code>repeated string env = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The env at the given index.
   */
  java.lang.String getEnv(int index);
  /**
   *
   *
   * <pre>
   * A list of environment variable definitions to be used when running a step.
   *
   * The elements are of the form "KEY=VALUE" for the environment variable "KEY"
   * being given the value "VALUE".
   * </pre>
   *
   * <code>repeated string env = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the env at the given index.
   */
  com.google.protobuf.ByteString getEnvBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of arguments that will be presented to the step when it is started.
   *
   * If the image used to run the step's container has an entrypoint, the `args`
   * are used as arguments to that entrypoint. If the image does not define
   * an entrypoint, the first element in args is used as the entrypoint,
   * and the remainder will be used as arguments.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   *
   * @return A list containing the args.
   */
  java.util.List<java.lang.String> getArgsList();
  /**
   *
   *
   * <pre>
   * A list of arguments that will be presented to the step when it is started.
   *
   * If the image used to run the step's container has an entrypoint, the `args`
   * are used as arguments to that entrypoint. If the image does not define
   * an entrypoint, the first element in args is used as the entrypoint,
   * and the remainder will be used as arguments.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   *
   * @return The count of args.
   */
  int getArgsCount();
  /**
   *
   *
   * <pre>
   * A list of arguments that will be presented to the step when it is started.
   *
   * If the image used to run the step's container has an entrypoint, the `args`
   * are used as arguments to that entrypoint. If the image does not define
   * an entrypoint, the first element in args is used as the entrypoint,
   * and the remainder will be used as arguments.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The args at the given index.
   */
  java.lang.String getArgs(int index);
  /**
   *
   *
   * <pre>
   * A list of arguments that will be presented to the step when it is started.
   *
   * If the image used to run the step's container has an entrypoint, the `args`
   * are used as arguments to that entrypoint. If the image does not define
   * an entrypoint, the first element in args is used as the entrypoint,
   * and the remainder will be used as arguments.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the args at the given index.
   */
  com.google.protobuf.ByteString getArgsBytes(int index);

  /**
   *
   *
   * <pre>
   * Working directory to use when running this step's container.
   *
   * If this value is a relative path, it is relative to the build's working
   * directory. If this value is absolute, it may be outside the build's working
   * directory, in which case the contents of the path may not be persisted
   * across build step executions, unless a `volume` for that path is specified.
   *
   * If the build specifies a `RepoSource` with `dir` and a step with a `dir`,
   * which specifies an absolute path, the `RepoSource` `dir` is ignored for
   * the step's execution.
   * </pre>
   *
   * <code>string dir = 4;</code>
   *
   * @return The dir.
   */
  java.lang.String getDir();
  /**
   *
   *
   * <pre>
   * Working directory to use when running this step's container.
   *
   * If this value is a relative path, it is relative to the build's working
   * directory. If this value is absolute, it may be outside the build's working
   * directory, in which case the contents of the path may not be persisted
   * across build step executions, unless a `volume` for that path is specified.
   *
   * If the build specifies a `RepoSource` with `dir` and a step with a `dir`,
   * which specifies an absolute path, the `RepoSource` `dir` is ignored for
   * the step's execution.
   * </pre>
   *
   * <code>string dir = 4;</code>
   *
   * @return The bytes for dir.
   */
  com.google.protobuf.ByteString getDirBytes();

  /**
   *
   *
   * <pre>
   * Unique identifier for this build step, used in `wait_for` to
   * reference this build step as a dependency.
   * </pre>
   *
   * <code>string id = 5;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Unique identifier for this build step, used in `wait_for` to
   * reference this build step as a dependency.
   * </pre>
   *
   * <code>string id = 5;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * The ID(s) of the step(s) that this build step depends on.
   * This build step will not start until all the build steps in `wait_for`
   * have completed successfully. If `wait_for` is empty, this build step will
   * start when all previous build steps in the `Build.Steps` list have
   * completed successfully.
   * </pre>
   *
   * <code>repeated string wait_for = 6;</code>
   *
   * @return A list containing the waitFor.
   */
  java.util.List<java.lang.String> getWaitForList();
  /**
   *
   *
   * <pre>
   * The ID(s) of the step(s) that this build step depends on.
   * This build step will not start until all the build steps in `wait_for`
   * have completed successfully. If `wait_for` is empty, this build step will
   * start when all previous build steps in the `Build.Steps` list have
   * completed successfully.
   * </pre>
   *
   * <code>repeated string wait_for = 6;</code>
   *
   * @return The count of waitFor.
   */
  int getWaitForCount();
  /**
   *
   *
   * <pre>
   * The ID(s) of the step(s) that this build step depends on.
   * This build step will not start until all the build steps in `wait_for`
   * have completed successfully. If `wait_for` is empty, this build step will
   * start when all previous build steps in the `Build.Steps` list have
   * completed successfully.
   * </pre>
   *
   * <code>repeated string wait_for = 6;</code>
   *
   * @param index The index of the element to return.
   * @return The waitFor at the given index.
   */
  java.lang.String getWaitFor(int index);
  /**
   *
   *
   * <pre>
   * The ID(s) of the step(s) that this build step depends on.
   * This build step will not start until all the build steps in `wait_for`
   * have completed successfully. If `wait_for` is empty, this build step will
   * start when all previous build steps in the `Build.Steps` list have
   * completed successfully.
   * </pre>
   *
   * <code>repeated string wait_for = 6;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the waitFor at the given index.
   */
  com.google.protobuf.ByteString getWaitForBytes(int index);

  /**
   *
   *
   * <pre>
   * Entrypoint to be used instead of the build step image's default entrypoint.
   * If unset, the image's default entrypoint is used.
   * </pre>
   *
   * <code>string entrypoint = 7;</code>
   *
   * @return The entrypoint.
   */
  java.lang.String getEntrypoint();
  /**
   *
   *
   * <pre>
   * Entrypoint to be used instead of the build step image's default entrypoint.
   * If unset, the image's default entrypoint is used.
   * </pre>
   *
   * <code>string entrypoint = 7;</code>
   *
   * @return The bytes for entrypoint.
   */
  com.google.protobuf.ByteString getEntrypointBytes();

  /**
   *
   *
   * <pre>
   * A list of environment variables which are encrypted using a Cloud Key
   * Management Service crypto key. These values must be specified in the
   * build's `Secret`.
   * </pre>
   *
   * <code>repeated string secret_env = 8;</code>
   *
   * @return A list containing the secretEnv.
   */
  java.util.List<java.lang.String> getSecretEnvList();
  /**
   *
   *
   * <pre>
   * A list of environment variables which are encrypted using a Cloud Key
   * Management Service crypto key. These values must be specified in the
   * build's `Secret`.
   * </pre>
   *
   * <code>repeated string secret_env = 8;</code>
   *
   * @return The count of secretEnv.
   */
  int getSecretEnvCount();
  /**
   *
   *
   * <pre>
   * A list of environment variables which are encrypted using a Cloud Key
   * Management Service crypto key. These values must be specified in the
   * build's `Secret`.
   * </pre>
   *
   * <code>repeated string secret_env = 8;</code>
   *
   * @param index The index of the element to return.
   * @return The secretEnv at the given index.
   */
  java.lang.String getSecretEnv(int index);
  /**
   *
   *
   * <pre>
   * A list of environment variables which are encrypted using a Cloud Key
   * Management Service crypto key. These values must be specified in the
   * build's `Secret`.
   * </pre>
   *
   * <code>repeated string secret_env = 8;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the secretEnv at the given index.
   */
  com.google.protobuf.ByteString getSecretEnvBytes(int index);

  /**
   *
   *
   * <pre>
   * List of volumes to mount into the build step.
   *
   * Each volume is created as an empty volume prior to execution of the
   * build step. Upon completion of the build, volumes and their contents are
   * discarded.
   *
   * Using a named volume in only one step is not valid as it is indicative
   * of a build request with an incorrect configuration.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Volume volumes = 9;</code>
   */
  java.util.List<com.google.cloudbuild.v1.Volume> getVolumesList();
  /**
   *
   *
   * <pre>
   * List of volumes to mount into the build step.
   *
   * Each volume is created as an empty volume prior to execution of the
   * build step. Upon completion of the build, volumes and their contents are
   * discarded.
   *
   * Using a named volume in only one step is not valid as it is indicative
   * of a build request with an incorrect configuration.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Volume volumes = 9;</code>
   */
  com.google.cloudbuild.v1.Volume getVolumes(int index);
  /**
   *
   *
   * <pre>
   * List of volumes to mount into the build step.
   *
   * Each volume is created as an empty volume prior to execution of the
   * build step. Upon completion of the build, volumes and their contents are
   * discarded.
   *
   * Using a named volume in only one step is not valid as it is indicative
   * of a build request with an incorrect configuration.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Volume volumes = 9;</code>
   */
  int getVolumesCount();
  /**
   *
   *
   * <pre>
   * List of volumes to mount into the build step.
   *
   * Each volume is created as an empty volume prior to execution of the
   * build step. Upon completion of the build, volumes and their contents are
   * discarded.
   *
   * Using a named volume in only one step is not valid as it is indicative
   * of a build request with an incorrect configuration.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Volume volumes = 9;</code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.VolumeOrBuilder> getVolumesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of volumes to mount into the build step.
   *
   * Each volume is created as an empty volume prior to execution of the
   * build step. Upon completion of the build, volumes and their contents are
   * discarded.
   *
   * Using a named volume in only one step is not valid as it is indicative
   * of a build request with an incorrect configuration.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Volume volumes = 9;</code>
   */
  com.google.cloudbuild.v1.VolumeOrBuilder getVolumesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for executing this build step.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan timing = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the timing field is set.
   */
  boolean hasTiming();
  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for executing this build step.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan timing = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The timing.
   */
  com.google.cloudbuild.v1.TimeSpan getTiming();
  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for executing this build step.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan timing = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloudbuild.v1.TimeSpanOrBuilder getTimingOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for pulling this build step's
   * builder image only.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan pull_timing = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the pullTiming field is set.
   */
  boolean hasPullTiming();
  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for pulling this build step's
   * builder image only.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan pull_timing = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The pullTiming.
   */
  com.google.cloudbuild.v1.TimeSpan getPullTiming();
  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for pulling this build step's
   * builder image only.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan pull_timing = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloudbuild.v1.TimeSpanOrBuilder getPullTimingOrBuilder();

  /**
   *
   *
   * <pre>
   * Time limit for executing this build step. If not defined, the step has no
   * time limit and will be allowed to continue to run until either it completes
   * or the build itself times out.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 11;</code>
   *
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   *
   *
   * <pre>
   * Time limit for executing this build step. If not defined, the step has no
   * time limit and will be allowed to continue to run until either it completes
   * or the build itself times out.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 11;</code>
   *
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();
  /**
   *
   *
   * <pre>
   * Time limit for executing this build step. If not defined, the step has no
   * time limit and will be allowed to continue to run until either it completes
   * or the build itself times out.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 11;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Status of the build step. At this time, build step status is
   * only updated on build completion; step status is not updated in real-time
   * as the build progresses.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.Build.Status status = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * Output only. Status of the build step. At this time, build step status is
   * only updated on build completion; step status is not updated in real-time
   * as the build progresses.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.Build.Status status = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The status.
   */
  com.google.cloudbuild.v1.Build.Status getStatus();

  /**
   *
   *
   * <pre>
   * Allow this build step to fail without failing the entire build.
   *
   * If false, the entire build will fail if this step fails. Otherwise, the
   * build will succeed, but this step will still have a failure status.
   * Error information will be reported in the failure_detail field.
   * </pre>
   *
   * <code>bool allow_failure = 14;</code>
   *
   * @return The allowFailure.
   */
  boolean getAllowFailure();

  /**
   *
   *
   * <pre>
   * Output only. Return code from running the step.
   * </pre>
   *
   * <code>int32 exit_code = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The exitCode.
   */
  int getExitCode();

  /**
   *
   *
   * <pre>
   * Allow this build step to fail without failing the entire build if and
   * only if the exit code is one of the specified codes. If allow_failure
   * is also specified, this field will take precedence.
   * </pre>
   *
   * <code>repeated int32 allow_exit_codes = 18;</code>
   *
   * @return A list containing the allowExitCodes.
   */
  java.util.List<java.lang.Integer> getAllowExitCodesList();
  /**
   *
   *
   * <pre>
   * Allow this build step to fail without failing the entire build if and
   * only if the exit code is one of the specified codes. If allow_failure
   * is also specified, this field will take precedence.
   * </pre>
   *
   * <code>repeated int32 allow_exit_codes = 18;</code>
   *
   * @return The count of allowExitCodes.
   */
  int getAllowExitCodesCount();
  /**
   *
   *
   * <pre>
   * Allow this build step to fail without failing the entire build if and
   * only if the exit code is one of the specified codes. If allow_failure
   * is also specified, this field will take precedence.
   * </pre>
   *
   * <code>repeated int32 allow_exit_codes = 18;</code>
   *
   * @param index The index of the element to return.
   * @return The allowExitCodes at the given index.
   */
  int getAllowExitCodes(int index);

  /**
   *
   *
   * <pre>
   * A shell script to be executed in the step.
   *
   * When script is provided, the user cannot specify the entrypoint or args.
   * </pre>
   *
   * <code>string script = 19;</code>
   *
   * @return The script.
   */
  java.lang.String getScript();
  /**
   *
   *
   * <pre>
   * A shell script to be executed in the step.
   *
   * When script is provided, the user cannot specify the entrypoint or args.
   * </pre>
   *
   * <code>string script = 19;</code>
   *
   * @return The bytes for script.
   */
  com.google.protobuf.ByteString getScriptBytes();

  /**
   *
   *
   * <pre>
   * Option to include built-in and custom substitutions as env variables
   * for this build step. This option will override the global option
   * in BuildOption.
   * </pre>
   *
   * <code>optional bool automap_substitutions = 20;</code>
   *
   * @return Whether the automapSubstitutions field is set.
   */
  boolean hasAutomapSubstitutions();
  /**
   *
   *
   * <pre>
   * Option to include built-in and custom substitutions as env variables
   * for this build step. This option will override the global option
   * in BuildOption.
   * </pre>
   *
   * <code>optional bool automap_substitutions = 20;</code>
   *
   * @return The automapSubstitutions.
   */
  boolean getAutomapSubstitutions();
}
