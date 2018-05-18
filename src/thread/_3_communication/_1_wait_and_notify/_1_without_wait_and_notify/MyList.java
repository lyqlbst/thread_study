package thread._3_communication._1_wait_and_notify._1_without_wait_and_notify;

import java.util.ArrayList;
import java.util.List;

class MyList {
    private volatile List<String> list = new ArrayList<>();

    void add() {
        list.add("测试");
    }

    int size() {
        return list.size();
    }
}
