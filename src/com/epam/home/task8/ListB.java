package com.epam.home.task8;

import java.util.ArrayList;
import java.util.List;

public class ListB{
   private List<Model> modelsB = new ArrayList<>();


    public List<Model> getModelsB() {
        return modelsB;
    }

    public void setModelsB(List<Model> modelsB) {
        this.modelsB = modelsB;
    }

    @Override
    public String toString() {
        return "ListB{" +
                "modelsB=" + modelsB +
                '}';
    }
}
