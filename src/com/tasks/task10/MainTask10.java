package com.tasks.task10;

public class MainTask10 {
    public static void main(String[] args) {
        int year = 2008;
        System.out.println(" вы ввели " + year + " если будет true год високостный : "+  LeapYear(year));

    }
    public static boolean LeapYear(int year){
        boolean f = false;
        if(year%4==0 && year%100 !=0){
            f = true;


        }
        if(year%100==0&&year%400==0){
            f = true;

        }
        if (year%4!=0) {
            f = false;

        }
        return f;


    }
}
