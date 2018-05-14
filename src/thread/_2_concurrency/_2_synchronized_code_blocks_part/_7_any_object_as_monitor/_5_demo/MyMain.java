package thread._2_concurrency._2_synchronized_code_blocks_part._7_any_object_as_monitor._5_demo;

/**
 * “脏读”出现了。出现的原因是两个线程以异步的方式返回list参数的size()大小。解决办法就是“同步化”。
 * ……
 * MyOnlList addServiceMethod(MyOneList list,String data) {
 *     synchronized (list){
 *         if(list.getSize() < 1){
 *             try {
 *                 Thread.sleep(500);  // 模拟从远程花费0.5秒取回数据
 *             } catch (InterruptedException e) {
 *                 e.printStackTrace();
 *             }
 *             list.add(data);
 *         }
 *     }
 * }
 * ……
 * 由于list参数对象在项目中是一份实例，是单例的，而且也正需要对list参数的getSize()方法做同步的调用，
 * 所以就对list参数进行同步处理。
 */
class MyMain {

    public static void main(String[] args) {
        MyOneList list = new MyOneList();
        MyThread1 thread1 = new MyThread1(list);
        thread1.setName("A");
        thread1.start();
        MyThread2 thread2 = new MyThread2(list);
        thread2.setName("B");
        thread2.start();
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("listSize=" + list.getSize());
    }
}
