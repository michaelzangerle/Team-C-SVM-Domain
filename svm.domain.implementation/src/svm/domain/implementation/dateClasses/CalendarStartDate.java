package svm.domain.implementation.dateClasses;

import java.util.Calendar;
import java.util.Date;

/**
 * Projectteam : Team C
 * Date: 30.10.12
 */
public class CalendarStartDate {

    public static Date getCalenderStartDate() {
        Calendar cal = Calendar.getInstance();
        cal.set(1900, 1, 1); //year is as expected, month is zero based, date is as expected
        Date dt = cal.getTime();
        return dt;
    }
}
