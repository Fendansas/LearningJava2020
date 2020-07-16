package com.epam.home.task5;

import static com.epam.home.task5.TypeOfEngine.*;

public class Main {
    public static void main(String[] args) {
        Model<String> stringModel = new StringModel("101");
        Car carWithoutBrakes = new Car(false,DIESEL,stringModel);
        carWithoutBrakes.showCar();

        System.out.println("___________________________________________________");

        Model<Integer> integerModel = new IntegerModel(202);
        Car carWithBrakes = new Car (true,ELECTRIC,integerModel);
        carWithBrakes.showCar();

        System.out.println("___________________________________________________");

        Model<String> stringModel2 = new StringModel("SAS 303");
        Car carWithoutBrakes2 = new Car(false,GAS,stringModel2);
        carWithoutBrakes2.showCar();

        System.out.println("___________________________________________________");

    }


}
