import org.jetbrains.kotlin.gradle.dsl.JvmDefaultMode
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Version
val targetJavaVersion: String = project.property("targetJavaVersion").toString()

plugins {
    java
    idea

    kotlin("jvm") version(libs.versions.kotlin.get())
    kotlin("plugin.lombok") version(libs.versions.kotlin.get())
    kotlin("kapt") version(libs.versions.kotlin.get())
    kotlin("plugin.serialization") version(libs.versions.kotlin.get()) apply false
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "idea")
    apply(plugin = "kotlin")
    apply(plugin = "kotlin-lombok")

    version = rootProject.version

    dependencies {
        implementation(kotlin("stdlib-jdk8"))
        implementation(rootProject.libs.kotlinx.coroutines)
        implementation(rootProject.libs.kotlinx.coroutines.jdk8)
        implementation(rootProject.libs.kotlinx.json)

        compileOnly(rootProject.libs.guava)
        compileOnly(rootProject.libs.gson)
        compileOnly(rootProject.libs.fastutil)

        api(rootProject.libs.annotations)
        api(rootProject.libs.lombok)

        annotationProcessor(rootProject.libs.lombok)

        testImplementation(kotlin("test"))
        testImplementation(rootProject.libs.guava)
        testImplementation(rootProject.libs.gson)
        testImplementation(rootProject.libs.fastutil)
    }

    tasks.test {
        useJUnitPlatform()
        testLogging {
            events("passed", "skipped", "failed")
        }
        failOnNoDiscoveredTests = false
    }

    tasks {
        java.toolchain.languageVersion.set(JavaLanguageVersion.of(targetJavaVersion))

        compileJava {
            options.encoding = Charsets.UTF_8.name()
        }

        javadoc {
            options.encoding = Charsets.UTF_8.name()
        }

        processResources {
            filteringCharset = Charsets.UTF_8.name()
        }
    }

    tasks.withType<KotlinCompile>().configureEach {
        compilerOptions {
            jvmDefault.set(JvmDefaultMode.ENABLE)
        }
    }
}

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()

        maven("https://repo.plasmoverse.com/snapshots")
        maven("https://repo.plasmoverse.com/releases")
        maven("https://maven.fabricmc.net/")
        maven("https://maven.shedaniel.me/")
        maven("https://maven.nucleoid.xyz/")

        maven("https://repo.maven.apache.org/maven2/") {
            name = "MavenCentralLWJGL"
            content { includeGroup("org.lwjgl") }
        }

        exclusiveContent {
            forRepository {
                maven("https://api.modrinth.com/maven")
            }
            filter {
                includeGroup("maven.modrinth")
            }
        }
    }
}

tasks {
    jar {
        enabled = false
    }
}

kapt {
    keepJavacAnnotationProcessors = true
}
