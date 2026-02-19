repositories {
    mavenCentral()
}

plugins {
    id("java")
    checkstyle
}

checkstyle {
    toolVersion = "10.21.4"
    configFile = rootProject.file("config/checkstyle/checkstyle.xml")
}

dependencies {
    implementation("com.google.guava:guava:${Versions.guava}")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:${Versions.junit}")
    testImplementation("org.junit.jupiter:junit-jupiter-params:${Versions.junit}")
    testImplementation("org.mockito:mockito-core:${Versions.mockito}")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:${Versions.junitPlatformLauncher}")
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