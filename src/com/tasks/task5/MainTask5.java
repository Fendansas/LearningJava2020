package com.tasks.task5;
//5.Write a Java method to count all words in a string

public class MainTask5 {
    public static void main(String[] args) {
        System.out.println("В предложении " + countAllWords("Привет как дела?") + " буквы");
    }
    private static int countAllWords (String a){
        String space = " ";
        String[] e;
        e = a.split(space);
        int i = e.length;
        return i;


    }
}
