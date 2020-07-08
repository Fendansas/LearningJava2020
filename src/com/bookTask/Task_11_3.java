package com.bookTask;

import java.util.Scanner;

public class Task_11_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i < 6; i++) {
            int k = scanner.nextInt();
            if (k > 100) sum = sum + k;
        }
        System.out.println(sum);
    }
}
