package com.epam.home.task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MainModel {
    public static void main(String[] args) {
        Model model1 = new Model("Model1");
        Model model2 = new Model("Model2");
        Model model3 = new Model("Model3");
        Model model4 = new Model("Model4");
//__________________B________________________________
        ListB listB = new ListB();
        List<Model> models = new ArrayList<>();
        models.add(model1);
        models.add(model2);
        listB.setModelsB(models);
//__________________A__________________________________

        ListA listA = new ListA(listB);
        List<Model> modelsA = new ArrayList<>();
        modelsA.add(model3);
        modelsA.add(model4);
//--------------------------------------------------
        List<Model> listC = new ArrayList<>();
        listC.addAll(models);
        listC.addAll(modelsA);
        System.out.println(listC);
//--------------------------------------------------
        Stream<Model> modelStream;
        modelStream = Stream.concat(
                models.stream(),
                modelsA.stream());
        System.out.println(modelStream.toString());
//------------------------------------------------------
        List<Model> listV = new ArrayList<>();
        List<Model> modelsA1 = listA.getModelsA();
        List<Model> modelsA2 = (List<Model>) listA.getListB();
        listV.add((Model) modelsA1);
        listV.add((Model) modelsA2);
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(listV);

 //_____________________________________________________________



    }










    /*final List<String> collected = Stream.concat(
            Stream.of(a)
                    .flatMap(item -> Stream.of(item.b))
                    .flatMap(itemB -> itemB.models.stream())
                    .map(model -> model.field),
            Stream.of(a)
                    .flatMap(itemA -> itemA.models.stream())
                    .map(model -> model.field))
            .collect(Collectors.toList());

        collected.forEach(System.out::println);

     */
}
