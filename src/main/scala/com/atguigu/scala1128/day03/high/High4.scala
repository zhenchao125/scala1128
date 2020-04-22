package com.atguigu.scala1128.day03.high

/**
 * Author atguigu
 * Date 2020/4/22 10:49
 */
object High4 {
    def main(args: Array[String]): Unit = {
        val arr = Array(30, 50, 70, 60, 10, 20)
//        foreach(arr, (a: Int) => println(a))
        foreach(arr, x => {
            println(x)
            println(x * x)
            println(x * x * x)
            
        })
    }
    
    /*
        foreach 是一种, 可以用他完成遍历数组中元素的作用.
        遍历到元素之后, 你想对这元素做什么(通过函数告诉foreach), 只有调用者才清楚
     */
    def foreach(arr: Array[Int], op: Int => Unit) = {
        // 可以遍历, 但是你得给我个函数, 我遍历到元素之后, 我去调用这个函数
        for (ele <- arr) {
            op(ele)
        }
    }
}

/*
1. foreach
2. map
3. reduce
4. filter
 */