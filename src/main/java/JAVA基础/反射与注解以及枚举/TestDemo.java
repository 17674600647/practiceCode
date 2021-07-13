package JAVA基础.反射与注解以及枚举;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 15:55 2021/7/12
 * @ Description：测试
 */
public class TestDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //  two();
//        Class<StudentFS> studentFSClass = StudentFS.class;
//        StudentFS studentFS = new StudentFS();
//        Class<? extends StudentFS> aClass = studentFS.getClass();
//        Class<?> aClass = Class.forName("JAVA基础.反射与注解以及枚举.StudentFS");
        two();
    }

    private static void two() throws UnsupportedEncodingException {
        //   getDirectly();
        Properties properties = new Properties();
        InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("test.properties");
        InputStreamReader inputStreamReader = new InputStreamReader(resourceAsStream, "UTF-8");
        try {
            properties.load(inputStreamReader);
            String classname = properties.getProperty("classname");
            Class<?> aClass = Class.forName(classname);
            //获取构造器
            Constructor<?> constructor = aClass.getConstructor();
            //获取带参构造器
            Constructor<?> constructor1 = aClass.getConstructor(String.class, int.class);
            System.out.println("constructor1" + constructor1);
            //用构造器获取一个对象
            Object o = constructor.newInstance();
            //获取所有公共的构造方法
            Constructor<?>[] constructors = aClass.getConstructors();
            for (int i = 0; i < constructors.length; i++) {
                System.out.println(constructors[i]);
            }
            //获取所有的构造方法,私有的也可以
            Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
            for (Constructor de : declaredConstructors
            ) {
                System.out.println(de);
            }
            //获取方法
            Method method = aClass.getMethod(properties.getProperty("method"));
            //调用方法

            method.invoke(o);


            //获取变量
            //aClass.getField();  这个方法只能获取公共的变量!!
            Field name = aClass.getDeclaredField("name");
            System.out.println(name);
            //设置可访问的
            name.setAccessible(true);
            name.set(o, "lzy");
            Object o1 = name.get(o);
            System.out.println("o1"+o1.toString());
            System.out.println(o.getClass().getMethod("getName").invoke(o));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void getDirectly() {
        try {
            Class<?> aClass = Class.forName("JAVA基础.反射与注解以及枚举.StudentFS");
            //获取无参构造方法
            Constructor<?> constructor = aClass.getConstructor();
            //创建一个实例
            Object newInstance = constructor.newInstance();


            Method on = aClass.getMethod("on");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
