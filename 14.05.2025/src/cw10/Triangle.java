package cw10;

public class Triangle extends Shape{

    private double sideA , sideB , sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return sideA + "," + sideB + "," + sideC;
    }
}
