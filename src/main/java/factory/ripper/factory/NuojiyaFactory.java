package main.java.factory.ripper.factory;

import main.java.factory.ripper.Nuojiya;
import main.java.factory.ripper.Phone;

/**
 * Created by Ripper on 2018/3/12.
 */
public class NuojiyaFactory implements Factory {
    @Override
    public Phone getPhone() {
        return new Nuojiya();
    }
}
