package com.atguigu.scala1128.day07.high

/**
 * Author atguigu
 * Date 2020/4/28 14:26
 */
object FilterMap {
    def main(args: Array[String]): Unit = {
        val list: List[Any] = List(10, 20, "aaa", false, "123")
        // 得到一个新的的List  List[Int](10, 20)
        val list2 = list
            .filter(_.isInstanceOf[Int])
            .map(_.asInstanceOf[Int])
            //            .map(math.pow(_, 2))
            .map(x => x * x)
        
        println(list2)
        
    }
}
