group = "$group.server"

dependencies {
    api(project(":api:server"))
    api(project(":server-proxy-common"))

    implementation(libs.mcdsl.brigadier)

    compileOnly(libs.netty)

    testImplementation(libs.mockito)
    testImplementation(libs.netty)
}