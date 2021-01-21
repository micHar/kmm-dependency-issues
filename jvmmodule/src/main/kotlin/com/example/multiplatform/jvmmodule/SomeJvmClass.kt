package com.example.multiplatform.jvmmodule

import com.example.multiplatform.multiplatformmodule.*

class SomeJvmClass {

    /*
    This declaration:
    - is marked as unresolved in IDE
    - but builds just fine when built from another multiplatform module (when the dependency on implementation(project(":multiplatformmodule")) is in commonMain of multiplatform module
    - but cannot be built for tests (see SomeJvmTest.kt in this module)
     */
    private val multiClass = SomeMultiPlatformClass()

    fun multiClassPrint() = println(multiClass.whatever)

}