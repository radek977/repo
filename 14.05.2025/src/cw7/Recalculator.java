package cw7;

import java.math.BigDecimal;

public class Recalculator {

    private static final Double MILES = 1.6;

    public static Double mileToKm(Double mile) {
        return mile * MILES;
    }

    public static BigDecimal mileToKm(BigDecimal mile) {
        return mile.multiply(BigDecimal.valueOf(MILES));
    }
}
