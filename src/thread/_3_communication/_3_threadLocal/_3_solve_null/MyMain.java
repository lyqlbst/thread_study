package thread._3_communication._3_threadLocal._3_solve_null;

/**
 * 此案例仅仅证明main线程有自己的值，那其他线程是否会有自己的初始值呢？
 */
class MyMain {

    static ThreadLcoalExt t = new ThreadLcoalExt();

    public static void main(String[] args) {
        if (t.get() == null) {
            System.out.println("从未放过值");
            t.set("我的值");
        }
        System.out.println(t.get());
        System.out.println(t.get());
    }
}
