package com.atguigu.scala1128.day08.othercollection

import com.atguigu.scala1128.day08.high.User2

/**
 * Author atguigu
 * Date 2020/4/29 14:15
 */
object OptionDemo {
    def main(args: Array[String]): Unit = {
        /*val opt:Option[Int] = Some(10)
        if (opt.isDefined) {
            println(opt.get)
        }*/
        val opt: Option[User2] = foo()
        /*if (opt.isDefined) {
            println(opt.get)
        }*/
        opt.foreach(user => println(user))
    }
    def foo(): Option[User2] = {
        Some(new User2(10, "abc"))
//        None
    }
}
/*
Option
 
 */