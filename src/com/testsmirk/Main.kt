package com.testsmirk

/**
 * Created by testsmirk on 2017/8/18.
 */
fun main(args: Array<String>) {

    print(sumAnd())
    val name = "abcd"
    for (c in name){
        print(c)
    }
}

fun sumAnd(a:Int,b:Int):String {
    if (a!=0&&b!=0)
        return (a+b).toString()
    return ">_<"
}
fun sumAnd():String{
    return sumAnd(0,0)

}