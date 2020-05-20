package com.tasks.task2;
//2. Write a Java method to compute the average of three numbers / Написать метод находящий среднее число из трех.
//   Вопрос: как правильно делать через if или if else????

public class MainTask2 {
    public static void main(String[] args) {


        averageNumber(25, 37, 29);
    }
    private static void averageNumber(int a, int b, int c) {
        if (a >= b & a <= c) {
            System.out.println("the average number is " + a);
        }
        if (b >= a & b <= c) {
            System.out.println("the average number is " + b);
        }
        if (c >= a & c <= b) {
            System.out.println("the average number is " + c);
        }
    }

}
