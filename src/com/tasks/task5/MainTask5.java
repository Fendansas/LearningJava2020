package com.tasks.task5;
//5.Write a Java method to count all words in a string

public class MainTask5 {
    public static void main(String[] args) {
        countAllWords("Привет как дела?");
    }
    private static void countAllWords (String a){
        String space = " ";
        String[] e;
        e = a.split(space);
        System.out.println("Вы ввели "+e.length + " слова");

    }
}
