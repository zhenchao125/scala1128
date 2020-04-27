package com.atguigu.scala1128.day06.arr

/**
 * Author atguigu
 * Date 2020/4/27 15:29
 */
object ArrayMore {
    def main(args: Array[String]): Unit = {
        var arr1 = Array(30, 50, 70, 60, 10, 20)
        // 等价于 arr1 = arr1 :+= 100
        arr1 :+= 100
        println(arr1.mkString(", "))
    }
}
