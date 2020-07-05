package com.epam.home.Task3;
// Разбить строку на отдельные слова и посчитать количество вхождений для каждого слова. - через split
// - будет считать разделителем пробел

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountsWords {
    public static void main(String[] args) {

        String string = "Привет как как дела привет ";
        String stringLowerCase = string.toLowerCase();
        String space = " ";

        String[] arrString = stringLowerCase.split(space);
        Arrays.sort(arrString);


        for (int i = 0; i < arrString.length; ) {
            String copy = arrString[i];
            int count = 1;

            while (++i < arrString.length && arrString[i].equals(copy))
                ++count;

            System.out.println(copy + " -  " + count);
        }

 // -------------------------------------------------------------------------------------------------------------------
// не очень понимаю как это работает.

        String string1 = "Ёлочка вам нравится, привет привет привет ёлочка?";

        List<String> words = new ArrayList<>();
        for (String s : string1.split(" ")) {
            words.add(s.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", "").toLowerCase());
        }

        Map<String, Long> frequency = countDuplicates(words);
        System.out.println(frequency);
    }

    public static Map<String, Long> countDuplicates(List<String> inputList) {
        return inputList.stream().collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
    }


}











/*
String sentence = "Ёлочка вам нравится, привет привет привет ёлочка?";

        List<String> words = new ArrayList<>();
        for (String s : sentence.split(" ")) {
            words.add(s.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", "").toLowerCase());
        }

        Map<String, Long> frequency = countDuplicates(words);
        System.out.println(frequency);
    }
    public static Map<String, Long> countDuplicates(List<String> inputList) {
        return inputList.stream().collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
    }
 */