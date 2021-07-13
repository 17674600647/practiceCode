package JAVA基础.每天练习.上课.集合数据结构;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 16:00 2021/7/8
 * @ Description：treeSet测试
 */
public class SetTest {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        students.add(new Student("niubi", 24));
        students.add(new Student("niubi2", 2433));
        students.add(new Student("niubi3", 243));
        System.out.println(students.size());
        System.out.println(students);


    }
}
