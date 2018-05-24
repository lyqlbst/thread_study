package thread._6_singleton._3_static_inner_class;

class MyObject {
    // 内部类方式
    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    private MyObject() {
    }

    static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

}
