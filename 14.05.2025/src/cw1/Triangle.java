package cw1;

import java.util.Objects;

public class Triangle extends Shape {

    private int sideA;
    private int sideB;
    private int sideC;
    private int height;

    public Triangle(int sideA, int sideB, int sideC, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public String toString() {
        return height + ", " + sideA + ", " + sideB + ", " + sideC;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Triangle) {
            Triangle triangle = (Triangle) o;
            return triangle.sideA == this.sideA && triangle.sideB == this.sideB && triangle.sideC == this.sideC && triangle.height == this.height;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC, height);
    }

    @Override
    public double getArea() {
        return 1/2*sideA*height;
    }

    @Override
    public double getCircumference() {
        return sideA+sideB+sideC;
    }
}
