package thread._3_communication._3_threadLocal._2_verify_isolation._2_demo;

import java.util.Date;

class Tools {
    static ThreadLocal<Date> t = new ThreadLocal<>();
}
