package thread._6_singleton._2_lazy_mode._1_analyze;

class MyObject {
    private static MyObject myObject;

    private MyObject() {
    }

    static MyObject getInstance() {
        // 延迟加载
        if (myObject == null) myObject = new MyObject();
        return myObject;
    }
}
