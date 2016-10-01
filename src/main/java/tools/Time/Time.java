package tools.Time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

    private static final String CURRENT_DATE_FORMAT = "yyyy-MM-dd hh:mm";

    public String getCurrentTime() {
        Date date = new Date();
        return formatDate(date);
    }

    private String formatDate(Date date) {
        return new SimpleDateFormat(CURRENT_DATE_FORMAT).format(date);
    }

}
