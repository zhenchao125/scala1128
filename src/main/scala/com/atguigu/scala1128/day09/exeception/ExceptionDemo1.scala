package com.atguigu.scala1128.day09.exeception

/**
 * Author atguigu
 * Date 2020/4/30 11:26
 */
object ExceptionDemo1 {
    def main(args: Array[String]): Unit = {
        val a = 10
        val b = 0
        
        try {
            val r: Int = a / b
            
            println(r)
        } catch {
            case e: ArithmeticException => println(e.getMessage)
            case e: RuntimeException =>
            case e =>
        }finally {
            // 用来释放一些资源
        }
        println("------")
    }
}
