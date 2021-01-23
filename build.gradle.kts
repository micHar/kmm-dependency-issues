plugins {
    kotlin("jvm") version "1.4.30-RC"
}
buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.21")
        classpath("com.android.tools.build:gradle:4.1.1")
        classpath("de.mannodermaus.gradle.plugins:android-junit5:1.7.0.0")
    }
}

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
}