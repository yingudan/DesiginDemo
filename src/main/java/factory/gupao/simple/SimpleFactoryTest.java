package main.java.factory.gupao.simple;

import main.java.factory.gupao.Yili;

/**
 * Created by Ripper on 2018/3/12.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        //这个new是一个很复杂的过程
        //有人民币就不需要自己new了
        System.out.println(new Yili().getName());

        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getMick("伊利").getName());

    }
}
