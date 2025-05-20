package cw6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StringLength {

    public static void stringLength() {
        List<String> list = new ArrayList<>();
        list.add("Barry Allen");
        list.add("John Snow");
        Function<List<String>, List<Integer>> getLength = r -> {
            List<Integer> lengths = new ArrayList<>();
            for (String s : list) {
                lengths.add(s.length());
            }
            return lengths;
        };
        System.out.println(getLength.apply(list));
    }
}
