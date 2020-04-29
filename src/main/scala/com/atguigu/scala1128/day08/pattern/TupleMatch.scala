package com.atguigu.scala1128.day08.pattern

/**
 * Author atguigu
 * Date 2020/4/29 16:05
 */
object TupleMatch {
    def main(args: Array[String]): Unit = {
        /*val t: Any = (10, 20)
        t match {
            case (a:String , b)=>
                println(a)
                println(b)
        }*/
        /*val t = (1,(2,(3,(4,5))))
        println(t._2._2._2._2)
        t match {
            case (_,(_,(_,(_,a)))) =>
                println(a)
        }*/
        
        val map = Map("a" -> 97, "b" -> 98)
        map.foreach(kv => {
            kv match {
                case (k, v) => println(v)
            }
        })
    }
}
