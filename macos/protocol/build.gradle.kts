plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
}

group = "$group.mac"

dependencies {
    api(libs.kotlinx.msgpack)
    api(libs.kotlinx.io)
}