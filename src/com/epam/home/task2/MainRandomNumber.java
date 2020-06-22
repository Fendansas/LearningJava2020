package com.epam.home.task2;

import java.util.Scanner;

public class MainRandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите чило от 1 до 99");

        int inputNumber = scanner.nextInt();
        int count = 0;
        int random = 0;

        randomNumber(inputNumber, count, random);


    }

    private static void randomNumber(int inputNumber, int count, int random) {
        while (random != inputNumber) {

            random = (int) (Math.random() * 100);
            System.out.println(random);
            count++;
        }
        System.out.println("попыток потребовалось " + count);
    }
}
