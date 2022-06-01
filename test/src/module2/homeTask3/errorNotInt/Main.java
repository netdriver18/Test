package module2.homeTask3.errorNotInt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException {
        System.out.println("Input the number : ");
        Scanner sc = new Scanner(System.in);
        try {
            int a = Integer.parseInt(sc.next());
            Calculate.check(a);
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());;
        }

    }
}
