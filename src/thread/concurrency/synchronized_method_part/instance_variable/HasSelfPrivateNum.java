package thread.concurrency.synchronized_method_part.instance_variable;

class HasSelfPrivateNum {
    private int num = 0;

    void addI(String userName) {
        if ("a".equals(userName)) {
            num = 100;
            System.out.println("a set over!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            num = 200;
            System.out.println("b set over!");
        }
        System.out.println(userName + " num=" + num);
    }
}
