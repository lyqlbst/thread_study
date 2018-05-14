package thread._2_concurrency._2_synchronized_code_blocks_part._7_any_object_as_monitor._4_demo;

import java.util.ArrayList;
import java.util.List;

class MyList {
    private List<String> list = new ArrayList();

    synchronized void add(String userName) {
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "执行了add方法！");
        list.add(userName);
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "退出了add方法！");
    }

    synchronized int getSize() {
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "执行了getSize方法！");
        int sizeValue = list.size();
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "退出了getSize方法！");
        return sizeValue;
    }
}
