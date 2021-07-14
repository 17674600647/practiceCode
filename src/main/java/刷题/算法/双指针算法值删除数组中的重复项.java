package 刷题.算法;

/**
 * @author ：lzy
 * @ Date       ：Created in 16:32 2021/7/14
 * @ Description：
 */
public class 双指针算法值删除数组中的重复项 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] == nums[j] && j - i >= 1) {
            }
            if (nums[i] != nums[j] && j - i > 1) {
                nums[i + 1] = nums[j];
                i = i + 1;
            }
            if (nums[i] != nums[j] && j - i == 1) {
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] x = {1,1,2};
        System.out.println(removeDuplicates(x));
    }
}
