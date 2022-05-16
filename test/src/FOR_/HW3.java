package FOR_;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int i;
        for (i = b-1;  i< b; i--){
            System.out.println(i);
            System.out.println(b - a - 1);
            in.close();
        }
    }
}
