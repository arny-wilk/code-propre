package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateMethods {

    private static SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public abstract String formatDefault(Date date);

    public abstract String format(String pattern, Date date);

    public static SimpleDateFormat getFormateur() {
        return formateur;
    }

    public static void setFormateur(SimpleDateFormat formateur) {
        DateMethods.formateur = formateur;
    }
}
