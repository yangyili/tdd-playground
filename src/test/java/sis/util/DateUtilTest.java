package sis.util;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

/**
 * Created by afaren on 7/30/17.
 */
public class DateUtilTest {
    @Test
    public void test_create_date() throws Exception {
        Date date = DateUtil.createDate(2000, 1, 1);
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        assertEquals(2000, calendar.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
        assertEquals(1, calendar.get(Calendar.DAY_OF_MONTH));

    }
}
