package JAVA基础.IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 11:55 2021/7/12
 * @ Description：文件复制
 */
public class 文件复制 {
    public static void main(String[] args) {
        copyLargeFiles(new File("X:\\电影\\[电影天堂www.dytt89.com]霸王别姬BD国语中字.mp4"),
                new File("D:\\3.学习视频\\java基础\\test"));
        copySmallFiles(new File("X:\\电影\\[电影天堂www.dytt89.com]霸王别姬BD国语中字.mp4"),
                new File("D:\\3.学习视频\\java基础\\test"));
    }

    public static void copyLargeFiles(File in, File out) {
        try {
            FileInputStream fileInputStream = new FileInputStream(in);
            FileOutputStream fileOutputStream = new FileOutputStream(out);
            byte[] a = new byte[1024];
            long start = System.currentTimeMillis();
            while (fileInputStream.read(a) != -1) {
                fileOutputStream.write(a);
            }
            long end = System.currentTimeMillis() - start;
            System.out.println(end);
            fileInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void copySmallFiles(File in, File out) {
        try {
            FileInputStream fileInputStream = new FileInputStream(in);
            FileOutputStream fileOutputStream = new FileOutputStream(out);
            byte[] a = new byte[10240];
            long start = System.currentTimeMillis();
            while (fileInputStream.read(a) != -1) {
                fileOutputStream.write(a);
            }
            long end = System.currentTimeMillis() - start;
            System.out.println(end);
            fileInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
