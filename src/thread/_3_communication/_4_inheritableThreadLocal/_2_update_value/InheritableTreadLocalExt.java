package thread._3_communication._4_inheritableThreadLocal._2_update_value;

import java.util.Date;

class InheritableTreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + " 我在子线程加的！";
    }
}
