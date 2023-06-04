package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils extends DateMethods {

    @Override
    public String formatDefault(Date date) {
        return DateMethods.getFormateur().format(date);
    }

    @Override
    public String format(String pattern, Date date) {
        DateMethods.setFormateur(new SimpleDateFormat(pattern));
        return DateUtils.getFormateur().format(date);
    }
}
