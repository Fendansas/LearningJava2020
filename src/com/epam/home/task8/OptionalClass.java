package com.epam.home.task8;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("John");
        System.out.println(name);
        //Optional<String> name1 = Optional.of(null); // так делать ельзя
        //System.out.println(name1);
        System.out.println("________________________________________________");

        Optional<String> name2 = Optional.ofNullable("John Conor");
        System.out.println(name2);
        String john = null;
        Optional<String> name3 = Optional.ofNullable(john);
        System.out.println(name3);
        System.out.println("________________________________________________");

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);
        System.out.println("________________________________________________");

        Optional<String> name4 = Optional.of("John");
        System.out.println(name4.get()); //output John
        Optional<Object> nullOptional = Optional.ofNullable(null);
        //System.out.println(nullOptional.get());
        System.out.println("________________________________________________");

        Optional<String> name5 = Optional.of("John");
        if (name5.isPresent()) {             //увидим имя
            System.out.println(name5.get());
        }
        Optional<Object> empty = Optional.empty();
        if (empty.isPresent()) {            //не увидем именеи
            System.out.println(empty.get());
        }
        System.out.println("________________________________________________");

        Optional<String> name6 = Optional.of("John");
        name6.ifPresent(val -> System.out.println(val)); // мыувидим John
        Optional<Object> empty1 = Optional.empty();
        empty1.ifPresent(val -> System.out.println(val)); // ошибки не будет
        System.out.println("________________________________________________");

        Optional<String> name7 = Optional.of("John");
        System.out.println(name7.orElse("blank")); //John
        Optional<Object> empty2 = Optional.empty();
        System.out.println(empty2.orElse("blank"));//blank
        System.out.println("________________________________________________");

        Optional<String> name8 = Optional.of("John");
        System.out.println(name8.orElseGet(() -> "blank")); // John
        Optional<Object> empty3 = Optional.empty();
        System.out.println(empty3.orElseGet(() -> "blank")); // blank
        System.out.println("________________________________________________");

        Optional<String> name9 = Optional.of("John");
        String nameValue = name9.orElseThrow(() -> new RuntimeException());
        System.out.println(nameValue);                                      // John
        Optional<Object> empty4 = Optional.empty();
        //Object emptyValue = empty4.orElseThrow(() -> new RuntimeException());
        System.out.println("________________________________________________");

        Optional<String> name10 = Optional.of("JOHN");
        System.out.println(name10.map(String::toLowerCase));  //john
        Optional<String> empty5 = Optional.empty();
        System.out.println(empty5.map(String::toLowerCase)); //пусто
        System.out.println("________________________________________________");

        Optional<Optional<String>> name11 = Optional.of(Optional.of("JOHN"));
        Optional<String> lowerCaseName = name11.flatMap(o -> o.map(String::toLowerCase));
        System.out.println(lowerCaseName);  //john
        Optional<Optional<String>> empty8 = Optional.of(Optional.empty());
        System.out.println(empty8.flatMap(o -> o.map(String::toLowerCase)));


    }


}
