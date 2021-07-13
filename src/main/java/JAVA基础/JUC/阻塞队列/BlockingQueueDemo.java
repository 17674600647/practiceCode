package JAVA基础.JUC.阻塞队列;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 19:32 2021/7/9
 * @ Description：测试
 */
public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new ArrayBlockingQueue<String>(3);


        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("b"));
        System.out.println(blockingQueue.add("c"));
        try {
            blockingQueue.put("c");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.peek());

    }
}
