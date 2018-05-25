package thread._7_supplement._2_thread_group._4_get_group_parent;

/**
 * 程序运行结果：NullPointerException
 * 运行结果说明JVM的根线程组就是system，再取其父线程组则出现空指针异常。
 */
class MyMain {

    public static void main(String[] args) {
        System.out.println("线程：" + Thread.currentThread().getName()
                + " 所在的线程组名为：" + Thread.currentThread().getThreadGroup().getName());
        System.out.println("main线程所在的线程组的父线程组的名称是："
                + Thread.currentThread().getThreadGroup().getParent().getName());
        System.out.println("main线程所在的线程组的父线程组的父线程组的名称是："
                + Thread.currentThread().getThreadGroup().getParent().getParent().getName());
    }
}
