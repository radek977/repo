package org.example;
import com.google.gson.Gson;
import java.io.FileReader;
import java.util.*;

public class CurrencyConverter {

    private static final Map<String, Double> EXCHANGE_RATES = new HashMap<>();

    public static void run() {
        loadJson("src/main/resources/currency.json");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------MENU---------");
            System.out.println("----WITAM W KANTORZE!----");
            System.out.println("Wybierz co chcialbys zrobic: ");
            System.out.println("1. Wyswietl waluty i kursy");
            System.out.println("2. Przelicz walute");
            System.out.println("0. Wyjscie");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                EXCHANGE_RATES.forEach((code, value) -> System.out.println(code + ": " + value));
            }
            else if (option == 2) {
                double amount = 0.0;
                while (true) {
                    System.out.print("Kwota: ");
                    try {
                        amount = Double.parseDouble(scanner.nextLine());
                        break;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("ERROR: podaj prawidlowa liczbe.");
                    }
                }
                System.out.print("Z jakiej waluty (np. PLN): ");
                String from = scanner.next().toUpperCase();
                System.out.print("Na jaka walute (np. EUR): ");
                String to = scanner.next().toUpperCase();

                if (EXCHANGE_RATES.containsKey(from) && EXCHANGE_RATES.containsKey(to)) {
                    double result = amount * (EXCHANGE_RATES.get(from) / EXCHANGE_RATES.get(to));
                    double betterResult = Math.round(result * 1000.0) / 1000.0;
                    System.out.println("Wynik: "+betterResult+" "+to);
                }
                else {
                    System.out.println("Nieznana waluta.");
                }
            }
            else if (option == 0) {
                break;
            }
        }
    }

    private static void loadJson(String path) {
        try (FileReader reader = new FileReader(path)) {
            Gson gson = new Gson();
            CurrencyData data = gson.fromJson(reader, CurrencyData.class);
            EXCHANGE_RATES.put(data.getBaseCurrency().getCode(), data.getBaseCurrency().getValue());
            for (Currency c : data.getCurrencies()) {
                EXCHANGE_RATES.put(c.getCode(), c.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
