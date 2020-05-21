package com.tasks.task7;
// Write a Java method to display the first 50 pentagonal numbers.

public class MainTask7 {
    public static void main(String[] args) {
        int count =1;
        for (int i =1; i <= 50; i++){
            System.out.printf("%-6d", pentogonalNumbers(i));
            if (count%10==0) System.out.println();
            count++;
        }

    }
    public static int pentogonalNumbers(int i){
        return (i*(3*i-1))/2;
    }
}
