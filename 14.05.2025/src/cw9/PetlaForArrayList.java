package cw9;

import java.util.ArrayList;

public class PetlaForArrayList {

    public static void petlaForArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        int number = 1;

        for (int i = 1; i <= 5; i++) {
            number *= i;
            list.add(number);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1)+"!="+list.get(i));
        }
    }
}
