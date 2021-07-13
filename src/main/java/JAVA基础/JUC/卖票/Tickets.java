package JAVA基础.JUC.卖票;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 17:21 2021/7/7
 * @ Description：票
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tickets {
    private Integer number;
    private String ticketName;

    public  void sale() throws InterruptedException {
        //判断是否还有票
        synchronized(ticketName){
            if (Thread.currentThread().getName()=="fgx"){
                ticketName.notifyAll();
            }
            if (number==1000){
                ticketName.wait();
            }

            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + ":卖出" + (number--) + "剩下" + number);
            }
        }

    }
}
