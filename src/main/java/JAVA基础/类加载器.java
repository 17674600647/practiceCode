package JAVA基础;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 14:32 2021/7/12
 * @ Description：
 */
public class 类加载器 {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //获取系统类加载器的父加载器--平台加载器
        ClassLoader parent = systemClassLoader.getParent();
        //获取平台加载器的父加载器--启动类加载器
        ClassLoader parent1 = parent.getParent();
    }

    public static void InputStream() {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //加载器加载一个指定的文件
        InputStream resourceAsStream = systemClassLoader.getResourceAsStream("prop.properties");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
