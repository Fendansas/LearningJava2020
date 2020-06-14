package com.epam.home.task1;

// 3. Заданы три числа. Найти среди них минимальное, максимальное и среднее арифметическое и вывести.

import java.util.Scanner;

public class MainMinMaxMid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите первое чило и нажмите enter");
        int number1 = scanner.nextInt();

        System.out.println("Ввидите второе чило и нажмите enter");
        int number2 = scanner.nextInt();

        System.out.println("Ввидите третье чило и нажмите enter");
        int number3 = scanner.nextInt();

        System.out.println( "Наименьшее число "+smallestNumber(number1,number2,number3));
        System.out.println( "Наибольшее число "+greatestNumber(number1,number2,number3));
        System.out.println( "Среднее арифметическое число "+averageArithmeticNumber(number1,number2,number3));

    }
    // метод находит наименьшее число
    private static int smallestNumber(int a, int b, int c) {
        int smallestNumber = 0;
        if (a <= b & a <= c) {
            smallestNumber = a;
        } else if (b <= a & b <= c) {
            smallestNumber = b;
        } else if (c <= a & c <= b) {
            smallestNumber = c;
        }
        return smallestNumber;
    }
    // метод находит наибольшее число
    private static int greatestNumber(int a, int b, int c) {
        int greatestNumber = 0;
        if (a >= b & a >= c) {
            greatestNumber = a;
        } else if (b >= a & b >= c) {
            greatestNumber = b;
        } else if (c >= a & c >= b) {
            greatestNumber = c;
        }
        return greatestNumber;
    }

   // метод находит среднее арефметическое.
    private static float averageArithmeticNumber(float a, float b, float c) {
        float averageArithmetic = (a + b + c) / 3;
        return averageArithmetic;
    }

}
