package module1.for1;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int i;
        int k;
        for (i = 1; i<10; i++){
            k = price*i;
            System.out.println(k);
            sc.close();
        }
    }
}


