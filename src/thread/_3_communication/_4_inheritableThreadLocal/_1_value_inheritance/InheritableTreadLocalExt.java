package thread._3_communication._4_inheritableThreadLocal._1_value_inheritance;

import java.util.Date;

class InheritableTreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
