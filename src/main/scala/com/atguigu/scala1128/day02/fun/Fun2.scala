package com.atguigu.scala1128.day02.fun

/**
 * Author atguigu
 * Date 2020/4/21 14:23
 */
object Fun2 {
    def main(args: Array[String]) {
        //        val r = add(3, 4)
        //        println(r)
        
        /* foo()
         foo
     
         println(add(3, 4))*/
        /*val r: Unit = foo()
        println(r)
        1*/
        
        foo
        
    }
    
    def foo = {
        println("foo...")
    }
    
    /*def foo() {  // 过程!
        println("foo...")
    }*/
    
    /*def foo() :Unit = {
        1
       return ""
    }
    */
    /*def add(a: Int, b: Int): Int = {
        return a + b
    }
    
    def foo() = {
        println("foo...")
    }*/
    
    // definition
    /* def add(a: Int, b: Int): Int = {
         a + b
     }*/
    //    def add(a: Int, b: Int): Int = a + b
    
    //    def add(a: Int, b: Int) = a + b
}

/*
void add(int a, int b){
}

定义函数(方法):
    def add(a: Int, b: Int): Int = {
        // 具体实现
    }
    
    1. 如果没有return, 则自动把最后一行的值返回
    2. 如果函数实现只有一行代码, 则 { }可以省略
    3. 如果内部没有时候用return, 则返回值的类型也可以省略,
            scala编译器会根据最后一行得到值的类型进行自动推导
    4. 如果在调用函数的时候, 如果没有参数则愿括号可以省略
    
    关于返回值:
    5. 如果没有return, 则自动把最后一行的值返回
    6. 如果有return, 则代码执行到return会结束函数, 返回return后面的值.
        这个时候返回值类型就 不能推导了!!!
        
    7. 如果函数的返回值声明为 Unit, 那么在函数内部, 不管你return的值是什么,
        返回的就用于是Unit
    8. 如果你的返回值是 Unit, 那么这个时候,其实可以省略掉  :Unit=
    
    关于声明:
    9. 其实在声明的时候, 如果参数的个数是 0, 那么声明的时候, 圆括号也可以省略.
        这个时候调用的时候, 圆括号就必须省略!!!
        
    
 */