package thread._2_concurrency._2_synchronized_code_blocks_part._14_inner_class_and_synchronized._2_demo;

import thread._2_concurrency._2_synchronized_code_blocks_part._14_inner_class_and_synchronized._2_demo.OutClass.InnerClass1;
import thread._2_concurrency._2_synchronized_code_blocks_part._14_inner_class_and_synchronized._2_demo.OutClass.InnerClass2;

/**
 * 本实验测试同步代码块synchronized(class2)对class2上锁后，其他线程只能以同步的方式调用class2中的静态同步方法。
 */
class MyMain {

    public static void main(String[] args) {
        final InnerClass1 in1 = new InnerClass1();
        final InnerClass2 in2 = new InnerClass2();
        Thread t1 = new Thread(() -> in1.method1(in2));
        t1.setName("T1");
        Thread t2 = new Thread(in1::method2);
        t2.setName("T2");
        Thread t3 = new Thread(in2::method1);
        t3.setName("T3");
        t1.start();
        t2.start();
        t3.start();
    }
}
