package thread._3_communication._1_wait_and_notify._3_implementation._2_demo;

/**
 * 程序运行后效果：方法wait下面的代码不执行
 * 但线程不能永远等待下去，这样程序就停止不前，不继续向下运行了。如何使呈等待wait状态的线程继续运行呢？
 * 答案就是使用notify()方法。
 */
class MyMain {

    public static void main(String[] args) {
        String lock = new String();
        System.out.println("syn上面");
        synchronized (lock) {
            System.out.println("syn第一行");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("wait下的代码！");
        }
        System.out.println("syn下面的代码");
    }
}
