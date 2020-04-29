package com.atguigu.scala1128.day08.high

object Sort2 {
    def main(args: Array[String]): Unit = {
        //        val list1 = List(30, 50, 70, 60, 10, 20)
        //        println(list1.sorted(Ordering.Int))
        //        println(list1.sorted(Ordering.Int.reverse))
        
       implicit val ord: Ordering[User2] = new Ordering[User2] {
            override def compare(x: User2, y: User2): Int =
                if (x.age > y.age) 1
                else if (x.age == y.age) 0
                else -1
        }
        val list1 = List(new User2(20, "a"), new User2(10, "c"), new User2(15, "b"))
        println(list1.sorted)
    }
}

class User2(val age: Int, val name: String) {
    
    override def toString: String = s"[age = $age, name = $name]"
}