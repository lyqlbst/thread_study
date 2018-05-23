package thread._4_lock._1_reentrantLock._13_lock_methods._2_tryLock;

/**
 * 方法boolean tryLock()的作用是，仅在调用时锁定未被另一个线程保持的情况下，才获取该锁定。
 */
class MyMain {

    public static void main(String[] args) {
        final MyService service = new MyService();
        Runnable runnableRef = service::waitMethod;
        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
