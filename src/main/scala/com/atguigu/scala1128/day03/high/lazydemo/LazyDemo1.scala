package com.atguigu.scala1128.day03.high.lazydemo

/**
 * Author atguigu
 * Date 2020/4/22 16:22
 */
object LazyDemo1 {
    def main(args: Array[String]): Unit = {
        
       lazy  val a = {
            println("a.....")
            10
        }
        println("main -------")
        println(a)
        println(a)
        println(a)
        println(a)
        println(a)
        
    }
}

/*
惰性求值
    对一个常量, 只要在第一次使用的时候才去求值
    一旦计算一次只会, 以后再使用, 就不用再计算了.

 */
