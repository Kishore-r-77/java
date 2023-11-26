package FunctionalProgramming;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(name.get());
        System.out.println(listOfNames.get());
    }

    static Supplier<String> name = () -> "Kishore";

    static Supplier<List<String>> listOfNames = () -> List.of("Kish", "Ash", "Ish");

}
