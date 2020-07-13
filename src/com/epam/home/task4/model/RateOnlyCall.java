package com.epam.home.task4.model;

public class RateOnlyCall extends Rate {
    public RateOnlyCall(String name, int subscriptionFee, int pin) {
        super(name, subscriptionFee, pin);
    }

    private int freeZones = 100;
    private int freeSms = 50;

    public RateOnlyCall(String name, int subscriptionFee, int pin, int freeZones, int freeSms) {
        super(name, subscriptionFee, pin);
        this.freeZones = freeZones;
        this.freeSms = freeSms;
    }

    public int getFreeZones() {
        return freeZones;
    }

    @Override
    public String toString() {
        return super.toString() +
                " freeZones = " + freeZones +
                ", freeSms = " + freeSms;
    }
}
