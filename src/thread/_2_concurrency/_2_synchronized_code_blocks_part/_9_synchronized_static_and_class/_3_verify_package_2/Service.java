package thread._2_concurrency._2_synchronized_code_blocks_part._9_synchronized_static_and_class._3_verify_package_2;

class Service {
    synchronized static void printA() {
        System.out.println("线程名称为：" + Thread.currentThread().getName()
                + "在" + System.currentTimeMillis() + "进入printA");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程名称为：" + Thread.currentThread().getName()
                + "在" + System.currentTimeMillis() + "离开printA");
    }

    synchronized static void printB() {
        System.out.println("线程名称为：" + Thread.currentThread().getName()
                + "在" + System.currentTimeMillis() + "进入printB");
        System.out.println("线程名称为：" + Thread.currentThread().getName()
                + "在" + System.currentTimeMillis() + "离开printB");
    }
}
