package main.java.factory.gupao.simple;

import main.java.factory.gupao.Mengniu;
import main.java.factory.gupao.Milk;
import main.java.factory.gupao.Telunsu;
import main.java.factory.gupao.Yili;

/**
 * Created by Ripper on 2018/3/12.
 */
public class SimpleFactory {

    public Milk getMick(String name){

        if("特仑苏".equals(name)){
            return  new Telunsu();
        }else if("蒙牛".equals(name)){
            return  new Mengniu();
        }else if("伊利".equals(name)){
            return  new Yili();
        }
        return null;

    }
}
