package thread._3_communication._1_wait_and_notify._11_producer_consumer._4_p_c_operate_stack;

import java.util.ArrayList;
import java.util.List;

class MyStack {
    private List<String> list = new ArrayList<>();

    synchronized void push() {
        if (list.size() == 1) try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.add("anyString=" + Math.random());
        this.notify();
        System.out.println("push=" + list.size());
    }

    synchronized String pop() {
        if (list.size() == 0) {
            System.out.println("pop操作中的：" + Thread.currentThread().getName() + " 线程呈wait状态");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String returnValue = list.get(0);
        list.remove(0);
        this.notify();
        System.out.println("pop=" + list.size());
        return returnValue;
    }
}
