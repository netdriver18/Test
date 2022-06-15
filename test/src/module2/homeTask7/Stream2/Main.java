package module2.homeTask7.Stream2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<People> people = new ArrayList<>(Arrays.asList(
                new People("Adam Braun", 23, "m"),
                new People("Nikolay Gren", 26, "m"),
                new People("Natalie Kim", 16, "w"),
                new People("Kate Fame", 80, "w"),
                new People("Ada Klo", 36, "w"),
                new People("Bd Bra", 19, "m")));

        people.stream().filter(element -> element.getAge() > 18 && element.getAge() < 27 && element.getSex() == "m")
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Average age of man : ");
        final OptionalDouble averageAge = OptionalDouble.of(people.stream().filter(element -> element.getAge() > 18 && element.getAge() < 27 && element.getSex() == "m")
                .mapToInt((element) -> Integer
                        .parseInt(String.valueOf(element.getAge())))
                .average().getAsDouble());
        System.out.println(averageAge);

        System.out.println();
        System.out.printf("Worker age people : ");
        people.stream().filter(element -> (element.getAge() > 18 && element.getAge() < 60 && element.getSex() == "m") ||
                        (element.getAge() > 18 && element.getAge() < 50 && element.getSex() == "w"))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Sorted people : ");
        people.stream().sorted(Comparator.comparing(People::getName).reversed())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Sorted people name---> age: ");
        people.stream().sorted(Comparator.comparing(People::getName))
                .sorted(Comparator.comparing(People::getAge))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Count of man: ");
        System.out.println(people.stream().filter(element -> (element.getSex() == "m"))
                .count());

        System.out.println();
        System.out.println("Count of women: ");
        System.out.println(people.stream().filter(element -> (element.getSex() == "w"))
                .count());

    }
}
