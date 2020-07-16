package com.epam.home.task5;

public class Car {

    private Brakes brakes;
    private Engine engine;
    private Model model;

    public Car(boolean PresenceOfBrakes, TypeOfEngine view, Model model) {
        brakes = new Brakes(PresenceOfBrakes);
        engine = new Engine(view);
        this.model = model;
    }

    public void showCar() {
        brakes.showBrakes();
        engine.showType();
        System.out.println(model.getModelString());

    }

    // класс тормаза
    private class Brakes {
        private boolean PresenceOfBrakes;

        public Brakes(boolean PresenceOfBrakes) {
            this.PresenceOfBrakes = PresenceOfBrakes;
        }

        public void showBrakes() {
            // System.out.println(String.format("В нашей машине ", PresenceOfBrakes ? " нет тормозов" : " есть тормоза"));
            if (PresenceOfBrakes == true) {
                System.out.println("У меня есть тормоза");
            } else {
                System.out.println("У меня нет тормозов");
            }

        }
    }

    // класс двигатель
    private class Engine {
        private TypeOfEngine view;

        public Engine(TypeOfEngine view) {
            this.view = view;
        }

        public void setStatus(TypeOfEngine status) {
            this.view = status;
        }

        public void showType() {
            System.out.println("У меня : " + view.getType() + " двигатель");
        }
    }
}
