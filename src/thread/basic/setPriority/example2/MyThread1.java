package thread.basic.setPriority.example2;

import java.util.Random;

class MyThread1 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 50000; i++) {
                Random random = new Random();
                random.nextInt();
                addResult += i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("★ ★ ★ ★ ★ thread 1 use time=" + (endTime - beginTime) + " addResult=" + addResult);
    }
}
