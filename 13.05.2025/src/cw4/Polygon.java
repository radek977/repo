package cw4;

public class Polygon {
    Integer[] sides;

    public Polygon(Integer... sides) {
        this.sides = sides;
    }

    public void printSides() {
        System.out.print("Boki: ");
        for (int side : sides) {
            System.out.print(side + ", ");
        }
        System.out.println();
    }
}
