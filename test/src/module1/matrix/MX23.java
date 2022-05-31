package module1.matrix;
//Matrix23. Дана матрица размера M × N. В каждой строке матрицы найти
//минимальный элемент

import java.util.Arrays;
import java.util.Scanner;

public class MX23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite dlinnu massiva/dlinnu nabora");
        int n = input.nextInt();
        int m = input.nextInt();
        int min = 0;
        System.out.println("Vvedite  massiv");
        int[][] array = new int[n][m];
        for (int i = 0; i<array.length; i++ ) {
            for (int j = 0; j < m; j++) {
                array[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i<array.length; i++ ){
            min = array[i][0];
            for (int j = 0; j<array[0].length; j++){
                if (min > array[i][j]){
                    min = array[i][j];
                }
            }
            System.out.println("min: "+min);
        }



    }
}
