package JAVA基础.JUC.线程间通信;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 11:11 2021/7/9
 * @ Description：share类
 */
public class ShareLock {
    //初始值
    private int number = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public  void incr() throws InterruptedException {
        lock.lock();
        try {
            while (number != 0) {
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName() + "::" + number);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public  void decr() throws InterruptedException {
        lock.lock();
        try {
            while (number != 1) {
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + "::" + number);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
