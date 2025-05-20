package cw3I;

import java.util.Collections;
import java.util.List;

public class MaxOperation implements MathOperation {

    @Override
    public int calculate(List<Integer> numbers) {
//        int max = Integer.MIN_VALUE;
//        for (int number : numbers) {
//            if (number > max) {
//                max = number;
//            }
//        }
//        return max;
        return Collections.max(numbers);
    }
}
