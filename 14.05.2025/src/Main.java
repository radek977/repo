import cw1.Triangle;
import cw10.Geometry;
import cw7.Recalculator;
import cw9.PetlaFor;
import cw9.PetlaForArrayList;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(9,9,9,9);
        Triangle triangle2 = new Triangle(9,9,9,9);
        Triangle triangle3 = new Triangle(7,10,25,9);
        System.out.println(triangle1.equals(triangle2));
        System.out.println(triangle1.equals(triangle3));


        Double mile = 9.0;
        Double answer = Recalculator.mileToKm(mile);
        System.out.println(mile+"mil= "+answer+"km");

        BigDecimal bigMile = new BigDecimal(7.9);
        BigDecimal bigAnswer = Recalculator.mileToKm(bigMile);
        System.out.println(bigMile+"mil= "+bigAnswer+"km");

        PetlaFor.petlaFor();
        PetlaForArrayList.petlaForArrayList();

        Geometry.run();
    }
}