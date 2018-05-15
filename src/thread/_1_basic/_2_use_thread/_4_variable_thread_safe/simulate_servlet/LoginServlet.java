package thread._1_basic._2_use_thread._4_variable_thread_safe.simulate_servlet;

/**
 * 本类模拟成一个Servlet组件
 */
class LoginServlet {
    private static String userNameRef;
    private static String passwordRef;

    public static void doPost(String userName, String password) {
        userNameRef = userName;
        if (userName.equals("a")) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        passwordRef = password;
        System.out.println("userName=" + userNameRef + " password=" + password);
    }
}
