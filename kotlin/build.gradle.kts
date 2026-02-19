repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm") version Versions.kotlin
    id("org.jlleitschuh.gradle.ktlint") version Versions.ktlint
}

kotlin {
    jvmToolchain(Versions.java)
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.google.guava:guava:${Versions.guava}")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:${Versions.junit}")
    testImplementation("org.junit.jupiter:junit-jupiter-params:${Versions.junit}")
    testImplementation("org.mockito:mockito-core:${Versions.mockito}")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:${Versions.junitPlatformLauncher}")
}

tasks {
    named<Test>("test") {
        useJUnitPlatform()
    }
}
