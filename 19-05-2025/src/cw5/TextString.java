package cw5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TextString {

    public static void textString() {
        List<String> list = new ArrayList<>();
        list.add("barry allen");
        list.add("iris west");
        list.add("john snow");
        list.forEach(word -> System.out.println(word.toUpperCase()));
    }
}
