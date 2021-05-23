# Kotlin Commons Library

[![Build](https://github.com/opengoodio/kotlin-commons/workflows/build/badge.svg)](https://github.com/opengoodio/kotlin-commons/actions?query=workflow%3Abuild)
[![Release](https://github.com/opengoodio/kotlin-commons/workflows/release/badge.svg)](https://github.com/opengoodio/kotlin-commons/actions?query=workflow%3Arelease)
[![Codecov](https://codecov.io/gh/opengoodio/kotlin-commons/branch/main/graph/badge.svg?token=AEEYTGK87F)](https://codecov.io/gh/opengoodio/kotlin-commons)
[![Release Version](https://img.shields.io/github/release/opengoodio/kotlin-commons.svg)](https://github.com/opengoodio/kotlin-commons/releases/latest)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/opengoodio/kotlin-commons/master/LICENSE)
[![FOSSA](https://app.fossa.com/api/projects/custom%2B22161%2Fgithub.com%2Fopengoodio%2Fkotlin-commons.svg?type=small)](https://app.fossa.com/projects/custom%2B22161%2Fgithub.com%2Fopengoodio%2Fkotlin-commons?ref=badge_small)

Commons library containing reusable functions, extensions, and objects
for Kotlin

## Setup

### Add Dependency

#### Gradle

```groovy
implementation("io.opengood.commons:kotlin-commons:VERSION")
```

#### Maven

```xml
<dependency>
    <groupId>io.opengood.commons</groupId>
    <artifactId>kotlin-commons</artifactId>
    <version>VERSION</version>
</dependency>
```

**Note:** See *Release* version badge above for latest version.

# Features

### Annotations

#### NoArg

* Automatically generate a no argument constructor on a data class:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.annotation.NoArg
    
    @NoArg
    data class Greeting(
        val name: String
    )
    ```

    `build.gradle.kts`

    ```kotlin
    noArg {
        annotation("io.opengood.commons.kotlin.annotation.NoArg")
        invokeInitializers = true
    }
    ```

### Extensions

#### Methods

##### Array

###### printAll

* Print all arguments in an array:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.printAll
    
    arrayOf("foo", "bar").printAll()
    ```

##### List

###### containsIgnoreCase

* Case-insensitive string contained in list:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.containsIgnoreCase
    
    listOf("foo", "bar").containsIgnoreCase("foo")
    ```

##### Map

###### containsMultipleListItems

* Map entry contains more than one value in list:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.containsMultipleListItems
    
    mapOf("foo" to listOf("bar", "baz")).containsMultipleListItems("foo")
    ```

###### notContainsKey

* Key not contained in map:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.notContainsKey
    
    emptyMap<String, String>().notContainsKey("foo")
    ```

###### notContainsValue

* Value not contained in map:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.notContainsValue
    
    emptyMap<String, String>().notContainsValue("foo")
    ```

###### putIfNotAbsent

* Puts an entry into a map if it does not exist:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.putIfNotAbsent
    import io.opengood.commons.kotlin.function.makeEntry
    
    val map = mutableMapOf<String, String>()
    val entry = makeEntry("foo", "bar")
    map.putIfNotAbsent(entry)
    ```

##### Pair

###### toEntry

* Convert `Pair` to map entry:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.toEntry
    
    Pair("foo", "bar").toEntry()
    ```

##### String

###### capitalizeWords

* Capitalize all words in a string:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.capitalizeWords
    
    "hello world!".capitalizeWords()
    ```

###### containsIgnoreCase

* Case-insensitive substring contained in string:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.containsIgnoreCase
    
    "Hello World!".containsIgnoreCase("HELLO")
    ```

###### equalsIgnoreCase

* Case-insensitive string equals substring:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.equalsIgnoreCase
    
    "Hello World!".equalsIgnoreCase("HELLO WORLD!")
    ```

###### isBoolean

* Value indicating if string is boolean:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.isBoolean
    
    "true".isBoolean()
    ```

###### isInt

* Value indicating if string is integer:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.isInt
    
    "12345".isInt()
    ```

###### toIntOrZero

* Value indicating if string is integer, if so then value as integer,
and if not, then value is zero:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.toIntOrZero
    
    "12345".toIntOrZero()
    ```

