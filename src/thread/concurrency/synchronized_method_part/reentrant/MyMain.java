package thread.concurrency.synchronized_method_part.reentrant;

/**
 * “可重入锁”的概念是：自己可以再次获取自己的内部锁。
 * 比如有1条线程获得了某个对象的锁，此时这个对象锁还没有释放，当其再次想获取这个对象的锁的时候还是可以获取的，
 * 如果不可锁重入的话，就会造成死锁。可重入锁也支持在父子类集成的环境中
 */
class MyMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
