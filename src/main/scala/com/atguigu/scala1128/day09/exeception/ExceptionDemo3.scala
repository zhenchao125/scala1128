package com.atguigu.scala1128.day09.exeception

/**
 * Author atguigu
 * Date 2020/4/30 11:36
 */
object ExceptionDemo3 {
    def main(args: Array[String]): Unit = {
       
       try {
           foo()
       } catch {
           case e: RuntimeException => println("发生了异常")
       }
    }
    
    
    @throws(classOf[RuntimeException])
    @throws(classOf[IllegalArgumentException])
    def foo() = {
        10 / 0
    }
}
