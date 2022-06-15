package module2.homeTask6.Person;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(Arrays.asList(
                new Person(23, "Adam Braun"),
                new Person(26, "Nikolay Gren"),
                new Person(16, "Natalie Kim"),
                new Person(80, "Kate Fame"),
                new Person(36, "Ada Klo"),
                new Person(19, "Bd Bra")));

        List<Person> adults = new ArrayList<>();
        personList.forEach(person -> {
            if (person.getAge() >= 18) {
                adults.add(person);
            }
        });

        adults.forEach(System.out::println);

        Date date = new Date();
        personList.forEach(person -> person.setTimeStamp(date));

        personList.forEach(person -> System.out.println(person.getTimeStamp().toString()));
    }
}
