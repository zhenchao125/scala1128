package com.atguigu.scala1128.day01

/**
 * Author atguigu
 * Date 2020/4/20 16:54
 */
object Operator2 {
    def main(args: Array[String]): Unit = {
        val a = "a"
        val m = a + "b"
        val n = a + "b"
//        println(m == n)
        println(m.eq(n))
    }
}
/*
java中有3个用来判断相等
    ==
        引用类型判断是地址值
    equals
        判断的是内容

----

scala中有3个用来判断相等:
 ==    equals
    完全一样. 都是判断内容. 关键是看equals的实现
    覆写的时候, 还是按照java的规矩来, 需要覆写 equals
 eq
    等价于java中的 ==


 */