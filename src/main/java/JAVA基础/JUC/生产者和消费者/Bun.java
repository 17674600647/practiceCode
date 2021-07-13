package JAVA基础.JUC.生产者和消费者;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 8:55 2021/7/12
 * @ Description：包子
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bun {
    private String name;
    private AtomicInteger numb;
}
