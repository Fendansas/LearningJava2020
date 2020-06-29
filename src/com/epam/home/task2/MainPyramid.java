package com.epam.home.task2;


import java.util.Scanner;

// Вывести пирамиду из цифр. Размер вводится пользователем. Пирамида - фигура такого вида:
//1 1 1 1 1
//1 2 2 2 1
//1 2 3 2 1
//1 2 2 2 1
//1 1 1 1 1

public class MainPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидте размер");

        int input = scanner.nextInt();
        int number = 1;

        int[][] arr = getArr(input, number);
        ptintArr(arr);

    }

    private static void ptintArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] getArr(int input, int number) {
        if (input % 2 != 1) {
            input++;
        }

        int[][] arr = new int[input][input];

        for (int i = 0; i < arr.length / 2 + 1; i++) {
            for (int j = i; j < arr[i].length; j++) {

                for (int k = i; k < arr.length; k++) {
                    for (int r = j; r < arr.length - k; r++) {
                        arr[k][r] = number;
                        if (r == arr.length - k - 1) {
                            arr[k][arr.length - number] = number;
                            arr[arr.length - number][k] = number;
                        }
                    }
                }

            }
            number++;
        }
        return arr;
    }
}


