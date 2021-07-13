package JAVA基础.每天练习.第二堆;


import java.util.Scanner;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 8:46 2021/7/7
 * @ Description：通过键盘输入 大写的字母或者小写的字母，然后能够自动判断，把大写转换成小写，小写转换成大写
 */
public class 题目二 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String next = scanner.next();
            char[] chars = next.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if ('a' <= chars[i] && chars[i] <= 'z') {
                    chars[i] -= 32;
                } else if ('A' <= chars[i] && chars[i] <= 'Z') {
                    chars[i] += 32;
                }
            }
            System.out.println(new String(chars));
        }
    }
}
