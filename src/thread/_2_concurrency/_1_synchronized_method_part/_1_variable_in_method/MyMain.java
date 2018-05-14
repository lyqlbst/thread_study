package thread._2_concurrency._1_synchronized_method_part._1_variable_in_method;

/**
 *方法中的变量不存在非线程安全问题，永远都是线程安全的
 */
class MyMain {

    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
    }
}
