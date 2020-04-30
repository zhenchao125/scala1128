package com.atguigu.scala1128.day09.extra

/**
 * Author atguigu
 * Date 2020/4/30 15:29
 */
class User {
    val buffer = new Array[Int](10)
    
    def apply(index: Int) = buffer(index)
    
    def update(index: Int, value: Int) = {
        buffer(index) = value
    }
}

object Extra1 {
    def main(args: Array[String]): Unit = {
        //!2 = 8  // !2 = 10 -2  !2 = 10 - 3
        //        println(!2)
        //        println(!4)
        /*val user = new User
        user(0) = 100 // user.update(0, 100)
        user(1) = 200 // user.update(1, 200)
        println(user(0))*/
        
        /* val f = foo _
         f()
         
         val a_+ = 10*/
        
        //        val opt:Option[Int] = Some(10)
        val opt: Option[Int] = None
        opt match {
            case Some(a) =>
                println(a)
            case None =>
                println("None")
        }
        
        
    }
    
    def foo1(list: List[_]) = {
    
    }
    
    def foo = {
        println("foo...")
    }
    
    implicit class RichInt(n: Int) {
        // 后置
        // def ! = 10
        def unary_! : Int = 10 - n
    }
    
    
}

trait A {
    _: Exception =>
    this.printStackTrace()
    
}

/*
1. 中置运算符
   1 + 2
2. 一元运算符
    后置
        1 toString
    前置
        +5
        -5
        !false  取反
        ~2  按位取反
3. apply方法
    任何对象都可以 调用
    对象(...)   // 对象.apply(...)
    伴生对象
    普通的对象
    函数对象
4. update方法
        user(0) = 100 // user.update(0, 100)
        
5. _ 总结
    https://stackoverflow.com/questions/8000903/what-are-all-the-uses-of-an-underscore-in-scala
    1. 导包, 通配符 _
            import java.util.Math._
    2. 屏蔽类
            import java.util.{HashMap => _, _}
    3. 给可变参数传值的时候, 展开
            foo(arr:_*)
    4. 元组元素访问
            t._1
    5. 函数参数的占位符
            reduce(_ + _)
    6. 方法转函数
        val f = foo _
        
    7. 给属性设置默认值
            class A{
                var a: Int = _  // 给a赋值默认的0
            }
    8. 模式匹配的通配符
        case _ =>   // 匹配所有
    
    9. 模式匹配集合
        Array(a, b, rest@_*)
        
    10. 部分应用函数
        math.pow(_, 2)
        
    11. 在定义标识符的时候, 把字符和运算符隔开
            val a_+ = 10
            a+ // 错误
    12. List[_]
            泛型通配符
    
    13. 自身类型
        _: Exception =>


 */