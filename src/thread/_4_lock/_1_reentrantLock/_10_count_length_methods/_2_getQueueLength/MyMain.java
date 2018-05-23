package thread._4_lock._1_reentrantLock._10_count_length_methods._2_getQueueLength;

class MyMain {

    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = service::serviceMethod1;
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) threads[i] = new Thread(runnable);
        for (int i = 0; i < 10; i++) threads[i].start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("有线程数：" + service.lock.getQueueLength() + "在等待获取锁！");
    }
}
