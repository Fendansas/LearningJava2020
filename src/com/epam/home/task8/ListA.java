package com.epam.home.task8;

import java.util.ArrayList;
import java.util.List;

public class ListA {
    private List<Model> modelsA = new ArrayList<>();
    private ListB listB;

    public ListA(ListB listB) {
        this.listB = listB;
    }

    public List<Model> getModelsA() {
        return modelsA;
    }

    public void setModelsA(List<Model> modelsA) {
        this.modelsA = modelsA;
    }

    public ListB getListB() {
        return listB;
    }

    public void setListB(ListB listB) {
        this.listB = listB;
    }

    @Override
    public String toString() {
        return "ListA{" +
                "modelsA=" + modelsA +
                ", listB=" + listB +
                '}';
    }



}
