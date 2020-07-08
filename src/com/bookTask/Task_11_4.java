package com.bookTask;

import java.util.Scanner;

public class Task_11_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i, x1, x2;
                x1 = scanner.nextInt();

        for (i = 1; i < 5; i++) {
            x2 = scanner.nextInt();
            if (x2 > x1) System.out.println(x2);
            x1 = x2;
        }
    }
}
