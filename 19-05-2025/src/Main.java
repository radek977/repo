import cw3I.MathOperation;
import cw3I.MaxOperation;
import cw3I.MinOperation;
import cw4.RemoveEmptyStrings;
import cw5.TextString;
import cw6.StringLength;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        RemoveEmptyStrings.removeEmptyStrings();
        TextString.textString();
        StringLength.stringLength();

        MathOperation maxOp = new MaxOperation();
        MathOperation minOp = new MinOperation();
        List<Integer> numbers = Arrays.asList(4, 9, 10, 90, 7);
        System.out.println("Max: "+maxOp.calculate(numbers));
        System.out.println("Min: "+minOp.calculate(numbers));

        Function<Integer, Integer> multiplyBy3 = x -> x*3;
        Consumer<Integer> display = result -> System.out.println(result);
        getResult(5, multiplyBy3, display);
    }

    private static void getResult(int number, Function<Integer, Integer> operation, Consumer<Integer> display) {
        int result = operation.apply(number);
        display.accept(result);
    }
}