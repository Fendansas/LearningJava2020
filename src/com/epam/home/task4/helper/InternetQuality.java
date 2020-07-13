package com.epam.home.task4.helper;

public enum InternetQuality {
    EXCELLENT("Best of the best"),
    NORMAL("normal"),
    BAD("Very bad");

    private String value;

    InternetQuality(String value) {
        this.value = value;
    }

    public String getValue() {
        return  value;
    }
}
