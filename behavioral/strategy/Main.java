package patterns.behavioral.strategy;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var me = new MyselfMethod2();
        me.ChangeStrategy(new SunshineWearingStrategy());
        me.GoOutside();
    }
}
