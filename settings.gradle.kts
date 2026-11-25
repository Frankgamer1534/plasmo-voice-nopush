pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.fabricmc.net/")
        maven("https://repo.plasmoverse.com/releases")
        maven("https://repo.plasmoverse.com/snapshots")
        maven("https://jitpack.io/")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "PlasmoVoice"

include("protocol")

include("api:common")
include("api:client")
include("api:server")
include("api:server-proxy-common")

include("common")
include("server-proxy-common")
include("server:common")
include("macos:protocol")

include("client")
