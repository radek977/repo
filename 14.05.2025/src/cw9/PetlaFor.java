package cw9;

public class PetlaFor {

    public static void petlaFor() {

        int[] numbers = new int[5];
        int number = 1;

        for (int i = 0; i < numbers.length; i++) {
            number *= (i + 1);
            numbers[i] = number;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i+1)+"n!= "+numbers[i]);
        }
    }
}
