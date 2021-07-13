package JAVA基础.JUC.线程池;

import java.util.concurrent.*;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 20:37 2021/7/9
 * @ Description：自定义线程池
 */
public class 自定义线程池 {
    public static void main(String[] args) {
        new ThreadPoolExecutor(2,  //2个核心线程
                5,   //5个最大线程数量
                2L,  //存活时间
                TimeUnit.SECONDS,  //2s
                new ArrayBlockingQueue<>(3),  //阻塞队列
                Executors.defaultThreadFactory(),  //默认线程工厂
                new ThreadPoolExecutor.DiscardPolicy() //不搭理策略
        );
    }
}
