package com.atguigu.scala1128.day09.pattern

object Match5 {
    def main(args: Array[String]): Unit = {
        val Array(_, _, a, _*) = foo
        println(a)
        
        val (c, d) = foo1
        println(c)
        
        
    }
    
    def foo = Array(10,20,30,40,50)
    
    def foo1 = (10, 20)
}
