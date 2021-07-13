package JAVA基础.反射与注解以及枚举;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 15:47 2021/7/12
 * @ Description：反射测试类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentFS {
    private String name;
    private int age;
    public void on(){
        System.out.println("这是公开方法");
    }
    private void in(){
        System.out.println("这是私有方法");
    }
}
