package thread._2_concurrency._3_volatile_part._4_none_atomic;

class MyThread extends Thread {
    private volatile static int count;

    private static void addCount() {
        for (int i = 0; i < 1000; i++) count++;
        System.out.println("count=" + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
