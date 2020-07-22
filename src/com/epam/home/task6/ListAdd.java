package com.epam.home.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ListAdd {
    public static void main(String[] args) throws IOException {

        System.out.println("Елсли вы хотите ввисти номер телефона нажмите 1");
        System.out.println("Если хотите закончить нажмите 0");

        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        int reset = 1;
        String str;

        while (reset == 1) {
            System.out.println("Закончить 0, продолжить 1");
            int s = scanner.nextInt();
            if (s == 1) {
                System.out.println("Видите что текст");
                str = reader.readLine();
                list.add(str);
                reset = 1;
            } else {
                reset = 0;
            }
        }
        System.out.println(list);
    }
}
