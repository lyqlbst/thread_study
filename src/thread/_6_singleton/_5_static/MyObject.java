package thread._6_singleton._5_static;

class MyObject {
    private static MyObject instance;

    private MyObject() {
    }

    static {
        instance = new MyObject();
    }

    static MyObject getInstance() {
        return instance;
    }
}
