package JAVA基础.每天练习.上课.集合数据结构;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 19:26 2021/7/8
 * @ Description：map的测试类
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Student, Student> hashMap = new HashMap();
        //添加方法.put
        hashMap.put(new Student("xiaoxin1", 8900), new Student("xiaoxinp1", 780400));
        hashMap.put(new Student("xiaoxin2", 8900), new Student("xiaoxinp2", 78040));
        hashMap.put(new Student("xiaoxin3", 8900), new Student("xiaoxinp3", 78000));
        hashMap.put(new Student("xiaoxin4", 8900), new Student("xiaoxinp4", 7800330));
        System.out.println(hashMap);
//        Student xiaoxin2 = hashMap.remove(new Student("xiaoxin2", 8900));
//        System.out.println(xiaoxin2);
//        System.out.println(hashMap);
//        System.out.println(hashMap.isEmpty());
//        hashMap.clear();
//        System.out.println(hashMap.isEmpty());
//        boolean xiaoxin3 = hashMap.containsKey(new Student("xiaoxin3", 8900));
//        System.out.println(xiaoxin3);
//        System.out.println(hashMap.size());
        //遍历1
//        Set<Student> students = hashMap.keySet();
//        students.forEach(s-> System.out.println(s));
        //遍历2
//        Set<Map.Entry<Student, Student>> entries = hashMap.entrySet();
//        entries.forEach(s-> System.out.println(s));
        Collection<Student> values = hashMap.values();
        values.forEach(s-> System.out.println(s));
    }
}
