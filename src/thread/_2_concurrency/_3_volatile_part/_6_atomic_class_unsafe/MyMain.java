package thread._2_concurrency._3_volatile_part._6_atomic_class_unsafe;

/**
 * 原子类在具有逻辑性的情况下输出结果也具有随机性。
 * 打印顺序错了，应该每次加一次100再加一次1.出现这样的情况是因为addAndGet()方法是原子的，
 * 但方法和方法之间的调用却不是原子的。解决这样的问题必须要使用同步，将addNum()代码修改为：
 * ……
 * synchronized void addNum(){
 *     System.out.println(Thread.currentThread().getName() + "加了100之后的值是：" + aiRef.addAndGet(100));
 *     adRef.addAndGet(1);
 * }
 * ……
 * 从运行结果可以看到，是每次加100再加1，结果是5050的同时还保证在过程中累加的顺序也是正确的。
 */
class MyMain {

    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread[] myThreads = new MyThread[50];
        for (int i = 0; i < myThreads.length; i++) myThreads[i] = new MyThread(service);
        for (int i = 0; i < myThreads.length; i++) myThreads[i].start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(service.aiRef.get());
    }
}
