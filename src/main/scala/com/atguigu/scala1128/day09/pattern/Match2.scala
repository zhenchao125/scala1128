package com.atguigu.scala1128.day09.pattern

/**
 * Author atguigu
 * Date 2020/4/30 10:05
 */


object MyArray{
    def unapplySeq(s: String) = {
        if(s == null) None
        else Some(s.split(",").toList)
    }
}
object Match2 {
    def main(args: Array[String]): Unit = {
        val names = "zs,lisi,ww,zl,zhiling"
        // Some()  Some(()), ...
        
        names match {
            case MyArray(one, two, rest@_*) =>
                println(one)
                println(rest)
            
        }
        
    }
}
