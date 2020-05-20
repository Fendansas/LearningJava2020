package com.tasks.task3;
//3. Write a Java method to display the middle character of a string
//Note: a) If the length of the string is odd there will be two middle characters.
//b) If the length of the string is even there will be one middle character.

public class MainTask3 {
    public static void main(String[] args) {
        middleCharacter("12321");
    }
    private static void middleCharacter(String a) {
        int s = a.length();
        int b = s % 2;
        int v = s / 2;
        if (b == 0) {
            System.out.println(a.charAt(v - 1) + "" + a.charAt(v));
        } else {
            System.out.println(a.charAt(v));
        }
        //System.out.println(s);
    }

}
