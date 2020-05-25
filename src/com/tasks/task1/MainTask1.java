package com.tasks.task1;
//1. Write a Java method to find the smallest number among three numbers/ Написать метод находящий самое маленькое число из трех чисел.

public class MainTask1 {
    public static void main(String[] args) {
        System.out.println("Самое маленькое число "+ smallestNumber(25, 37, 29));
    }


    private static int smallestNumber(int a, int b, int c) {
        int smallestNumber =0;
        if (a <= b & a <= c) {
            smallestNumber= a;
        } else if (b <= a & b <= c) {
            smallestNumber= b;
        } else if (c <= a & c <= b) {
            smallestNumber= c;
        }
        return smallestNumber;
    }
}

