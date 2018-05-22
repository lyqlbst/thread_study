package thread._3_communication._3_threadLocal._4_verify_isolaion_again;

import java.util.Date;

class ThreadLcoalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
