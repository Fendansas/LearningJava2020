package com.epam.home.Task3;
//3. Пользователь вводит имя и возраст. Вывести сообщение, приветствующее пользователя.
// - форматирование (String.format) через спецификаторы

import java.util.Scanner;

public class NameAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввидите имя");
        String name = scanner.nextLine();

        System.out.println("Ввидите год рождения");
        String age = scanner.nextLine();

        System.out.println(String.format("Привет %s тебе %s лет",name,age));
    }
}
