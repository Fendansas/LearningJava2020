package com.epam.home.task4.model;

import com.epam.home.task4.interfaces.Connected;

public abstract class Rate implements Connected, Comparable<Rate> {

    private String name;
    private int subscriptionFee;
    private int pin;
    private boolean state = false;

    public void call() {
        System.out.println("Я звоню и мой тариф " + name);
    }

    public Rate(String name, int subscriptionFee, int pin) {
        this.name = name;
        this.subscriptionFee = subscriptionFee;
        this.pin = pin;
    }

    @Override
    public int onLine() {
        if (state) {
            return 0;
        }
        state = true;
        System.out.println("Теперь " + name + " в сети таприф мой " + subscriptionFee);
        return subscriptionFee;

    }

    @Override
    public int ofLine() {
        if (!state) {
            return 0;
        }
        state = false;
        System.out.println("Нет сигнала " + name);
        return subscriptionFee;
    }

    @Override
    public int compareTo(Rate o) {
        if (subscriptionFee > o.subscriptionFee) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Rate: " +
                "name = " + name +
                ", subscriptionFee = " + subscriptionFee +
                ", pin = " + pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setSubscriptionFee(int subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }


}

