package thread._2_concurrency._3_volatile_part._5_use_atomic_class;

import java.util.concurrent.atomic.AtomicInteger;

class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) System.out.println(count.incrementAndGet());
    }
}
