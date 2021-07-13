package JAVA基础.IO流;

import java.io.File;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 11:20 2021/7/12
 * @ Description：遍历文件夹
 */
public class TraverseDirectory {
    public static void main(String[] args) {
        findFile(new File("src/main"));
    }

    public static void findFile(File file) {
        File[] files = file.listFiles();
        if (files == null||files.length==0) {
            return;
        }
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                System.out.println("文件夹:" + files[i].getName());
                findFile(files[i]);
            } else {
                System.out.println(files[i].getName());
            }
        }
    }
}
