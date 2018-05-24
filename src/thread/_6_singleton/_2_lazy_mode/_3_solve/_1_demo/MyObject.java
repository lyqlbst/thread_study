package thread._6_singleton._2_lazy_mode._3_solve._1_demo;

class MyObject {
    private static MyObject myObject;

    private MyObject() {

    }

    // 设置同步方法效率太低了
    // 整个方法被上锁
    synchronized static MyObject getInstance() {
        if (myObject == null) {
            // 模拟在创建对象之前做一些准备性的工作
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myObject = new MyObject();
        }
        return myObject;
    }
}
