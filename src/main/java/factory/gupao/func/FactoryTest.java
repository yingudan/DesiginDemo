package main.java.factory.gupao.func;

/**
 * Created by Ripper on 2018/3/12.
 */
public class FactoryTest {
    public static void main(String[] args) {

        Factory factory = new TelunsuFactory();
        System.out.println(factory.getMick());

    }
}
