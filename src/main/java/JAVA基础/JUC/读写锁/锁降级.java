package JAVA基础.JUC.读写锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 18:44 2021/7/9
 * @ Description：读写锁的降级过程
 */
public class 锁降级 {
    public static void main(String[] args) {
        //可重入读写锁对象
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock(); //获取读写锁
        Lock readLock = readWriteLock.readLock();
        Lock writeLock = readWriteLock.writeLock();
        //锁降级
        writeLock.lock(); //获取写锁
        System.out.println("lzyWrite");

        //获取读锁
        readLock.lock();
        System.out.println("---lzyRead");

        //释放写锁
        writeLock.unlock();
        //释放读锁
    }
}
