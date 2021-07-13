package JAVA基础.每天练习.第一堆;

import java.util.Scanner;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 16:49 2021/7/6
 * @ Description：编写程序,从键盘上输入两个数,然后计算这两个数的 ,和,差,积,商,余数
 */
public class 题目5 {
    public static void main(String[] args) {
        题目5 题目5x=new 题目5();
        题目5x.startScanner();
    }

    public void startScanner() {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        while (true) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            calculation(a, b);
        }
    }

    public void calculation(int a, int b) {
        //和,差,积,商,余数
        System.out.println("和:" + (a + b));
        System.out.println("差:" + (a - b));
        System.out.println("积:" + (a * b));
        System.out.println("商:" + (a / b));
        System.out.println("余数:" + (a % b));


    }
}
