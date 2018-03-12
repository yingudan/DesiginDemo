package main.java.factory.ripper.abstr;

import main.java.factory.ripper.Huawei;
import main.java.factory.ripper.Phone;

/**
 * Created by Ripper on 2018/3/12.
 */
public class PhoneFactory extends   AbstractFactory {
    @Override
    public Phone getHuaweiPhone() {
        return new Huawei();
    }

    @Override
    public Phone getNuojiyaPhone() {
        return null;
    }

    @Override
    public Phone getIphone() {
        return null;
    }
}
