package com.testsmirk.`class`

/**
 * Created by testsmirk on 2017/8/21.
 */
class Student(sid:String,name: String,age:Int):Person(name,age) {

    override fun study() {
        println("我长大了")

    }
}