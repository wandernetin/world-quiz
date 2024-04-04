plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.4")
    implementation("org.springframework:spring-web:6.1.5")
    implementation("org.springframework.data:spring-data-jpa:3.2.4")
    implementation ("javax.persistence:javax.persistence-api:2.2")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}