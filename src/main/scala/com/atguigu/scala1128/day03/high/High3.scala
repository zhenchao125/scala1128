package com.atguigu.scala1128.day03.high

/**
 * Author atguigu
 * Date 2020/4/22 9:48
 */
object High3 {
    def main(args: Array[String]): Unit = {
        
        /*val f: (Int, Int) => Int = (a: Int, b: Int) => a + b
        val r = cacl(10, 20, f)
        println(r)*/
        
        
        val r = cacl(10, 20, (a: Int, b: Int) => a + b)
        println(r)
        // 传递匿名函数的时候, 一般直接定义在参数位置
        println(cacl(10, 20, (a: Int, b: Int) => a * b))
        
        // 有上下文环境, 参数的类型可以省略, scala可以推导出来
        val r1 = cacl(100, 200, (a, b) => a + b)
        println(r1)
        
        // 如果参数只使用一次, 则可以使用 _ 来替换每个参数
        val r2 = cacl(100, 200, _ * _)  // (a,b) => a * b ====   _* _
        println(r2)
        
    }
    
    def cacl(a: Int, b: Int, op: (Int, Int) => Int) = op(a, b)
}

/*
<- for内使用
=> 胖箭头

 */