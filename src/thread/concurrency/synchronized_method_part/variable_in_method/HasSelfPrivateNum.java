package thread.concurrency.synchronized_method_part.variable_in_method;

class HasSelfPrivateNum {

    void addI(String userName){
        int num = 0;
        if (userName.equals("a")){
            num = 100;
            System.out.println("a set over!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            num = 200;
            System.out.println("b set over!");
        }
        System.out.println(userName + " num=" + num);
    }
}
