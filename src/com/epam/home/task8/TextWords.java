package com.epam.home.task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TextWords {
    public static void main(String[] args) {

        String string = "Привет как Дела привет дом стройка деталь ";
        String stringLowerCase = string.toLowerCase();
        String space = " ";

        String[] arrString = stringLowerCase.split(space);
        Arrays.sort(arrString);
        List list = Arrays.asList(arrString);
        ArrayList<String> strings = new ArrayList<String>(list);

        List<String> filtered = strings.stream()
                .filter(p -> p.startsWith("д"))
                .collect(Collectors.toList());
        System.out.println(string);

        System.out.println("_______________________");
        for (int i = 0; i < filtered.size(); i++) {
            System.out.println(filtered.get(i));

        }
        System.out.println("_______________________");
// можно еще и в строку
        System.out.println(filtered);


    }


}
