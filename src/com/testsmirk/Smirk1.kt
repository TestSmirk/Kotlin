package com.testsmirk

/**
 * Created by testsmirk on 2017/8/21.
 */
class Smirk1() {
    constructor(name: String) : this() {
        println("name $name")

    }
    constructor(name:String,age:Int):this(name){
        print("name $name , age $age")
    }

}