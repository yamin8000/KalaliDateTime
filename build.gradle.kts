import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
}

group = "io.github.yamin8000"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {

}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}