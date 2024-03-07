plugins {
//    id("java")
    java
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation(fileTree("libs") { include("*.jar") })
}

application {
    mainClass.set("us.msu.cse.repair.Main")
}

configurations.all {
    resolutionStrategy {
        force("org.eclipse.platform:org.eclipse.core.runtime:3.13.0")
        force("org.eclipse.core:org.eclipse.core.resources:3.9.1.v20140825-1431")

    }
}

tasks.test {
    useJUnitPlatform()
}
