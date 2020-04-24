package a;

/**
 * @Author lzc
 * @Date 2020/4/24 15:11
 */
public class ExtendsDemo1 {
    public static void main(String[] args) {
        B b = new B();
        A a = b;
        /*a.foo(10);
        a.eat();*/
        System.out.println(b.a);  // 20
        System.out.println(a.a);  // 10 20
    }
}

abstract class A{
    public int a = 10;

    protected A foo(int a) throws RuntimeException{
        System.out.println("A foo");
        return null;
    }
    abstract public void eat();

}
class B extends A{
    public int a = 20;
    @Override
    public A foo(int b) throws RuntimeException {
        System.out.println("B foo");
        return null;
    }

    public void eat(){
        System.out.println("eat...");
    }

}
