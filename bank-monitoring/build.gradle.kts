plugins {
    kotlin("plugin.spring")
}
dependencies {
    implementation("org.springframework:spring-context")
    implementation("io.micrometer:micrometer-core")
    implementation(kotlin("stdlib"))
}
repositories {
    mavenCentral()
}