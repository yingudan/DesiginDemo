package main.java.factory.gupao.func;

import main.java.factory.gupao.Mengniu;
import main.java.factory.gupao.Milk;
import main.java.factory.gupao.Yili;

/**
 * Created by Ripper on 2018/3/12.
 */
public class YiliFactory implements  Factory{
    @Override
    public Milk getMick() {
        return new Yili();
    }
}
