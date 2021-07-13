package JAVA基础.每天练习.第一堆;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 16:42 2021/7/6
 * @ Description：编写java程序，完成 byte数据类型和其他数据类型的加减乘除混合运算的，
 * 完成 short数据类型和其他数据类型的加减乘除混合运算的，完成 int数据类型和其他数据类型的加减乘除混合运算的；
 * 完成 long数据类型和其他数据类型的加减乘除混合运算的；完成 float数据类型和其他数据类型的加减乘除混合运算的；完成 double数据类型和其他数据类型的加减乘除混合运算的。
 */
public class 题目3 {
    public static void main(String[] args) {
        byte a=90;
        short b=830;
        int c=70321;
        long d=802312L;
        float e=9000.9000F;
        double f=909201012.90809;

        System.out.println(a-b*e/f-d);
    }
}
