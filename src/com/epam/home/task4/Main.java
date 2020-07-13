package com.epam.home.task4;

import com.epam.home.task4.model.Rate;
import com.epam.home.task4.model.RateAlwaysOnline;
import com.epam.home.task4.model.RateOnlyCall;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        RateAlwaysOnline rateAlwaysOnline1 = new RateAlwaysOnline("Free internet 1", 200, 1111, 15, 20);
        RateAlwaysOnline rateAlwaysOnline2 = new RateAlwaysOnline("Free internet 2", 100, 1111, 5, 10);
        RateAlwaysOnline rateAlwaysOnline3 = new RateAlwaysOnline("Free internet 3", 150, 1111, 7, 13);

        RateOnlyCall rateOnlyCall1 = new RateOnlyCall("Calling 1", 90, 222, 100, 200);
        RateOnlyCall rateOnlyCall2 = new RateOnlyCall("Calling 2", 50, 222, 20, 40);
        RateOnlyCall rateOnlyCall3 = new RateOnlyCall("Calling 3", 70, 222, 70, 70);


        System.out.println(rateAlwaysOnline1);

        System.out.println("Распечатка из метода до сортировки");

        Rate[] rates = new Rate[6];

        rates[0] = rateAlwaysOnline1;
        rates[1] = rateAlwaysOnline2;
        rates[2] = rateAlwaysOnline3;

        rates[3] = rateOnlyCall1;
        rates[4] = rateOnlyCall2;
        rates[5] = rateOnlyCall3;

        print(rates);
        Arrays.sort(rates);

        System.out.println("После сортировки");
        print(rates);

        System.out.println("Тариф в заданном диапазоне");
        tariffSearch(65, 110, rates);

        System.out.println("Проверка интерфейса");

        int summ = 0;
        summ += rateAlwaysOnline1.onLine();
        summ += rateAlwaysOnline2.onLine();
        summ += rateOnlyCall1.onLine();
        System.out.println("Всего обонентской платы в месяц " + summ);

        summ -= rateAlwaysOnline1.ofLine();
        System.out.println("Всего обонентской платы в месяц " + summ);

        rateOnlyCall1.call();
        rateAlwaysOnline1.call();
        rateAlwaysOnline1.internet();

        System.out.println("Количество клиентов " +rates.length);
    }

    //Выводит тарифы в заданном диапазоне
    private static void tariffSearch(int min, int max, Rate[] rates) {
        for (Rate rate : rates) {
            if (rate.getSubscriptionFee() > min && rate.getSubscriptionFee() < max) {
                System.out.println(rate);
            }
        }
    }

    //выводит список тарифов
    public static void print(Rate[] rates) {
        for (Rate rate : rates) {
            System.out.println(rate);
        }
    }
}
