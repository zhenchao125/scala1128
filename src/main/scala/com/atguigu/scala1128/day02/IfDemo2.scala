package com.atguigu.scala1128.day02

import scala.io.StdIn

/**
 * Author atguigu
 * Date 2020/4/21 9:23
 */
object IfDemo2 {
    def main(args: Array[String]): Unit = {
        // 计算平方根
        val m = StdIn.readDouble()
        
        val sqrt: Double = if(m >= 0)
            Math.sqrt(m)  // Double
        else
            throw new IllegalArgumentException("非法参数异常") //Nothing
        println(sqrt)
        
        
    }
}
