package FOR_DO_WHILE;

import java.util.Scanner;

public class HW38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть  ціле  N ");
        int   N = sc.nextInt();
        double stepn = 1.00;
        double is =1;
        System.out.printf( " 1  ");
        for (int i = 2; i <= N; i++) {

            for (int j= (N-i+1); j>=1; j--) {
                is = is * i;
            }
            stepn = stepn + is;
            System.out.printf( " + %s ",is);
            is=1;
        }
        System.out.printf( " = %.2f ", stepn);
    }
}

