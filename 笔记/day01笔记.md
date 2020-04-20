# day01笔记

## 1. scala和java的关系

## 2. 环境搭建

### window环境搭建

- 准备java环境
- 解压 zip
- 配置环境变量
  1. SCALA_HOME
  2. PATH

###idea环境搭建

1. 安装支持scala开发的插件(装完重启)
2. 创建maven project

3. 添加 scala 的支持

   ![](http://lizhenchao.oss-cn-shenzhen.aliyuncs.com/1587350706.png)

4. 创建一个 object 

   ![](http://lizhenchao.oss-cn-shenzhen.aliyuncs.com/1587350744.png)

   

5. 创建main函数   (main, 提示, 回车)

### 关联源码

1. 解压源码, 最好和scala的安装的目录在一起, 方便管理

2. 关联

   ![](http://lizhenchao.oss-cn-shenzhen.aliyuncs.com/1587352959.png)



## 3. 变量和常量

```scala
scala中如何声明变量和常量:
    变量
        var a: Int = 20
        注意: 变量声明的时候必须初始化. 不能延后初始化
            当使用变量的再去声明.
            
    常量
        val c: Int = 10
        注意: 1. 必须声明的时候进行初始化scala
       
              2.不能重新赋值   b = 200 ×
实际开发的时候, 能用常量的地方, 绝对不要用变量.
```

### 类型推导

```scala
var a = 30
    1. 如果在声明的时候没有指定类型, 则会根据初始化的值自动进行类型的推导
    2. 不要理解成动态类型. 
    3. 类型推导不是万能, 有些情况不能推导.
```

## 4. 标识符的命名规范

1. 按照java的规范(数字字母)
  
- 下划线的使用要注意, 在scala中下划线有很多特殊的含义
  
2. 可以使用所谓的的运算符作为标识符
   - `+-*/  `   ...
   - 至少两个. 而且不能和字母混用

3. 如果有必要, 其实还可以使用任意的字符作为标识符

   反引号括起来

## 5. 字符串的输出

```scala
// 1. 使用java的输出
System.out.println("abc");
// 2. scala的输出
println("ahc")
// 3. 格式化输出
val a = 20
//        println("a = " + a)
// 参考的传统的c语言
printf("a = %d %s %.2f", a, "1128班", math.Pi)
```

## 5.1 字符串插值

### s插值(重要)

```scala
val a = 10
val b = 20
s"a = ${a * 10}, b= ${b * 100}"
```

### raw插值

```scala
val r = raw"\r \n \t"
```

## 5.2 字符串模板(多行字符串)

```scala
val sql =
"""
|select
|    *
|from user
|where id > 10
|""".stripMargin
```

- 多行字符串配合字符串插值使用非常的方便

## 5.3 从简单读取数据

```scala
// 从键盘读数据
// 1. java: 使用System.in直接读, 做一些封装
val reader = new BufferedReader(new InputStreamReader(System.in))
val line: String = reader.readLine()
println(line)
// 2. java: jdk 1.5之后, Scanner
val scanner = new Scanner(System.in)
val line2: String = scanner.nextLine()
println(line2)
// 3. scala
//        println("请输入你的银行卡密码: ")
val line3: String = StdIn.readLine("请输入你的银行卡密码: ")
println(line3)
```

## 5.4 数据类型

### 5.4.1 . java的数据类型

- 基本数据类型

  ```scala
  八大基本数据类型:
  byte short int long char(0-65535)
  float double
  boolean
  ```

- 引用数据类型(对象类型)

  所有的类型都是引用类型.   (String)

  基本类型的包装类

### 5.4.2 scala的数据类型

```scala
Any
	AnyVal	值类型
		对应着java的基本类型
		
	AnyRef	引用类型

```

1. Unit

   java中  void (方法不需要返回值的时候, 使用void) 关键字

   Unit 表示类型, 既然是类型, 就应该有值 (). 用来替换java中的那个void

   `Int -> 1, 2 ...`

   `Unit -> ()`

2. Null

   `java:  User a = null`

   `scala: Null 类型, 它有一个值 null`

   所有引用类型的类型.

3. Nothing

   是scala中, 最底层的类型.是任何类型的子类型. 

   而且, 他没有任何的对象. 

   一般用于辅助类型的推导. 当代码非正常结束, 则值就是nothing

### 5.4.3 值型转换

1. 自动类型转换(类型的提升)

    从范围小的->范围大的  才会自动转换

   `Byte -> Short->Int->Long->Float->Double`

   `Char -> Int->....`

2. 强制类型转换

   ```
   .toInt .toDouble...
   ```

3. 和String之间的转换
   - 值-> string     .toString
   - String->值     .toInt

## 5.5 运算符

在scala中, 本质上是没有运算符的. 运算符的本质其实是方法名

在scala中, 调用方法的时候, 可以省略点 .,  如果参数只有一个或者没有,则( )括号也可以省

当省略了点和圆括号之后, 方法名就是运算符了.

方法和运算符的区别:

1. 调用方法必须有 .,  运算符是省略点的
2. 调用方法是没有优先级. 就是按照调用顺序来执行
3. 运算符有优先级



## 总结

1. java和scala的关系

2. 声明变量和常量

3. 字符串的插值和多行字符串  重点

4. 数据类型

   - Unit
   - Null

   - Nothing
   - Any
   - AnyRef
   - AnyVa

5. 类型的转换

   - 强制转换   .to...
   - 字符串->值  "true".toBoolean

6. 运算符的本质

   - 方法名省略而来 (省略调用的.和圆括号)





