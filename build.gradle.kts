import io.opengood.gradle.enumeration.ProjectType

plugins {
    id("io.opengood.gradle.config")
}

group = "io.opengood.commons"

opengood {
    main {
        projectType = ProjectType.LIB
    }
    features {
        spring = false
    }
    artifact {
        description = "Commons library containing reusable functions, extensions, and objects for Kotlin"
    }
}
