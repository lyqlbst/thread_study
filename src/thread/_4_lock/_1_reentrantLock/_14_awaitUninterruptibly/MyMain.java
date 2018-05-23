package thread._4_lock._1_reentrantLock._14_awaitUninterruptibly;

/**
 * 程序运行结果：程序运行出现异常，这是正常现象。
 * 将Service.java中的“condition.await();”更换为“condition.awaitUninterruptibly();”。
 * 程序运行结果正常，没有抛出异常。
 */
class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        MyThread myThread = new MyThread(service);
        myThread.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.interrupt();
    }
}
