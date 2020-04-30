package com.atguigu.scala1128.day09.pattern

/**
 * Author atguigu
 * Date 2020/4/30 9:27
 */
object Match1 {
    def main(args: Array[String]): Unit = {
        val user: User = User(10, "lisi")
        val user1: User = User(10, "lisi")
        println(user.equals(user1))
        println(user == user1)
        println(user eq user1)  // 比较是否为同一个对象
        
        user match {
            case User(age, name) =>
                println(age)
        }
    }
}

case class User(age: Int, name: String)
