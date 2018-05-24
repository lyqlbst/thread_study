package thread._6_singleton._2_lazy_mode._3_solve._4_demo;

class MyObject {
    private static MyObject myObject;

    private MyObject() {
    }

    // 使用双检测机制来解决问题，既保证了不需要同步代码的异步执行性，又保证了单例的效果
    // 此版本的代码成为双重检查Double-Check Locking
    static MyObject getInstance() {
        if (myObject == null) {
            // 模拟在创建对象之前做一些准备性的工作
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (MyObject.class) {
                if (myObject == null) myObject = new MyObject();
            }
        }
        return myObject;
    }
}
