package Module1.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class MX1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длинну двумерного массива n m");
        int n = input.nextInt();
        int m = input.nextInt();
      //ввод массива с клавиатуры
        int[][] array = new int[n][m];
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<m; j++){
              array[i][j] = input.nextInt();
            }
        }
        System.out.println("Массив введен корректно");
        for (int i = 0; i < array[0].length; i++){
            for (int j = 1; j < m; j++){
               array[i][j] = array[i][j]*10;
              // System.out.print(array[i][j]+" ");
             }
        }
       System.out.println(Arrays.deepToString(array));
    }
}
