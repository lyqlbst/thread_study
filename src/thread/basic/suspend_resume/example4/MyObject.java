package thread.basic.suspend_resume.example4;

class MyObject {
    private String userName = "1";
    private String password = "11";

    void setValue(String u, String p) {
        this.userName = u;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("停止a线程！");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }

    void printUserNamePassword() {
        System.out.println(userName + " " + password);
    }
}
