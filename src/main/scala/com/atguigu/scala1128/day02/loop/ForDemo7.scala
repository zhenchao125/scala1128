package com.atguigu.scala1128.day02.loop

/**
 * Author atguigu
 * Date 2020/4/21 11:58
 */
object ForDemo7 {
    def main(args: Array[String]): Unit = {
        // for推导
        // 得到一个新的序列, 1 4 9 16 25 ...
        val s = for (i <- 1 to 10) yield i * i  // map
        
        for (i <- s) {
            println(i)
        }
    }
}

