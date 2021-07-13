package JAVA基础.JUC.线程间的定制化通信;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 14:28 2021/7/9
 * @ Description：定制化线程资源类
 */
public class ShareResource {
    private int flag = 1;
    private Lock lock = new ReentrantLock();
    //创建3个condition
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();

    //打印5次
    public void printA() {
        //lock上锁
        lock.lock();
        try {
            while (flag != 1) {
                condition1.await();
            }

            System.out.println("A");
            flag = 2;
            condition2.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    //打印5次
    public void printB() {
        //lock上锁
        lock.lock();
        try {
            while (flag != 2) {
                condition2.await();
            }

            System.out.println("B");
            flag = 3;
            condition3.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    //打印5次
    public void printC() {
        //lock上锁
        lock.lock();
        try {
            while (flag != 3) {
                condition3.await();
            }

            System.out.println("C");
            flag = 1;
            condition1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
