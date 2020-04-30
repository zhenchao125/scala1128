package com.atguigu.scala1128.day09.extra

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * Author atguigu
 * Date 2020/4/30 15:29
 */
class User {
    val buffer = new Array[Int](10)
    
    def apply(index: Int) = buffer(index)
    
    def update(index: Int, value: Int) = {
        buffer(index) = value
    }
}

object Extra1 {
    def main(args: Array[String]): Unit = {
        //!2 = 8  // !2 = 10 -2  !2 = 10 - 3
        //        println(!2)
        //        println(!4)
        /*val user = new User
        user(0) = 100 // user.update(0, 100)
        user(1) = 200 // user.update(1, 200)
        println(user(0))*/
        
    }
    
    implicit class RichInt(n: Int) {
        // 后置
        // def ! = 10
        def unary_! : Int = 10 - n
    }
    
}

/*
1. 中置运算符
   1 + 2
2. 一元运算符
    后置
        1 toString
    前置
        +5
        -5
        !false  取反
        ~2  按位取反
3. apply方法
    任何对象都可以 调用
    对象(...)   // 对象.apply(...)
    伴生对象
    普通的对象
    函数对象
4. update方法
        user(0) = 100 // user.update(0, 100)
        
5. _ 总结
 
 


 */