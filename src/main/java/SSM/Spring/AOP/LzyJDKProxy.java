package SSM.Spring.AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ：lzy
 * @ Date       ：Created in 16:32 2021/7/22
 * @ Description： 使用JDK的Proxy动态代理
 */
public class LzyJDKProxy {
    public static Lzy createsProxy(Lzy lzy) {
        ClassLoader classLoader = lzy.getClass().getClassLoader();
        //获取所有接口
        Class<?>[] interfaces = lzy.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("shabi");
                return method.invoke(lzy, args);
            }
        };
        Lzy lzy1 = (Lzy) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        return lzy1;
    }
}
