package thread._3_communication._1_wait_and_notify._10_condition_changed;

/**
 * 在使用wait/notify模式时，还需要注意另外一种情况，也就是wait等待的条件发生了变化，也容易造成程序逻辑的混乱。
 * 运行结果：数组越界异常
 * 出现这样异常的原因是因为有两个实现删除remove()操作的线程，他们在Thread.sleep(1000)；之前都执行了wait()方法，
 * 呈等待状态，当加操作的线程在1秒之后被运行时，通知了所有呈wait等待状态的减操作的线程，
 * 那么第一个实现减操作的线程能正确地删除list中索引为0的数据，但第二个实现减操作的线程则出现索引溢出的异常，
 * 因为list中仅仅添加了一个数据，也只能删除一个数据，所以没有第二个数据可供删除。
 * 将Subtract.java中的subtract方法修改如下：
 * ……
 * synchronized(lock){
 *     while(ValueObject.list.size == 0){
 *         ……
 *         lock.wait();
 *         ……
 *     }
 *     ValueObject.list.remove(0);
 *     System.out.println("list size=" + ValueObject.list.size());
 * }
 * 运行结果：没有抛出异常
 */
class MyMain {

    public static void main(String[] args) {
        String lock = new String();
        Add add = new Add(lock);
        ThreadAdd addTread = new ThreadAdd(add);
        Subtract subtract = new Subtract(lock);
        ThreadSubtract subtract1Thread = new ThreadSubtract(subtract);
        subtract1Thread.setName("subtract1Thread");
        ThreadSubtract subtract2Thread = new ThreadSubtract(subtract);
        subtract2Thread.setName("subtract2Thread");
        subtract1Thread.start();
        subtract2Thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addTread.start();
    }
}
