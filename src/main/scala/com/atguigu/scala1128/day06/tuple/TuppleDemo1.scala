package com.atguigu.scala1128.day06.tuple

/**
 * Author atguigu
 * Date 2020/4/27 16:39
 */
object TuppleDemo1 {
    def main(args: Array[String]): Unit = {
        // 创建元组
        /*val t2 = Tuple4(10, "name", 10, false)
        println(t2._1)
        println(t2._2)
        println(t2._3)
        println(t2._4)*/
        
        val t2  = ("a", 10)  // 等价于 Tuple2("a", 10)
        val it: Iterator[Any] = t2.productIterator
        for (elem <- it) {
            println(elem)
        }
    }
}
