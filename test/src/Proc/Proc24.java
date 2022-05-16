package Proc;

import java.util.Scanner;

public class Proc24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();

        System.out.println(calc(k));
    }

    public static boolean calc(int k){
        boolean s = false;
        if(k%2==0){
            s = true;
        }
        else if(k%2!=0){
            s = false;
        }

        return s;
    }
}
