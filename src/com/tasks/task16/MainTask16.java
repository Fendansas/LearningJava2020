package com.tasks.task16;

public class MainTask16 {
    public static void main(String[] args) {
        promeNumbers(100);

    }
    public static void promeNumbers(int a){
        for (int i = 2; i<a; i++){
            int count = 0;
            for(int j =2; j<=i && count <2; ++j){
                if(i%j==0){
                    ++count;
                }
            }
            if (count<2) System.out.println(i);
        }
    }
}
