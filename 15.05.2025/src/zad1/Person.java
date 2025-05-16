package zad1;

import java.util.Optional;

public class Person {

    public static void person() {
        Optional<String> person = Optional.empty();
        String name1 = null;
        String name2 = "Barry";
        String name3 = "eighteen";
        Optional<String> person1 = Optional.ofNullable(name1);
        Optional<String> person2 = Optional.ofNullable(name2);
        Optional<String> person3 = Optional.ofNullable(name3);
        if (person1.isPresent()) {
            System.out.println(person1.get());
        }
        else {
            System.out.println("nie podano wartości");
        }

        if (person2.isPresent()) {
            System.out.println(person2.get());
        }
        else {
            System.out.println("nie podano wartości");
        }

        if (person3.isPresent()) {
            System.out.println(person3.get());
        }
        else {
            System.out.println("nie podano wartości");
        }
    }
}
