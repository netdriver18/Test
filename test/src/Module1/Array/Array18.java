package Module1.Array;

import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("vvedite dlinny massivu:");
        int n = input.nextInt();
        int k = 0;
        int mas[] = new int[n];
        for(int i = 0;i<= mas.length; i++){
            if (i == mas.length){
                break;
            }
            else{
            System.out.println("Vvedite sam massiv c dlinnoj :"+mas.length);
            mas[i] = input.nextInt();
            }
        }
        int fi = mas[mas.length-1];
        for (int i = 0; i<=n-1; i++) {
            if (mas[i] > fi) {
                k = mas[i];
                System.out.println("najden element Ak>An:" + k);
            }

        }
        if (k == 0) {
            System.out.println(0);
        }

    }
}