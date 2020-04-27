package com.atguigu.scala1128.day06.implicitdemo

/**
 * Author atguigu
 * Date 2020/4/27 11:40
 */
object ImplicitDemo8 {
    
    def main(args: Array[String]): Unit = {
        val s: String = "123"
        // 隐式转换, 默认导入: scala.Predef
        println(s.head)
        s.toInt
        s.sortBy(x => x)
        
    }
}
