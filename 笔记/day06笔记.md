# 一 昨日内容回顾

1. 单例对象

   ```scala
   object A{
       def foo() = {}
       val a = 10
   }
   ```

   在`scala`中, 这个`A`就是一个对象.

   ```scala
   A.foo()  // 调用对象A的方法
   ```

2. 伴生类和伴生对象

   - 在同一个文件中, `object`的名字和`class`名字相同
   - 他们之间可以互相访问对方的私有成员(翻译成字节码之后, 他们其实在一个类中)

3. `apply`

   - 任何对象都可以调用.  `对象(...)`
   - 等价于`对象.apply(...)`

4. 抽象类

   - 比普通类多了抽象字段和抽象方法, 而且必须使用`abstract`修饰

   - 不能直接`new`对象
   - 也是单继承

5. `trait`

   - 实际使用, 就把`trait`当做`java`的接口
   - 多混入(`mixin`, 叠加)
   - 也可以有实现好的方法, 抽象方法, 抽象字段, 实现好的字段.
   - 构造器, 可以认为只有一个默认的无参构造器.

6. 类型的判断和强转

   - 判断
     - `java`: ` a instanceof B`
     - `scala: a.isInstanceof[B]`
   - 强转
     - `java: (B)a`
     - `scala:  a.asInstanceof[B]`

7. 枚举

   - 用的最多的还是使用的`java`的枚举.
   - 模拟枚举
   - `Enumeration`

8. `App`类, 知道. 以后尽量不用. `spark`中使用, 会有问题.

   少些一个`main`函数

# 二 隐式转换

是`scala`一个高级特性, 也是`scala`源码不太好理解的地方.

1. 使用隐式转换函数
2. 隐式类(其实对隐式转换函数一种简化), 出现的比较慢 `2.1.X`
3. 隐式参数和隐式值

## 2.1 隐式转换函数

```scala
// 在作用域内只能有一个, 如果有多个 Double=> Int 那么这个时候, 隐式转换就不会发生
implicit def double2Int(d: Double): Int = d.toInt

val a: Int = 10.1 // Double=> Int
```

重要功能: 对已有的类做功能扩展

```scala
object ImplicitDemo2 {
    def main(args: Array[String]): Unit = {
        // 读取文本文件中的内容  java: IO
        implicit def file2RichFile(file: File) = new RichFile(file)
        
        val content = new File("C:\\Users\\lzc\\Desktop\\class_code\\2019_11_28\\01_scala\\scala1128\\src\\main\\scala\\com\\atguigu\\scala1128\\day06\\implicitdemo\\ImplicitDemo2.scala").readContent
        println(content)
    }
}

class RichFile(file: File) {
    
    // 这个方法要真正的去封装读 文件 内容的代码
    def readContent: String = {
        // Array(1,2,3,4)  => arr.mkString   "1234"
        // Array(1,2,3,4)  => arr.mkString(",")   "1,2,3,4"
        Source.fromFile(file, "utf-8").mkString
    }
}
```

### 总结

1. 什么时候会用到隐式转换

   - 把 `A`类型的值, 赋值给`B`类型的时候,` A`和`B`没有任何的关系, 这个时候会去找一个隐式转换(`A => B`),如果还有有, 则编译成功,将来自动把 A转成B之后, 赋值给B

     ```scala
     val a: A = new A
     val b:B = a   // 会找隐式转换
     ```

   - 在调用一个对象`a`的方法(`foo`)的时候, 如果这个对象`a`没有这样的方法, 那么会找一个隐式转换, 这个隐式接受一个 `A`类型的对象, 返回一个新的新的对象, 新的对象中有`foo`, 就成功了

     ```scala
     implicit def a(file:File) = new RichFile(file)
     val content = new File("..").readContent
     //RichFile中有一个readContent方法
     ```

2. 隐式转换需要做什么

   - 写一个隐式转换函数

     - 函数名没有限制, 随意
     - 参数一定是你原来的类型
     - 返回值一定是你新定义的类型
     - `implicit def a(file:File) = new RichFile(file)`

   - 写一个自定义类型(能够完成以前的类没有的功能)

     - 自定义一个类: 主构造接受已有的类型

     - 在定义一个你需要的方法

       ```scala
       class RichFile(file: File){
       	def readContent = {}
       }
       ```

## 2.2 隐式类

用`implicit`修饰的类就是隐式类

- 好处: 省略去写隐式转换函数

- 隐式类可以看成是隐式转换函数的升级版!!! 

- 隐式类不能是顶级类, 只能是内部类.

  (`implicit`不能修饰顶级元素)

```scala
implicit class RichFile(file: File) {
    // 这个方法要真正的去封装读 文件 内容的代码
    def readContent: String = {
        // Array(1,2,3,4)  => arr.mkString   "1234"
        // Array(1,2,3,4)  => arr.mkString(",")   "1,2,3,4"
        Source.fromFile(file, "utf-8").mkString
    }
}
```

## 2.3 隐式参数和隐式值

配合使用

```scala
implicit val aaa: Int = 100

def main(args: Array[String]): Unit = {
    foo
}

// a是隐式参数, 将来调用的时候根据需要,可以不传
// 让scala自动帮助我们传递, 找一个隐式值
def foo(implicit a: Int) = {
    println(a)
}
```

注意

- 找隐式值的时候, 只看类型, 不看变量的名字

- 在作用域内, 只能有一个同类型的隐式值

- 一个隐式参数列表内, 如果有多个参数, 则这些参数都是隐式的

- 如果一个函数, 有很多参数, 有些用是隐式参数, 有些不是, 怎么办?

  对函数左柯里化

  - 使用两个参数列表
  - 第一个是必须要传
  - 第二个里面是隐式参数

- 如果使用隐式值, 则圆括号也要省略

- ```, 
  省略括号, 表示在使用 隐式值,  加上括号, 表示使用默认值
  ```

## 2.4 隐式转换函数,隐式类,隐式值  的查找路径问题

1. 在当前作用域中查找
2. 去***相关类型***的***伴生对象***中查找!!!  如果有泛型, 泛型也是相关的.

# 三 集合

集合框架

`java`的集合框架

1. 数组
2. `List`, `Set`, `Map`

`scala`

所有的集合框架他们有一些共同的方法, 这方法虽然操作的集合不同, 但是用法基本相同.

提供了很多的高阶函数, 可以操作集合中的元素

> `scala.collection`



## 3.1 数组

### 定长数组(不可变数组, 长度不可变)

底层其实本质就是`java`的数组:长度不能变, 元素可以变换

> 创建数组
>
> 1. 直接给元素初始化
>
>    ```scala
>    val arr: Array[Int] = Array[Int](10, 20, 30)
>    ```
>
> 2. 使用`new`来创建
>
>    ```scala
>    new Array[Int](length)
>    ```

几个数组可用的的运算符

1. `:+` 用来在数组的尾部添加元素

2. `+:` 用来在数组的头部添加元素

   运算符的结合性: 

   ```
   a + b   左结合
   a = 30  右结合
   潜规则:
   	如果一个运算符以 : 结尾,那么他就是右结合
   
   100 +: arr 等价于 arr.+:(100)
   ```

3. `++` 合并两个数组

### 可变数组

