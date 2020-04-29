package com.atguigu.scala1128.day08.homework

/**
 * Author atguigu
 * Date 2020/4/29 7:38
 */
object Homework1 {
    def main(args: Array[String]): Unit = {
        //        work4()
        //        work5()
        //        println(work6("Helloee"))
        work7()
    }
    
    def work7(): Unit = {
        //        7. 实现一个函数，作用与mkString相同，使用foldLeft
        val list1 = List(30, 50, 70, 60, 10, 20)
        //        println(list1.mkString("<<", "-", ">>"))
        println(myMakeString(list1, "<<", "--", ">>"))
        
        // <<30-50-20>>
        def myMakeString(list: List[Int], start: String, sep: String, end: String): String = {
            /*list1.foldLeft(start)((a, b)  => {
                a + b + sep
            }).dropRight(sep.length) + end*/
            
            //            list1.foldLeft(start)(_ + _ + sep).dropRight(sep.length) + end
            
            //            list1./:(start)(_ + _ + sep).dropRight(sep.length) + end
            
            //            val temp = list1./:(start)(_ + _ + sep)
            
            val temp = (start /: list1) (_ + _ + sep)
            temp.dropRight(sep.length) + end
        }
        
    }
    
    
    def work6(s: String) = {
        /*6. 编写一个函数, 接收一个字符串, 返回一个 Map.
        比如: indexes("Helloee")
    
        返回: Map(H->List(0), e -> List(1, 5, 6), ...)   数字其实是下标*/
        s.zipWithIndex
            .groupBy(_._1)
            //            .mapValues(vector => vector.map(_._2).toList)
            .mapValues(_.map(_._2).toList)
    }
    
    def work5(): Unit = {
        //5. 使用 foldLeft 同时计算最大值和最小值
        val list1 = List(30, 50, 70, 60, 10, 20)
        val (max, min) = list1.foldLeft((list1.head, list1.head))((maxMin, ele) =>
            (maxMin._1.max(ele), maxMin._2.min(ele)))
        println(max)
        println(min)
    }
    
    def work4(): Unit = {
        //4. 使用 reduce 计算集合中的最大值
        val list1 = List(30, 50, 70, 60, 10, 20)
        val max = list1.reduce((x, y) => x.max(y))
        println(max)
    }
}

/*



    

 */
