package cw5;

public class SportTest {

    public static void run() {
        Sport<String> football = new Sport<>("Pilka nozna");
        Sport<Integer> level = new Sport<>(9);
        System.out.println("Football: ");
        football.printDisciplineType();
        System.out.println("Level: ");
        level.printDisciplineType();
        System.out.println("Typ football: "+football.getClass().getSimpleName());
        System.out.println("Typ level: "+level.getClass().getSimpleName());
    }
}
