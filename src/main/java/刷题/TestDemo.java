package 刷题;

/**
 * @author ：lzy
 * @ Date       ：Created in 19:02 2021/7/20
 * @ Description：
 */
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(binaryA(new int[]{1, 2, 3, 42, 32, 321}, 321));
    }


    static int binaryA(int[] srcArray, int des) {
        int min = 0;
        int max = srcArray.length - 1;
        while (min < max && min <= srcArray.length - 1 && max <= srcArray.length - 1) {
            int mid = min+(min + max) >> 1;
            if (srcArray[mid] == des) {
                return mid;
            }
            if (srcArray[mid] > des) {
                max = mid - 1;
            }
            if (srcArray[mid] < des) {
                min = mid - 1;
            }
        }
        return -1;
    }
}
