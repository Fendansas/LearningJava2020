package com.tasks.task6;
//6. Write a Java method to compute the sum of the digits in an integer. Input an integer: 25

public class MainTask6 {
    public static void main(String[] args) {
        summNambers(9);// работает только для 2х значных цифр
    }
    private static void summNambers (Integer a){
        int q = a.intValue();
        int d = q / 10;
        int r = q%10;
        int y = d+r;
        System.out.println("Сумма чисел " + y);

    }
}
