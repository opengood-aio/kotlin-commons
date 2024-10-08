# Kotlin Commons Library

[![Build](https://github.com/opengood-aio/kotlin-commons/workflows/build/badge.svg)](https://github.com/opengood-aio/kotlin-commons/actions?query=workflow%3Abuild)
[![Release](https://github.com/opengood-aio/kotlin-commons/workflows/release/badge.svg)](https://github.com/opengood-aio/kotlin-commons/actions?query=workflow%3Arelease)
[![CodeQL](https://github.com/opengood-aio/kotlin-commons/actions/workflows/codeql.yml/badge.svg)](https://github.com/opengood-aio/kotlin-commons/actions/workflows/codeql.yml)
[![Codecov](https://codecov.io/gh/opengood-aio/kotlin-commons/branch/main/graph/badge.svg?token=AEEYTGK87F)](https://codecov.io/gh/opengood-aio/kotlin-commons)
[![Release Version](https://img.shields.io/github/release/opengood-aio/kotlin-commons.svg)](https://github.com/opengood-aio/kotlin-commons/releases/latest)
[![Maven Central](https://img.shields.io/maven-central/v/io.opengood.commons/kotlin-commons.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.opengood.commons%22%20AND%20a:%22kotlin-commons%22)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/opengood-aio/kotlin-commons/master/LICENSE)

Commons library containing reusable functions, extensions, and objects
for Kotlin

## Compatibility

* Java 21
* Spring Boot 3

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

## Features

### Annotations

#### NoArg

* Automatically generate no argument constructor on data class:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.annotation.NoArg
    
    @NoArg
    data class Greeting(
        val name: String
    )
    ```

    Add configuration to `build.gradle.kts`:

    ```kotlin
    noArg {
        annotation("io.opengood.commons.kotlin.annotation.NoArg")
        invokeInitializers = true
    }
    ```
  
---

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

---

##### BigDecimal

###### roundUp

* Rounds decimal value half up to specified scale:

  Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.roundUp
    
    BigDecimal(12.346).roundUp(2)
    ```

---

##### List

###### containsIgnoreCase

* Case-insensitive string contained in list:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.containsIgnoreCase
    
    listOf("foo", "bar").containsIgnoreCase("foo")
    ```

###### sortAscending

* Sorts list of map keys in ascending order:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.sortAscending
    
    val list = listOf(
        mapOf(
            "foo" to "bar",
            "baz" to "pas"
        ),
        mapOf(
            "foo" to "par",
            "baz" to "taz"
        )
    )

    list.sortAscending("baz")
    ```

###### sortDescending

* Sorts list of map keys in descending order:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.sortDescending
    
    val list = listOf(
        mapOf(
            "baz" to "pas",
            "foo" to "bar"
        ),
        mapOf(
            "baz" to "taz",
            "foo" to "par"
        )
    )

    list.sortDescending("baz")
    ```

---

##### Map

###### containsMultipleListItems

* Map entry contains more than one value in list:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.containsMultipleListItems
    
    mapOf("foo" to listOf("bar", "baz")).containsMultipleListItems("foo")
    ```

###### keyByIndex

* Gets map key by index

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.keyByIndex
    
    val map = mapOf("foo" to "bar")
    map.keyByIndex(0)
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

###### valueByIndex

* Gets map value by index

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.valueByIndex
    
    val map = mapOf("foo" to "bar")
    map.valueByIndex(0)
    ```

---

##### Pair

###### toEntry

* Convert `Pair` to map entry:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.toEntry
    
    Pair("foo", "bar").toEntry()
    ```

---

##### String

###### capitalizeWord

* Capitalize word in a string:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.capitalizeWord
    
    "hello".capitalizeWord()
    ```

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

###### isUuid

* Value indicating if string is UUIS:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.isUuid
    
    "12102e90-2918-4578-a9a1-bb16ac81d8f8".isUuid()
    ```

###### toIntOrZero

* Value indicating if string is integer, if so then value as integer,
and if not, then value is zero:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.extension.method.toIntOrZero
    
    "12345".toIntOrZero()
    ```

---

#### Properties

##### Decimal

| Property | Description           | Value         |
|----------|-----------------------|---------------|
| `zero`   | BigDecimal zero value | BigDecimal(0) |

Example:

```kotlin
import io.opengood.commons.kotlin.extension.property.*

Decimal.zero
```

---

##### String

| Property          | Description               | Value  |
|-------------------|---------------------------|--------|
| `carriageReturn`  | Carrier return            | `\r`   |
| `comma`           | Comma                     | `,`    |
| `crlf`            | Carriage return/line feed | `\n\r` |
| `empty`           | Empty string              |        |
| `equalsSign`      | Equals sign               | `=`    |
| `greaterThanSign` | Greater than sign         | `>`    |
| `lessThanSign`    | Less than sign            | `<`    |
| `newline`         | Newline                   | `\n`   |
| `pipe`            | Pipe                      | `\     |
| `tab`             | Tab                       | `\t`   |
| `whitespace`      | Whitespace                |        |

Example:

```kotlin
import io.opengood.commons.kotlin.extension.property.*

String.carriageReturn
String.comma
String.crlf
String.empty
String.equalsSign
String.greaterThanSign
String.lessThanSign
String.newline
String.pipe
String.tab
String.whitespace
```

---

##### UUID

| Property | Description | Value        |
|----------|-------------|--------------|
| `empty`  | Empty UUID  | UUID(0L, 0L) |

Example:

```kotlin
import io.opengood.commons.kotlin.extension.property.*

Uuid.empty
```

---

### Functions

#### I/O

##### captureStdOut

* Captures standard output of specified function:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.function.captureStdOut
    
    val output = captureStdOut { print("foo") }
    ```

---

#### Map

##### makeEntry

* Creates a map entry using specified key and value:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.function.makeEntry
    
    makeEntry("foo", "bar")
    ```
  
---

### Infix Functions

#### Boolean

##### then

* Shorthand ternary function for evaluating simple conditions then
returning simple results:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.infix.then
    
    val condition = 1
    val result = (condition == 1) then { true } ?: false
    ```

---

#### Generic Type

##### firstOrDefault

* Gets value of specified object, if not null, otherwise, gets specified
default value:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.infix.firstOrDefault
    
    "foo" firstOrDefault "bar"
    ```

---

#### Integer

##### isDivFactorOf

* Gets value indicating if specified integer is divisible by a factor
of specified value:

    Example:

    ```kotlin
    import io.opengood.commons.kotlin.infix.isDivFactorOf
    
    10 isDivFactorOf 5
    ```
