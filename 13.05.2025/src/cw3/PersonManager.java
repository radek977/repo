package cw3;

import java.util.ArrayList;
import java.util.Collections;

public class PersonManager {

    public void run() {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("John", "Stone", "dirt"));
        people.add(new Person("Emma", "Watson", "red hair"));
        people.add(new Person("Barry", "Allen", "Flash"));
        Collections.sort(people, new PersonCompare());
        System.out.println("Posortowane: ");
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
