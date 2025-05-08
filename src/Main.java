import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        cw11 k = new cw11();
        Scanner in = new Scanner(System.in);
        boolean dalej = true;

        while (dalej) {
            System.out.println("------MENU------");
            System.out.println("WYBIERZ OPCJE:");
            System.out.println("1. KALKULATOR");
            System.out.println("2. EXIT");
            int opcja = in.nextInt();

            switch (opcja) {
                case 1:{
                    k.wlaczKalkulator(new Scanner(System.in));
                    break;
                }
                case 2:{
                    dalej = false;
                    System.out.println("KONIEC PROGRAMU!");
                    break;
                }
                default:{
                    System.out.println("ZLA OPERACJA!!!");
                }
            }
        }
    }
}