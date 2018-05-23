package thread._4_lock._1_reentrantLock._10_count_length_methods._1_getHoldCount;

/**
 * 方法int getHoldCount()的作用是查询当前线程保持此锁定的个数，也就是调用lock()方法的次数。
 */
class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        service.serviceMethod1();
    }
}
