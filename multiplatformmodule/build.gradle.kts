plugins {
    kotlin("multiplatform")
    id("java-library")
}

repositories {
    jcenter()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
}

kotlin {

    jvm()
    ios()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }
    }


}