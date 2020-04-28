package com.atguigu.scala1128.day07.operation

/**
 * Author atguigu
 * Date 2020/4/28 10:26
 */
object BasicOperation {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        //        （1）获取集合长度
        println(list1.length)
        //        （2）获取集合大小
        println(list1.size)
        //        （3）循环遍历
        list1.foreach(println)
        //        （4）迭代器
        println("----------")
        val it: Iterator[Int] = list1.iterator
        println(it.hasNext)
        println(it.isEmpty)
        while (it.hasNext) {
            println(it.next())  // 返回刚刚跳过的那个元素
        }
        //        （5）生成字符串
        println(list1.mkString("-> "))
        //        （6）是否包含
        println(list1.contains(30))
        
    }
}
