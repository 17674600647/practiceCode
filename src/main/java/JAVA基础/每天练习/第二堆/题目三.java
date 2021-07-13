package JAVA基础.每天练习.第二堆;

import java.util.Scanner;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 9:57 2021/7/8
 * @ Description：通过键盘输入用户名和密码，用户名是字符串，密码为数字，然后通过判断，如果成功把用户名和密码再输出出来 ，输出的时候对密码进行加密 比如在密码的基础上+1234，并使用到转义字符中的\t
 */
public class 题目三 {
    public static void main(String[] args) {
        int mima = 123456;
        String username = "lzy";

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("用户名:");
            String putUsername = scanner.next();
            System.out.println("密码");
            int putMima = scanner.nextInt();
            if (putUsername.equals(username) && mima == putMima) {
                System.out.println("账号密码正确!");
                System.out.println(putMima + 456);
                break;
            }
        }

    }
}
