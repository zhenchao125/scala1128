package com.atguigu.scala1128.day07.operation

/**
 * Author atguigu
 * Date 2020/4/28 10:45
 */
object SubCollections {
    def main(args: Array[String]): Unit = {
        
        //        （1）获取集合的头head
        //        println(list1.head)
        //        （2）获取集合的尾（不是头就是尾）tail
        //        println(list1.tail)
        //        （3）集合最后一个数据 last
        //        println(list1.last)
        //        （4）集合初始数据（不包含最后一个）
        //        println(list1.init)
        //        （5）反转
        //        println(list1.reverse)
        //        （6）取前（后）n个元素
        //        println(list1.take(3))
        //        println(list1.take(30))
        //        println(list1.takeRight(2))
        //        （7）去掉前（后）n个元素
        //        println(list1.drop(2))
        //        println(list1.dropRight(3))
        //        （8）并集
        //        println(list1.union(list2))
        //        （9）交集
        //        println(list1.intersect(list2))
        //        （10）差集
        //        println(list1.diff(list2))
        val list1 = List(30, 50, 70, 60, "abc")
        val list2 = List("30", "50", "7", "6", "10", "2", "abc")
        //        （11）拉链
        //        val list3: List[(Int, Int)] = list1.zip(list2)  // 多出会忽略
        //  val list3 = list1.zipAll(list2, -1, "fff")  // 配置默认值
        val list3= list1.zipWithIndex  // 元素和索引进行拉链
        println(list3)
        //        （12）滑窗
        
    }
}
