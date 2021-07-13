package JAVA基础.JUC.线程辅助类;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 16:41 2021/7/9
 * @ Description：
 */

//集齐7颗龙珠召唤神龙
public class CyclicBarrierDemo {

    private static final int NUMBER = 7;

    public static void main(String[] args) {
        //创建CyclicBarrier
        CyclicBarrier cyclicBarrier = new CyclicBarrier(NUMBER, () -> {
            System.out.println("集齐7颗龙珠召唤神龙");
        });
        //集齐7颗龙珠过程
        for (int i = 0; i < 7; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "♥龙珠");
                try {
                    cyclicBarrier.await(); //注意这里
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i)).start();
        }

    }
}
