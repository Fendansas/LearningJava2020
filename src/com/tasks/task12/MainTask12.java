package com.tasks.task12;

public class MainTask12 {
    public static void main(String[] args) {
        printMatrix(10);
    }
    public static void printMatrix(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}
