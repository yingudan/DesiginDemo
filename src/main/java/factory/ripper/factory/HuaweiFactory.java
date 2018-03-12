package main.java.factory.ripper.factory;

import main.java.factory.ripper.Huawei;
import main.java.factory.ripper.Phone;

/**
 * Created by Ripper on 2018/3/12.
 */
public class HuaweiFactory implements Factory{
    @Override
    public Phone getPhone() {
        return new Huawei();
    }
}
