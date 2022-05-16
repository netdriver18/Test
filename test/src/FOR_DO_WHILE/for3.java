package FOR_DO_WHILE;

import java.util.Scanner;

public class for3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int h = k;
        int i;
        for (i = 1; k>0&&k-n>0;  k = k-n){
           if ((k-n)>0){
               i++;
           }
           else
               i--;
        }
        System.out.println(i);
        System.out.println(h - i*n);
    }
}

