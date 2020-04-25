package com.atguigu.scala1128.day05.single

/**
 * Author atguigu
 * Date 2020/4/25 11:17
 */
object ApplyDemo2 {
    def main(args: Array[String]): Unit = {
        /*val user = User("lisi", 20); // User.apply("lisi", 20)
        println(user)*/
        val arr = new MyArray(10,20,30,40)
        println(arr(0))  // arr.apply(0)
        println(arr(1))
        
    }
}

class MyArray(val args: Int*){
    def apply(index: Int) = args(index)
    
}

object User {
    var a = 10
    def apply(name: String, age: Int) = new User(name, age)
}

class User(val name: String, var age: Int){
    var a = 100
    override def toString: String = s"$name, $age, ${User.a}"
}
