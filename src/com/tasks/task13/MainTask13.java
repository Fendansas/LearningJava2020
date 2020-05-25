package com.tasks.task13;

public class MainTask13 {
    public static void main(String[] args) {
        System.out.println("Area "+areaOfTriangle(5,5,5));

    }
    public static double areaOfTriangle(double a, double b, double c){
        double s=0;
        if (a+b > c && a+c>b && c+b >a){
            double p = (a+b+c)/2;
            s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            //System.out.println("area " + s);

        }
        else System.out.println("Стороны не верны");
        return s;




    }
}
