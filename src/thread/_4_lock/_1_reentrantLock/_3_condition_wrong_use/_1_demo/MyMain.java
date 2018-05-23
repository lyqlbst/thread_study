package thread._4_lock._1_reentrantLock._3_condition_wrong_use._1_demo;

/**
 * 程序运行结果：出现异常（无监视器对象）
 * 报错的异常信息是监视器出错，解决的办法是必须在condition.await()方法调用之前调用lock.lock()代码获得同步监视器。
 */
class MyMain {

    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
