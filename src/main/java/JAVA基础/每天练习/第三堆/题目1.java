package JAVA基础.每天练习.第三堆;

import java.util.Scanner;
import java.util.Vector;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 10:22 2021/7/8
 * @ Description：1.使用编写程序的方式,从键盘接收 5个数,然后找到他们里边,最的大那个数和最小的那个数.
 */
public class 题目1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;
        for (int i = 0; i < 5; i++) {
            int put = scanner.nextInt();
            if (i == 1) {
                max = put;
                min = put;
            }
            if (max < put) {
                max = put;
            }
            if (min > put) {
                min = put;
            }
            System.out.print(put+"  ");
        }
        System.out.println("最大值:"+max);
        System.out.println("最小值:"+min);
    }
}
