package com.atguigu.scala1128.day05.single

/**
 * Author atguigu
 * Date 2020/4/25 11:42
 */
object ObjectDemo {
    def main(args: Array[String]): Unit = {
        println(Student.name)
        println(Student.age)
        
        
        println(Student.isInstanceOf[Student])
        
    }
}

class Student private (val name: String, val age: Int){
    def foo() = println("foo...")
}
object Student extends Student("志玲", 40)



// 对象
