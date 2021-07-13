package JAVA基础.每天练习.基础练习;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 13:45 2021/7/10
 * @ Description：队列 有很多种:使用栈，和队列来进行存放string类型的数据，然后进行编写他的相应的方法。入队，出队，进栈，出栈， 判断空，判断满。等等
 */
public class 队列练习 {
    public static void main(String[] args) {
        Queue strings = new ArrayBlockingQueue<>(5);
        Queue strings1X = new ArrayBlockingQueue<>(5);
        Queue strings2 = new LinkedList();
        Queue strings2X = new LinkedList();
        Queue strings3 = new LinkedBlockingQueue(5);
        //hashmap的底层是哈希表
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Integer count = 0;
        while (true) {
            count++;
            String next = scanner.next();
            if (next.equals("1")) {
                Object remove = strings.remove();
                System.out.println(remove);
                Object poll = strings1X.poll();
                System.out.println(poll);
                System.out.println("移除完成");
                Integer s = map.get(poll);
                System.out.println("map:" + s);
                continue;
            }
            if (next.equals("2")) {
                //没有就会抛异常
                Object element = strings.element();
                System.out.println(element);
                System.out.println(strings1X.peek());
                Integer s = map.get(element);
                System.out.println("map:" + s);
                continue;
            }
            if (next.equals("3")) {
                Set<Map.Entry<String, Integer>> entries = map.entrySet();
                System.out.println("第一种遍历方式");
                entries.forEach((s) -> {
                    System.out.println(s);
                });
            }
            if (next.equals("4")) {
                System.out.println("第二种遍历方式");
                Set<String> strings1 = map.keySet();
                strings1.forEach((s) -> {
                    System.out.println(map.get(s));
                });
            }
            boolean add = strings.add(next);
            System.out.println(add);
            boolean offer = strings1X.offer(next);
            System.out.println(offer);
            System.out.println("---添加完成----");
            map.put(next, count);

            
        }


    }
}
