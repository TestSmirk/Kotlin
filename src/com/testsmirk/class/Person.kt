package com.testsmirk.`class`

/**
 * Created by testsmirk on 2017/8/21.
 */
open class Person(name:String,age:Int) {
    init {
        println("Person "+name+age)
    }

    open fun study(){
        println("我毕业了")
    }
}