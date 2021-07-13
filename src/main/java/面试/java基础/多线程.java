package 面试.java基础;

import java.util.concurrent.*;

/**
 * @author ：lzy
 * @ Date       ：Created in 14:31 2021/7/13
 * @ Description：
 */
public class 多线程 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new MyThread().start();
        new Thread(new MyThread2()).start();
        FutureTask<Integer> integerFutureTask = new FutureTask<>(new MyThread3());
        new Thread(integerFutureTask).start();
        while (!integerFutureTask.isDone()) {
            try {
                System.out.println(integerFutureTask.isDone());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            System.out.println(integerFutureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 5, 60,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardPolicy());
        Future<?> submit = threadPoolExecutor.submit(integerFutureTask);
        while (!submit.isDone()){
            System.out.println("没完成");
        }
        System.out.println(submit.get());

    }
}


class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread");
    }
}

class MyThread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable");
    }
}

class MyThread3 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("Callable");
        return 12;
    }
}