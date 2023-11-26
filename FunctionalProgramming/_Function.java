package FunctionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    static Function<Integer, Integer> add = number -> number + 1;

    static Function<Integer, Integer> mul = (n1) -> n1 * 10;

    static BiFunction<Integer, Integer, Integer> bimul = (a, b) -> a * b;

    public static void main(String[] args) {

        // Integer increment = add.apply(7);

        // Integer multiply = mul.apply(increment);

        Integer result = add.andThen(mul).apply(7);

        Integer biresult = bimul.apply(3, 3);

        System.out.println(result);
        System.out.println(biresult);

    }

}
