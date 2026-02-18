repositories {
    mavenCentral()
}

plugins {
    id("java")
}

dependencies {
    implementation("com.google.guava:guava:27.1-jre")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:${Versions.junit}")
    testImplementation("org.junit.jupiter:junit-jupiter-params:${Versions.junit}")
    testImplementation("org.mockito:mockito-core:${Versions.mockito}")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.6.2")
}

java {
    sourceCompatibility = JavaVersion.VERSION_25
    targetCompatibility = JavaVersion.VERSION_25
}

tasks {
    named<Test>("test") {
        useJUnitPlatform()
    }
}