package SSM.Spring;

import javafx.application.Application;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：lzy
 * @ Date       ：Created in 8:58 2021/7/22
 * @ Description：
 */
public class UserApp {
    public static void main(String[] args) {
        //加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取资源
        Service service =(Service) context.getBean("Service2");
        service.save();
    }
}
