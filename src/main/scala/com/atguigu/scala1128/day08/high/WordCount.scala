package com.atguigu.scala1128.day08.high

/**
 * Author atguigu
 * Date 2020/4/29 11:23
 */
object WordCount {
    def main(args: Array[String]): Unit = {
        val tupleList =
            List(("Hello Scala Spark World", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))
        // 统计单词的数量, 然后再按照单词的数量进行降序排列
        //        foo1(tupleList)
        foo2(tupleList)
        
    }
    
    def foo2(tupleList: List[(String, Int)]) = {
        // List(hello->4, Scala->4, ....)
        val r = tupleList
            .flatMap(kv => {
                kv._1.split(" ").map((_, kv._2))
            })
            .groupBy(_._1)
            .mapValues(list => {
                // 最终的结果, 和元素类型不一致, 用foldLeft
                list.foldLeft(0)(_ + _._2)
            })
            .toList
            .sortBy(-_._2)
    
        println(r)
        
    }
    
    def foo1(tupleList: List[(String, Int)]) = {
        // Map Seq Set 只有Seq可以排序
        // List(("Hello Scala Spark World", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))
        // List("Hello Scala Spark World Hello Scala Spark World Hello Scala Spark World Hello Scala Spark World ", ...)
        val r = tupleList
            .map(kv => ((kv._1 + " ") * kv._2).trim)
            .flatMap(_.split(" "))
            .groupBy(x => x)
            .mapValues(_.size)
            .toList
            .sortBy(-_._2)
        
        println(r)
    }
}
