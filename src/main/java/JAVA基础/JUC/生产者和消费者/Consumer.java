package JAVA基础.JUC.生产者和消费者;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 9:23 2021/7/12
 * @ Description：
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Consumer implements Runnable {
    private Bun bun;
    private Lock lock;
    private Condition condition;

    @Override
    public void run() {
        lock.lock();
        try {
            while (true){
                while (bun.getNumb().get() <= 0) {
                    condition.await();
                }
                System.out.println("消费" + bun.getName() + "面包" + bun.getNumb().decrementAndGet());
                condition.signal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
