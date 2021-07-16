package JAVA基础.反射与注解以及枚举;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：lzy
 * @ Date       ：Created in 13:38 2021/7/16
 * @ Description：
 */
public class 反射封装 {
    public static void main(String[] args) {
        Map<String, String[]> map = new HashMap(3);
        map.put("name", new String[]{"lzy"});
        map.put("path", new String[]{"lzy/cn"});


        try {
            //获取这个的GET   Set方法
            PropertyDescriptor propertyDescriptor = new PropertyDescriptor("name", StudentX.class);
            System.out.println(propertyDescriptor);
            //获取get方法
            System.out.println(propertyDescriptor.getReadMethod());
            //获取Set方法
            System.out.println(propertyDescriptor.getWriteMethod());


        } catch (IntrospectionException e) {
            e.printStackTrace();
        }

    }

}


@Data
@NoArgsConstructor
@AllArgsConstructor
class StudentX {
    private String name;
    private String path;
}
