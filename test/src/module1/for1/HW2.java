package module1.for1;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("a:");
        int a = in.nextInt();
        System.out.print("b:");
        int b = in.nextInt();
        int i;
        for(i = a; i <= b; i++ )
            System.out.println(i);
        in.close();
    }

}
