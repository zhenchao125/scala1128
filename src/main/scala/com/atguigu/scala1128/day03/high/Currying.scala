package com.atguigu.scala1128.day03.high

/**
 * Author atguigu
 * Date 2020/4/22 14:50
 */
object Currying {
    
    def main(args: Array[String]): Unit = {
    
        val r: Int = add(100)(200)
        println(r)
        
    }
    // 函数的柯里化!!!
    def add(a:Int)(b:Int) = a + b
    
    /*def add(a: Int) = {
        (b: Int) => a + b
    }
    */
//    def add(a:Int, b:Int) = a + b
    
}

/*
柯里化:


*/