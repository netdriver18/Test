package Proc;

import java.util.Scanner;

public class Proc18 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();

        System.out.println(circl(r));
    }

    public static double circl(int r){
        double s = 0;
        s = (3.14*Math.pow(r, 2))*3;
        return s;
    }

}