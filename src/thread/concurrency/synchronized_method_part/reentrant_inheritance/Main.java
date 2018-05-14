package thread.concurrency.synchronized_method_part.reentrant_inheritance;

class Main {
    int i = 10;

    synchronized void operateIMainMethod() {
        i--;
        System.out.println("main print i =" + i);
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
