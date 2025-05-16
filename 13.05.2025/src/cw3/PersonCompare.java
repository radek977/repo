package cw3;

import java.util.Comparator;

public class PersonCompare implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.surname.compareTo(o2.surname);
    }

//    public int compare(Person p1, Person p2) {
//        return p1.surname.compareTo(p2.surname);
//    }
}
