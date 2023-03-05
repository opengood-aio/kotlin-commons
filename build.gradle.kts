plugins {
    id("io.opengood.gradle.config")
}

group = "io.opengood.commons"

opengood {
    features {
        spring = false
    }
    artifact {
        description = "Commons library containing reusable functions, extensions, and objects for Kotlin"
    }
}
