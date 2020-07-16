package com.epam.home.task5;

// вид двигателя
public enum TypeOfEngine {
    PETROL (" быстрый "),
    DIESEL(" экономный "),
    ELECTRIC (" лучший "),
    GAS (" газовый ");

    private String type;

    TypeOfEngine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

