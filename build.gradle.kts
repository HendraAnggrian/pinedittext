buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(android())
        classpath(kotlin("gradle-plugin", VERSION_KOTLIN))
        classpath(bintray())
        classpath(bintrayRelease())
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks {
    "clean"(Delete::class) {
        delete(buildDir)
    }
    "wrapper"(Wrapper::class) {
        gradleVersion = VERSION_GRADLE
    }
}
