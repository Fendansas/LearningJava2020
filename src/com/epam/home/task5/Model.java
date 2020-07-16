package com.epam.home.task5;

public abstract class Model<T> {
    protected T model;

    public Model(T model) {
        this.model = model;
    }

    public String getModelString() {
        return "Модель: " + model;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Model{" +
                "model=" + model +
                '}';
    }
}
