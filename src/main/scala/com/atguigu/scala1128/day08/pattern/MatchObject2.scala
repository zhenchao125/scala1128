package com.atguigu.scala1128.day08.pattern

/**
 * Author atguigu
 * Date 2020/4/29 16:23
 */

class Person(val name: String, val age: Int)

object Person {
    def unapply(p: Person) = {
        if (p == null) None
        else Some((p.name, p.age))
    }
}

object MatchObject2 {
    def main(args: Array[String]): Unit = {
        val p = new Person("zs", 20)
        
        // 通过模式匹配的方式把  name和age来匹配出来
        p match {
            case Person(name, age) =>
                println(name)
                println(age)
            case _ =>
        }
    }
}

/*
对象匹配的本质:
    1. 是去调用这个对象的 unapply 方法, 把需要匹配的值传给这个方法
    2. unapply方法, 返回值必须是 Option, 如果返回的Some,则表示匹配成功, 然后把
       Some中封装的值赋值 case语句中
       如果返回的是None, 表示匹配失败, 继续下一个case语句
    注意: 如果 对象() 等价于 对象.apply()
            case 对象()=>   等价于 对象.unapply
 */


