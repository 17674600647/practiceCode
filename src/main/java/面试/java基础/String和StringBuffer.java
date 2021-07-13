package 面试.java基础;

/**
 * @author ：lzy
 * @ Date       ：Created in 15:21 2021/7/13
 * @ Description：
 */
public class String和StringBuffer {
    public static void main(String[] args) {
       /* String string = "ads";
        string = "sda";  //这一步只是记录了一个新的对象地址,就是new了一个String,他的底层是一个final修饰的字符数组
        */
        StringBuilder stringBuilder = new StringBuilder("告诉你:");
        stringBuilder.append("这是一个字符串");
        stringBuilder.delete(0, 2);
        System.out.println(stringBuilder);
    }

}
