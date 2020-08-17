package com.epam.home.task9;

import java.util.Scanner;

import static com.epam.home.task9.Priority.LONG;

public class TaskCreator {

    private static final Scanner scanner = new Scanner(System.in);

    public static Task create() {
        return new Task(getName(),getCategory());
    }



    private static String getName() {
        System.out.println("Enter name: ");
        return scanner.nextLine();
    }

    private static String getCategory() {
        System.out.println("Enter Category: ");
        return scanner.nextLine();
    }

   /* private static Priority getPriority() {
        System.out.println("нипиши URGENTLY   если CURRENT если LONG ");
        return LONG;
    }

    */


}
