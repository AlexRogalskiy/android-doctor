/*
 * Copyright (C) 2020. Nuh Koca. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
    `java-gradle-plugin`
}

repositories {
    google()
    mavenCentral()
    maven("https://plugins.gradle.org/m2/")

    // Make this a caching provider
    jcenter()
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

object PluginVersions {
    const val gradle_plugin = "3.6.3"
    const val oss_licenses_plugin = "0.10.2"
    const val kotlin_gradle_plugin = "1.3.72"
    const val gradle_version_plugin = "0.28.0"
    const val safeArgs = "2.2.2"
    const val detekt = "1.8.0"
    const val ktlint = "9.2.1"
    const val spotless = "3.27.2"
    const val junit5 = "1.6.0.0"
}

dependencies {
    implementation("com.android.tools.build:gradle:${PluginVersions.gradle_plugin}")
    implementation("com.google.android.gms:oss-licenses-plugin:${PluginVersions.oss_licenses_plugin}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersions.kotlin_gradle_plugin}")
    implementation("org.jetbrains.kotlin:kotlin-serialization:${PluginVersions.kotlin_gradle_plugin}")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:${PluginVersions.safeArgs}")
    implementation("com.github.ben-manes:gradle-versions-plugin:${PluginVersions.gradle_version_plugin}")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${PluginVersions.detekt}")
    implementation("org.jlleitschuh.gradle:ktlint-gradle:${PluginVersions.ktlint}")
    implementation("com.diffplug.spotless:spotless-plugin-gradle:${PluginVersions.spotless}")
    implementation("de.mannodermaus.gradle.plugins:android-junit5:${PluginVersions.junit5}")
}
