package com.atguigu.scala1128.day09.homework

/**
 * Author atguigu
 * Date 2020/4/30 8:34
 */
object HomeWork1 {
    def main(args: Array[String]): Unit = {
        /*val list1 = List(30, 50, 70, 60, 10, 20).toStream
        println(list1.take(4).force)
        println(list1)*/
        
        val list1 = List(30, 50, 70, 60, 10, 20).view
        println(list1.take(4).force)
        println(list1.head)
    }
}
