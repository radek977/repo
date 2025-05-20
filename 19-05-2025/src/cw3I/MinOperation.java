package cw3I;

import java.util.Collections;
import java.util.List;

public class MinOperation implements MathOperation{

    @Override
    public int calculate(List<Integer> numbers) {
//        int min = Integer.MAX_VALUE;
//        for (int number : numbers) {
//            if (number < min) {
//                min = number;
//            }
//        }
//        return min;
        return Collections.min(numbers);
    }
}
