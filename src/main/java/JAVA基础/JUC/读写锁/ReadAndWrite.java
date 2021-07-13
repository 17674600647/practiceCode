package JAVA基础.JUC.读写锁;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 18:05 2021/7/9
 * @ Description：多线程操作模拟缓存
 */

class MyCache {
    //创建map集合
    private volatile Map<String, Object> map = new HashMap<>();


    private ReadWriteLock rwlock = new ReentrantReadWriteLock();

    //放数据
    public void put(String key, Object value) {
        rwlock.writeLock().lock(); //上一把写锁
        try {
            System.out.println(Thread.currentThread().getName() + "正在写操作" + key);
            TimeUnit.MICROSECONDS.sleep(300);
            map.put(key, value);
            System.out.println(Thread.currentThread().getName() + "写完了" + key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rwlock.writeLock().unlock();
        }
    }

    public Object get(String key) {
        //添加读锁
        rwlock.readLock().lock();
        Object result = null;
        //暂停一会
        try {

            System.out.println(Thread.currentThread().getName() + "正在读取" + key);
            TimeUnit.MICROSECONDS.sleep(300);
            result = map.get(key);
            System.out.println(Thread.currentThread().getName() + "取完了" + key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rwlock.readLock().unlock();
        }
        return result;
    }

}

public class ReadAndWrite {
    public static void main(String[] args) {
        MyCache myCache = new MyCache();
        //创建线程从里面取
        for (int i = 0; i < 6; i++) {
            final int num = i;
            new Thread(() -> {
                myCache.put(num + "", num + "");
            }, String.valueOf(i)).start();
        }

        for (int i = 0; i < 6; i++) {
            final int num = i;
            new Thread(() -> {
                myCache.get(num + "");
            }, String.valueOf(i)).start();
        }
    }
}
