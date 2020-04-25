package com.atguigu.scala1128.day05.homework

/**
 * Author atguigu
 * Date 2020/4/25 9:12
 */
object Homework1 {
    def main(args: Array[String]): Unit = {
        /*val card = new Card("A", "♦")
        println(card.isRed)
        println(card)*/
        
        val account : BankAccount = new CheckingAccount(1000)
        val balance = account.deposit(100)
        println(balance)
        println(account.withdraw(100))
        
    }
}

class BankAccount(initialBalance: Double) {
    private var balance = initialBalance
    
    def deposit(amount: Double) = {
        balance += amount
        balance
    }
    
    def withdraw(amount: Double) = {
        balance -= amount
        balance
    }
}
class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance){
    // 1000
    override def deposit(amount: Double): Double = {
        super.deposit(amount - 1)
    }
    
    override def withdraw(amount: Double): Double = {
        super.withdraw(amount + 1)
    }
}


class Card(val point: String, val color: String) {
    def isRed = color == "♦" || color == "♥"
    
    override def toString: String = color
}


/*
4. 编写一个扑克牌只能有 4 种花色,让其 toString 方法分别返回,,,，
    并实现一个函数,检查某张牌的花色是否为红色
5. 扩展如下的 BankAccount类，新类 CheckingAccount 对每次存款和取款都收取1美元的手续费

    class BankAccount(initialBalance: Double) {
        private var balance = initialBalance

        def deposit(amount: Double) = {
            balance += amount
            balance
        }

        def withdraw(amount: Double) = {
            balance -= amount
            balance
        }
    }

6. 设计一个Point类，其x和y坐标可以通过构造器提供。
     提供一个子类 LabeledPoint，其构造器接受一个标签值和x,y坐标,比如:new LabeledPoint(“Black Thursday”,1929,230.07)

7. 定义一个抽象类 Shape，一个抽象方法 centerPoint，以及该抽象类的子类 Rectangle 和 Circle。
为子类提供合适的构造器，并重写centerPoint方法, 并提供计算面积的方法 (根据需要添加相应的属性)
 */