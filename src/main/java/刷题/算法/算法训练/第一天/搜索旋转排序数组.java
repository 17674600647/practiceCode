package 刷题.算法.算法训练.第一天;

/**
 * @author ：lzy
 * @ Date       ：Created in 17:45 2021/7/19
 * @ Description：搜索旋转排序数组
 */
public class 搜索旋转排序数组 {
    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }
    private static class Solution {
        public int search(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }
}
