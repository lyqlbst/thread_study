package thread._4_lock._1_reentrantLock._7_p_c_alternate_print;

/**
 * 程序运行结果：交替打印
 * 通过Condition对象，成功实现交替打印的效果。
 */
class MyMain {

    public static void main(String[] args) {
        MyService service = new MyService();
        MyThreadA a = new MyThreadA(service);
        MyThreadB b = new MyThreadB(service);
        a.start();
        b.start();
    }
}
