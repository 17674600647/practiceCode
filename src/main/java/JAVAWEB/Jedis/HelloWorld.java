package JAVAWEB.Jedis;

import redis.clients.jedis.Jedis;

/**
 * @author ：lzy
 * @ Date       ：Created in 15:24 2021/7/20
 * @ Description：jedis第一行代码
 */
public class HelloWorld {
    public static void main(String[] args) {
        //获取连接对象
        Jedis jedis = new Jedis("47.103.216.189", 6379);
        //执行操作
        jedis.set("lzy", "niui");
        System.out.println(jedis.get("lzy"));
        jedis.hset("lzy", "laopo", "fgx");
        System.out.println(jedis.hget("lzy", "laopo"));
        //关闭连接
        jedis.close();
    }
}
