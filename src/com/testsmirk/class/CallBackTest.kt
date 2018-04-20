package com.testsmirk.`class`

import java.util.*
import java.util.logging.Handler
import kotlin.concurrent.timerTask


class CallBackTest {
     var callback: ((name: String, age: Int) -> Unit?)? = null

    fun run() {
        Timer().schedule(timerTask {
            callback?.let { it("",2) }

        }, 2000)
    }

    fun setCallBack(callback: (name: String, age: Int) -> Unit) {
        this.callback = callback
    }
}