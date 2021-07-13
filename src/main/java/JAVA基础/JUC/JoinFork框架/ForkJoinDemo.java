package JAVA基础.JUC.JoinFork框架;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 20:58 2021/7/9
 * @ Description：
 */
class MyTask extends RecursiveTask<Integer> {

    //拆分值不能超过10
    private static final Integer VALUE = 10;
    private int begin;//拆分开始值
    private int end;//拆分结束值
    private int result;//拆分返回结果
    //创建有参构造


    public MyTask(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        //判断相加的两个树值是否大于10
        if ((end - begin) <= VALUE) {
            //相加
            for (int i = begin; i < end; i++) {
                result = result + result;
            }
        } else {//进一步拆分
            //获取中间值
            int middle = (begin + end) / 2;

            //拆分左边
            MyTask task = new MyTask(begin, middle);
            //拆分右边
            MyTask task2 = new MyTask(middle + 1, end);
            task.fork();
            task2.fork();
            result = task.join() + task2.join();
        }
        return result;
    }
}

public class ForkJoinDemo {
    public static void main(String[] args) {
        MyTask myTask = new MyTask(0, 100);
        //创建ForkJoinPool池子
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Integer> submit = forkJoinPool.submit(myTask);
        Integer integer = null;
        try {
            integer = submit.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(integer);
    }
}
