package JAVA基础.JUC.线程辅助类;

import java.util.concurrent.Exchanger;

/**
 * @author ：lzy
 * @ Date       ：Created in 20:22 2021/7/14
 * @ Description：交换数据
 */
public class ExchangeDemo {
    static Exchanger<String> exchanger = new Exchanger();

    public static void main(String[] args) {
        new Thread(()->{
            String s="t1";
            try {
                System.out.println(Thread.currentThread().getName()+":S="+s);
                 s = exchanger.exchange(s);
                System.out.println(Thread.currentThread().getName()+":S="+s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        },"t1").start();
        new Thread(()->{
            String s="t2";
            try {
                System.out.println(Thread.currentThread().getName()+":S="+s);
                s = exchanger.exchange(s);
                System.out.println(Thread.currentThread().getName()+":S="+s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        },"t2").start();
    }
}
