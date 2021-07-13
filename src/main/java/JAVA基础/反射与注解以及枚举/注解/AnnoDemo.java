package JAVA基础.反射与注解以及枚举.注解;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 10:25 2021/7/13
 * @ Description：
 */

public class AnnoDemo {
    public static void main(String[] args) {
        Class<?> aClass = null;
        try {
            aClass = Class.forName("JAVA基础.反射与注解以及枚举.注解.UseTest");
            Constructor<?> constructor = aClass.getConstructor();
            Object o = constructor.newInstance();
            //Method[] methods = aClass.getMethods();
            Method[] methods = aClass.getDeclaredMethods();
            for (Method meth : methods
            ) {
                System.out.println(meth.getName());
                Annotation annotation = meth.getAnnotation(Test.class);
                if (annotation != null) {
                    meth.invoke(o);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
