package JAVA基础.JUC.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 20:03 2021/7/9
 * @ Description：一池可扩容
 */
public class CachedThreadExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //10个顾客
        try {
            for (int i = 0; i <10 ; i++) {
                executorService.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"办理业务");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //放回线程池
            executorService.shutdown();
        }

    }
}
