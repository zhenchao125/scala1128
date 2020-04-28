package com.atguigu.scala1128.day07.high

/**
 * Author atguigu
 * Date 2020/4/28 13:42
 */
object Foreach {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        // 可以省略循环, 达到遍历的目的
        //        list1.foreach(x => println(x))
        //        list1.foreach(x => println(x * 10))
        list1.foreach(println)
    }
}
