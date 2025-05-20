package cw4;

import java.util.ArrayList;
import java.util.List;

public class RemoveEmptyStrings {

    public static void removeEmptyStrings() {
        List<String> collection = new ArrayList<>();
        collection.add("Barry Allen");
        collection.add("");
        collection.add("Iris West");
        collection.add("");
        collection.add("John Snow");
        System.out.println("Przed: "+collection);
        collection.removeIf(s -> s.isEmpty());
        System.out.println("Po: "+collection);
    }
}
