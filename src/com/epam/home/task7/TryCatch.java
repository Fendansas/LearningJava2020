package com.epam.home.task7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) throws SecondException {

        try {
            DoAll();
        } catch (MyException e) {
            System.out.println("MyException");
            e.printStackTrace();
        }

        Exception();

    }

    private static void Exception() throws SecondException {
        throw new SecondException();
    }

    private static void DoAll() {
        Scanner scanner = new Scanner(System.in);
        boolean returnBloc = true;
        PrintWriter writer = null;
        do {
            try {
                System.out.println("В видите число");
                int numerator = scanner.nextInt();
                System.out.println("В видите число");
                int donominator = scanner.nextInt();
                //System.out.println(division(numerator, donominator));
                //int[] intArray = new int[1];                         // сторока для получения ошибки
                //int i = intArray[2];                                // сторока для получения ошибки
                writer = new PrintWriter(new FileWriter("File.txt"));
                writer.println("рузультат = " + division(numerator, donominator));
                returnBloc = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println(" Ошибка : " + e);
                scanner.nextLine();
                System.out.println("Можно вводить только числа больше 0");
            } catch (IOException e) {
                System.out.println("Невозможно открыть фаил");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Все Exception тут ");
                throw new MyException("Array index out of bound. Вызван в IndexOutOfBoundsException " + e);
            } finally {
                System.out.println("Блок finally вызван");
                if (writer != null) {
                    writer.close();
                }
            }
            System.out.println("Try catch block закончен");
        } while (returnBloc);
    }

    private static int division(int numerator, int denominator) throws ArithmeticException, NullPointerException {
        return numerator / denominator;
    }


}
