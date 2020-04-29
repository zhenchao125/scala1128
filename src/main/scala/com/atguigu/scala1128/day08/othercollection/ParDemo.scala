package com.atguigu.scala1128.day08.othercollection

/**
 * Author atguigu
 * Date 2020/4/29 11:53
 */
object ParDemo {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20).par
        list1.foreach(x => {
            println(x + "   " + Thread.currentThread().getName)
        })
    }
}
