package thread._2_concurrency._2_synchronized_code_blocks_part._14_inner_class_and_synchronized._1_demo;

import thread._2_concurrency._2_synchronized_code_blocks_part._14_inner_class_and_synchronized._1_demo.OutClass.Inner;

/**
 * 本实验测试的案例是在内置类中有两个同步方法，但使用的确实不同的锁，打印结果也是异步的。
 * 由于持有不同的“对象监视器”，所以打印结果就是乱序的。
 */
class MyMain {

    public static void main(String[] args) {
        final Inner inner = new Inner();
        Thread t1 = new Thread(inner::method1);
        t1.setName("A");
        Thread t2 = new Thread(inner::method2);
        t2.setName("B");
        t1.start();
        t2.start();
    }
}
