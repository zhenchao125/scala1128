package com.atguigu.scala1128.day03.high.Controlabstract

/**
 * Author atguigu
 * Date 2020/4/22 15:41
 */
object MyWhileDemo {
    def main(args: Array[String]): Unit = {
        
        /* var i = 1
         myWhile(i < 100) {
             println(i)
             i += 1
         }*/
        
        val arr1 = Array(30, 50, 70, 60, 10, 20)
        var sum = 0
        var i = 0
        myWhile(i < arr1.length) {
            sum += arr1(i)
            i += 1
        }
        println(sum)
    }
    
    // 第一次  i < 100
    // 第而次  i < 100
    def myWhile(condition: => Boolean)(op: => Unit) {
        // 第一次求出来  1 < 100的值 true
        // 第一次求出来  2 < 100的值 true
        if (condition) {
            op
            myWhile(condition)(op)
        }
    }
}

/*
自定义循环结构:


 */