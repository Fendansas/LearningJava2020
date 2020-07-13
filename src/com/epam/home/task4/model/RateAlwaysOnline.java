package com.epam.home.task4.model;

import com.epam.home.task4.helper.InternetQuality;

public class RateAlwaysOnline extends Rate {

    public RateAlwaysOnline(String name, int subscriptionFee, int pin) {
        super(name, subscriptionFee, pin);
    }

    private int speedInternetMin;
    private int speedInternetMax;
    //private Quality quality; // не получилось сделать непонятно в чем ошибка

   /* public RateAlwaysOnline(String name, int subscriptionFee, int pin, int speedInternetMin, int speedInternetMax, Quality quality) {
        super(name, subscriptionFee, pin);
        this.speedInternetMin = speedInternetMin;
        this.speedInternetMax = speedInternetMax;
        this.quality = quality;
    }

    */

     public RateAlwaysOnline(String name, int subscriptionFee, int pin, int speedInternetMin, int speedInternetMax) {
        super(name, subscriptionFee, pin);
        this.speedInternetMin = speedInternetMin;
        this.speedInternetMax = speedInternetMax;
    }




    public void internet() {
        System.out.println("Я зашел в интернет и моя скорость " + speedInternetMax + " mb/s");
    }

 /*   public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

  */



    public void setSpeedInternetMin(int speedInternetMin) {
        this.speedInternetMin = speedInternetMin;
    }

    public int getSpeedInternetMin() {
        return speedInternetMin;
    }

    @Override
    public String toString() {
        return super.toString() +
                " speedInternetMin = " + speedInternetMin +
                ", SpeedInternetMax = " + speedInternetMax;
    }
// не получилось сделать перечесление((
    private class Quality{
        private InternetQuality quality;

        public Quality(InternetQuality quality) {
            this.quality = quality;
        }
        public void showStatus() {
            System.out.println("Status: " + quality.getValue() + " quality");
        }
    }



}
