package com.atguigu.scala1128.day02.loop

/**
 * Author atguigu
 * Date 2020/4/21 10:20
 */
object ForDemo1 {
    def main(args: Array[String]): Unit = {
        // java中: 高级for循环 for-each循环 增强for循环   for(int c : 集合){   }
        val s = "abcdefg"  // 字符串 存储是字符
        for(c <- s){
            println(c)
        }
    }
}
/*
for的本质是遍历一个"集合"中所有的元素
 */
