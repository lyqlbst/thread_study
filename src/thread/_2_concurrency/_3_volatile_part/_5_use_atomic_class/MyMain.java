package thread._2_concurrency._3_volatile_part._5_use_atomic_class;

/**
 * 除了在i++操作时使用synchronized关键字实现同步外，还可以使用AtomicInteger原子类进行实现。
 * 原子操作是不能分割的整体，没有其他线程能够中断或检查正在原子操作中的变量。
 * 一个原子（atomic）类型就是一个原子操作可用的类型，它可以在没有锁的情况下做到线程安全（thread-safe）
 */
class MyMain {

    public static void main(String[] args) {
        AddCountThread countService = new AddCountThread();
        for (int i = 0; i < 100; i++) new Thread(countService).start();
    }
}
