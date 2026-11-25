subprojects {
    group = "$group.api"

    dependencies {
        api("com.google.guava:guava") { version { prefer(rootProject.libs.versions.guava.get()) } }
        api("com.google.code.gson:gson") { version { prefer(rootProject.libs.versions.gson.get()) } }
        api(rootProject.libs.config)
        api(project(":protocol"))
    }
}

tasks.jar {
    enabled = false
}