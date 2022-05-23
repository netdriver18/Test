package Module1.Matrix;

import java.util.Arrays;
import java.util.Scanner;

//Matrix24◦
//. Дана матрица размера M × N. В каждом столбце матрицы найти
//максимальный элемент.
public class MX24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite dlinnu massiva/dlinnu nabora");
        int n = input.nextInt();
        int m = input.nextInt();
        int max = 0;
        System.out.println("Vvedite  massiv");
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));

        for (int j = 0; j < array.length; j++) {
            max = array[0][j];
            for (int i = 0; i < array[0].length; i++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
            System.out.println("max: " + max);
        }

    }
}
