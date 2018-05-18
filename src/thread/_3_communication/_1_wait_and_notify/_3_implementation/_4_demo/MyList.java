package thread._3_communication._1_wait_and_notify._3_implementation._4_demo;

import java.util.ArrayList;
import java.util.List;

class MyList {
    private static List<String> list = new ArrayList<>();

    static void add() {
        list.add("anyString");
    }

    static int size() {
        return list.size();
    }
}
