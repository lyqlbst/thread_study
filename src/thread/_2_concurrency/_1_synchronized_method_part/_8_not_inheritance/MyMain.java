package thread._2_concurrency._1_synchronized_method_part._8_not_inheritance;

/**
 * 可以看到，结果是非同步调用，也就是说，同步不能被集成，所以还得在子类的方法中添加synchronized关键字。
 */
class MyMain {

    public static void main(String[] args) {
        Sub subRef = new Sub();
        MyThreadA a = new MyThreadA(subRef);
        a.setName("A");
        a.start();
        MyThreadB b = new MyThreadB(subRef);
        b.setName("B");
        b.start();
    }
}
