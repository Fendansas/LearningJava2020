package com.tasks.task8;
//Write a Java method to compute the future investment value at a given interest rate for a specified number of years

public class MainTask8 {
    public static void main(String[] args) {
        for (int k = 1;k <= 5; k++){
            double investment = investmentValue(10,1000);
            System.out.println(investmentValue(10, investment));
        }

    }
    public static double investmentValue (double interest, double investment){
        int year = 12;
        double d = 12;
        double g = 100;
        int r =0;

        for(int i = 1; i<=year; i++){
            double e = (investment*((interest/d)/g));
            investment = e+investment;

        }
        return investment;
    }
}
