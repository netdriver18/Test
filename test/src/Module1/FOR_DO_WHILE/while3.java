package Module1.FOR_DO_WHILE;

import java.util.Scanner;

public class while3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int a = k;
        int i=0;
        while (a>0&&a>n){
           a = a-n;
           i++;
        }
        System.out.println(a);
        System.out.println(i);
    }
}
