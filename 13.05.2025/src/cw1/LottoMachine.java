package cw1;

import java.util.HashSet;
import java.util.Scanner;

public class LottoMachine {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe konca przedzialu: ");
        int max = scanner.nextInt();
        System.out.println("Podaj ile liczb ma byc wylosowanych: ");
        int count = scanner.nextInt();
        LottoGenerator generator = new LottoGenerator(max, count);
        HashSet<Integer> results = generator.drawNumbers();
        System.out.println("Wylosowane liczby: ");
        for (Integer number : results) {
            System.out.println(number);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("ERROR");
            }
        }
    }
}
