package com.atguigu.scala1128.day07.set

/**
 * Author atguigu
 * Date 2020/4/28 8:16
 */
object SetDemo3 {
    def main(args: Array[String]): Unit = {
       // Set集合的数学运算
        val set1 = Set(10,20,30,50)
        val set2 = Set(1,20,30,5)
        // 并
        println(set1 ++ set2)  // ++ 所有集合通用
        println(set1 | set2)
        println(set1.union(set2))
        // 交集
        println(set1.intersect(set2))  // java
        println(set1 & set2)
        // 差集
        println(set1 &~ set2)
        println(set1 -- set2)
        println(set1.diff(set2))
        
        
    }
}
