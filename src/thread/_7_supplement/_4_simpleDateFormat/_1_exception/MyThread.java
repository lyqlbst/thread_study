package thread._7_supplement._4_simpleDateFormat._1_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class MyThread extends Thread {
    private SimpleDateFormat sdf;
    private String dateString;

    MyThread(SimpleDateFormat sdf, String dateString) {
        super();
        this.sdf = sdf;
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            Date dateRef = sdf.parse(dateString);
            String newDateString = sdf.format(dateRef);
            if (!newDateString.equals(dateString))
                System.out.println("ThreadName=" + this.getName() + "报错了 日期字符串："
                        + dateString + " 转换成的日期为：" + newDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
