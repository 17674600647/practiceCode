package 刷题.算法.算法训练.第三天;

import java.util.*;

/**
 * @author ：lzy
 * @ Date       ：Created in 19:00 2021/7/21
 * @ Description：给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。  来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/3sum 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * https://leetcode-cn.com/problems/3sum/
 * /
 * <p>
 * <p>
 * /
 */
public class 三数之和 {
    public static void main(String[] args) {
        new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4}).forEach((s) -> {
            s.forEach((x) -> {
                System.out.println(x);
            });
        });
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            //如果遍历到大于0就结束了
            if (nums[i] > 0) {
                return result;
            }
            //如果i>0而且相等
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            //左边指针
            int left = i + 1;
            //右边指针
            int right = nums.length - 1;

            while (right > left) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (right > left && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    while (right > left && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    right--;
                    left++;
                }
            }
        }
        return result;
    }
}