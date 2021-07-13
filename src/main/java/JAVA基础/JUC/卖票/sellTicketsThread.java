package JAVA基础.JUC.卖票;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 17:20 2021/7/7
 * @ Description：卖票线程
 */
public class sellTicketsThread {

    public static void main(String[] args) {
        TicketsLock tickets2 = new TicketsLock(1000, "速度与激情7");
        Tickets tickets = new Tickets(1000, "速度与激情7");
        for (int i = 0; i < 200; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            tickets2.sale();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, String.valueOf(i)).start();
        }
        long s = System.currentTimeMillis();
        try {
            new Thread(()->{
                while (true) {
                    try {
                        tickets2.sale();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            },"fgx").start();
        } finally {
            System.out.println(System.currentTimeMillis() - s);
        }


    }
}
