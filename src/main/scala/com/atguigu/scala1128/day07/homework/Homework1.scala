package com.atguigu.scala1128.day07.homework

/**
 * Author atguigu
 * Date 2020/4/28 11:30
 */
object Homework1 {
    def main(args: Array[String]): Unit = {
        
        println(5 !)
        println(10 !)
    }
    
    implicit class RichInt(n: Int) {
        def ! = {
            /*def recursive(m: Int): Int = {
                if (m == 1) 1
                else m * recursive(m - 1)
            }*/
            
            def recursive(m: Int, acc: Int = 1):Int = {
                if(m == 1) acc
                else recursive(m - 1, acc * m)
            }
            
            recursive(n)
        }
        
    }
    
}
