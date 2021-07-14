package 刷题.算法;

import java.util.Collection;

/**
 * @author ：lzy
 * @ Date       ：Created in 19:37 2021/7/14
 * @ Description：合并数组
 */
public class 合并数组 {
    public static void main(String[] args) {
        System.out.println(new Solution().fib(1000));
    }
    static class Solution {
        public int fib(int n) {
            if (n == 1 || n == 2) {
                return 1;
            }
            return fib(n - 1) + fib(n - 2);
        }
    }
}
