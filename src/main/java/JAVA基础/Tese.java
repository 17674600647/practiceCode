package JAVA基础;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 11:19 2021/7/8
 * @ Description：测试
 */
public class Tese {
    public static void main(String[] args) {
        //test1();
        int[] x = new int[25];
        System.out.println(x[24]);

    }

    private static void test1() {
        Vector vector = new Vector();
        Stack stack = new Stack();
        List copyOnWriteArrayList = new CopyOnWriteArrayList();


        LinkedList linkedList = new LinkedList();
        //添加
        linkedList.add("d");
        linkedList.offer("da");
        //移除
        linkedList.remove();
        linkedList.poll();
        //检查
        linkedList.element();
        linkedList.peek();
    }
}
