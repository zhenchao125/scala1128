package com.atguigu.scala1128.day09.generic

/**
 * Author atguigu
 * Date 2020/4/30 14:11
 */
class Animal

class Pet extends Animal

class Dog extends Pet

class Cat extends Pet

class Earth

object GenericDemo3 {
    def main(args: Array[String]): Unit = {
        foo(new Pet)
        foo(new Animal)
        foo(new Dog)
        foo(new Object)
        foo(new Earth)
        foo(1)
    }
    
    def foo[T >: Pet](t: T) = {
        println("pet ...")
    }
    
}
