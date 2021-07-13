package 面试.java基础;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.File;
import java.util.HashMap;
import java.util.Objects;

/**
 * @author     ：lzy
 * @ Date       ：Created in 11:41 2021/7/13
 * @ Description：hashMap 面试测试
 *
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("lzy", "fgx");
        hashMap.put("lzy", "fgx2");
        hashMap.put("wyc", "yq");
        hashMap.put("xsx", "pn");
        System.out.println(hashMap);


        HashMap<Person, String> hashMap1 = new HashMap<>();
        hashMap1.put(new Person("lzy", 20), "祁东");
        hashMap1.put(new Person("lzy", 20), "祁阳");
        hashMap1.put(null, null);
        System.out.println(hashMap1);
        try {
            new File("dsa");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}

/**
 * @EqualsAndHashCode
 */
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}