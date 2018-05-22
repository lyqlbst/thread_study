package thread._3_communication._2_join._1_preparation;

/**
 * 在介绍join方法之前，先来看一个示例。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        // Thread.sleep(?);
        System.out.println("我想当thread对象执行完毕后我在执行");
        System.out.println("但上面代码中的sleep()中的值应该写多少呢？");
        System.out.println("答案是：根据不能确定:)");
    }
}
