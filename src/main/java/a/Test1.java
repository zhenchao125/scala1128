package a;

/**
 * @Author lzc
 * @Date 2020/4/20 16:57
 */
public class Test1 {
    public static void main(String[] args) {
        /*String a = "a";
        String m = a + "b";
        String n = a + "b";
        System.out.println(m == n);
        System.out.println(System.identityHashCode(m));
        System.out.println(System.identityHashCode(n));
        System.out.println(m.equals(n));*/
        int a = 10;
        int b = 20;
        // 其实是输出的 a = b 这个语句的值
        // 在java中, 赋值语句的值, 是赋值号, 左边的变量的值
        System.out.println(a = b);  // true 20

        foo2(1);
        foo2(1, 2);
        foo2(1, 2, 4);
        foo2(new int[]{1,2,3});

    }

    public void foo(int a){
        a = 100;
    }

    public void foo1(final int a){

    }

    public static void foo2(int ... ss){
        // ss 当做一个数组
    }

}
