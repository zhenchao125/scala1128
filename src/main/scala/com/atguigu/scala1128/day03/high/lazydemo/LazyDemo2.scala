package com.atguigu.scala1128.day03.high.lazydemo

object LazyDemo2 {
    val a = {
        println("a...")
        10
    }
    lazy val b = {
        println("b...")
        20
    }
    
    def c = {
        println("c...")
        30
    }
    
    
    
    def main(args: Array[String]): Unit = {
        // layz其实是介于 val和def之间的状况
        println(a)
        println(a)
        println(b)
        println(b)
        println(c)
        println(c)
        println(c)
        
    }
}
