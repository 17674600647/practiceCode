package JAVA基础.每天练习.上课;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 10:32 2021/7/7
 * @ Description：7月7号上课
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
class Student {
    private int id;
    private String name;
    private int age;
    private double score;

    //成绩最高的人
    public Student getMaxScoreStudent(Student[] students) {
        Student maxStudent = students[1];
        for (int i = 1; i < students.length; i++) {
            if (students[i].score > maxStudent.score) {
                maxStudent = students[i];
            }
        }
        return maxStudent;
    }

    //成绩最低的
    public Student getMinScoreStudent(Student[] students) {
        Student minStudent = students[1];
        for (int i = 1; i < students.length; i++) {
            if (students[i].score < minStudent.score) {
                minStudent = students[i];
            }
        }
        return minStudent;
    }

    //成绩总和
    public double sumOfGrades(Student[] students) {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
        }
        return sum;
    }

    //和平均成绩
    public double averageScore(Student[] students) {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
        }
        return sum / students.length;
    }

    //找出最低成绩的改为100
    public Student changeMinimumScore(Student[] student) {
        Student minScoreStudent = getMinScoreStudent(student);
        minScoreStudent.setScore(100);
        return minScoreStudent;
    }

}

public class 存班级 {
    public static void main(String[] args) {
        Student[] student = new Student[20];
        for (int i = 0; i < student.length; i++) {
            student[i] = new Student();
            student[i].setId(i);
            student[i].setScore(new Random().nextDouble() * (10-5));
            student[i].setName("老" + i);
            student[i].setAge(new Random().nextInt(20) * (10-5));
        }
        Student student1 = new Student();
        System.out.println(student1.getMinScoreStudent(student));
        System.out.println(student1.getMaxScoreStudent(student));
        System.out.println(student1.sumOfGrades(student));
        System.out.println(student1.averageScore(student));
        System.out.println(student1.changeMinimumScore(student));

    }
}
