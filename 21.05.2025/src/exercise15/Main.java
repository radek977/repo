package exercise15;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String[] words = {"hello", "academy", "java", "junior"};
        Set<Character> letters = Arrays.stream(words)
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toSet());
        System.out.println("Litery bez powtorzen: "+letters);
        System.out.println("Liczba tych liter: "+letters.size());
    }
}