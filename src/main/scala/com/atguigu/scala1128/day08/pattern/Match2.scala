package com.atguigu.scala1128.day08.pattern

/**
 * Author atguigu
 * Date 2020/4/29 14:54
 */
object Match2 {
    def main(args: Array[String]): Unit = {
        val aBBB = 120
        
        val a = 110
        a match {
            case 10 =>
                println("10....")
                // aa表示一个变量
                // 任何的值都可以匹配成功
                
            case aBBB =>
                // b是一个新定义的只能在当前的case中使用的变量
                println(aBBB + "  aa.....")
            case _ =>
            
        }
    }
}
