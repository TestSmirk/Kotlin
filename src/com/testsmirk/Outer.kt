package com.testsmirk

/**
 * Created by testsmirk on 2017/8/21.
 */
class Outer  {
    var name:String="name."
   inner class Inner{
        fun foo(){
            var o = this@Outer
            print("this is from inner class ! , "+o.name)
        }
    }
}