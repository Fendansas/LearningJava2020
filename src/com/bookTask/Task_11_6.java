package com.bookTask;

import java.util.Random;
import java.util.Scanner;

public class Task_11_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввидите первое чило");
        int input1 = scanner.nextInt();

        System.out.println("Ввидите второе чило");
        int input2 = scanner.nextInt();
        int random;

        for (int i = 0; i < 20; i++) {
            if (input1 < input2) {
                random = new Random().nextInt(input2 - input1) + input1;
                if (random<0){
                    System.out.print(random + "? ");
                } else {
                    System.out.print(random + " ");
                }
            } else {
                random = new Random().nextInt(input1 - input2) + input2;
                if (random<0){
                    System.out.print(random + "? ");
                } else {
                    System.out.print(random + " ");
                }
            }
        }
    }
}
