package com.epam.home.task1;


import java.util.Scanner;


public class MainPass {
    public static void main(String[] args) {

        checPass(enterPass());
    }

    public static String enterPass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String bet = scanner.nextLine();
        return bet;
    }


    public static void test() {
        System.out.println("Пароль правильный");
    }

    public static boolean checPass(String pass) {

        boolean success = false;

        do {

            if (pass.equals("1111")) {
                test();
                success = true;
            } else {
                System.out.println("Некорректный ввод, попробуйте снова");
                enterPass();
            }
        } while (!success);

        return true;
    }
}





