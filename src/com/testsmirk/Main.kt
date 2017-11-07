package com.testsmirk

import com.testsmirk.`class`.Student

/**
 * Created by testsmirk on 2017/8/18.
 */

class Test {
    var v = "成员属性"
    fun setInterface(test: TestInterface) {
        test.test()

    }
}

interface TestInterface {
    fun test()
}



fun main(args: Array<String>) {
  val t = Test()


}
fun test4(){
    test1()
    test2()
    test3();
    val d = D()
    d.d()
    println("D = ${D.foo()}")
    println("no:${D.no}")
    val v = null
    println(v.toString())

    val text = """
|asd
|啊盛大盛大
        """.trimMargin()
    print(text)
    val i = 10
    val s = "i = $i" // 求值结果为 "i = 10"
    println(s)


}

fun Any?.toString(): String {
    if (this == null) return "null"

    return toString()

}

class D {
    companion object {

    }

    fun d() {
        println("123")
    }
}

fun D.Companion.foo() {
    println("D的扩展函数")
}

val D.Companion.no: Int
    get() = 10

fun D.d() {
    println("456")
}

fun test3() {


    var student = Student("001", "Student1", 20)
    student.study()

    println("  ")

    var c = C()
    c.f()

    println("  ")
    var user = User("TestSmirk")

    user.Print()
}

fun User.Print() {
    println("user name is $name")
}

open class A {
    open fun f() {
        println("A")
    }

    fun a() {
        println("a")
    }
}

interface B {
    fun f() {
        println("B")
    }

    fun b() {
        println("b")
    }
}

class C : A(), B {
    override fun f() {

    }
}


fun test2() {
    println("++++++++++++++++++")
    var smirk = Smirk()
    smirk.lastname = "smirk1"
    smirk.num = 9
    println(smirk)

    println("++++++++++++++++++")
    var smirk1 = Smirk1("name1", 29)
    println("--------------------")

    Outer().Inner().foo()

    println("--------------------")

    var test = Test()
    test.setInterface(object : TestInterface {
        override fun test() {
            println("对象表达式创建匿名内部类的实例.")
        }

    })
}

fun test1() {
    var lambia: (Int, Int) -> Int = { a, b -> a + b }
    print(lambia(2, 2))
    var a = 1
// 模板中的简单名称：
    val s1 = "a is $a"

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"



    println(s2)
    print(sumAnd())
    val name = "abcd"
    for (c in name) {
        print(c)
    }

    val im = 0
    when (im) {
        0 -> print("0")
        1 -> print("1")

    }
    println(getStringLength(1))


    println("")
    for (x in 1..4) println(x)
    println("")

    println("")

    val q: Int = 1000;
    println(q === q)
    val boxedQ: Int? = q;
    val atherBoxedQ: Int = q;
    println(boxedQ === atherBoxedQ)
    println(boxedQ == atherBoxedQ)

    println("")
    val b: Byte = 1
    val i: Int = b.toInt()
    println("---")

    val texta = """
        this is mutil text
        """.trim()

    print(texta)

    println("")
}

fun getStringLength(any: Any): Int? {
    if (any is String) {
        return any.length;
    }
    return null

}

fun sumAnd(a: Int, b: Int): String {
    if (a != 0 && b != 0)
        return (a + b).toString()
    return ">_<"
}

fun sumAnd(): String {
    return sumAnd(0, 0)

}