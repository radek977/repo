package cw6;

public class PolygonTest {

    public static void run() {
        Box<Polygon> boxPolygon = new Box<>();
        boxPolygon.add(new Rectangle(4,6));
        boxPolygon.add(new Square(5));
        for (int i = 0; i < boxPolygon.size(); i++) {
            Polygon p = boxPolygon.get(i);
            p.printSides();
            if (p instanceof Rectangle) {
                Rectangle r = (Rectangle) p;
                System.out.println("Pole: "+r.getArea());
            }
            System.out.println();
        }
    }
}
