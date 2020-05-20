package com.tasks.task4;

//4. Write a Java method to count all vowels in a string. Напишите метод который выводит количество гласных в строке

public class MainTask4 {
    public static void main(String[] args) {
        allVowels("Hello");
    }
    private static void allVowels(String a) {
        String r = a.toLowerCase();
        String q = r.replaceAll(" ", ""); // не понял как удалить, заменил пробелы.
        char[] b = q.toCharArray();
        int index = 0;
        for (int i = 0; i < b.length; i++) {
            if(b[i]== 'a' || b[i] == 'e' || b[i] == 'y' || b[i] == i || b[i] == 'o' || b[i] == 'u'){
                index++;
            }
        }
        System.out.println("Гласных букв в слове "+index);
    }
}
