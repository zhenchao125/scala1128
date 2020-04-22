package com.atguigu.scala1128.day03.high

/**
 * Author atguigu
 * Date 2020/4/22 10:49
 */
object High4 {
    def main(args: Array[String]): Unit = {
        //        foreach(arr, (a: Int) => println(a))
        /*foreach(arr, x => {
            println(x)
            println(x * x)
            println(x * x * x)
        })*/
        
        //        foreach(arr, println)
        
        
        /*//        val arr1 = filter(arr, x => x > 20)
        //        val arr1 = filter(arr, x => x % 2 == 0)
        //        val arr1 = filter(arr, _ % 2 == 0)
        val arr1 = filter(arr, x => x % 3 == 0)
        foreach(arr1, println)*/
        
        /*val arr = Array(3, 5, 70, 6, 10, 20)
        val arr1 = map(arr, x => x + 10)
        foreach(arr1, println)*/
        
        // 打印出来一个数组中所有正数的平方根 !
        /*val arr1 = Array(-30, 50, -70, 60, -10, 20)
        // 1. 过滤出来正数
        val arr2 = filter(arr1, _ >= 0)
        // 2. 计算出来正数的平方根
        val arr3 = map(arr2, x => math.sqrt(x))
        // 3. 遍历打印
        foreach(arr3, println)*/
        
        
        val arr1 = Array(30, 50, 70, 60, 10, 20)
        println(reduce(arr1, (last, current) => last + current))
    }
    
    /*
        reduce:
            如何完成这个聚合?
        
    
     */
    def reduce(arr: Array[Int], op: (Int, Int) => Int): Int = {
        if(arr.length <= 0) return 0
        // 聚合操作
        // 表示上一次的聚合结果
        var lastResult = arr(0)
        for (i <- 1 until arr.length) {
            lastResult = op(lastResult, arr(i))
        }
        lastResult
    }
    
    /*
        map:
            映射 一进一出
     */
    def map(arr: Array[Int], op: Int => Double): Array[Double] = {
        // for推导
        for (ele <- arr) yield op(ele)
    }
    
    /*
    过滤操作:
        只留下来满足  条件  的元素, 不满足的去掉.
        关于条件: 应该是一个 Int => Boolean 值
        最后返回的是过滤后的数组
     */
    def filter(arr: Array[Int], condition: Int => Boolean) = {
        // for 推导
        for (ele <- arr if condition(ele)) yield ele
    }
    
    /*
        foreach 是一种, 可以用他完成遍历数组中元素的作用.
        遍历到元素之后, 你想对这元素做什么(通过函数告诉foreach), 只有调用者才清楚
     */
    def foreach(arr: Array[Double], op: Double => Unit) = {
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