package com.epam.home.task2;


import java.util.Scanner;

public class MainPyramid {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j + 1;
            }
        }
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
    }
}
  /*  Scanner sc = new Scanner(System.in);

        System.out.println("Here Is Your Pyramid");
                int noOfRows = sc.nextInt();
                int rowCount = 1;
                int[][] mass = new int[noOfRows][noOfRows];
                for (int i = mass.length/2; i <mass.length; i++) {
        for (int j = mass[i].length/2; j <mass[i].length; j++){
        mass[i][j]= rowCount;
        rowCount++;
        }
        }
        for (int i = 0; i < mass.length; i++) {
        for (int j = 0; j < mass[i].length; j++) {
        System.out.print(mass[i][j] + "\t");
        }
        System.out.println();
        }

   */