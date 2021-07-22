package SSM.Spring.AOP;

/**
 * @author ：lzy
 * @ Date       ：Created in 16:42 2021/7/22
 * @ Description：
 */
public class APP {
    public static void main(String[] args) {
        //JDK();
        Lzy lzy = new LzyImpl();
        Lzy lzy1 = LzyCGLIB.createaLzy(lzy.getClass());
        lzy1.say();


    }

    private static void JDK() {
        Lzy lzy = new LzyImpl();
        Lzy lzy1 = LzyJDKProxy.createsProxy(lzy);
        lzy1.say();
    }
}
