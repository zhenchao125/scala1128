package com.atguigu.scala1128.day08.high

/**
 * Author atguigu
 * Date 2020/4/29 10:44
 */
object Sort3 {
    def main(args: Array[String]): Unit = {
        /*val list1 = List(30, 50, 70, 60, 10, 20)
        //        println(list1.sortBy(x => x))
        val list2: List[Int] = list1.sortBy(x => x)(Ordering.Int.reverse)
        println(list2)*/
        
        val list1= List("abc", "a", "c", "dd", "aaa")
//        val list2: List[String] = list1.sortBy(x => x)
        // 按照字符串的长度的省略来排.  传递的这个匿名函数的返回值, 其实是排序的指标!
//        val list2: List[String] = list1.sortBy(x => x.length)(Ordering.Int.reverse)
        // 按照长度排升序排, 长度相等, 再按照字母表的升序排
//        val list2 = list1.sortBy(s => (s.length, s))
        // 按照长度排降序排, 长度相等, 再按照字母表的升序排
        val list2 = list1.sortBy(s => (s.length, s))(Ordering.Tuple2(Ordering.Int.reverse, Ordering.String))
        println(list2)
        
        
    }
}
