package com.atguigu.scala1128.day09.exeception

/**
 * Author atguigu
 * Date 2020/4/30 11:36
 */
object ExceptionDemo4 {
    def main(args: Array[String]): Unit = {
        
        
        try {
            throw new Exception
        } catch {
            case e => throw new IllegalArgumentException
        }
        println("-----")
        
    }
    
    @throws(classOf[IllegalAccessError])
    @throws(classOf[ArithmeticException])
    def foo = {
        throw new IllegalAccessError
        throw new ArithmeticException
    }
    
}
