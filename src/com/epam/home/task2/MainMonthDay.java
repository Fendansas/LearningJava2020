package com.epam.home.task2;

import java.util.Scanner;
//Пользователь вводит месяц и день (числа). Вывести, есть ли такой день в этом месяце

public class MainMonthDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввидите месяц (их 12)");
        int month = scanner.nextInt();

        System.out.println("Ввидите день (от 1 до 31)");
        int dayInput = scanner.nextInt();


        System.out.println("Из свич кейса");

        checkMonth(month, dayInput);

        System.out.println("Из массива");

        checkMonthArray(month, dayInput);
    }

    private static void checkMonthArray(int month, int dayInput) {

        int[] year = {31,29,31,31,31,30,31,31,30,31,30,31};

        int monthProg = month-1;

        if (monthProg <= year.length && dayInput <=year[monthProg]) {
            System.out.println("Такой день и месяц есть");
        }else System.out.println("Такого дня нету");
    }


    //вротой вариант решения задания

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
