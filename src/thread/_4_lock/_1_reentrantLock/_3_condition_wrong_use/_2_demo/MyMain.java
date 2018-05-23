package thread._4_lock._1_reentrantLock._3_condition_wrong_use._2_demo;

/**
 * 程序运行结果：只打印字母A
 * 在控制台中只打印一个字母A，原因是调用了Condition对象的await()方法，使当前执行任务的线程进入了等待WAITING状态。
 */
class MyMain {

    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
