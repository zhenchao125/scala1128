package com.atguigu.scala1128.day05.single

/**
 * Author atguigu
 * Date 2020/4/25 10:37
 */
object ApplyDemo1 {
    def main(args: Array[String]): Unit = {
        /*A()   // 等价于 A.apply()
        A.apply()
        val a = new A
        a()*/
        
        
        (foo _).apply(10)
        
        
    }
    
    
    def foo(a:Int) = println("foo...")
}


object A{
    def apply() = println("A... apply")
}
class A{
    
    def apply() = println("class A ... apply")
    
}