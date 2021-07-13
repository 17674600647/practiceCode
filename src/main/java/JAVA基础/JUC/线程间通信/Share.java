package JAVA基础.JUC.线程间通信;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 11:11 2021/7/9
 * @ Description：share类
 */
public class Share {
    //初始值
    private int number = 0;

    public synchronized void incr() throws InterruptedException {
        if (number != 0) {
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName() + "::" + number);
        this.notifyAll();
    }

    public synchronized void decr() throws InterruptedException {
        if (number != 1) {
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName() + "::" + number);
        this.notifyAll();
    }
}
