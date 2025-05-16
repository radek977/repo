package cw10;

import java.util.HashSet;
import java.util.Set;

public class Geometry {

    public static void run() {
        Set<Shape> shapes = new HashSet<>();
        shapes.add(new Triangle(9,9,9));
        shapes.add(new Circle(9));
        shapes.add(new Triangle(7,8,9));
        for (Shape s : shapes) {
            if (s instanceof Triangle) {
                System.out.println(s);
            }
        }
    }
}
