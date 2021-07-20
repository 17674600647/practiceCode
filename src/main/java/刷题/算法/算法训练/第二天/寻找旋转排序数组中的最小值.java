package 刷题.算法.算法训练.第二天;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author ：lzy
 * @ Date       ：Created in 19:16 2021/7/20
 * @ Description：寻找旋转排序数组中的最小值
 */
public class 寻找旋转排序数组中的最小值 {
    public static void main(String[] args) {
        System.out.println(new Solution().findMin(new int[]{31, 23, 5, 67, 20, 1321, 333}));
    }
}

class Solution {
    public int findMin(int[] nums) {
        int[] ints1 = Arrays.stream(nums).sorted().toArray();
        return ints1[0];
    }
}