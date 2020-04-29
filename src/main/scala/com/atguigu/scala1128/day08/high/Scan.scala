package com.atguigu.scala1128.day08.high

/**
 * Author atguigu
 * Date 2020/4/29 9:41
 */
object Scan {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
//        val list2: List[Int] = list1.scanLeft(0)(_ + _)
        val list2 = list1.scanRight(0)(_ + _)
        println(list2)
    }
}
