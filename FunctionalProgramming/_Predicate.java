package FunctionalProgramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        boolean phnum1 = isphoneNumValid.test("+919047230479");
        boolean phnum2 = isphoneNumValid.test("+9190473");
        boolean phnum3 = isphoneNumValid.test("8274384737843");
        System.out.println(phnum1);
        System.out.println(phnum2);
        System.out.println(phnum3);
        System.out.println(isphoneNumValid.and(containsNum).test("+919047230479"));
        System.out.println(compare.test(7, 6));

    }

    static Predicate<String> isphoneNumValid = num -> num.startsWith("+91") && num.length() == 13;
    static Predicate<String> containsNum = num -> num.contains("3");

    static BiPredicate<Integer, Integer> compare = (a, b) -> a > b;
}
