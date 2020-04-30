package com.atguigu.scala1128.day09.exeception

/**
 * Author atguigu
 * Date 2020/4/30 11:36
 */
object ExceptionDemo2 {
    def main(args: Array[String]): Unit = {
        val r = foo
        println(r)
    }
    
    def foo: Int = {
        try {
            100 / 0
        } catch {
            case e =>  0
        } finally {
            println("aaaa")
            200
        }
    }
}
