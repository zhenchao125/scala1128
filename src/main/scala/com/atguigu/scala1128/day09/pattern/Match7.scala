package com.atguigu.scala1128.day09.pattern

/**
 * Author atguigu
 * Date 2020/4/30 10:37
 */
object Match7 {
    def main(args: Array[String]): Unit = {
        val list = List(10, "a", false, 20, 30)
        // List(20, 40, 60)
        // filter + map
       val f: PartialFunction[Any, Double] =  new PartialFunction[Any, Double] {
            // 如果这个函数返回true, 则会对这个x进行处理
            // 这个方法, 只是交给collect才会起作用.
            override def isDefinedAt(x: Any): Boolean = x match {
                case _: Int => true
                case _ => false
            }
    
            // 这个是任何一个函数都有的!!!
            override def apply(v1: Any): Double = v1 match {
                case a:Int => a * 2
            }
        }
       val list2 =  list.collect(f)  // 等价于了 filter + map
       val a =  f(10)  // f.apply
        println(a)
        println(list2)
    }
}
/*
偏函数:
    偏好
    支持偏函数只有一个算子 collect
    偏函数:
        1. 首先是一个普通的函数
        2. 然后当交给collect算子使用的是才会当做一个偏函数
 */