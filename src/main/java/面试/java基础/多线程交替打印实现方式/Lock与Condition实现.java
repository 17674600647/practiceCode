package 面试.java基础.多线程交替打印实现方式;

import java.sql.Connection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ：lzy
 * @ Date       ：Created in 19:42 2021/7/13
 * @ Description：Lock.new Condition
 */
public class Lock与Condition实现 {
    public static void main(String[] args) {
        ThreadDemo4 threadTest = new ThreadDemo4();
        new Thread(() ->
        {
            while (true) {
                threadTest.show1();
            }

        }).start();
        new Thread(() ->

        {
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

class ThreadDemo4 {
    ReentrantLock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();

    public void show1() {
        lock.lock();
        try {
            while (true) {
                System.out.println("1");
                condition2.signal();
                condition1.await();
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
            while (true) {
                System.out.println("2");
                condition3.signal();
                condition2.await();
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
            while (true) {
                System.out.println("3");
                condition1.signal();
                condition3.await();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
