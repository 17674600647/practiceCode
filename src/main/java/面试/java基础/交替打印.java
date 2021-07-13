package 面试.java基础;

/**
 * @author ：lzy
 * @ Date       ：Created in 16:04 2021/7/13
 * @ Description：
 */
public class 交替打印 {
    public static void main(String[] args) {
        threadTest threadTest = new threadTest();
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

class threadTest {
    int flag = 1;

    public synchronized void show1() {
        while (flag != 1) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("1");
        flag=2;
        this.notifyAll();
    }

    public synchronized void show2() {
        while (flag  != 2) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("2");
        flag=3;
        this.notifyAll();
    }
    public synchronized void show3() {
        while (flag  != 3) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("3");
        flag=1;
        this.notifyAll();
    }
}