package cw4;

public class Rectangle extends Polygon {

    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB, sideA, sideB);
    }

    public int getArea() {
        return sides[0] * sides[1];
    }
}
