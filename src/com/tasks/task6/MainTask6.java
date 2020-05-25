package com.tasks.task6;
//6. Write a Java method to compute the sum of the digits in an integer. Input an integer: 25

public class MainTask6 {
    public static void main(String[] args) {
        System.out.println("сумма чисел " + summNambers(100));// работает только для 2х значных цифр
    }
    private static int summNambers (Integer a){
        int y = 0;
        if (a>99){
            System.out.println("Неверное чило, ввидите 2х значное число");
        }
        else {
            int q = a.intValue();
            int d = q / 10;
            int r = q % 10;
            y = d + r;
        }


        return y;

    }
}
