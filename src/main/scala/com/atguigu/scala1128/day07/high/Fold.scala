package com.atguigu.scala1128.day07.high

/**
 * Author atguigu
 * Date 2020/4/28 16:38
 */
object Fold {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
//        val r: Int = list1.foldLeft(0)(_ + _)
      //  "305070..."
       // val s = list1.reduce(_ + _ + "")  // 错误
//        val r = list1.foldLeft("")(_ + _)
        var r = list1.foldRight(0)(_ + _)
        println(r)
    }
}
