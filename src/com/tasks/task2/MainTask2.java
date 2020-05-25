package com.tasks.task2;
//2. Write a Java method to compute the average of three numbers / Написать метод находящий среднее число из трех.
//   Вопрос: как правильно делать через if или if else????

public class MainTask2 {
    public static void main(String[] args) {


        System.out.println("Среднее число " + averageNumber(25, 37, 29));
    }
    private static int averageNumber(int a, int b, int c) {
        int f=0;
        if (a >= b & a <= c) {
            f=a;
        }
        if (b >= a & b <= c) {
            f=b;
        }
        if (c >= a & c <= b) {
            f=c;
        }
        return f;
    }

}
