package thread._6_singleton._2_lazy_mode._3_solve._3_demo;

class MyObject {
    private static MyObject myObject;

    private MyObject() {
    }

    static MyObject getInstance() {
        if (myObject == null) {
            // 模拟在创建对象之前做一些准备性的工作
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 使用synchronized (MyObject.class)虽然部分代码被上锁，但还是有非线程安全问题
            synchronized (MyObject.class) {
                myObject = new MyObject();
            }
        }
        return myObject;
    }
}
