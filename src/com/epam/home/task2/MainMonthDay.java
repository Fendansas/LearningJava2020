package com.epam.home.task2;

import java.util.Scanner;

public class MainMonthDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввидите месяц");
        int month = scanner.nextInt();

        System.out.println("Ввидите день");
        int dayInput = scanner.nextInt();

        checkMonth(month, dayInput);
    }

    private static void checkMonth(int month, int dayInput) {
        switch (month) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                int day1 = 31;
                checkDay(dayInput, day1);
                break;
            case 2:
                int day2 = 29;
                checkDay(dayInput, day2);
                break;
            case 6:
            case 9:
            case 11:
                int day6 = 30;
                checkDay(dayInput, day6);
                break;
        }
    }

    private static void checkDay(int dayInput, int day) {
        if (day >= dayInput && dayInput > 0) {
            System.out.println("Такой день есть в этом месяце ");
        } else {
            System.out.println("Такого дня нет в этом месяце");
        }
    }
}
