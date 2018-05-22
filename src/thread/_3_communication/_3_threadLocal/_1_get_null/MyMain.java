package thread._3_communication._3_threadLocal._1_get_null;

/**
 * 从图中的运行结果来看，第一次调用t对象的get()方法时返回的值是null，
 * 通过调用set()方法赋值后顺利取出值并打印到控制台上。类ThreadLocal解决的是变量在不通线程间的隔离性，
 * 也即是不同线程拥有自己的值，不同线程中的值是可以放入ThreadLocal类中进行保存的。
 */
class MyMain {

    static ThreadLocal t = new ThreadLocal();

    public static void main(String[] args) {
        if (t.get() == null){
            System.out.println("从未放过值");
            t.set("我的值");
        }
        System.out.println(t.get());
        System.out.println(t.get());
    }
}
