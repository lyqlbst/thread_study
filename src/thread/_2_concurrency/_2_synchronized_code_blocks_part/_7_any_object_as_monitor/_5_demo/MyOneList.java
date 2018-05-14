package thread._2_concurrency._2_synchronized_code_blocks_part._7_any_object_as_monitor._5_demo;

import java.util.ArrayList;
import java.util.List;

class MyOneList {
    private List<String> list = new ArrayList<>();

    synchronized void add(String data) {
        list.add(data);
    }

    synchronized int getSize() {
        return list.size();
    }
}
