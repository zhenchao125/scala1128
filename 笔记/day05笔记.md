# 一. 昨日内容复习

1. 函数和方法区别

2. 部分应用函数

3. 面向对象

   - 属性自带`getter`和`setter`
   - `BeanProperty` 生产标准的`setter和getter`

4. 继承

   - 关键字 `extendes`
   - 方法的继承
     - 两同两小一大
   - 属性的继承
     - `var`只能覆写抽象的`var`
     - `val`可以覆写`val`和没有参数的`def`

5. 抽象类

   - 相比普通类多了 抽象属性和抽象方法
   - 抽象属性
     - 只有属性名和类型, 没有对属性进行初始化
   - 抽象方法
     - 只有签名, 没有实现

6. 包

   - 包的声明

     - 和`java`一样的

     - 一个文件可以有多个声明语句`package ...`

     - 包语句(一般不适用)

       ```scala
       package a{
           
       }
       ```

       

   - 包的导入

     - 和`java`一样, 在文件的最顶部
     - 可以在任何位置导入
     - 通配符导入  `_`
     - 给导入的类起别名

   - 包对象(包对象)

7. 访问控制

   - 默认(`public`)

   - `protected`

     - 调用父类的方法

       ```scala
       super.foo()  // 正确
       new Father().foo() // 错误
       ```

   - `private`

     ```scala
     private[a] ..
     //a包内可以访问到
     ```

# 二. 单例对象

```scala
object 对象名{
    // 也可以写代码
    def main(args: Array[String]){
        // 入口
    }
}
```



# 三. 伴生类和伴生对象

```scala
object User{
    // 也可以写代码
    def main(args: Array[String]){
        // 入口
    }
}
class User(val age: Int){
    
}
```



1. `class`的名字和`object`的名字相同, 就是伴生类和伴生对象
2. 他们可以互相访问对方的私有成员
3. 伴生类和 伴生对象必须在同一个`.scala`文件中
4. 将来编译成字节码之后, 站在`java`的角度, 伴生对象中的都是为成为静态成员, 伴生类中的成员都会成为非静态成员.

## `apply`

函数的特点是可以调用! 

其实, 在`scala`中, ***任何对象***也可以像函数一样去调用执行.

```scala
//函数调用:
函数名(参数 )  // 函数名.apply(参数)
// 对象调用
对象名(参数)   // 等价于去调用对象的 apply方法
```

注意:  

1. 其实函数也可以通过apply进行调用.  (方法不行), 如果是方法, 先把方法转成函数在使用.
2. **伴生对象**的`apply`, 通常情况是返回***伴生类的对象***, 然后在外面创建对象的时候, 可以省略`new`
3. 普通类中的`apply`, 一般根据具体的业务逻辑来实现.
4. `apply` 也可以重载

# 四.`trait`

特质(`trait`)

`java`中接口不够面向面向对象, 就有`trait`

接口:   实现

特质:  混入

特质的本质: 字节码之后, 还是接口

特质是支持多混入!!!

## 都可以有哪些成员

抽象类能有的成员, 那么特质都可有

1. 属性
2. 方法
3. 抽象属性
4. 抽象方法
5. 构造器(主/辅)

> `java`接口:
>
> 1.  1.8之前: 是抽象方法和常量的集合
> 2. 从1.8开始, 默认方法

## `trait`和抽象类的区别

`trait`可以多混入, 抽象类只能单继承

## 混入多个`trait`

```
class A extends t1 with t2 with t3...
```

## 叠加冲突

多个`trait`有相同实现好的方法的时,会产生冲突

1. 解决方案1

   在子类中把冲突的方法给覆写一下

   ![](http://lizhenchao.oss-cn-shenzhen.aliyuncs.com/1587798598.png)

2. 做一个"菱形(钻石)"

   ![](http://lizhenchao.oss-cn-shenzhen.aliyuncs.com/1587798865.png)

   冲突的方法最终使用的是最后叠加的那个!!!

   - 初始化的是, 一个`trait`最多初始化一次
   - 初始化的时候是从父开始, 从左
   - `super.foo()`不是真正的找父类, 而是按照叠加的顺序向前找
   - `super[T12].foo()` 明确指定这个`super`应该是哪个类



## 特质继承类

1. 方法1

   ```scala
   class A{
       def foo() = {
           println("A... foo")
       }
   }
   
   
   trait B extends A{
       def eat() = {
           println("B ... eat")
           foo()
       }
   }
   // extends 要么是A要么A的子类
   class C extends A with B
   ```

2. 使用自身类型(`selftype`)

   ```scala
   trait B{
       // s就是A类型的对象
       s: A =>
       
       def eat()= {
           println("B ... eat")
           s.foo()
       }
   }
   ```

   ## 动态叠加

   在`java`中所有的继承关系都应该在定义类是确定好.

   `scala`支持特质的动态叠加. 在创建对象的时候, 可以临时只针对整个对象来叠加特质

   ```scala
   object Trait5 {
       def main(args: Array[String]): Unit = {
           val h = new H with F1
           h.foo()
       }
   }
   
   class H
   
   trait F1 {
       def foo() = println("f1 foo...")
   }
   ```

   以后真正用的时候, 就把`trait`当做一个普通的接口来用!!!

# 5. 补充的一些值

1. 类型的判断和墙转

```scala
object Extra1 {
    def main(args: Array[String]): Unit = {
        val a:A = new B
        // java中判断类型:   a instanceof B
        if (a.isInstanceOf[B]) {  // 判断a是否为B的对象
            val b = a.asInstanceOf[B] // a转换B的类型
            b.foo()
        }
    }
}

class A
class B extends A{
    def foo() = println("foo...")
}
```

2. 枚举类

   - 使用`java`的来定义

   - `scala`自己模拟枚举类

     有个类型, 他的对象是预先创建好的有限个对象.

     > 密封类

   - 使用`scala`提供父类来完成

3. `scala`中的内部类

   类型投影

   ```scala
   def foo(obj: Outer#Inner)
   ```

   



