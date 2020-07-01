package com.epam.home.Task3;
// Разбить строку на отдельные слова и посчитать количество вхождений для каждого слова. - через split
// - будет считать разделителем пробел

import java.util.*;

public class CountsWords {
    public static void main(String[] args) {
        //System.out.println("В предложении " + countAllWords("Привет как дела?") + " буквы");
        String a = "привет как как дела привет ";
        String space = " ";
        String[] e = a.split(space);



        //List<String[]> list = new ArrayList<>();
        //list.add(e);
        /*int temp, count;
        for (int i = 0; i < array.length;)
        {
            temp = array[i];
            count = 1;
            while(++i < array.length && array[i] == temp)
                ++count;
            System.out.print(temp + "-" + count + " ");
        }

         */


        for (int i = 0; i < e.length;) {
            String copy = e[i];
            int count = 1;

            while (++i < e.length && e[i].equals(copy))
                ++count;
                System.out.println(copy + " " + count);



        }

    }


}





   /* private static int countAllWords (String a) {
        String space = " ";
        String[] e;
        e = a.split(space);
        int i = e.length;
        Collection coll = Arrays.asList(e);

        return i
        ;

    }
    */


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