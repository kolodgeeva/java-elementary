package com.mariana.lesson8;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {

    public static void main(String[] args) throws InterruptedException {

        Calendar calendar = new GregorianCalendar(2019, Calendar.JANUARY , 7);
        System.out.println(calendar);

        Date date = calendar.getTime();

        System.out.println(date);

        //calendar.add(Calendar.MONTH, -2);
        //System.out.println(calendar.getTime());

        calendar.roll(Calendar.MONTH, -2);
        System.out.println(calendar.getTime());

    }

}
