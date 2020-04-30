package com.atguigu.scala1128.day09.generic

/**
 * Author atguigu
 * Date 2020/4/30 14:22
 */
object GenericDemo4 {
    def main(args: Array[String]): Unit = {
//        val humans: MyList[Human] = new MyList[Human]
        
        val h:Human = new Person  // 多态
        // 协变
//        val hs: MyList[Human] = new MyList[Person]
        val ps : MyList[Person] = new MyList[Human]
    }
}

// 集合: 存储T类型的数据
class MyList[-T]

class Human
class Person extends Human