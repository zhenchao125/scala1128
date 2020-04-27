package com.atguigu.scala1128.day06.list

import scala.collection.mutable.ListBuffer

/**
 * Author atguigu
 * Date 2020/4/27 16:32
 */
object ListBuffer1 {
    def main(args: Array[String]): Unit = {
        // List ListBuffer
        val buffer: ListBuffer[Int] = ListBuffer(10, 20, 30)
        buffer += 100
        200 +=: buffer
        println(buffer)
        // 不能使用 ::  :::
    }
}
