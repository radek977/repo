import java.util.Arrays;
import java.util.Scanner;

public class cw11 {
    public static void wlaczKalkulator(Scanner scanner) {
        System.out.println("Podaj ilosc cyfr: ");
        int iloscCyfr = scanner.nextInt();

        if (iloscCyfr <= 0) {
            System.out.println("Cyfra musi byc wieksza od 0!!!");
            return;
        }

        double[] iloscCyfry = new double[iloscCyfr];
        for (int i = 0; i < iloscCyfr; i++) {
            System.out.println("Podaj cyfre"+(i+1)+": ");
            iloscCyfry[i] = scanner.nextDouble();
        }

        System.out.println("WYBIERZ OPERACJE: ");
        System.out.println("1. DODAWANIE");
        System.out.println("2. ODEJMOWANIE");
        System.out.println("3. MNOZENIE");
        System.out.println("4. DZIELENIE");
        System.out.println("WYBIERZ: ");
        int opcja = scanner.nextInt();

        double wynik = iloscCyfry[0];
        for (int i = 1; i < iloscCyfr; i++) {
            switch (opcja) {
                case 1:{
                    wynik += iloscCyfry[i];
                }
                case 2:{
                    wynik -= iloscCyfry[i];
                }
                case 3:{
                    wynik *= iloscCyfry[i];
                }
                case 4:{
                    if (iloscCyfry[i] == 0) {
                        System.out.println("Nie mozna dzielic przez 0!!!");
                        return;
                    }
                    wynik /= iloscCyfry[i];
                    break;
                }
                default:{
                    System.out.println("Zla operacja!!!");
                    return;
                }
            }
        }
        System.out.println("Wynik= " + wynik);
    }
}
