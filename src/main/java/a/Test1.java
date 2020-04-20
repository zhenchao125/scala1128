package a;

/**
 * @Author lzc
 * @Date 2020/4/20 16:57
 */
public class Test1 {
    public static void main(String[] args) {
        String a = "a";
        String m = a + "b";
        String n = a + "b";
        System.out.println(m == n);
        System.out.println(System.identityHashCode(m));
        System.out.println(System.identityHashCode(n));
        System.out.println(m.equals(n));
    }
}
