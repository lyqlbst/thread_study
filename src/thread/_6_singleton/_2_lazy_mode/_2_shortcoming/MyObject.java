package thread._6_singleton._2_lazy_mode._2_shortcoming;

class MyObject {
    private static MyObject myObject;

    private MyObject() {
    }

    static MyObject getInstance() {
        if (myObject == null) {
            // 模拟在常见对象之前做一些准备性的工资
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myObject = new MyObject();
        }
        return myObject;
    }
}
