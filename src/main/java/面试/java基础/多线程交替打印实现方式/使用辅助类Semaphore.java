package 面试.java基础.多线程交替打印实现方式;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ：lzy
 * @ Date       ：Created in 20:05 2021/7/13
 * @ Description：
 */
public class 使用辅助类Semaphore {
    public static void main(String[] args) {
        ThreadDemo5L threadTest = new ThreadDemo5L();
        new Thread(() ->
        {
            while (true) {
                threadTest.show1();
            }
        }).start();
        new Thread(() -> {
            while (true) {

                threadTest.show2();


            }
        }).start();
        new Thread(() ->
        {
            while (true) {

                threadTest.show3();


            }
        }).start();
    }


}
class ThreadDemo5L {
    Semaphore semaphore = new Semaphore(1);
    int flag = 1;
    public void show1() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (flag==1){
            try {

                System.out.println("1");
                flag=2;
                semaphore.release();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        semaphore.release();
    }
    public void show2() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (flag==2){
            try {

                System.out.println("2");
                flag=3;
                semaphore.release();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        semaphore.release();
    }

    public void show3() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (flag==3){
            try {
                System.out.println("3");
                flag=1;
                semaphore.release();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        semaphore.release();
    }
}
