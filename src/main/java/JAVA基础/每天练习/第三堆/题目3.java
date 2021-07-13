package JAVA基础.每天练习.第三堆;

import javax.xml.soap.SAAJMetaFactory;
import java.util.Scanner;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 10:41 2021/7/8
 * @ Description：通过键盘输入两个数然后比较他们那个大那个小
 */
public class 题目3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.println(a>b?a:b);
        }
    }
}
