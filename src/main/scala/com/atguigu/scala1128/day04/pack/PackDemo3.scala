package com.atguigu.scala1128.day04.pack


import java.io.{FileInputStream => _, _}
import java.lang.Math._
/**
 * Author atguigu
 * Date 2020/4/24 14:09
 */
object PackDemo3 {
    def main(args: Array[String]): Unit = {
        val u = new User
        // 把对象u的成员导入
        import u._
        foo()
        eat()
        
    }
}
class User{
    def foo() = {
        println("foo...")
    }
    def eat() = {
        println("eat...")
    }
}

class FileInputStream