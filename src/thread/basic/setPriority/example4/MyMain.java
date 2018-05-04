package thread.basic.setPriority.example4;

/**
 * 看谁运行的快，结果是大多数时候，优先级高的线程较快
 */
class MyMain {

    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        a.setPriority(Thread.NORM_PRIORITY - 3);
        b.setPriority(Thread.NORM_PRIORITY + 3);
        a.start();
        b.start();
        a.stop();
        b.stop();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("a=" + a.getCount());
        System.out.println("b=" + b.getCount());
    }
}
