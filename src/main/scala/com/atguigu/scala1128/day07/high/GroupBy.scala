package com.atguigu.scala1128.day07.high

/**
 * Author atguigu
 * Date 2020/4/28 15:12
 */
object GroupBy {
    def main(args: Array[String]): Unit = {
        //        val list = List("hello", "world", "hello", "atguigu", "hello", "atguigu")
        // 统计一下每个单词出现的次数  wordCount
        /*
        分析:
            Map(hello->3, world->1, atguigu->2)
         */
        /*        var result = Map[String, Int]()
                list.foreach(x => {
                    // x: hello    result找到hello的个数, 把个数+1
                    result += x -> (result.getOrElse(x, 0) + 1)
                })
                println(result)*/
        
        /*val list1 = List(30, 5, 70, 6, 1, 20)
        val map = list1
            .groupBy(x => if (x % 2 == 0) "偶数" else "奇数")
            .map(kv => {
                (kv._1, kv._2.length)
            })
        
        println(map)*/
        
        val list = List("hello", "world", "hello", "atguigu", "hello", "atguigu")
        // 如果匿名函数式原封不动的返回, 则不能化简
        val wordCount = list
            .groupBy(x => x)
            .map(kv => (kv._1, kv._2.size))
        println(wordCount)
        
        
    }
}
