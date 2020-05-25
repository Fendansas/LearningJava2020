package com.tasks.task3;
//3. Write a Java method to display the middle character of a string
//Note: a) If the length of the string is odd there will be two middle characters.
//b) If the length of the string is even there will be one middle character.

public class MainTask3 {
    public static void main(String[] args) {
        System.out.println(middleCharacter("фdвф"));
    }

    private static String middleCharacter(String a) {
        int p;
        int o;
        int s = a.length();
        int b = s % 2;
        if (b == 0) {
            p = s / 2 - 1;
            o = 2;

        } else {
            p = s / 2;
            o = 1;
        }
        return a.substring(p, p + o);
    }

}
