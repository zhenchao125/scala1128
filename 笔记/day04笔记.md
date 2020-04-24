# Day04笔记

## 1. 复习

hash值:  默认情况是通过一种hash算法, 得到一个值, 这个值就是将来对象在堆内存中的值.

`hashCode`这个方法, 默认返回了这个`hash`值, 

自定义类的时候, 一般为了比较两个对象是否相等,一般会覆写这个方法, 一旦覆写, 这和内存地址就没有任何关系了.

System类中, 提供了一个方法, 可以获取对象原始的hash值(内存地址)`System.identityHashCod`

### 名调用换个无参函数的区别

```scala
def main(args: Array[String]): Unit = {
    // 1. 调用时
    foo1{
        println(" => Int  .....")
        1
    }
    foo2(() => {
        println(" () => Int")
        1
    })
}

def foo1(f:  => Int) = {
   val i =  f  // 表示执行传过来的代码块
    println(i)
    f
}

def foo2(f:() => Int) = {
    f()
}
```

### 高阶函数

定义

自定义了几个高阶函数 `filter, foreach, map, reduce`

闭包  一个函数和这个函数的环境(他访问到的外部的变量), 闭包可以延长局部遍历的生命周期, 而且可以实现了在函数的尾部访问到了函数的局部遍历

柯里化  把一个参数列表中的多个参数, 变成多个参数列表,  柯里化.  后期用的特别多, 可以简化函数的调用.

匿名函数   

匿名函数的传递 简化

名调用和值调用

控制抽象(名调用的使用)  能看懂别人在使用

递归   一定要清楚你这个函数在干什么, 参数表示什么含义, 返回值表示什么含义.  最好把注释写明白

尾递归 找到累计器

## 2. 函数和方法的区别

```
方法和函数的区别:
1. 定义方式不一样
    a: 方法定义
        def 方法名(参数类别): 返回值类型 = {  // 方法的实现}
        
        def foo(a: Int, b:Int) = {
        
        }
    b: 函数定义
        (参数列表) => { //函数体}
        (a: Int, b:Int) => a + b
        
2. 有匿名函数, 但是没有匿名方法
      匿名函数   (a: Int, b:Int) => a + b
      
3. 函数也可以有名字
      val/var f: (Int, Int) => Int = (a: Int, b: Int) => a + b
      f就是函数名

4. 方法调用的时候, 如果参数只有一个或者没有参数则圆括号可以省略
    函数的圆括号不能省略
    
    // foo2是方法
    MethodFunction foo2 10
    MethodFunction.foo2(10)
    this foo2 10

    // f1是函数, 则调用的不能省略圆括号
    val f1 = () => println("无参函数...")
    f1()
5.  函数可以作为值传递和作为返回值返回, 但是方法不行
        换句话说, 在给高阶函数传递参数的时候, 只能传函数, 不能传方法.

6. 在使用的时候, 不产生歧义的情况下, scala会自动的根据需要把方法转成函数!!!
    手动转:
        有方法 add10
        转函数: val a = add10 _
       
        ''
7.  方法可以重载/覆写, 函数不能重载/覆写

8. 以后使用的时候, 不用关注他们的区别, 就把函数和方法当成一个东西来时候.
    如果发现编译不通过, 就改成比较完整的写法
```

## 3. 面向对象

面向对象3大特征

`scala`的面向的理论和`java`完全一样, 具体实现方式不一样

## 3. 类和对象

###定义类

```scala
class User1
```

属性只的默认初始化值:

- 数字    0
- 布尔型  false
- 引用型  null

### 特征

1. 类和java一样, 默认有空构造器, 但是一旦有定义构造器, 则不会再默认提供空构造器了

2. 给类定义的所有的属性都是私有.

3. 但是会给这些私有属性添加公共的`getter`或`setter`

   ```scala
   public class com.atguigu.scala1128.day04.obj.User2 {
     private java.lang.String name;
     private final int age;
     public java.lang.String name();   // getter
     public void name_$eq(java.lang.String);  // setter
     public int age();
     public com.atguigu.scala1128.day04.obj.User2(java.lang.String, int);
   }
   
   ```

4. 在访问属性的时候, 约定是访问公共的`getter`方法

   ```
   println(user.name)
   其实是访问的
   public java.lang.String name();
   ```

5. 在修改属性值的时候, 会默认访问`setter方法`

   ```scala
   user.name = "zs"
   其实访问的是
   public void name_$eq(java.lang.String)
   ```

6. 在主构造中, 如果没有`val/var`, 那么这个参数在有些情况(在类内部地方用到)下也会成为属性, 但是私有, 没有提供公共的getter和setter

7. `scala`自动提供的`setter和getter` 不符合标准的`java bean` 规范

   > `java bean`:
   >
   > `public String getName(){  }`
   >
   > `public void SetName(String name){  }`

   由于`scala`的生态不完善, `scala`大量的使用专门为`java`准备的那些类库, 这些类库, 他们在底层一般要用到标准的`java`的`getter和setter`

   所以, 要添加标准的`java`的`getter和setter`

8. 使用注解添加标准`bean`

   ```
   class User2(@BeanProperty var name: String, @BeanProperty val age: Int, @BeanProperty sex: String)
   ```

   如果要用到`java`的类库, 最好加上.

### 构造器重载

`scala`也支持构造器的重载.

整体分两种构造器

1. 主构造器

   紧跟着类名

2. 辅助构造器

   和柱构造构成了重载关系

   功能相比比较弱

   ```scala
   // 定义一个无参辅助构造器
   def this() = {
   
   // 注意: 首行必须是调用自己的主构造器
   this("lisi")
   }
   
   def this(age: Int) = {
       this("lisi")
       this.age = age
   }
   def this(a: Int) = {
       this()
   }
   ```

   注意: 

   1. 只能后定义的调用先定义的
   2. 辅助构造函数的参数, 仅仅是一个普通的参数, 不会成为类的属性

