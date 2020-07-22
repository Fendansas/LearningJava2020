package com.epam.home.task6;


import java.util.TreeMap;

public class TextAnalysisMain {
    public static void main(String[] args) {

       

        String txtInput = "ииаа аа ааа";
        String stringLowerCase = txtInput.toLowerCase();
        String alph = "abcdefghijklmnopqrstuvwxyzабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        for (int a = 0; a < alph.length(); a++){
            char letter = alph.charAt(a);

            TreeMap<Character, Integer> map = new TreeMap<>();
            for (int i = 0; i < stringLowerCase.length(); ++i) {
                char c = stringLowerCase.charAt(i);
                // проверяем является ли символ буквой
                if (Character.isLetter(c)) {
                    if (map.containsKey(c)) {
                        map.put(c, map.get(c) + 1);
                    } else {
                        map.put(c, 1);
                    }
                }
            }
            if (map.get(letter) == null){}
            else{
                System.out.println("Число повторов буквы "+ letter+" - "+map.get(letter));
            }
        }


    }
}
