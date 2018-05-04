package thread.basic.setPriority.example2;

/**
 * 优先级高的线程总是大部分先执行完，但不代表高优先级的线程全部先执行完。
 */
class MyMain {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 myThread1 = new MyThread1();
            myThread1.setPriority(1);
            myThread1.start();
            MyThread2 myThread2 = new MyThread2();
            myThread2.setPriority(10);
            myThread2.start();
        }
    }
}
