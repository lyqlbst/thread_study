package thread._2_concurrency._2_synchronized_code_blocks_part._7_any_object_as_monitor._3_demo;

class Service {
    private String anyString = new String();

    void a() {
        synchronized (anyString) {
            System.out.println("a begin");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("a end");
        }
    }

    synchronized void b() {
        System.out.println("b begin");
        System.out.println("b end");
    }
}
