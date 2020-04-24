package com.atguigu.scala1128.day04.obj

/**
 * Author atguigu
 * Date 2020/4/24 10:23
 */
object Obj1 {
    def main(args: Array[String]): Unit = {
        val u1 = new User1()
        println(u1)
        println(u1.sex)
        println(u1.name)
        u1.name = "李四"
        println(u1.name)
        u1.eat()
        
    }
    
    
}

class User1{
    // 类的具体的内容
    // 只读属性
    val sex = "male"
    // 可读可写属性   _ 表示给name初始化默认值 null
    var name: String = _
    var age = 10
    
    // 给类定义方法
    def eat() = {
        println(name)  // 函数式角度
        println(this.name) // 面向对象的角度
    }
}