package com.atguigu.scala1128.day09.pattern

/**
 * Author atguigu
 * Date 2020/4/30 10:05
 */
class MyList(val names: String*){

}

object MyList{
    def unapplySeq(s: MyList) = {
        if(s == null) None
        else Some(s.names.toList)
    }
    
    def apply(names: String*) = new MyList(names:_*)
}
object Match3 {
    def main(args: Array[String]): Unit = {
        val names = MyList("zs", "lisi", "ww", "zs", "zhiling")
        // Some()  Some(()), ...
        
        names match {
            case MyList(one, two, rest@_*) =>
                println(one)
                println(rest)
        }
        
    }
}
