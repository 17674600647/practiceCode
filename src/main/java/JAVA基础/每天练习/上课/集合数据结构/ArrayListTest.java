package JAVA基础.每天练习.上课.集合数据结构;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 14:19 2021/7/8
 * @ Description：ArrayList类
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<Object> objects = Collections.synchronizedList(new ArrayList<>());
        Iterator<Object> iterator = objects.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        //新特性遍历java8遍历
        objects.forEach(s -> System.out.println(s));
        objects.forEach(System.out::println);
    }
}
