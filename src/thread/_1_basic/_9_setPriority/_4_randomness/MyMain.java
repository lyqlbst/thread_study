package thread._1_basic._9_setPriority._4_randomness;

/**
 * 优先级具有随机性，优先级高的线程不一定每次都先执行完，
 * 不要把优先级与运行结果的顺序作为衡量的标准，他们的关系具有不确定性和随机性
 */
class MyMain {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 myThread1 = new MyThread1();
            myThread1.setPriority(5);
            myThread1.start();
            MyThread2 myThread2 = new MyThread2();
            myThread2.setPriority(6);
            myThread2.start();
        }
    }
}
