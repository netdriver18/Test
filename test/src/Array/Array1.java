/*
Дано целое число N (> 0). Сформировать и вывести целочисленный
массив размера N, содержащий N первых положительных нечетных чисел:
1, 3, 5, . . . .
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[15];
        for (int i = 1;i<=n;i++){
            mas[i] = 1 + i * 2;
        }
        for (int i = 1;  i<=n; ++i)
        {
            System.out.println(mas[i]);
        }
        System.out.println(Arrays.toString(mas));
    }
}
