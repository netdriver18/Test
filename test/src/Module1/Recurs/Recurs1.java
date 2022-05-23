package Module1.Recurs;

import java.util.Scanner;

public class Recurs1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fact = input.nextInt();
        int sum = 1;

        while (fact != 1) {
            sum = sum * Recurs(fact);
            fact = fact - 1;
        }
        System.out.println(sum);
    }
    public static int Recurs(int fact){
            int s = 0;
            s = fact * (fact - 1);
            return s;
        }
    }


