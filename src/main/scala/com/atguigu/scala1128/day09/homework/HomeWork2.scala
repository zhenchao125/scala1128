package com.atguigu.scala1128.day09.homework

/**
 * Author atguigu
 * Date 2020/4/30 8:56
 */
object HomeWork2 {
    def main(args: Array[String]): Unit = {
        //        work6()
        //        work7()
        work8()
    }
    
    // 6. 利用模式匹配，编写一个 swap(arr: Array[Int]) 函数，交换数组中前两个元素的位置
    def work6(): Unit = {
        
        // Array(10,20,30,40)
        def swap(arr: Array[Int]): Array[Int] = {
            arr match {
                case Array(a, b, rest@_*) =>
                    Array(b, a) ++ rest
                case a => a
            }
        }
        
        val arr = swap(Array(10))
        println(arr.mkString(", "))
        
    }
    
    // 7. 编写一个函数，计算 List[Option[Int]] 中所有非None值之和。分别使用 match 和不使用 match 来计算
    def work7(): Unit = {
        
        /*def sumNotNone(list: List[Option[Int]]) = {
            var sum = 0
            list.foreach(option => {
                if(option.isDefined) sum += option.get
            })
            sum
        }
     */
        /*def sumNotNone(list: List[Option[Int]]) = {
            var sum = 0
            list.foreach(option => {
                sum += option.getOrElse(0)
            })
            sum
        }*/
        
        /*def sumNotNone(list: List[Option[Int]]) = {
            list.flatten.sum
        }*/
        
        /*def sumNotNone(list: List[Option[Int]]) = {
            list.filter(_.isDefined).map(_.get).reduce(_ + _)
        }*/
        def sumNotNone(list: List[Option[Int]]) = {
            /*list.foldLeft(0)(_ + _.getOrElse(0))*/
            (0 /: list) (_ + _.getOrElse(0))
        }
        
        val sum = sumNotNone(List(Some(10), None, Some(20), Some(30), None))
        println(sum)
    }
    
    def work8(): Unit = {
        
        /*def sumList(list: List[Any]): Int = {
            var sum = 0
            list.foreach(any => {
                any match {
                    case a: Int => sum += a
                    case b: List[_] => sum += sumList(b)
                }
            })
            sum
        }*/
        def sumList(list: List[Any]): Int = {
            list.foldLeft(0)((sum, y) => {
                y match {
                    case a: Int => sum + a
                    case list: List[_] => sum + sumList(list)
                }
            })
        }
        
        val list: List[Any] = List(List(3, 8), 2, List(5, List(10, 20)))
        println(sumList(list))
    }
}

/*


8. 我们可以用列表制作只在叶子节点存放值的树。举例来说，列表((3 8) 2 (5)) 描述的是如下这样一棵树：
        *
       /|\
      * 2 *
     /\   |
    3  8  5
    List[Any] = List(List(3, 8), 2, List(5))
    不过，有些列表元素是数字，而另一些是列表。在Scala中，你必须使用List[Any]。
    编写一个leafSum函数，计算所有叶子节点中的元素之和.
 */
