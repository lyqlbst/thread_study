package thread._2_concurrency._1_synchronized_method_part._6_reentrant._2_reentrant_inheritance;

class Sub extends Main {

    synchronized void operateISubMethod() {
        while (i > 0) {
            i--;
            System.out.println("sub print i=" + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.operateIMainMethod();
        }
    }
}
