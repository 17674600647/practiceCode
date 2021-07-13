package 面试.java基础;

/**
 * @author ：lzy
 * @ Date       ：Created in 15:00 2021/7/13
 * @ Description：
 */
public class 垃圾回收器 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            new Demo();
        }
        System.gc();
    }
}

class Demo extends Object {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("垃圾被回收了!");
    }
}