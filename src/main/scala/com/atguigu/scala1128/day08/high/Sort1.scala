package com.atguigu.scala1128.day08.high

import com.atguigu.scala1128.day04.obj.User1

/**
 * Author atguigu
 * Date 2020/4/29 9:57
 */
object Sort1 {
    def main(args: Array[String]): Unit = {
       /* val list1 = List(30, 50, 70, 60, 10, 20)
        // 返回一个已经排好序的集合, 默认都是按照自然排序(升序)
        val  list2 = list1.sorted
        println(list1)
        println(list2)*/
        /*val list1 = List(new User1(20, "a"), new User1(10, "c"), new User1(15, "b"))
        val list2: List[User1] = list1.sorted
        println(list2)
        */
        val u1 = new User1(20, "a")
        val u2 = new User1(15, "a")
        println(u1 > u2)
        
    }
}

class User1(val age: Int, val name: String) extends Ordered[User1] {
    
    override def toString: String = s"[age = $age, name = $name]"
    
    override def compare(that: User1): Int = this.age - that.age
}

/*class User1(val age: Int, val name: String) extends Comparable[User1] {
    // this和o进行比较  <0 this <o  =0 this==o  >0 this >o
    override def compareTo(o: User1): Int = o.age - this.age
    
    override def toString: String = s"[age = $age, name = $name]"
}*/
