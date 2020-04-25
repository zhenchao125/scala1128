package com.atguigu.scala1128.day05.extra

/**
 * Author atguigu
 * Date 2020/4/25 16:36
 */
object Type1 {
    def main(args: Array[String]): Unit = {
        // 给类起别名
        type T = TypeStudentPersonUserAAAAAA
    
        val t = new T
        t.foo
        println(t.getClass.getSimpleName)  // T TypeStudentPersonUserAAAAAA?
        
    }
}

class TypeStudentPersonUserAAAAAA{
    def foo = println("TypeStudentPersonUserAAAAAA ")
}