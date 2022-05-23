package Module1.FOR_;

import java.util.Scanner;

public class HW1<n, k> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(k);
            sc.close();
        }
    }
}
