package com.testsmirk

/**
 * Created by testsmirk on 2017/8/21.
 */
class Smirk {
    var lastname: String = "smirk"
        get() = field.toUpperCase()
        set
    var num: Int = 0
        get() = field
        set(value) {
            if (value > 10) {
                field = value
            } else {
                field = -1
            }
        }

    override fun toString(): String {
        return "lastname $lastname , num $num"
    }

}