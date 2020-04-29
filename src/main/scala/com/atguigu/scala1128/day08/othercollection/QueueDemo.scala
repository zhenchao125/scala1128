package com.atguigu.scala1128.day08.othercollection

import scala.collection.mutable

/**
 * Author atguigu
 * Date 2020/4/29 11:45
 */
object QueueDemo {
    def main(args: Array[String]): Unit = {
        val queue: mutable.Queue[Int] = mutable.Queue(10, 20, 30, 40)
        queue.enqueue(50, 60)
        println(queue)
        queue.dequeue()
        queue.dequeue()
        queue.dequeue()
        println(queue)
    }
}

/*
队列:
    FIFO 先进先出
    入队  enqueue
    出队  dequeue
 */