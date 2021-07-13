package JAVA基础.JUC.生产者和消费者;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 8:57 2021/7/12
 * @ Description：
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producer implements Runnable {
    private Bun bun;
    private Lock lock;
    private Condition condition;

    @Override
    public void run() {
        lock.lock();
        try {
            while(true){
                while (bun.getNumb().get() > 20) {
                    condition.await();
                }
                System.out.println("制作" + bun.getName() + "面包" + bun.getNumb().incrementAndGet());
                condition.signal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
