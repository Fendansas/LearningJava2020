package com.epam.home.task2;


import java.util.Scanner;

public class MainPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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






    }
}
/*for (int i = 0; i < noOfRows; i++) {



        for (int j = 1; j <= rowCount; j++) {
        System.out.print(j + " ");
        }



        for (int j = rowCount - 1; j >= 1; j--) {
        System.out.print(j + " ");
        }

        System.out.println();



        //rowCount++;

        }*/