package main.java.factory.gupao.abstr;

/**
 * Created by Ripper on 2018/3/12.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        MilkFactory factory = new MilkFactory();
//对于用户而言，更加简单了
        //用户只有选择的权利了，保证了程序的健壮性
        System.out.println(factory.getTelunsu());

    }
}
