package com.epam.home.task2;

import java.util.Scanner;

//Задать пользователю любой вопрос и дать ограниченное количество попыток для верного ответа.
// Предусмотреть возможность сдаться.

public class MainQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rules = "У вас 3 попытки, Вы можите сдатся написав слово \"СДАЮСЬ\"";
        String question = "Что за свойство, позволяющее одному классу получить все или отдельные свойства другого класса?";
        String answer = "наследование";
        String giveUp = "сдаюсь";

        System.out.println(rules);
        System.out.println(question);

        int count = 0;
        while (count < 3) {

            String responseFromUser = scanner.nextLine();
            String lowerCase = responseFromUser.toLowerCase();

            if (answer.equals(lowerCase)) {
                System.out.println("Вы дали правильный ответ");
                break;

            } else if (giveUp.equals(lowerCase)) {
                System.out.println("Вы сдались");
                break;

            } else count++;
            if (count < 3) {
                System.out.println("попробуй еще раз");

            } else System.out.println("ТЫ проиграл");

        }
    }
}
