package JAVA基础.每天练习.第二堆;

import java.util.Scanner;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 16:58 2021/7/6
 * @ Description：通过键盘输入两个数和一个符号（比如+,-,*,/）然后通过你输入的符号来进行相应的运算
 */
public class 题目1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double a = scanner.nextDouble();
            String s = scanner.next();
            double b = scanner.nextDouble();
            calculation(a, s, b);
        }
    }

    public static void calculation(double x, String symbol, double y) {
        switch (symbol) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            default:
                System.out.println("输入有误!");
        }
    }

}
