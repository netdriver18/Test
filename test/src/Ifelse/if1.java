package Ifelse;

import java.util.Scanner;

public class if1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b){
            System.out.println("Число введенное равно a=b!");
        }
        else if (a>b){
            System.out.println("a>b");
        }
        else
            System.out.println("a<b");
    }
}
