package module1.matrix;

import java.util.Arrays;
import java.util.Scanner;

//Дана матрица размера M × N и целое число K (1 ≤ K ≤ N). Найти
//сумму и произведение элементов K-го столбца данной матрицы.
public class MX18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite dlinnu massiva/dlinnu nabora");
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        int sum = 0;
        int pro = 1;
        System.out.println("Vvedite  massiv");
        int[][] array = new int[n][m];
        for (int i = 0; i<array.length; i++ ) {
            for (int j = 0; j < m; j++) {
                array[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i<array.length; i++ ){
          for (int j = 0; j<array[0].length; j++){
            if (j == k-1){
                 sum = sum+ array[i][j];
                 pro = pro* array[i][j];
             }
          }
      }
        System.out.println("sum: "+sum);
        System.out.println("pro: "+pro);

    }
}
