package com.atguigu.scala1128.day08.pattern

/**
 * Author atguigu
 * Date 2020/4/29 15:37
 */
object Match6 {
    def main(args: Array[String]): Unit = {
        val arr = Array(10, 20, 100, 200, 300)
        arr match {
            /*case Array(a, b, c, d) =>
                println(a)
                println(d)*/
            /*case Array(10, a, b, c) =>
                println(a)*/
            /*case Array(10, a, _, 40) if a > 15 =>
                println(a)*/
            /*case Array(a, b, _*) =>
                println(a)
                println(b)*/
            
            case Array(a, b, rest@_*) =>
                println(rest)
                
        }
        
        
    }
}
