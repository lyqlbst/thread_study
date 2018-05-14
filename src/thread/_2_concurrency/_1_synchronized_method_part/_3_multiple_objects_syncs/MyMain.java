package thread._2_concurrency._1_synchronized_method_part._3_multiple_objects_syncs;

/**
 * 这段代码的效果是异步的方式运行，如果多个线程访问多个对象，则JVM会创建多个锁。
 * synchronized关键字获得的锁都是对象锁，而不把是一段代码或方法当做锁，
 * 哪个线程先执行带synchronized关键字的方法，哪个线程就只有该方法所属对象的锁Lock，前提是同一个对象。
 */
class MyMain {

    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef1);
        ThreadB threadB = new ThreadB(numRef2);
        threadA.start();
        threadB.start();
    }
}
