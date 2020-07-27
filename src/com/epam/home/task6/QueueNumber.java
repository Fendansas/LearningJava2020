package com.epam.home.task6;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class QueueNumber {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        addToQueue(queue);
        System.out.println(queue.toString());
        int winNumber = 8;
        System.out.println("-----------------------------------------------------------");
        queue(queue, winNumber);
    }

    private static void queue(Queue<Integer> queue, int winNumber) {
        int user1;
        int user2;
        for (int i = 0; i < 5; i++) {
            user1 = queue.remove();
            System.out.println(user1); //для проверки сгенереных чисел

            user2 = queue.remove();
            System.out.println(user2); //для проверки сгенереных чисел

            if (user1 == winNumber) {
                System.out.println("Игрок номер 1 вытянул заданное значение " + user1 + " и он победил");
                System.exit(0);
            } else if (user2 == winNumber) {
                System.out.println("Игрок номер 2 вытянул заданное значение " + user2 + " и он победил");
                System.exit(0);
            } else {
                System.out.println("Продолжаем");
            }
        }
    }

    public static void addToQueue(Queue queue) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {

            queue.offer(random.nextInt(10) + 1);
        }
    }
}
