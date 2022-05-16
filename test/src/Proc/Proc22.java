package Proc;

import java.util.Scanner;

public class Proc22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
         double a = input.nextDouble();
         double b = input.nextDouble();
        System.out.println(calc(a,b,r));
    }

    public static double calc(double a, double b, int c){
        double s = 0;
        switch (c) {
            case 1:
                s = a - b;
                break;
            case 2:
                s = a * b;
                break;
            case 3:
                s = a / b;
                break;
            default:
                s = a + b;
        }
        return s;
    }
}
