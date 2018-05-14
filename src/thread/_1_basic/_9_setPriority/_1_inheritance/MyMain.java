package thread._1_basic._9_setPriority._1_inheritance;

/**
 *线程优先级具有集成属性，比如A线程启动B线程，则B线程的优先级与A是一样的
 */
class MyMain {

    public static void main(String[] args) {
        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority=" + Thread.currentThread().getPriority());
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
    }
}
