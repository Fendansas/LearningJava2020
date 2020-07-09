package com.bookTask;

import java.util.Random;

public class Task_11_9 {
    public static void main(String[] args) {
        int min = 27;
        int max = 73;
        int random;
        for (int i = 0; i <15; i++){
            random = new Random().nextInt(max - min)+min;
            if (random % 3 == 0){
                System.out.print(random + "# ");

            }else {
                System.out.print(random + " ");
            }

        }
    }
}
