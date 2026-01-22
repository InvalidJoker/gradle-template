plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    alias(libs.plugins.shadow)
}

dependencies {
    implementation(project(":shared"))
}