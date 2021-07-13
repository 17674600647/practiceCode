package 面试.java基础.多线程交替打印实现方式;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ：lzy
 * @ Date       ：Created in 16:25 2021/7/13
 * @ Description：Lock锁实现
 */
public class Lock实现 {
    public static void main(String[] args) {
        ThreadDemo3 threadTest = new ThreadDemo3();
        new Thread(() ->

        {
            while (true) {
                threadTest.show1();
            }

        }).start();
        new

                Thread(() ->

        {
            while (true) {
                threadTest.show2();
            }
        }).start();
        new

                Thread(() ->

        {
            while (true) {
                threadTest.show3();
            }
        }).start();
    }

}

class ThreadDemo3 {
    ReentrantLock lock = new ReentrantLock();
    private int flag = 1;

    public void show1() {
        lock.lock();
        try {
            while (flag == 1) {
                System.out.println("1");
                flag = 2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void show2() {
        lock.lock();
        try {
            while (flag == 2) {
                System.out.println("2");
                flag = 3;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public void show3() {
        lock.lock();
        try {
            while (flag == 3) {
                System.out.println("3");
                flag = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}