package com.atguigu.scala1128.day02

/**
 * Author atguigu
 * Date 2020/4/21 9:23
 */
object IfDemo {
    def main(args: Array[String]): Unit = {
        /*val n: Int = StdIn.readInt()
        if(n % 2 == 0){
            println(s"$n 是偶数")
        }else{
            println(s"$n 是奇数")
            
        }*/
        
        // 给你两个数, 计算出来他们的最大值
        val m = 10
        val n = 20
        
        // 完全替换了3元运算符
        val max = if (m > n) m else n
        
        println(max)
    }
}

/*
在scala中, 任何的语法结构都有值!!!
针对 if语句来说, if语句值, 是执行的分支中的最后一行代码的值

 */