package thread._3_communication._1_wait_and_notify._1_without_wait_and_notify;

/**
 * 在试验中使用sleep()结合while(true)死循环法来实现多个线程间通信。
 * 虽然两个线程间实现了通信，但有一个弊端就是，线程ThreadB.java不停地通过while语句轮询机制来检测某一个条件，
 * 这样会浪费CPU资源。
 * 如果轮询的时间间隔很小，更浪费CPU资源；如果轮训的时间间隔很大，有可能会取到不限要得到的数据。
 * 所以就需要一种机制来实现减少CPU的资源浪费，而且还可以实现在多个线程间通信，它就是：“wait/notify”机制。
 */
class MyMain {

    public static void main(String[] args) {
        MyList service = new MyList();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
