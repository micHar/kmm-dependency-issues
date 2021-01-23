plugins {
    kotlin("jvm")
    id("java-library")
}

repositories {
    jcenter()
}

dependencies {

    implementation(project(":multiplatformmodule"))

    testImplementation(kotlin("test-junit"))
//    implementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
//    runtimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")

}