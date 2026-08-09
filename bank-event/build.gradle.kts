dependencies {
    // slf4j
    implementation("ch.qos.logback:logback-classic:1.4.14")

    implementation(project(":bank-domain"))

    implementation("org.springframework.boot:spring-boot-starter")
}