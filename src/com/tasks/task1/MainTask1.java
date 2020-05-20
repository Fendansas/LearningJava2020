package com.tasks.task1;
//1. Write a Java method to find the smallest number among three numbers/ Написать метод находящий самое маленькое число из трех чисел.

public class MainTask1 {
    public static void main(String[] args) {
        smallestNumber(25, 37, 29);
    }


    private static void smallestNumber(int a, int b, int c) {
        if (a <= b & a <= c) {
            System.out.println("the smallest number is " + a);
        } else if (b <= a & b <= c) {
            System.out.println("the smallest number is " + b);
        } else if (c <= a & c <= b) {
            System.out.println("the smallest number is " + c);
        }
    }
}

