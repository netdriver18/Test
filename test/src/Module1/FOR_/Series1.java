package Module1.FOR_;
/*Series1◦Даны десять вещественных чисел. Найти их сумму.*/

import java.util.Scanner;

public class Series1 {
   public static void main(String[] args){
        int s;
            int i;
            s = 0;
            for (i = 1; i <= 10; i++) {
                System.out.println("Введите число:");
                Scanner sc = new Scanner(System.in);
                int k = sc.nextInt();
                s = s + k;
            }
       System.out.println("Сумма:");
        System.out.println(s);
    }
}
