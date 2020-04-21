package com.atguigu.scala1128.day02.fun

/**
 * Author atguigu
 * Date 2020/4/21 15:34
 */
object Fun5 {
    def main(args: Array[String]): Unit = {
       /* println(add(20, 10))
        println(add(30, 10))
        println(add(40, 20))
        println(add(40))
        println(add(50))
        
        // 位置参数, 所有的语言中, 默认都是按照位置来传参!!!
        add1(100, b = 1000)
        // 命名参数, 就可以按照自己喜欢的顺序,想怎么传就怎么传
        println(add1(b = 2000, a = 1000))
    
        println(add1(a = 200, 2000))*/
        
        add()
    }
    def add(a: Int = 200, b: Int = 100) = a + b
    
    def add1(a: Int = 100, b: Int) = a + b
    
    
}
