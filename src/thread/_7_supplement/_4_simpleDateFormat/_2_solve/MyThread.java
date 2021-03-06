package thread._7_supplement._4_simpleDateFormat._2_solve;

import java.text.ParseException;
import java.util.Date;

class MyThread extends Thread {
    private String formatPattern;
    private String dateString;

    MyThread(String formatPattern, String dateString) {
        super();
        this.formatPattern = formatPattern;
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            Date dateRef = DateTools.parse(formatPattern, dateString);
            String newDateString = DateTools.format(formatPattern, dateRef);
            if (!newDateString.equals(dateString))
                System.out.println("ThreadName=" + this.getName() + "报错了 日期字符串："
                        + dateString + " 转换成的日期为：" + newDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
