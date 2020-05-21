package com.tasks.task13;

public class MainTask13 {
    public static void main(String[] args) {
        areaOfTriangle(5,5,5);

    }
    public static void areaOfTriangle(double a, double b, double c){
        if (a+b > c && a+c>b && c+b >a){
            double p = (a+b+c)/2;
            double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("area " + s);

        }
        else System.out.println("Стороны не верны");




    }
}
