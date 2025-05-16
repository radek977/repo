package cw1;

import java.util.HashSet;
import java.util.Random;

public class LottoGenerator {
    private final int max;
    private final int count;
    private final Random random;

    public LottoGenerator(int max, int count) {
        this.max = max;
        this.count = count;
        this.random = new Random();
    }

    public HashSet<Integer> drawNumbers() {
        HashSet<Integer> numbers = new HashSet<>();
        while (numbers.size() < count) {
            int number = random.nextInt(max)+1;
            numbers.add(number);
        }
        return numbers;
    }
}
