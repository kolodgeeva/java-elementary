package com.mariana.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SimpleDateFormatTest {

    public static void main(String[] args) throws InterruptedException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy");

        Calendar calendar = new GregorianCalendar(2019, Calendar.JANUARY , 25);
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);
        calendar.roll(Calendar.MONTH, -2);
        System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println(dateFormat.format(new Date()));

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = reader.readLine();
            System.out.println(dateFormat.parse(string));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

    }

}
