package 刷题.算法.算法训练.第一天;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ：lzy
 * @ Date       ：Created in 16:58 2021/7/19
 * @ Description：在排序数组中查找元素的第一个和最后一个位置
 */
public class 在排序数组中查找元素的第一个和最后一个位置 {
    public static void main(String[] args) {

        Arrays.stream(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)).forEach(s -> {
            System.out.println(s);
        })
        ;

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && result[0] == -1) {
                result[0] = i;
            }
            if (nums[i] == target) {
                result[1] = i;
            }
        }
        return result;
    }


}
