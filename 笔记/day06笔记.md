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
2. 隐式类
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



