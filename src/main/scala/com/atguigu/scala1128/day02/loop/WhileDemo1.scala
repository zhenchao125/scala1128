package com.atguigu.scala1128.day02.loop

/**
 * Author atguigu
 * Date 2020/4/21 10:14
 */
object WhileDemo1 {
    def main(args: Array[String]): Unit = {
        // 输出1-100中所有的偶数
        /*var i = 1
        val a = while (i <= 100) {
            if (i % 2 == 0) println(i)
            i += 1
        }
        println(a)*/
        
        
        var i = 1
        do {
            println(i)
            i += 1
        } while (i <= 100)
        
    }
}
