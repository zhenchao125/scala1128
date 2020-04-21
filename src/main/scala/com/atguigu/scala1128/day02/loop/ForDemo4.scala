package com.atguigu.scala1128.day02.loop

/**
 * Author atguigu
 * Date 2020/4/21 10:44
 */
object ForDemo4 {
    def main(args: Array[String]): Unit = {
        // 输出1 到 100所有的偶数, 步长只能1
        /*for(n <- 1 to 100 ){
            if(n % 2 == 0){
                // 很多的逻辑, 仅仅是对偶数才去执行这些代码
                
            }
        }*/
        
        // for守卫. 类似于java中的continue
        for (n <- 1 to 100 if n % 2 == 0) {
            println(n)
        }
    }
}
