package com.tasks.task10;

public class MainTask10 {
    public static void main(String[] args) {
        LeapYaer(2008);

    }
    public static void LeapYaer(int year){
        if(year%4==0 && year%100 !=0){
            System.out.println("Год високосный "+ year);
        }
        if(year%100==0&&year%400==0){
            System.out.println("Год високосный "+ year);
        }
        if (year%4!=0) {
            System.out.println("Год обычный "+ year);
        }


    }
}
