package com.atguigu.scala1128.day09.extra


/**
 * Author atguigu
 * Date 2020/4/30 16:53
 */
object PureFunction {
    
    def main(args: Array[String]): Unit = {
        // 一定要有副作用
        foo
    }
    
    def foo: Unit = {
        3 + 4
        4 + 5
        println("xxxx")
        
    }
    
    
    def add(a: Int, b: Int) = {
        a + b
    }
}

/*
纯函数:
    1. 没有副作用
        - 向控制台打印东西
        - 向文件写入数据
        - 更改了外部的变量
        - 向其他存储系统写入数据
        
    2. 引用透明
        这个函数执行的结果, 只和参数有关, 不依赖于其他的任何值!
        
 好处:
    1. 不用考虑线程安全问题
    2. 可以通过缓存技术, 来提升计算的效率
    
过程:
    没有返回值, 只有符副作用的函数, 就叫过程
    
    
 */