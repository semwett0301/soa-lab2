plugins {
    java
    id("org.springframework.boot") version "2.7.15"
}

apply(plugin = "org.springframework.boot")
apply(plugin = "io.spring.dependency-management")

group = "ru.itmo"
version = "0.0.1"

java {
    sourceCompatibility = JavaVersion.VERSION_11
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

task("prepareKotlinBuildScriptModel"){}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-data-rest")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")

    implementation("org.modelmapper:modelmapper:2.4.5")
    implementation("org.mapstruct:mapstruct:1.5.5.Final")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml")

    implementation("org.hibernate:hibernate-core:5.6.14.Final")
    implementation("org.hibernate:hibernate-entitymanager:5.6.14.Final")
    implementation("org.hibernate.validator:hibernate-validator:6.1.6.Final")

    compileOnly("org.projectlombok:lombok")
    runtimeOnly("org.postgresql:postgresql")

    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.5.Final")
    annotationProcessor("org.projectlombok:lombok-mapstruct-binding:0.2.0")
    annotationProcessor("org.projectlombok:lombok")
}