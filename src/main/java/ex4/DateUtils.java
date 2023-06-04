package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static SimpleDateFormat formateur;

    public DateUtils() {
        formateur = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    }

    public static String formatDefault(Date date) {
        return formateur.format(date);
    }

    public static String format(String pattern, Date date) {
        DateUtils.formateur = new SimpleDateFormat(pattern);
        return DateUtils.formateur.format(date);
    }

}
