package FOR_DO_WHILE;

import java.util.Scanner;

public class while4 {
    /*While4◦
    Дано целое число N (> 0). Если оно является степенью числа 3, то
    вывести TRUE, если не является — вывести FALSE.*/
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

        while (n % 2 == 0) {
        n /= 2;
        }
        System.out.println(n == 1 ? "YES" : "NO");
    }
}
