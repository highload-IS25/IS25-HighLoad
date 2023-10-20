plugins {
    java
    id("org.springframework.boot") version "3.1.4"
    id("io.spring.dependency-management") version "1.1.3"
}
group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    compileOnly("org.projectlombok:lombok")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    developmentOnly("org.springframework.boot:spring-boot-docker-compose")
    annotationProcessor("org.projectlombok:lombok")
    implementation ("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation ("jakarta.persistence:jakarta.persistence-api:3.1.0")
    implementation("org.postgresql:postgresql:42.6.0")
    implementation("jakarta.annotation:jakarta.annotation-api:2.1.1")
    implementation("javax.xml.bind:jaxb-api:2.3.0")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.1.1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
