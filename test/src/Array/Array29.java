package Array;

import java.util.Scanner;

/*
 Дан массив A размера N.
Найти максимальный элемент из его элементов с нечетными номерами: A1, A3, A5, .
 */
public class Array29 {
    public static void main(String[] args){
        int[] nmas = new int[]{1,2,3,4,20,6,7,8,9,10};
        int sum = 0, i = 1, k = 0;
       while (i<=9) {
           k = nmas[i];
           if (k < nmas[i]) {
               k = nmas[i];
           }
           i++;
       }
    System.out.println("max: "+k);
    }
}
