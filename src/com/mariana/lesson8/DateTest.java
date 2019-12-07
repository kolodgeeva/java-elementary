package com.mariana.lesson8;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

    public static void main(String[] args) throws InterruptedException {

        Date date1 = new Date();

        Thread.sleep(1000);

        Date date2 = new Date();

        if (date1.getTime() < date2.getTime()) {
            System.out.println(String.format("%s less than %s", date1, date2));
        }

        if (date1.compareTo(date2) < 0) {
            System.out.println(String.format("%s less than %s", date1, date2));
        }

        if (date1.before(date2)) {
            System.out.println(String.format("%s less than %s", date1, date2));
        }

    }

}
