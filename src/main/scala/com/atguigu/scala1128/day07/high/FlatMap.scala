package com.atguigu.scala1128.day07.high

/**
 * Author atguigu
 * Date 2020/4/28 14:40
 */
object FlatMap {
    def main(args: Array[String]): Unit = {
        //        val list = List("hello world", "hello hello", "hello atguigu hello")
        // List(hello, world, hello, hello, ....)
        /* val list2: List[String] = list
             .map(x => x.split(" "))
             .flatten
         println(list2)*/
        
        // map + flatten
        //       val list2 =  list.flatMap(x => x.split(" "))
        //        println(list2)
        
        //        val list1 = List(30, 50, 70, 60, 10, 20)
        //        // List(30, 900, 27000, 50, 2500,...)
        //       val list2 =  list1.flatMap(x => List(x, x * x, x * x * x))
        //        println(list2)
        val list1 = List(3, 5, 70, 6, 10, 20)
        // 新的集合, 如果是偶数要包含这个偶数的平方和3次方  // 4900 666666  36 216
        // 如果是奇数, 就只包含3次方    // 9 25
        list1
            .flatMap(x => {
                if (x % 2 == 0) Array(x * x, x * x * x)
                else Array[Int]()
            })
            .foreach(println)
        
    }
}
