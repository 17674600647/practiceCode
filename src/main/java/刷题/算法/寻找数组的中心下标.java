package 刷题.算法;

/**
 * @author ：lzy
 * @ Date       ：Created in 17:02 2021/7/14
 * @ Description：https://leetcode-cn.com/problems/find-pivot-index/
 */
public class 寻找数组的中心下标 {
    public static void main(String[] args) {
        System.out.println(new Solution().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}

class Solution {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            long sumL = 0;
            long sumR = 0;
            for (int j = 0; j < i; j++) {
                sumL = sumL + nums[j];
            }
            for (int j = i+1; j < nums.length; j++) {
                sumR = sumR + nums[j];
            }
            System.out.println("L:"+sumL+"---R:"+sumR+"---I:"+i);
            if (sumL == sumR) {
                return i;
            }
        }
        return -1;
    }
}