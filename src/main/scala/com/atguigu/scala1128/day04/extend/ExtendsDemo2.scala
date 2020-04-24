package com.atguigu.scala1128.day04.extend

object ExtendsDemo2 {
    def main(args: Array[String]): Unit = {
        val s1 = new Student("lisi")
        println(s1.name)
    }
}

class Person(val name: String){

}

class Student(override val name: String) extends Person(name){

}
