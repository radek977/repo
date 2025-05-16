package cw3;

public class Person {

    String name;
    String surname;
    String nick;

    public Person(String name, String surname, String nick) {
        this.name = name;
        this.surname = surname;
        this.nick = nick;
    }

    public String toString() {
        return name + " " + surname + " " + nick;
    }
}
