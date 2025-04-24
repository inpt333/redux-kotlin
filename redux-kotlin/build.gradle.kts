import util.jvmCommonTest

plugins {
    id("convention.library-mpp-all")
    id("convention.publishing-mpp")
}

android {
    namespace = "org.reduxkotlin"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

kotlin {
    sourceSets {
        jvmCommonTest {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:_")
            }
        }
    }
}
