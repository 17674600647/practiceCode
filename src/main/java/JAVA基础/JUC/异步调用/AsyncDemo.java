package JAVA基础.JUC.异步调用;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author ：lzy
 * @ Date       ：Created in 12:54 2021/7/14
 * @ Description：
 */
public class AsyncDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //同步调用
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().getName() + " CompletableFuture.runAsync");
        });
        completableFuture.get();


        //异步调用
        CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + " CompletableFuture.supplyAsync");
            return 1024;
        });

        //完成之后   t是返回结果,如果有异常,u就是异常信息
        completableFuture1.whenComplete((t, u) -> {
            System.out.println(u);
            System.out.println(t);
        }).get();
    }
}
