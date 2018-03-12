package main.java.factory.gupao.abstr;

import main.java.factory.gupao.Milk;
import main.java.factory.gupao.Sanlu;
import main.java.factory.gupao.Telunsu;
import main.java.factory.gupao.func.MengniuFactory;
import main.java.factory.gupao.func.YiliFactory;

/**
 * Created by Ripper on 2018/3/12.
 */
public class MilkFactory extends   AbstractFactory{
    @Override
    public Milk getMengniu() {
        return new MengniuFactory().getMick();
    }

    @Override
    public Milk getTelunsu() {
        return new Telunsu();
    }

    @Override
    public Milk getYili() {
        return new YiliFactory().getMick();
    }

    @Override
    public Milk getSanlu() {
        return new Sanlu();
    }
}
