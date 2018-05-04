package thread.basic.variable_thread_safe.example3;

/**
 * 非线程安全的环境，在doPost()方法前加synchronized关键字即可解决
 */
class MyMain {

    public static void main(String[] args) {
        Thread aLogin = new Thread(() -> LoginServlet.doPost("a", "aa"));
        Thread bLogin = new Thread(() -> LoginServlet.doPost("b", "bb"));
        aLogin.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bLogin.start();
    }
}
