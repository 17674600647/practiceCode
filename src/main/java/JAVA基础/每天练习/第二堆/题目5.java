package JAVA基础.每天练习.第二堆;

import java.util.Scanner;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 10:13 2021/7/8
 * @ Description：编写程序实现，键盘输入三个数，然后通过关系运算符来找到里边最大的。
 */
public class 题目5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            a = a > b ? a : b;
            a = b > c ? b : c;
            System.out.println("最大值:" + a);
        }

    }
}
