package JAVA基础.JUC.线程辅助类;

import java.util.concurrent.CountDownLatch;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 16:33 2021/7/9
 * @ Description：
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "离开了");
                countDownLatch.countDown();
            }, String.valueOf(i)).start();
        }
        new Thread(()->{
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("班长锁门了");
        }).start();

    }

}
