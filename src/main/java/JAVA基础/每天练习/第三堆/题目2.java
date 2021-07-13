package JAVA基础.每天练习.第三堆;

import java.util.Scanner;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 10:38 2021/7/8
 * @ Description：使用编程的方式实现从键盘输用户名字和密码然后能使用 &&的方法判断.他们成功.然后在换成 &实现后面的密码数字能够自加
 */
public class 题目2 {
    public static void main(String[] args) {
        int mima = 123456;
        String username = "lzy";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("用户名:");
            String putUsername = scanner.next();
            System.out.println("密码");
            int putMima = scanner.nextInt();
            if (putUsername.equals(username) & mima == putMima) {
                System.out.println("账号密码正确!");
                System.out.println(putMima + 456);
                break;
            }
        }
    }
}
