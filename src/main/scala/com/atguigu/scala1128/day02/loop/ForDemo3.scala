package com.atguigu.scala1128.day02.loop

/**
 * Author atguigu
 * Date 2020/4/21 10:38
 */
object ForDemo3 {
    def main(args: Array[String]): Unit = {
        // for(int i = 0; i < arr.length; i++)
        for(i <- 0 until 100){  // until: [0, 100) to: [0, 100]
            println(i)
        }
    }
}
