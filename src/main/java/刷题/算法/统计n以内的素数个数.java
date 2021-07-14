package 刷题.算法;

/**
 * @author ：lzy
 * @ Date       ：Created in 16:08 2021/7/14
 * @ Description：统计n以内的素数个数
 */
public class 统计n以内的素数个数 {
    public static void main(String[] args) {

        System.out.println(statisticalPrime1(100));
    }


    /**
     * 暴力算法
     */
    public static int statisticalPrime1(int n) {
        if (n == 1 || n == 0 || n < 0) {
            System.out.println("非法参数");
            return 0;
        }
        int flag = 0;
        for (int i = 2; i < n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == j) {
                    flag++;
                }
                if (i % j == 0) {
                    break;
                }
            }
        }
        return flag;
    }
}