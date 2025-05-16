package cw1;

import java.util.Objects;

public class Circle {

    private int radius;

    public Circle() {
        radius = 0;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String toString() {
        return "-" + radius + "-";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle circle = (Circle) o;
            return circle.radius == this.radius;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
