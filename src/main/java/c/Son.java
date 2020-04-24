package c;

import b.Father;

/**
 * @Author lzc
 * @Date 2020/4/24 16:50
 */
public class Son extends Father {
    public void eat(){
        /*Father f = new Father();
        // 能否通过f调用 protected void foo(){ }
        f.foo();*/

        super.foo();
    }

    public static void main(String[] args) {

    }
}
