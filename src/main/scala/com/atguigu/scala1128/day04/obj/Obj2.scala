package com.atguigu.scala1128.day04.obj

import scala.beans.BeanProperty

/**
 * Author atguigu
 * Date 2020/4/24 10:42
 */
object Obj2 {
    def main(args: Array[String]): Unit = {
        val u21 = new User2("lisi", 20, "male")
        
        println(u21.age)
        println(u21.age)
        println(u21.name)
        u21.name = "zs"
        u21.name_$eq("ww")
        println(u21.name)
        //        u21.eat
        
        println(u21.name)
        println(u21.getName())
        u21.setName("志玲")
        println(u21.name)
        
    }
}

class User2(@BeanProperty var name: String, @BeanProperty val age: Int, @BeanProperty sex: String) {
    def eat = println(this.sex)
    
    /*def getName() = this.name
    def setName(name: String) = this.name = name*/
}

/*
主构造器:
    直接写在类名的后面, 主构造器的参数
    重要:
        主构造器的参数, 会自动成为类的属性
*/