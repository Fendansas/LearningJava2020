package com.epam.home.task1;

import java.util.Scanner;

/*1. Задано целое число. Определить, какой день недели соответствует заданному числу и вывести в консоль.
 Если ни одному - вывести соответствующее сообщение.
*/
public class MainDaysOfTheWeek {
    public static void main(String[] args) {

        System.out.println("Ввидте число от 1 до 7.");
        System.out.println("1 Понедельник");
        System.out.println("2 Вторник.");
        System.out.println("3 Среда");
        System.out.println("4 Четверг");
        System.out.println("5 Пятница");
        System.out.println("6 Суббота.");
        System.out.println("7 Воскресенье");

        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        dayOfTheWeek(dayNumber);
    }

    public static void dayOfTheWeek(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Ура Суббота");
                break;
            case 7:
                System.out.println("Воскресенье, завтра на работу");
                break;

            default:
                System.out.println("Что то пошло не так, попробуй еще раз");
        }

    }

}
