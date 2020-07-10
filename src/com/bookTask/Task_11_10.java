package com.bookTask;

import java.util.Random;

public class Task_11_10 {


    public static void main(String[] args) {
        int random;
        for (int i = 0; i <19; i++){
            random = (int) (Math.random() * 10);
            if (random == 0){
                System.out.print("%"+random+"% ");
            }else {
                System.out.print(random + " ");
            }
        }
    }

}
