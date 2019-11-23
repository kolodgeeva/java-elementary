package com.mariana.lesson4.phone;

public class WirelessPhone extends AbstractPhone {

    public static final int MAX_WORK_HOURS = 5;
    private int workHours;

    public WirelessPhone() {
    }

    public WirelessPhone(int year) {
        super(year);
    }

    public WirelessPhone(int year, int workHours) {
        super(year);
        this.workHours = workHours;
    }

    @Override
    public void ring(int inNumber) {
        if (this.workHours <= MAX_WORK_HOURS) {
            System.out.println("Wireless ring " + inNumber);
        } else {
            System.out.println("Wireless Phone is died");
        }
    }

    @Override
    public void call(int outNumber) {
        if (this.workHours <= MAX_WORK_HOURS) {
            System.out.println("Wireless call to " + outNumber);
        } else {
            System.out.println("Wireless Phone is died");
        }
    }
}
