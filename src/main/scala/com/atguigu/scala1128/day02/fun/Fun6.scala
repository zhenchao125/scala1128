package com.atguigu.scala1128.day02.fun

/**
 * Author atguigu
 * Date 2020/4/21 16:13
 */
object Fun6 {
    def main(args: Array[String]): Unit = {
        println(foo())
        println(foo(1))
        println(foo(1, 2))
        println(foo(1, 2, 3))
        // scala中是否可以直接给可变参数传递数组
        val arr: Array[Int] = Array(1, 2, 34)
        //        println(foo(arr(0), arr(1), arr(2)))
        println(foo(arr: _*))
    }
    
    // scala: 也支持可变参数
    // ss是一个可变参数
    def foo(ss: Int*) = {
        // 把ss当做一个数组(集合)来使用
        /*var sum = 0
        for (i <- ss) {
            sum += i
        }
        sum*/
        ss.sum
    }
    
    
}
