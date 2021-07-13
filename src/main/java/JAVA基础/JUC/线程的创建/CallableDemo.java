package JAVA基础.JUC.线程的创建;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 16:08 2021/7/9
 * @ Description：
 */

class CallableDemo2 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return null;
    }
}

class RunnableDemo2 implements Runnable {

    @Override
    public void run() {

    }
}

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new Thread(new RunnableDemo2(), "dsa").start();

        FutureTask futureTask = new FutureTask(() -> {
            return 1024;
        });
        new Thread(futureTask).start();
        while (!futureTask.isDone()) {
            System.out.println(futureTask.isDone());
        }

        System.out.println(futureTask.get());


    }
}
