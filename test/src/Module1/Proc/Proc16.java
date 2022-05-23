package Module1.Proc;

import java.util.Scanner;

public class Proc16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(Func(n));
    }

    public static int Func(int n){
        int x = 0;
       if (n < 0){
        x = -1;
       }
       else if (n == 0){
           x = 0;
        }
       else if (n>0){
    x = 1;
        }
        return(x);
    }
}
