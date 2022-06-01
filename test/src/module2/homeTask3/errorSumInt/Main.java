package module2.homeTask3.errorSumInt;

import module2.homeTask3.errorNotInt.Calculate;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException {
        int a;
        int b;
        System.out.println("Input the two number : ");
        Scanner sc = new Scanner(System.in);
        try {
            a = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());
            Sum.check(a, b);
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }

    }
}
