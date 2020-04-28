package com.atguigu.scala1128.day07.high

/**
 * Author atguigu
 * Date 2020/4/28 15:32
 */
object GroupBy2 {
    def main(args: Array[String]): Unit = {
        val list = List("hello world", "hello hello", "hello atguigu hello")
        // 统计WordCount
        val r = list
            .flatMap(_.split(" "))
            .groupBy(x => x)
            //            .map(kv => (kv._1, kv._2.size))
            .mapValues(_.size) // 得到的结果, key原封不动, 值对value做map
        println(r)
        
        
    }
}
