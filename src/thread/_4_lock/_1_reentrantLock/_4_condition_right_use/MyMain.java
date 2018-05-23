package thread._4_lock._1_reentrantLock._4_condition_right_use;

/**
 * 程序运行结果：正常运行
 * 成功实现等待/通知模式。
 * Object类中的wait()方法相当于Condition类中的await()方法。
 * Object类中的wait(long timeout)方法想当于Condition类中的await(long time, TimeUnit unit)方法。
 * Object类中的notify()方法相当于Condition类中的signal()方法。
 * Object类中的notifyAll()方法，相当于Condition类中的signalAll()方法。
 */
class MyMain {

    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.signal();
    }
}
