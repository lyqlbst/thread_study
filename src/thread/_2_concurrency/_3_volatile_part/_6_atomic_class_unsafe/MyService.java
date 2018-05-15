package thread._2_concurrency._3_volatile_part._6_atomic_class_unsafe;

import java.util.concurrent.atomic.AtomicLong;

class MyService {
    static AtomicLong aiRef = new AtomicLong();

    void addNum() {
        System.out.println(Thread.currentThread().getName() + "加了100之后的值是：" + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
