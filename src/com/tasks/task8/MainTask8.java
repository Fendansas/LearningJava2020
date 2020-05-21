package com.tasks.task8;
//Write a Java method to compute the future investment value at a given interest rate for a specified number of years

public class MainTask8 {
    public static void main(String[] args) {
        investmentValue(10,1000, 5);

    }
    public static void investmentValue (double interest, double investment, int year){
        year = year*12;
        double d = 12;
        double g = 100;
        int r =0;
        System.out.println("Year         FutureValue");
        for(int i = 1; i<=year; i++){
            double e = (investment*((interest/d)/g));
            investment = e+investment;
            if(i%12==0){
                r++;
                System.out.print(r+"              ");
                System.out.printf("%.2f", investment);
                System.out.println(" ");
            }
        }
    }
}
