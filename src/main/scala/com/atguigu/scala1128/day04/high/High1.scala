package com.atguigu.scala1128.day04.high

/**
 * Author atguigu
 * Date 2020/4/24 9:56
 */
object High1 {
    def main(args: Array[String]): Unit = {
        /*foreach(x => println(x))
        foreach(println(_))*/
        foreach(println)
        println("------")
        foreach(println(_ ))  // x => x + 100   x$1 => x$1.$plus(100)
    
        
    
        foreach(x => println(x + 100))
        //foreach(println(_ + 100))  // _ + 100 补充成  x => x + 100  foreach(println(x => x + 100 + 100))
        
    }
    
    val arr1 = Array(30, 50, 70, 60, 10, 20)
    def foreach(op: Int => Unit) = {
        for (elem <- arr1) {
            op(elem)
        }
    }
}
