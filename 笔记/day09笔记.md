# 一. 昨日内容回顾

1. 排序

   - `sorted`

     借助于`Ordering`或`Ordered`

   - `sortBy`

     根据指标进行排序

     `sortBy(x => (,,))(Ordering.Tuple3(Ordering.Int, ...))`

   - `sortWith`

     ```scala
     sortWith((x, y) => {
         // 返回值是true  x =< y
         // false x > y
     })
     ```

2. `Stack, Queue, Stream`

3. 模式匹配

   - 匹配变量和常量

     `case  a => `

     `case A => `

   - 匹配类型

     ```scala
     case a:Int => 
     case arr: Array[Int] =>
     case list:List[_] => 
     ```

   - 守卫

     ```scala
     case a:Int if a > 3 => 
     case arr: Array[Int] =>
     case list:List[_] => 
     ```

   - 匹配内容

     ```scala
     Array
     List
     元组  // 模式匹配中的用的特别的多   
     ```

   - 匹配对象

     ```scala
     case A(a) => 
     
     unapply(...): Option[Int] = ...
     ```

# 二 样例类

   对象匹配, 必须要手动在伴生对象中去实现一个`def unapply`方法.

   样例他主要就是为模式匹配而生.

   `case class`

   其实就是`scala`, 替我们实现很多方法, 这些方法大部分可以直接使用.

   ```scala
   apply
   unapply
   hashCode
   equals
   ...
   ```

   ```scala
   case class User(age: Int, name:String)
   
   1. 写在主构造中的属性默认都是val. 如果有需要可以改成var的
   2. 默认实现了很多方法
   	apply
       unapply
       hashCode
       equals
   3. 使用场景
   	- 模式匹配
   	- 替代 java bean
       - 作为进程间通信的通讯协议
   ```

   ## 在变量声明的时候使用模式匹配

   ## 偏函数

  ```scala
val list = List(10, "a", false, 20, 30)
// List(20, 40, 60)
// filter + map
val f: PartialFunction[Any, Double] =  new PartialFunction[Any, Double] {
    // 如果这个函数返回true, 则会对这个x进行处理(交给apply进行处理)
    override def isDefinedAt(x: Any): Boolean = x match {
        case _: Int => true
        case _ => false
    }

    override def apply(v1: Any): Double = v1 match {
        case a:Int => a * 2
    }
}
val list2 =  list.collect(f)  // 等价于了 filter + map
println(list2)
  ```

定义方式2:

用一对大括号括起来的`case`语句, 就是一个偏函数

   ```scala
{ case ...=>}
   ```

# 三 异常处理

`java`中: 

都是继承自`Exception`

特点: 代码会变的比较健壮

- 运行时异常

  只有在运行的时候才有可能产生, 在源码中,可以处理, 也可以不处理

- 编译时异常(受检异常)

  在源码的时候,必须处理. `IO, 网络`

  

在`scala`中,  所有的异常, 都可以处理, 也可以不处理.

用法:

1. 处理

   - 使用`try catch finally`

   - 抛出异常类型(`java: throws` `scala: 注解`)

     ```scala
     @throws(classOf[RuntimeException])
     @throws(classOf[IllegalArgumentException])
     ```

2. 主动抛出

   ```scala
   throw new IllegalArgumentException
   ```

   

   scalac: 编译scala源码

   scala: 进行运行

   ----

    scala 源码.scala 

   当脚本用来(内部会先编译, 再运行)

# 四. 泛型

 泛型:  类型的参数化

```
int a = 10
```

- 泛型类
  - 泛型定义在类上, 然后这个泛型在类的内部的任何位置都可以使用
- 泛型方法(函数)
  - 泛型定义在方法上, 泛型只能在这个方法使用.

> `scala`泛型为啥是`[ ]`
>
> `scala`原生支持`xml`, 标签都是用`<user>`, 尖括号用这里
>
> 就用`[ ]`
>
> 集合通过下标访问, `( )`

## 泛型的上限界定和下限界定

```scala
[T <: Ordered[T]]  // 上限
```

```scala
[T >: Pet]  // 下限. 推导的时候,不能和上限一样
```

## 三变

```scala
class MyList[T]

class Father
class Son extends Father
```

不变

​	`MyList[Son] 和 MyList[Father] 没有任何的"父子关系"`

```scala
错误:  val fs: MyList[Father] = new MyList[Son] 
默认情况下, 所有泛型都是不变的!!!
class MyList[T]
```

协变

```scala
val fs: MyList[Father] = new MyList[Son]  // 正确的

class MyList[+T]
```

逆变

```scala
val fs: MyList[Son] = new MyList[Father]  // 正确的

class MyList[-T]
```

## 上下文界定(泛型)

```scala
def max[T](x: T,y:T)(implicit ord: Ordering[T]) = {
    if(ord.gt(x, y)) x
    else y
}
```

```scala
[T:Ordering]
这就是泛型上下文.
表示: 一定有一个隐式值  Ordering[T] 类型的隐式值
```

上下文泛型的本质其实是对***隐式参数和隐式值***的封装!!!

## 视图界定

视图界定是对象***隐式转换函数***的封装!!!

```scala
def max[T <% Ordered[T]](x: T, y: T) :T = {
    if(x > y) x
    else y
}


/*def max[T](x: T, y: T)(implicit f:  T => Ordered[T]) :T = {
        if(x > y) x
        else y
    }*/
```

```scala
/*
1. 中置运算符
   1 + 2
2. 一元运算符
    后置
        1 toString
    前置
        +5
        -5
        !false  取反
        ~2  按位取反
3. apply方法
    任何对象都可以 调用
    对象(...)   // 对象.apply(...)
    伴生对象
    普通的对象
    函数对象
4. update方法
        user(0) = 100 // user.update(0, 100)
        
5. _ 总结
    https://stackoverflow.com/questions/8000903/what-are-all-the-uses-of-an-underscore-in-scala
    1. 导包, 通配符 _
            import java.util.Math._
    2. 屏蔽类
            import java.util.{HashMap => _, _}
    3. 给可变参数传值的时候, 展开
            foo(arr:_*)
    4. 元组元素访问
            t._1
    5. 函数参数的占位符
            reduce(_ + _)
    6. 方法转函数
        val f = foo _
        
    7. 给属性设置默认值
            class A{
                var a: Int = _  // 给a赋值默认的0
            }
    8. 模式匹配的通配符
        case _ =>   // 匹配所有
    
    9. 模式匹配集合
        Array(a, b, rest@_*)
        
    10. 部分应用函数
        math.pow(_, 2)
        
    11. 在定义标识符的时候, 把字符和运算符隔开
            val a_+ = 10
            a+ // 错误
    12. List[_]
            泛型通配符
    
    13. 自身类型
        _: Exception =>


 */
```

