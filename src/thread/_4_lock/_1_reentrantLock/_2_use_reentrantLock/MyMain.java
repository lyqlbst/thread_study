package thread._4_lock._1_reentrantLock._2_use_reentrantLock;

/**
 * 程序运行结果：全部同步运行
 * 此实验说明，调用lock.lock()代码的线程就持有了“对象监视器”，其他线程只有等待锁被释放时再次争抢。
 * 效果和使用synchronized关键字一样，线程之间执行的顺序是随机的。
 */
class MyMain {

    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadAA aa = new ThreadAA(service);
        aa.setName("AA");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        ThreadBB bb = new ThreadBB(service);
        bb.setName("BB");
        a.start();
        aa.start();
        b.start();
        bb.start();
    }
}
