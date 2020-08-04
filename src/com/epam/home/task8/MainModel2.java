package com.epam.home.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainModel2 {

    public static void main(String[] args) {
        List<Model> modelsForA = new ArrayList<>();
        modelsForA.add(new Model("for a1"));
        modelsForA.add(new Model("for a2"));

        List<Model> modelsForB = new ArrayList<>();
        modelsForB.add(new Model("for b1"));
        modelsForB.add(new Model("for b2"));

        ClassB b = new ClassB(modelsForB);
        final ClassA a = new ClassA(modelsForA, b);

        final List<String> collected = Stream.concat(
                Stream.of(a)
                        .flatMap(item -> Stream.of(item.b))
                        .flatMap(itemB -> itemB.models.stream())
                        .map(model -> model.field),
                Stream.of(a)
                        .flatMap(itemA -> itemA.models.stream())
                        .map(model -> model.field))
                .collect(Collectors.toList());

        collected.forEach(System.out::println);
    }







    static class Model {
        String field;

        public Model(String field) {
            this.field = field;
        }
    }

    static class ClassB {
        List<Model> models;


        public ClassB(List<Model> models) {
            this.models = models;
        }
    }

    static class ClassA {
        List<Model> models;
        ClassB b;

        public ClassA(List<Model> models, ClassB b) {
            this.models = models;
            this.b = b;
        }
    }
}
