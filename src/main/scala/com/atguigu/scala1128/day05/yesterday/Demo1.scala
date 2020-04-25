package com.atguigu.scala1128.day05.yesterday

/**
 * Author atguigu
 * Date 2020/4/25 8:48
 */
object Demo1 {
    def main(args: Array[String]): Unit = {
        val dog = new Jinmao("大黄", 10, "male")
        println(dog.name)
        println(dog.age)
        
    }
}

class Animal(var name: String, var age: Int, var sex: String){
    def this(){
        this("a", 10, "male")
    }
}

// 如果是var类型, 则子类就可以不用添加属性了, 只需要接受参数, 给父的主构造初始化
class Dog(name: String, age: Int, sex: String) extends Animal(name, age, sex)
class Jinmao(name: String, age: Int, sex: String) extends Dog(name, age, sex)

/*
	需求 一个动物类 animal
	一个dog类 DOG
	一个金毛类 jinmao
	关系是父类 animal 子类Dog 孙子类 金毛
	如果animal有一个主构造器（name age sex）
	金毛类也有一个主构造器（name age sex） 那么发生重载
	我希望要一个可以get set的属性，所以选择了var
	为什么不能override var指定的属性呢，如果遇到这个情况该如何处理，
	如果用val不就只能get了么
 */