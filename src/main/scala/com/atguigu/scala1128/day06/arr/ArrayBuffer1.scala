package com.atguigu.scala1128.day06.arr

import scala.collection.mutable.ArrayBuffer

/**
 * Author atguigu
 * Date 2020/4/27 14:56
 */
object ArrayBuffer1 {
    def main(args: Array[String]): Unit = {
        // 创建可变数组
        val buffer = ArrayBuffer(10, 20, 30, 40, 10.3)
        println(System.identityHashCode(buffer))
        /*val buffer2 = 200 +: buffer :+ 100
        println(buffer)*/
        buffer += 100  // 等价于 buffer.append(100)
        200 +=: buffer
        buffer.append(1000)  // java式的写法
        buffer.prepend(2000)
        buffer.insert(0, 200, 3000, 4000)
        println(System.identityHashCode(buffer))
        
        println(buffer)
        
        
        /*// 创建一个空的ArrayBuffer
        new ArrayBuffer[Int]()
        // 创建一个空的ArrayBuffer
        ArrayBuffer[Int]()*/
    }
}
