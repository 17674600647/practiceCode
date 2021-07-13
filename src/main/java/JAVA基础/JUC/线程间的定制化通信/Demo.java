package JAVA基础.JUC.线程间的定制化通信;

import JAVA基础.JUC.线程间通信.ShareLock;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 14:35 2021/7/9
 * @ Description：
 */
public class Demo {
    public static void main(String[] args) {
        ShareResource share = new ShareResource();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share.printA();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "1").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share.printB();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "2").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share.printC();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "3").start();
    }
}
