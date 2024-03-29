# AndroidTemplate 🤖

[![Use this template](https://img.shields.io/badge/from-AndroidTemplate-brightgreen?logo=dropbox)](https://github.com/PearKMA/AndroidTemplate/generate) ![Pre Merge Checks](https://github.com/PearKMA/AndroidTemplate/workflows/Pre%20Merge%20Checks/badge.svg)  ![Language](https://img.shields.io/github/languages/top/PearKMA/AndroidTemplate?color=blue&logo=kotlin)

A simple Github template that lets you create an **Android/Kotlin** project and be up and running in
a **few seconds**.

This template is focused on delivering a project with **static analysis** and **continuous
integration** already in place.

## How to use 👣

Just click
on [![Use this template](https://img.shields.io/badge/-Use%20this%20template-brightgreen)](https://github.com/testarossa/AndroidTemplate/generate)
button to create a new repo starting from this template.

Once created don't forget to update the:

- [App ID](buildSrc/src/main/java/Coordinates.kt)
- AndroidManifest ([here](app/src/main/AndroidManifest.xml)
  and [here](library-android/src/main/AndroidManifest.xml))
- Package of the source files

## Features 🎨

- 3 Sample modules (Android app, Android library, Jetpack Compose Activity).
- Jetpack Compose setup ready to use.
- Sample Espresso, Instrumentation & JUnit tests.
- 100% Gradle Kotlin DSL setup.
- CI Setup with GitHub Actions.
- Dependency versions managed via `buildSrc`.

## Gradle Setup 🐘

This template is using [**Gradle Kotlin
DSL**](https://docs.gradle.org/current/userguide/kotlin_dsl.html) as well as
the [Plugin DSL](https://docs.gradle.org/current/userguide/plugins.html#sec:plugins_block) to setup
the build.

Dependencies are centralized inside the Gradle Version Catalog in
the [libs.versions.toml](gradle/libs.versions.toml) file in the `gradle` folder.

## CI ⚙️

This template is using [**GitHub Actions**](https://github.com/testarossa/AndroidTemplate/actions)
as CI. You don't need to setup any external service and you should have a running CI once you start
using this template.

There are currently the following workflows available:

- [Validate Gradle Wrapper](.github/workflows/gradle-wrapper-validation.yml) - Will check that the
  gradle wrapper has a valid checksum
- [Pre Merge Checks](.github/workflows/pre-merge.yaml) - Will run the `build`, `check`
  and `publishToMavenLocal` tasks.

## Project Structure

The project includes two sub-projects, each in their own subdirectories:

- **`app`:** The source for the final Android application.
- **`library-android`:** The source for an Android library including UI.
- **`library-compose`:** The source for a UI library with Jetpack Compose library.

The following additional top-level directories configure & support building the app & projects:

- **`buildSrc`:** Contains shared Gradle logic
  as [precompiled script plugins](https://docs.gradle.org/current/userguide/custom_plugins.html#sec:precompiled_plugins)
- **`config`:** Contains
  the [Detekt configuration file](https://detekt.dev/docs/introduction/configurations/).
- **`gradle`:** Contains Gradle Configuration files such as the Gradle Version Catalog and
  the [Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html).

Finally, the following hidden top-level directories provide functionality for specific development
systems:

- **`.github`:** Defines the [Github Actions](https://github.com/features/actions) CI tasks and
  templates for new pull requests, issues, etc.
- **`.idea`:** Sets common initial project settings when the project is opened
  in [Android Studio](https://developer.android.com/studio)
  or [IntelliJ IDEA](https://www.jetbrains.com/idea/).
