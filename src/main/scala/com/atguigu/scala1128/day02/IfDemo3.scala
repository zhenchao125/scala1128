package com.atguigu.scala1128.day02

/**
 * Author atguigu
 * Date 2020/4/21 9:42
 */
object IfDemo3 {
    def main(args: Array[String]): Unit = {
        // 任何的语法结构都有值!
        var a: Int = 10
        var b = 20
        var c: Unit = ()
        
        println(a = b) // ()  Unit
        c = a = b
        println(a)
    }
}

/*
1. 赋值语句作为一个语法结构, 他也有值. 但是他的值是 Unit类型.  ()
 */