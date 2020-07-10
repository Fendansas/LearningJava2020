package com.bookTask;

public class Task_11_11 {
    public static void main(String[] args) {
        int random;
        int number1;
        int number2;
        int answer;

        for (int i = 0; i < 11; i++) {
            random = (int) (Math.random() * 100);
            if (random % 5 == 0) {
                number1 = random / 10;
                number2 = random % 10;
                answer = number1 + number2;
                System.out.print("(" + answer + ")");
            } else {
                number1 = random / 10;
                number2 = random % 10;
                if (number1 == 0){
                    System.out.print("[" + number2 + "]");
                } else if (number2 == 0){
                    System.out.print("[" + number1 + "]");
                }else {
                    answer = number1 * number2;
                    System.out.print("[" + answer + "]");
                }

            }
        }

    }
}
