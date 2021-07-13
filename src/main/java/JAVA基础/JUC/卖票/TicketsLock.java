package JAVA基础.JUC.卖票;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 17:21 2021/7/7
 * @ Description：票
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketsLock {
    private int number;
    private String ticketName;
    private final ReentrantLock lock = new ReentrantLock(true);

    public void sale() {
        //判断是否还有票
        lock.lock();
        try {
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + ":卖出" + (number--) + "剩下" + number);

            }
        } finally {
            lock.unlock();
        }

    }
}
