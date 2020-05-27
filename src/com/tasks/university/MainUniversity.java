package com.tasks.university;

public class MainUniversity {
    public static void main(String[] args) {
        System.out.println(UniversityMadElks.NAME_UNIVERSITY);
        Dean dean1= new Dean("Dean weapon",5000,"Vilkevish","Vova","18.05.2000","Grodno",33_777_88_99);
        System.out.println(dean1.getUniversitySpecialization()); // знаю что так делать не стоит, решил проверить как это работает.
        System.out.println(dean1);
    }
}
