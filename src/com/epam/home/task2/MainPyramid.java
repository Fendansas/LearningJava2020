package com.epam.home.task2;


import java.util.Scanner;

public class MainPyramid {
    public static void main(String[] args) {


        int max = 4;
        int min;

        for (int i = 0; i<max; i++){
            for (int j = 0; j <max; j++){
                min = i>j?i:j;
                System.out.print(max-min);
            }
            System.out.println();

        }




        }
    }


