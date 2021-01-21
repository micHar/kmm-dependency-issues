# KMM - jvm depending on multiplatform issues

A minimum example of a dependency issue when accessing multiplatform classes from a jvm module (especially in tests)

Structure
- `multiplatformmodule` - contains a single kotlin class `SomeMultiPlatformClass`  
- `jvmmodule` - a pure jvm module which depends on `multiplatformmodule`

## Issue 
The problem is that within the `jvmmodule` I can't access `SomeMultiPlatformClass` when running `SomeJvmTest`.
I get `java.lang.NoClassDefFoundError: com/example/multiplatform/multiplatformmodule/SomeMultiPlatformClass`.
IDE (Anroid Studio) also marks this class as unresolved.

![alt text](https://raw.githubusercontent.com/micHar/kmm-dependency-issues/master/screenshot.png)

# Additional notes

It builds fine if imported from another multiplatform module (not part of this example), e.g. like this
```kotlin

//build.gradle.kts of some multiplatform module 

...

kotlin {

    jvm()
    ios()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":multiplatformmodule"))
            }
        }
    }

}
```

**Real life**  
In real code I have a jvm-only module which is an annotation processor that depends on a multiplatform module and generates code for a multplatform project.
It's a PITA to code because of lack of IDE support, but the real problem is that I can't write tests for it because of this issue.

