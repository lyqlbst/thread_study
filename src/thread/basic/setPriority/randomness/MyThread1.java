package thread.basic.setPriority.randomness;

import java.util.Random;

class MyThread1 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("★ ★ ★ ★ ★ thread 1 use time=" + (endTime - beginTime));
    }
}
