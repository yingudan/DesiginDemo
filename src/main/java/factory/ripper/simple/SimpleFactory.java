package main.java.factory.ripper.simple;

import main.java.factory.ripper.Huawei;
import main.java.factory.ripper.Iphone;
import main.java.factory.ripper.Nuojiya;
import main.java.factory.ripper.Phone;

/**
 * Created by Ripper on 2018/3/12.
 */
public class SimpleFactory {

    public  Phone getPhone(String name){
        if("诺基亚".equals(name)){
            return new Nuojiya();
        }else  if ("苹果".equals(name)){
            return  new Iphone();
        }else  if("华为".equals(name)){
            return  new Huawei();
        }
        return  null;
    };

}
