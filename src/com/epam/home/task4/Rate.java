package com.epam.home.task4;

public abstract class Rate {

    private String name;
    private  int subscriptionFee;
    private  int pin;

    public Rate(String name, int subscriptionFee, int pin) {
        this.name = name;
        this.subscriptionFee = subscriptionFee;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "name='" + name + '\'' +
                ", subscriptionFee=" + subscriptionFee +
                ", pin=" + pin +
                '}';
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
