package com.mariana.lesson8;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneTest {

    public static void main(String[] args) throws InterruptedException {

        Calendar calendar = new GregorianCalendar(2019, Calendar.JANUARY , 7);

        TimeZone timeZone = calendar.getTimeZone();
        System.out.println(timeZone.toZoneId());
    }

}
