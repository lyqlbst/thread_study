package thread._4_lock._1_reentrantLock._15_awaitUntil;

class MyMain {

    public static void main(String[] args) {
        run1();
//        run2();
    }

    /**
     * 运行结果：2秒后自动唤醒自己
     */
    private static void run1(){
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
    }

    /**
     * 运行结果：0.5秒后被其他线程所唤醒
     * 说明线程在等待时间到达前，可以被其他线程提前唤醒。
     */
    private static void run2(){
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        MyThreadB myThreadB = new MyThreadB(service);
        myThreadA.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThreadB.start();
    }
}
