package thread.concurrency.synchronized_method_part.instance_variable;

/**
 * 如果有多个线程共同访问1个对象中的实例变量，则有可能出现“非线程安全”问题
 */
class MyMain {

    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        ThreadB threadB = new ThreadB(numRef);
//        threadA.setPriority(10);
        threadA.start();
        threadB.start();
    }
}
