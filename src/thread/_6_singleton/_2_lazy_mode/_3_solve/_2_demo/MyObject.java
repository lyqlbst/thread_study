package thread._6_singleton._2_lazy_mode._3_solve._2_demo;

class MyObject {
    private static MyObject myObject;

    private MyObject() {
    }

    static MyObject getInstance() {
        synchronized (MyObject.class) {
            // 此种写法等同于：synchronized static MyObject getInstance()的写法，效率一样很低，全部代码被上锁
            if (myObject == null) {
                // 模拟在创建对象之前做一些准备性的工作
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                myObject = new MyObject();
            }
            return myObject;
        }
    }
}
