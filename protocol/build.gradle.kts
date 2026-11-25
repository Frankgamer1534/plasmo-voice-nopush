dependencies {
    api("it.unimi.dsi:fastutil") { version { prefer(libs.versions.fastutil.get()) } }

    implementation("su.plo.slib:api-common:${libs.versions.slib.get()}")
}