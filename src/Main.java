import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        cw11 k = new cw11();
        Scanner scanner = new Scanner(System.in);
        boolean dalej = true;

        while (dalej) {
            System.out.println("------MENU------");
            System.out.println("1. KALKULATOR");
            System.out.println("2. EXIT");
            System.out.print("WYBIERZ OPCJE: ");
            int opcja = scanner.nextInt();

            switch (opcja) {
                case 1:
                    k.wlaczKalkulator(scanner);
                    break;
                case 2:
                    dalej = false;
                    System.out.println("KONIEC PROGRAMU!");
                    break;
                default:
                    System.out.println("ZLA OPCJA!");
            }
        }

        scanner.close();
    }
}
