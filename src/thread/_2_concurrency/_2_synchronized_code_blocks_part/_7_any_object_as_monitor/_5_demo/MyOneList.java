package thread._2_concurrency._2_synchronized_code_blocks_part.any_object_as_monitor.demo_5;

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
