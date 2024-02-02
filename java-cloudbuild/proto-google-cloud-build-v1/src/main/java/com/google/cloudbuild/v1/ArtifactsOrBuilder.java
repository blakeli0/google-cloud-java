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

public interface ArtifactsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.Artifacts)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of images to be pushed upon the successful completion of all build
   * steps.
   *
   * The images will be pushed using the builder service account's credentials.
   *
   * The digests of the pushed images will be stored in the Build resource's
   * results field.
   *
   * If any of the images fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated string images = 1;</code>
   *
   * @return A list containing the images.
   */
  java.util.List<java.lang.String> getImagesList();
  /**
   *
   *
   * <pre>
   * A list of images to be pushed upon the successful completion of all build
   * steps.
   *
   * The images will be pushed using the builder service account's credentials.
   *
   * The digests of the pushed images will be stored in the Build resource's
   * results field.
   *
   * If any of the images fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated string images = 1;</code>
   *
   * @return The count of images.
   */
  int getImagesCount();
  /**
   *
   *
   * <pre>
   * A list of images to be pushed upon the successful completion of all build
   * steps.
   *
   * The images will be pushed using the builder service account's credentials.
   *
   * The digests of the pushed images will be stored in the Build resource's
   * results field.
   *
   * If any of the images fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated string images = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The images at the given index.
   */
  java.lang.String getImages(int index);
  /**
   *
   *
   * <pre>
   * A list of images to be pushed upon the successful completion of all build
   * steps.
   *
   * The images will be pushed using the builder service account's credentials.
   *
   * The digests of the pushed images will be stored in the Build resource's
   * results field.
   *
   * If any of the images fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated string images = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the images at the given index.
   */
  com.google.protobuf.ByteString getImagesBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of objects to be uploaded to Cloud Storage upon successful
   * completion of all build steps.
   *
   * Files in the workspace matching specified paths globs will be uploaded to
   * the specified Cloud Storage location using the builder service account's
   * credentials.
   *
   * The location and generation of the uploaded objects will be stored in the
   * Build resource's results field.
   *
   * If any objects fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Artifacts.ArtifactObjects objects = 2;</code>
   *
   * @return Whether the objects field is set.
   */
  boolean hasObjects();
  /**
   *
   *
   * <pre>
   * A list of objects to be uploaded to Cloud Storage upon successful
   * completion of all build steps.
   *
   * Files in the workspace matching specified paths globs will be uploaded to
   * the specified Cloud Storage location using the builder service account's
   * credentials.
   *
   * The location and generation of the uploaded objects will be stored in the
   * Build resource's results field.
   *
   * If any objects fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Artifacts.ArtifactObjects objects = 2;</code>
   *
   * @return The objects.
   */
  com.google.cloudbuild.v1.Artifacts.ArtifactObjects getObjects();
  /**
   *
   *
   * <pre>
   * A list of objects to be uploaded to Cloud Storage upon successful
   * completion of all build steps.
   *
   * Files in the workspace matching specified paths globs will be uploaded to
   * the specified Cloud Storage location using the builder service account's
   * credentials.
   *
   * The location and generation of the uploaded objects will be stored in the
   * Build resource's results field.
   *
   * If any objects fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Artifacts.ArtifactObjects objects = 2;</code>
   */
  com.google.cloudbuild.v1.Artifacts.ArtifactObjectsOrBuilder getObjectsOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of Maven artifacts to be uploaded to Artifact Registry upon
   * successful completion of all build steps.
   *
   * Artifacts in the workspace matching specified paths globs will be uploaded
   * to the specified Artifact Registry repository using the builder service
   * account's credentials.
   *
   * If any artifacts fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Artifacts.MavenArtifact maven_artifacts = 3;
   * </code>
   */
  java.util.List<com.google.cloudbuild.v1.Artifacts.MavenArtifact> getMavenArtifactsList();
  /**
   *
   *
   * <pre>
   * A list of Maven artifacts to be uploaded to Artifact Registry upon
   * successful completion of all build steps.
   *
   * Artifacts in the workspace matching specified paths globs will be uploaded
   * to the specified Artifact Registry repository using the builder service
   * account's credentials.
   *
   * If any artifacts fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Artifacts.MavenArtifact maven_artifacts = 3;
   * </code>
   */
  com.google.cloudbuild.v1.Artifacts.MavenArtifact getMavenArtifacts(int index);
  /**
   *
   *
   * <pre>
   * A list of Maven artifacts to be uploaded to Artifact Registry upon
   * successful completion of all build steps.
   *
   * Artifacts in the workspace matching specified paths globs will be uploaded
   * to the specified Artifact Registry repository using the builder service
   * account's credentials.
   *
   * If any artifacts fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Artifacts.MavenArtifact maven_artifacts = 3;
   * </code>
   */
  int getMavenArtifactsCount();
  /**
   *
   *
   * <pre>
   * A list of Maven artifacts to be uploaded to Artifact Registry upon
   * successful completion of all build steps.
   *
   * Artifacts in the workspace matching specified paths globs will be uploaded
   * to the specified Artifact Registry repository using the builder service
   * account's credentials.
   *
   * If any artifacts fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Artifacts.MavenArtifact maven_artifacts = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.Artifacts.MavenArtifactOrBuilder>
      getMavenArtifactsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of Maven artifacts to be uploaded to Artifact Registry upon
   * successful completion of all build steps.
   *
   * Artifacts in the workspace matching specified paths globs will be uploaded
   * to the specified Artifact Registry repository using the builder service
   * account's credentials.
   *
   * If any artifacts fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Artifacts.MavenArtifact maven_artifacts = 3;
   * </code>
   */
  com.google.cloudbuild.v1.Artifacts.MavenArtifactOrBuilder getMavenArtifactsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A list of Python packages to be uploaded to Artifact Registry upon
   * successful completion of all build steps.
   *
   * The build service account credentials will be used to perform the upload.
   *
   * If any objects fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Artifacts.PythonPackage python_packages = 5;
   * </code>
   */
  java.util.List<com.google.cloudbuild.v1.Artifacts.PythonPackage> getPythonPackagesList();
  /**
   *
   *
   * <pre>
   * A list of Python packages to be uploaded to Artifact Registry upon
   * successful completion of all build steps.
   *
   * The build service account credentials will be used to perform the upload.
   *
   * If any objects fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Artifacts.PythonPackage python_packages = 5;
   * </code>
   */
  com.google.cloudbuild.v1.Artifacts.PythonPackage getPythonPackages(int index);
  /**
   *
   *
   * <pre>
   * A list of Python packages to be uploaded to Artifact Registry upon
   * successful completion of all build steps.
   *
   * The build service account credentials will be used to perform the upload.
   *
   * If any objects fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Artifacts.PythonPackage python_packages = 5;
   * </code>
   */
  int getPythonPackagesCount();
  /**
   *
   *
   * <pre>
   * A list of Python packages to be uploaded to Artifact Registry upon
   * successful completion of all build steps.
   *
   * The build service account credentials will be used to perform the upload.
   *
   * If any objects fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Artifacts.PythonPackage python_packages = 5;
   * </code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.Artifacts.PythonPackageOrBuilder>
      getPythonPackagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of Python packages to be uploaded to Artifact Registry upon
   * successful completion of all build steps.
   *
   * The build service account credentials will be used to perform the upload.
   *
   * If any objects fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Artifacts.PythonPackage python_packages = 5;
   * </code>
   */
  com.google.cloudbuild.v1.Artifacts.PythonPackageOrBuilder getPythonPackagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A list of npm packages to be uploaded to Artifact Registry upon
   * successful completion of all build steps.
   *
   * Npm packages in the specified paths will be uploaded
   * to the specified Artifact Registry repository using the builder service
   * account's credentials.
   *
   * If any packages fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Artifacts.NpmPackage npm_packages = 6;</code>
   */
  java.util.List<com.google.cloudbuild.v1.Artifacts.NpmPackage> getNpmPackagesList();
  /**
   *
   *
   * <pre>
   * A list of npm packages to be uploaded to Artifact Registry upon
   * successful completion of all build steps.
   *
   * Npm packages in the specified paths will be uploaded
   * to the specified Artifact Registry repository using the builder service
   * account's credentials.
   *
   * If any packages fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Artifacts.NpmPackage npm_packages = 6;</code>
   */
  com.google.cloudbuild.v1.Artifacts.NpmPackage getNpmPackages(int index);
  /**
   *
   *
   * <pre>
   * A list of npm packages to be uploaded to Artifact Registry upon
   * successful completion of all build steps.
   *
   * Npm packages in the specified paths will be uploaded
   * to the specified Artifact Registry repository using the builder service
   * account's credentials.
   *
   * If any packages fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Artifacts.NpmPackage npm_packages = 6;</code>
   */
  int getNpmPackagesCount();
  /**
   *
   *
   * <pre>
   * A list of npm packages to be uploaded to Artifact Registry upon
   * successful completion of all build steps.
   *
   * Npm packages in the specified paths will be uploaded
   * to the specified Artifact Registry repository using the builder service
   * account's credentials.
   *
   * If any packages fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Artifacts.NpmPackage npm_packages = 6;</code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.Artifacts.NpmPackageOrBuilder>
      getNpmPackagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of npm packages to be uploaded to Artifact Registry upon
   * successful completion of all build steps.
   *
   * Npm packages in the specified paths will be uploaded
   * to the specified Artifact Registry repository using the builder service
   * account's credentials.
   *
   * If any packages fail to be pushed, the build is marked FAILURE.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Artifacts.NpmPackage npm_packages = 6;</code>
   */
  com.google.cloudbuild.v1.Artifacts.NpmPackageOrBuilder getNpmPackagesOrBuilder(int index);
}
