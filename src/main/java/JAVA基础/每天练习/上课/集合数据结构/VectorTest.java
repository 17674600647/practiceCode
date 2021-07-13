package JAVA基础.每天练习.上课.集合数据结构;

import lombok.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Vector;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 8:51 2021/7/8
 * @ Description：
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<Student> vector = new Vector();

        vector.add(new Student("xx", 70013.5));
        vector.add(new Student("cc", 2153.5));
        vector.add(new Student("aa", 893.5));
        vector.add(new Student("nn", 6473.5));
        Collections.sort(vector);

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
        Collections.sort(vector, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore() < o2.getScore()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        System.out.println("---------");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }


}

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
class Student implements Comparable<Student> {
    private String name;
    private double score;

    @Override
    public int compareTo(Student o) {
        if (this.score < o.score) {
            return 1; //1存右边
        } else {
            return -1;
        }
    }
}