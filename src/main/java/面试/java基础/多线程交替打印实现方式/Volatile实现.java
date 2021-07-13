package 面试.java基础.多线程交替打印实现方式;

/**
 * @author ：lzy
 * @ Date       ：Created in 16:21 2021/7/13
 * @ Description：Volatile实现
 */
public class Volatile实现 {


    public static void main(String[] args) {
        ThreadTest2 threadTest = new ThreadTest2();
        new Thread(() -> {
            while (true) {
                threadTest.show1();
            }

        }).start();
        new Thread(() -> {
            while (true) {
                threadTest.show2();
            }
        }).start();
        new Thread(() -> {
            while (true) {
                threadTest.show3();
            }
        }).start();
    }
}

class ThreadTest2 {
    private volatile int flag = 1;

    public  void show1() {
        while (flag == 1) {
            System.out.println(flag);
            flag = 2;
        }
    }

    public  void show2() {
        while (flag == 2) {
            System.out.println(flag);
            flag = 3;
        }
    }

    public  void show3() {
        while (flag == 3) {
            System.out.println(flag);
            flag = 1;
        }
    }
}
