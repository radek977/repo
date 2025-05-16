package cw5;

public class Sport<T> {

    private T discipline;

    public Sport(T discipline) {
        this.discipline = discipline;
    }

    public T getDiscipline() {
        return discipline;
    }

    public void printDisciplineType() {
        System.out.println("Typ dyscypliny: "+discipline.getClass().getName());
    }
}
