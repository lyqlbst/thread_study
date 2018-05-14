package thread._2_concurrency._2_synchronized_code_blocks_part._7_any_object_as_monitor._4_demo;

class MyMain {

    public static void main(String[] args) {
        MyList myList = new MyList();
        MyThreadA a = new MyThreadA(myList);
        a.setName("a");
        MyThreadB b = new MyThreadB(myList);
        b.setName("b");
        a.start();
        b.start();
    }
}
