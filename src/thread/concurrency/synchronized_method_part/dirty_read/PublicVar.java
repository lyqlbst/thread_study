package thread.concurrency.synchronized_method_part.dirty_read;

class PublicVar {
    String userName = "A";
    String password = "AA";

    synchronized void setValue(String userName, String password) {
        this.userName = userName;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.password = password;
        System.out.println("setValue method thread name=" + Thread.currentThread().getName()
                + " userName=" + userName
                + " password=" + password);
    }

    void getValue() {
        System.out.println("setValue method thread name=" + Thread.currentThread().getName()
                + " userName=" + userName
                + " password=" + password);
    }
}
