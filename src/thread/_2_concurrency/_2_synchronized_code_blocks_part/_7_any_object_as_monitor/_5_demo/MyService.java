package thread._2_concurrency._2_synchronized_code_blocks_part.any_object_as_monitor.demo_5;

class MyService {
    MyOneList addServiceMethod(MyOneList list, String data) {
        if (list.getSize() < 1) {
            try {
                Thread.sleep(500);  // 模拟从远程花费0.5秒取回数据
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(data);
        }
        return list;
    }
}
