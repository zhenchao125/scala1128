package com.atguigu.scala1128.day03.high

/**
 * Author atguigu
 * Date 2020/4/22 9:48
 */
object High2 {
    def main(args: Array[String]): Unit = {
        // 传递匿名函数(拉姆达表达式)
        /*val r =  cacl(10, 20, _ + _)
         println(r)*/
        
        // 具名函数
        //        def add(a: Int, b: Int) = a + b
        // 匿名函数  =>前面大部分: 匿名函数的参数列表部分  =>后面的部分: 匿名函数的实现
        val f: (Int, Int) => Int = (a: Int, b: Int) => a + b
        val r = cacl(10, 20, f)
        println(r)
        
    }
    
    def cacl(a: Int, b: Int, op: (Int, Int) => Int) = op(a, b)
}

/*
<- for内使用
=> 胖箭头

 */