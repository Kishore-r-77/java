package FunctionalProgramming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        Person kishore = new Person("Kishore", 26);

        greet.accept(kishore);

        message.accept("Aswathy", 23);
    }

    static Consumer<Person> greet = person -> System.out
            .println("Hai " + person.getName() + " I believe your age is " + person.getAge());

    static BiConsumer<String, Integer> message = (n, a) -> System.out.println("Name: " + n + " Age: " + a);

    static class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

    }
}
