package JAVA基础.反射与注解以及枚举.注解;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 10:26 2021/7/13
 * @ Description：
 */

//注解的存活时间
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {

}
