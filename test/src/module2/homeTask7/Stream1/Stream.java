
package module2.homeTask7.Stream1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three", "Four", "Five", "One"));

        long count = list.stream().filter((s) -> s.contains("One")).count();
        System.out.println(count);

        if (list.stream().findAny().isEmpty()) {
            System.out.println("null");
        } else {
            list.stream().limit(1)
                    .forEach(System.out::println);
        }

        if (list.stream().findAny().isEmpty()) {
            System.out.println("empty");
        } else {
            list.stream().skip(5)
                    .forEach(System.out::println);
        }
        String str1 = list.stream().filter(e -> list.equals("Three"))
                .findAny()
                .orElse("Not such elements ");
        System.out.println(str1);

        list.stream()
                .limit(3)
                .skip(2)
                .forEach(s -> System.out.print(s));

        list.stream()
                .limit(1)
                .skip(5)
                .forEach(s -> System.out.print(s));

        List<String> list1 = new ArrayList<>(Arrays.asList("One", "Two", "Three", "Four", "Five", "One"));

        list1.stream().distinct()
                .forEach(System.out::println);
        long ct = list.stream().filter(s -> s == "One").count();
        System.out.println(ct);

        list.stream().map(e -> e + "_1")
                .forEach(System.out::println);
    }
}

