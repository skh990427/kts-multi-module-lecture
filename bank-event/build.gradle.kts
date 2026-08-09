dependencies {
    implementation(project(":bank-domain"))

    // slf4j
    implementation("ch.qos.logback:logback-classic:1.4.14")
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.retry:spring-retry")
}