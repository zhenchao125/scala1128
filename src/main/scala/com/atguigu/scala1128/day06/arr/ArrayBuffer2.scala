package com.atguigu.scala1128.day06.arr

import scala.collection.mutable.ArrayBuffer

/**
 * Author atguigu
 * Date 2020/4/27 14:56
 */
object ArrayBuffer2 {
    def main(args: Array[String]): Unit = {
        // 创建可变数组
        val buffer1 = ArrayBuffer(10, 20, 30, 40, 10.3)
        val buffer2 = ArrayBuffer(100, 200, 300, 400, 100.3)
        println(buffer1 ++ buffer2)  // 新的buffer, 但是buffer1和buffer2没有任何的变化
        
//        buffer1 ++= buffer2  // 把buffer2的内容之家到buffer1的内部
        buffer1 ++=: buffer2  //
        println(buffer1)
        println(buffer2)
        
       
    }
}
