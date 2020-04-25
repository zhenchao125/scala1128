package com.atguigu.scala1128.day05.traitdemo

/**
 * Author atguigu
 * Date 2020/4/25 15:55
 */
object Trait5 {
    def main(args: Array[String]): Unit = {
        val h = new H with F1 with Serializable
        h.foo()
    }
}

class H

trait F1 {
    def foo() = println("f1 foo...")
}



