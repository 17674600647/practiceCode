package 刷题.算法;

import java.util.Arrays;

/**
 * @author ：lzy
 * @ Date       ：Created in 19:10 2021/7/14
 * @ Description：三角形最大的周长
 */
public class 求三角形最大的周长 {
    public static void main(String[] args) {
        System.out.println(new Solution().largestPerimeter(new int[]{2,1,2}));
    }

    static class Solution {
        public int largestPerimeter(int[] nums) {
            Arrays.sort(nums);
            System.out.println(Arrays.stream(nums).sum());
            for (int i = nums.length - 1; i > 1; i--) {
                if (nums[i - 2] + nums[i - 1] > nums[i]) {
                    return nums[i - 2] + nums[i - 1] + nums[i];
                }
            }
            return 0;
        }
    }
}

