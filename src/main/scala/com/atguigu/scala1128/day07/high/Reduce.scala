package com.atguigu.scala1128.day07.high

/**
 * Author atguigu
 * Date 2020/4/28 16:18
 */
object Reduce {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        /*val r = list1.reduce((x, y) => {
            x + y
        })*/
//        val r = list1.reduce((x, y) => x + y)
        // 是一个匿名函数, 有连个参数
        val r = list1.reduce(_ + _)
        
        println(r)
        
    }
}
