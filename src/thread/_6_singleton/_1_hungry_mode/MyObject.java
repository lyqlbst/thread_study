package thread._6_singleton._1_hungry_mode;

class MyObject {
    // 立即加载方式==饿汉模式
    private static MyObject myObject = new MyObject();

    private MyObject() {
    }

    static MyObject getInstance() {
        // 此代码版本为立即加载
        // 此版本代码的缺点是不能有其他实例变量
        // 因为getInstance()方法没有同步
        // 所以有可能出现非线程安全问题
        return myObject;
    }
}
