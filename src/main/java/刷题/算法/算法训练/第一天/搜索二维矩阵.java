package 刷题.算法.算法训练.第一天;

import java.sql.Connection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ：lzy
 * @ Date       ：Created in 21:05 2021/7/19
 * @ Description：
 */
public class 搜索二维矩阵 {
    public static void main(String[] args) {
        boolean searchMatrix = new Solution().searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3);
        System.out.println(searchMatrix);
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target && target <= matrix[i][matrix[i].length - 1]) {
                int X = binarySearch(matrix[i], target);
                if (X != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    //    /二分查找
    public int binarySearch(int[] srcArray, int des) {
        int low = 0;
        int high = srcArray.length - 1;

        while ((low <= high) && (low <= srcArray.length - 1) && (high <= srcArray.length - 1)) {
            int middle = low + ((high - low) >> 1);
            if (des == srcArray[middle]) {
                return middle;
            } else if (des < srcArray[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }


}