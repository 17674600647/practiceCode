package 刷题.算法;

import java.util.Arrays;

/**
 * @author ：lzy
 * @ Date       ：Created in 19:20 2021/7/14
 * @ Description：
 */
public class 柠檬水找零 {
    public static void main(String[] args) {
        System.out.println(new Solution().lemonadeChange(new int[]{5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5}));
    }

    static class Solution {
        public boolean lemonadeChange(int[] bills) {
            int flag5 = 0;
            int flag10 = 0;
            for (int i = 0; i < bills.length; i++) {
                if (bills[i] == 5) {
                    flag5++;
                }
                if (bills[i] == 10) {
                    flag10++;
                    flag5--;
                    if (flag5 < 0) {
                        return false;
                    }
                }
                if (bills[i] == 20) {
                    if (flag10 >= 1) {
                        flag10--;
                    } else {
                        flag5--;
                        flag5--;
                    }

                    flag5--;
                    if (flag5 < 0) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}

