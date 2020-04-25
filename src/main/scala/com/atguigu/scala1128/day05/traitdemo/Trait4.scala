package com.atguigu.scala1128.day05.traitdemo

/**
 * Author atguigu
 * Date 2020/4/25 15:31
 */
object Trait4 {
    def main(args: Array[String]): Unit = {
        val c = new C
        c.eat()
        c.foo()
    }
}

class A {
    def foo() = {
        println("A... foo")
    }
}

/*trait B extends A {
    def eat() = {
        println("B ... eat")
        foo()
    }
}*/
/*trait B{
    // s就是A类型的对象
    s: A =>
    
    def eat()= {
        println("B ... eat")
        s.foo()
    }
    
}*/
trait B {
    // that就是A类型的对象
    //    that: A =>
    _: A =>
    
    def eat() = {
        println("B ... eat")
        //        that.foo()
        this.foo()
    }
}

class C extends A with B