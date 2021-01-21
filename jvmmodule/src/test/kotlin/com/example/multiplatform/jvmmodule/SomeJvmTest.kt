package com.example.multiplatform.jvmmodule

import org.junit.jupiter.api.Test

class SomeJvmTest {

    @Test
    fun someTest() {
        /*
        java.lang.NoClassDefFoundError: com/example/multiplatform/multiplatformmodule/SomeMultiPlatformClass
         */
        val jvmClass = SomeJvmClass()
    }

}