package JAVA基础.反射与注解以及枚举;

import lombok.Data;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 9:29 2021/7/13
 * @ Description：枚举
 */

public enum season {
    SPRING("春"), SUMMER("夏");
    private String nameX;

    private season() {
    }

    private season(String name) {
        this.nameX = name;
    }
}
