package main.java.factory.gupao.abstr;

import main.java.factory.gupao.Milk;

/**
 * Created by Ripper on 2018/3/12.
 */
public  abstract class AbstractFactory {


    //公共的逻辑 方便用于管理

    public abstract Milk getMengniu();
    public abstract Milk getTelunsu();
    public abstract Milk getYili();
    public abstract Milk getSanlu();



}
