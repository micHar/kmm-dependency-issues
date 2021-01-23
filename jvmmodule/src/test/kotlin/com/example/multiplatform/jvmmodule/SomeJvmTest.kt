package com.example.multiplatform.jvmmodule

import kotlin.test.Test
import kotlin.test.assertTrue

class SomeJvmTest {

    @Test
    fun someTest() {
        /*
        java.lang.NoClassDefFoundError: com/example/multiplatform/multiplatformmodule/SomeMultiPlatformClass
         */
        val jvmClass = SomeJvmClass()
    }

}