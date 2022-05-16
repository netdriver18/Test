package Case;

import java.util.Scanner;

public class case4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mounth = sc.nextInt();
        switch (mounth) {
            case 1 -> System.out.println(30);
            case 2 -> System.out.println(28);
            case 3 -> System.out.println(30);
            case 4 -> System.out.println(31);
            case 5 -> System.out.println(30);
            case 6 -> System.out.println(31);
            case 7 -> System.out.println(30);
            case 8 -> System.out.println(31);
            case 9 -> System.out.println(30);
            case 10 -> System.out.println(31);
            case 11 -> System.out.println(31);
            case 12 -> System.out.println(30);
            default -> System.out.println("Invalid number");

        }
    }
}
