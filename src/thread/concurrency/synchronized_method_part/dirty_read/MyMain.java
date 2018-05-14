package thread.concurrency.synchronized_method_part.dirty_read;

/**
 * 出现脏读是因为void getValue()方法并不是同步的，所以可以在任意时候进行调用。
 */
class MyMain {

    public static void main(String[] args) {
        PublicVar publicVarRef = new PublicVar();
        ThreadA thread = new ThreadA(publicVarRef);
        thread.start();
        try {
            ThreadA.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        publicVarRef.getValue();
    }
}
