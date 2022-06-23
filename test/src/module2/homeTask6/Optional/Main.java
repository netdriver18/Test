package module2.homeTask6.Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("Natasha"); // java.lang.NullPointerException
        name.ifPresent(e -> System.out.println(name.get()));
    }
}
