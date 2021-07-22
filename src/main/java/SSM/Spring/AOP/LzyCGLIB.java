package SSM.Spring.AOP;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ：lzy
 * @ Date       ：Created in 16:48 2021/7/22
 * @ Description：动态生产类,只要一个类就可以代理
 */
public class LzyCGLIB {
    public static Lzy createaLzy(Class clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        //对原始的操作做调用
        enhancer.setCallback(new MethodInterceptor() {
            //MethodProxy自己造出来的代理方法,Object是代理出来的对象
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object o1 = methodProxy.invokeSuper(o, objects);
                if (method.getName().equals("say")){
                    //调用父类方法
                    System.out.println("刮大白");
                }
                return o1;
            }
        });
        return (Lzy) enhancer.create();
    }

}
