package thread._1_basic._2_use_thread._4_variable_thread_safe.non_shared_data;

/**
 * 非共享数据
 */
class MyMain {

    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}
