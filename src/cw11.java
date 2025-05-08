import java.util.Scanner;

public class cw11 {
    public void wlaczKalkulator(Scanner scanner) {
        System.out.print("Podaj ilosc cyfr: ");
        int ilosc = scanner.nextInt();

        if (ilosc <= 0) {
            System.out.println("Cyfra musi być wieksza od 0!");
            return;
        }

        double[] liczby = new double[ilosc];
        for (int i = 0; i < ilosc; i++) {
            System.out.print("Podaj cyfre " + (i + 1) + ": ");
            liczby[i] = scanner.nextDouble();
        }

        System.out.println("WYBIERZ OPERACJE:");
        System.out.println("1. DODAWANIE");
        System.out.println("2. ODEJMOWANIE");
        System.out.println("3. MNOZENIE");
        System.out.println("4. DZIELENIE");
        System.out.print("WYBIERZ: ");
        int operacja = scanner.nextInt();

        double wynik = liczby[0];
        for (int i = 1; i < liczby.length; i++) {
            switch (operacja) {
                case 1:
                    wynik += liczby[i];
                    break;
                case 2:
                    wynik -= liczby[i];
                    break;
                case 3:
                    wynik *= liczby[i];
                    break;
                case 4:
                    if (liczby[i] == 0) {
                        System.out.println("Nie można dzielić przez 0!");
                        return;
                    }
                    wynik /= liczby[i];
                    break;
                default:
                    System.out.println("Zla operacja!");
                    return;
            }
        }

        System.out.println("Wynik = " + wynik);
    }
}
