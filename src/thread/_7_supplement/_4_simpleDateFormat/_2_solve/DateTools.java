package thread._7_supplement._4_simpleDateFormat._2_solve;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateTools {
    static Date parse(String formatPattern, String dateString) throws ParseException {
        return new SimpleDateFormat(formatPattern).parse(dateString);
    }

    static String format(String formatPattern, Date date) {
        return new SimpleDateFormat(formatPattern).format(date);
    }
}
