package JAVA基础.每天练习.上课.集合数据结构;

import java.util.LinkedList;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 15:30 2021/7/8
 * @ Description：链表
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("d0a");
        linkedList.add("d1a");
        linkedList.add("d2a");

        linkedList.addFirst("d00a");
        linkedList.addLast("d00a");
        linkedList.getFirst();
        linkedList.getLast();
        linkedList.removeFirst();
        linkedList.forEach(s-> System.out.println(s));
    }
}
