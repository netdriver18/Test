package module1.matrix;

import java.util.Arrays;
import java.util.Scanner;
//Matrix3. Даны целые положительные числа M, N и набор из M чисел.
// Сформировать матрицу размера M × N, у которой в каждом столбце содержатся
//все числа из исходного набора (в том же порядке).
public class MX3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite dlinnu massiva/dlinnu nabora");
        int k = input.nextInt();
        int l = 0;
        int[] inputarray = new int[k];
        System.out.println("Vvedite  nabor");
        for (int i = 0; i < inputarray.length; i++) {
            inputarray[i] = input.nextInt();
        }
       int[][] array = new int[inputarray.length][k];
        int i = 0;
        int j = 0;
        while (i < inputarray.length){
            while (j < array[0].length){
                    array[i][j] = inputarray[i];
                    array[i + 1][j] = inputarray[i + 1];
                    array[i + 2][j] = inputarray[i + 2];
                    j++;
            }
            i++;
        }
        System.out.println(Arrays.deepToString(array));
    }
    }

