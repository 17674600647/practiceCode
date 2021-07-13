package JAVA基础.JUC.生产者和消费者;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 8:48 2021/7/12
 * @ Description：生产者消费者模型
 */
public class producerConsumerModel {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Bun beefBun = new Bun("牛肉包", new AtomicInteger(30));
        Condition condition = reentrantLock.newCondition();
        new Thread(new Consumer(beefBun, reentrantLock, condition),"1号消费者").start();
        new Thread(new Consumer(beefBun, reentrantLock, condition),"2号消费者").start();
        new Thread(new Consumer(beefBun, reentrantLock, condition),"3号消费者").start();
        new Thread(new Producer(beefBun, reentrantLock, condition),"1号生产者").start();
        new Thread(new Producer(beefBun, reentrantLock, condition),"2号生产者").start();
        new Thread(new Producer(beefBun, reentrantLock, condition),"3号生产者").start();
    }
}
