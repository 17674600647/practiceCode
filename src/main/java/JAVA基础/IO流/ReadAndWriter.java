package JAVA基础.IO流;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 10:12 2021/7/12
 * @ Description：
 */
public class ReadAndWriter {
    public static void main(String[] args) {
        //writer();
        niu();

    }

    private static void niu() {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("test.md"));
            byte[] buf = new byte[1024];
            int length = 0;
            System.out.println(fileInputStream.available());
            while ((length = fileInputStream.read(buf)) != -1) {
                System.out.println(new String(buf, 0, length));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void writer() {
        File file = new File("test.md");
        String str = "## 这是一个标题";
        byte[] bytes = str.getBytes();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
