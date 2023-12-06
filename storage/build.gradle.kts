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
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    implementation ("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("javax.xml.bind:jaxb-api:2.3.0")
    implementation("org.iq80.leveldb:leveldb:0.12")
    implementation("org.springframework.boot:spring-boot-starter-data-redis:3.1.5")
    implementation("redis.clients:jedis:5.0.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
