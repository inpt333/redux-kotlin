import util.jvmCommonTest

plugins {
    id("convention.library-mpp-all")
    id("convention.publishing-mpp")
}

android {
    namespace = "org.reduxkotlin"
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
