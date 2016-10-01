package tools.Time;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TimeTest {

    private static final String CURRENT_DATE_FORMAT = "yyyy-MM-dd hh:mm";

    private Time time = new Time();

    @Test
    public void shouldGetValidTime() throws ParseException {
        String currentTime = time.getCurrentTime();
        Date parsedDate = new SimpleDateFormat(CURRENT_DATE_FORMAT).parse(currentTime);
        Calendar calendar = getInstance();

        assertThat(parsedDate).isToday();
        assertThat(parsedDate).hasHourOfDay(calendar.get(HOUR));
        assertThat(parsedDate).hasMinute(calendar.get(MINUTE));
    }
}
