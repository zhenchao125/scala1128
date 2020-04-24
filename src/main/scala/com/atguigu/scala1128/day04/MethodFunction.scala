package com.atguigu.scala1128.day04

/**
 * Author atguigu
 * Date 2020/4/24 9:12
 */
object MethodFunction {
    def main(args: Array[String]): Unit = {
        /* foo1
         foo1()
         
         MethodFunction foo2 10
         MethodFunction.foo2(10)
         this foo2 10
         
         val f1 = () => println("无参函数...")
         f1()
         */
        
        
        /*// 调用high只能给high传函数, 不能传方法
        val r = high(x => x + 10)
        println(r)
        
        // 其实是把add10这个方法, 给转成了函数
        val r1 = high(add10)
        println(r1)*/
        high1(abc _)
        
        
        
    }
    
    
    def abc = {
        println("abc....")
    }
    // 高阶算子
    def high1(op: () => Unit) = op()
    
    
    
    def add10(a: Int) = a + 10
    
    
    def high(f: Int => Int) = {
        f(10)
    }
    
    
    def foo2(a: Int) = {
        println("foo2...l")
    }
    
    // 方法
    def foo1() = {
        println("foo1...")
    }
    
    def foo(a: Int, b: Int) = {
    
    }
}

/*
方法和函数的区别:
1. 定义方式不一样
    a: 方法定义
        def 方法名(参数类别): 返回值类型 = {  // 方法的实现}
        
        def foo(a: Int, b:Int) = {
        
        }
    b: 函数定义
        (参数列表) => { //函数体}
        (a: Int, b:Int) => a + b
        
2. 有匿名函数, 但是没有匿名方法
      匿名函数   (a: Int, b:Int) => a + b
      
3. 函数也可以有名字
      val/var f: (Int, Int) => Int = (a: Int, b: Int) => a + b
      f就是函数名

4. 方法调用的时候, 如果参数只有一个或者没有参数则圆括号可以省略
    函数的圆括号不能省略
    
    // foo2是方法
    MethodFunction foo2 10
    MethodFunction.foo2(10)
    this foo2 10

    // f1是函数, 则调用的不能省略圆括号
    val f1 = () => println("无参函数...")
    f1()
5.  函数可以作为值传递和作为返回值返回, 但是方法不行
        换句话说, 在给高阶函数传递参数的时候, 只能传函数, 不能传方法.

6. 在使用的时候, 不产生歧义的情况下, scala会自动的根据需要把方法转成函数!!!
    手动转:
        有方法 add10
        转函数: val a = add10 _
       
        ''
7.  方法可以重载/覆写, 函数不能重载/覆写

8. 以后使用的时候, 不用关注他们的区别, 就把函数和方法当成一个东西来时候.
    如果发现编译不通过, 就改成比较完整的写法
 */
