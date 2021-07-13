package 面试.java基础;

/**
 * @author ：lzy
 * @ Date       ：Created in 14:13 2021/7/13
 * @ Description：
 */
public class 异常 {
    public void show(int n) throws Exception {
        if (n==1){
            throw new Exception("有异常");
        }else {
            throw new RuntimeException("有异常");
        }
    }
}
