package JAVA基础.IO流;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 10:55 2021/7/12
 * @ Description：d
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            FileReader reader = new FileReader("src/main/java/JAVA基础/IO流/test.properties");
            properties.load(reader);
            reader.close();
            System.out.println(properties.getProperty("name"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
