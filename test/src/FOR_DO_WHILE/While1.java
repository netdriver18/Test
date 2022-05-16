package FOR_DO_WHILE;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int k;
       k = a;
       while (k>0&&k>b){
           k = k-=b;
       }
       System.out.println(k);
    }
}
