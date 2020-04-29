package com.atguigu.scala1128.day08.pattern

import scala.io.StdIn

/**
 * Author atguigu
 * Date 2020/4/29 14:38
 */
object Match1 {
    def main(args: Array[String]): Unit = {
        // 从键盘输入两个整数和一个运算符, 计算他们的运算结果
        
        val a: Int = StdIn.readInt()
        val b: Int = StdIn.readInt()
        val operation: String = StdIn.readLine() // + - * /
        
        operation match {
            
            case "+" =>
                println(a + b)
            case "-" =>
                println(a - b)
            case "*" =>
                println(a * b)
            case "/" =>
                println(a / b)
            // 匹配所有
            case _ =>
                println("你的运算符有问题...")
                
        }
        
    }
}
