package Case;

import book.Switch;

import java.util.Scanner;

public class case5 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        if (B > 0) {
            switch (N)
            {
                case 1 -> System.out.println(A + B);
                case 2 -> System.out.println(A - B);
                case 3 -> System.out.println(A / B);
                case 4 -> System.out.println(A * B);
                default -> System.out.println("Oshibka!");
            }
        }
        else System.out.println("B < 0");
        }
    }

