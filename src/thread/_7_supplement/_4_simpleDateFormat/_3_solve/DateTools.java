package thread._7_supplement._4_simpleDateFormat._3_solve;

import java.text.SimpleDateFormat;

class DateTools {
    private static ThreadLocal<SimpleDateFormat> t = new ThreadLocal<>();

    static SimpleDateFormat getSimpleDateFormat(String datePattern) {
        SimpleDateFormat sdf = t.get();
        if (sdf == null) {
            sdf = new SimpleDateFormat(datePattern);
            t.set(sdf);
        }
        return sdf;
    }
}
