package thread._1_basic._7_suspend_resume._2_exclusive_object;

class SynchronizedObject {

    synchronized void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a线程永远suspend了！");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
