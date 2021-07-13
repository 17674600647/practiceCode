package JAVA基础.NIO;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 19:31 2021/7/12
 * @ Description：
 */
public class Demo1 {
    public static void main(String[] args) {
        //test1();
        ByteBuffer allocate = ByteBuffer.allocate(60);
        System.out.println(allocate.capacity());
        System.out.println(allocate.position());
        System.out.println(allocate.limit());
        System.out.println("-------");

        String nio = "王者荣耀";
        allocate.put(nio.getBytes());
        //获取容量
        System.out.println(allocate.capacity());
        //获取当前位置
        System.out.println(allocate.position());
        //获取最多能存多少
        System.out.println(allocate.limit());
        //剩余能操作的
        System.out.println(allocate.remaining());
        //还能操作的
        System.out.println(allocate.hasRemaining());


        Buffer rewind = allocate.rewind();
        allocate.clear();
        byte[] array = allocate.array();
        System.out.println(new String(array, 0, array.length));
    }

    private static void test1() {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        byte[] bytes = {32, 45, 67};
        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        byte b = wrap.get();
        System.out.println(b);
        byte b1 = wrap.get();
        System.out.println(b1);

    }

}
