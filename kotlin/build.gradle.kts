repositories {
    mavenCentral()
    jcenter()
}

plugins {
    kotlin("jvm") version Versions.kotlin
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.google.guava:guava:27.1-jre")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:${Versions.junit}")
    testImplementation("org.junit.jupiter:junit-jupiter-params:${Versions.junit}")
    testImplementation("org.mockito:mockito-core:${Versions.mockito}")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
        kotlinOptions.freeCompilerArgs += listOf(
                "-Xuse-experimental=kotlin.Experimental",
                "-Xuse-experimental=io.ktor.util.KtorExperimentalAPI",
                "-Xuse-experimental=kotlinx.coroutines.ObsoleteCoroutinesApi",
                "-Xuse-experimental=kotlinx.coroutines.ExperimentalCoroutinesApi"
        )
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
        kotlinOptions.freeCompilerArgs += listOf(
                "-Xuse-experimental=kotlin.Experimental",
                "-Xuse-experimental=io.ktor.util.KtorExperimentalAPI",
                "-Xuse-experimental=kotlinx.coroutines.ObsoleteCoroutinesApi"
        )
    }

    named<Test>("test") {
        useJUnitPlatform()
    }
}
