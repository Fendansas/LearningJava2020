package com.epam.home.task7;

import java.io.PrintStream;

public class SecondException extends Exception {

    @Override
    public void printStackTrace(PrintStream s) {
        System.err.println("Моя ошибка");
    }
}
