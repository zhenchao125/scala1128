package com.atguigu.scala1128.day04.obj

/**
 * Author atguigu
 * Date 2020/4/24 11:49
 */
object Obj3 {
    def main(args: Array[String]): Unit = {
        val u31 = new User3(20)
        println(u31.age)
    }
}

class User3(var name: String) {
    var age: Int = _
    
    // 定义一个无参辅助构造器
    def this() = {
        
        // 注意: 首行必须是调用自己的主构造器
        this("lisi")
    }
    
    def this(a: Boolean) = {
        this()
        println(a)
    }
    
    def this(age: Int) = {
        /*this("lisi")
        this.age = age*/
        this(false)
    }
    
    
}